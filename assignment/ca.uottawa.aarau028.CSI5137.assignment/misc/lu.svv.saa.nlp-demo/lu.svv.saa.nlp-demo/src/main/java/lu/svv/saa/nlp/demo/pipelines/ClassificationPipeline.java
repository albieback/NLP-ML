package lu.svv.saa.nlp.demo.pipelines;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;
import static org.apache.uima.fit.factory.CollectionReaderFactory.createReaderDescription;
import static org.uimafit.factory.AnalysisEngineFactory.createPrimitiveDescription;
import java.io.IOException;
import java.util.Random;
import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.collection.CollectionReaderDescription;
import org.apache.uima.fit.pipeline.SimplePipeline;
import de.tudarmstadt.ukp.dkpro.core.dictionaryannotator.DictionaryAnnotator;
import de.tudarmstadt.ukp.dkpro.core.io.text.TextReader;
import de.tudarmstadt.ukp.dkpro.core.matetools.MateLemmatizer;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpChunker;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpPosTagger;
import de.tudarmstadt.ukp.dkpro.core.stanfordnlp.StanfordNamedEntityRecognizer;
import de.tudarmstadt.ukp.dkpro.core.stanfordnlp.StanfordParser;
import de.tudarmstadt.ukp.dkpro.core.tokit.BreakIteratorSegmenter;
import lu.svv.saa.nlp.demo.analysis.FeaturesExtractor;
import lu.svv.saa.nlp.demo.io.FeatureMatrixWriter;
import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.trees.RandomForest;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;;

public class ClassificationPipeline {
  static String PATH = "src/main/resources/data/";
  static String SENTIMENT_PATH = "src/main/resources/dic/sentiments.lst";
  static String VERBNET_PATH = "src/main/resources/verbnet-3.1/";

  public static void main(String[] args) throws Exception {
    // extractFeatures();

    classify();
  }

  /**
   * @throws Exception 
   * 
   */
  private static void classify() throws Exception {
      DataSource source = new DataSource(PATH + "_opinion_fact.arff");
      Instances data = source.getDataSet();

      // Set class attribute
      if (data.classIndex() == -1) {
        data.setClassIndex(data.numAttributes() - 1);
      }

      int folds = 10;
      int seed = 1;
      // randomize data
      Random rand = new Random(seed);
      Instances randData = new Instances(data);
      randData.randomize(rand);
      if (randData.classAttribute().isNominal())
        randData.stratify(folds);

      // apply the classifier on the dataset using a 10-fold cross-validation setting
      RandomForest rf = new RandomForest();

      Evaluation eval = new Evaluation(randData);
      for (int n = 0; n < folds; n++) {
        Instances train = randData.trainCV(folds, n, rand);
        Instances test = randData.testCV(folds, n);
        // build and evaluate classifier
        rf.buildClassifier(train);
        eval.evaluateModel(rf, test);
      }

      // output evaluation
      System.out.println();
      System.out.println("=== Setup ===");
      System.out.println("Classifier: " + rf.getClass().getSimpleName());
      System.out.println("Dataset: " + data.relationName());
      System.out.println("Folds: " + folds);
      System.out.println("Seed: " + seed);
      System.out.println();

      System.out
          .println(eval.toSummaryString("=== " + folds + "-fold Cross-validation ===", false));

      System.out.println(String.format("Precision =  %.2f, Recall = %.2f", 
          (eval.weightedPrecision()*100), (eval.weightedRecall()*100)));
  }

  /**
   * @throws IOException
   * @throws UIMAException
   * 
   */
  private static void extractFeatures() throws UIMAException, IOException {
    CollectionReaderDescription reader =
        createReaderDescription(TextReader.class, TextReader.PARAM_SOURCE_LOCATION, PATH,
            TextReader.PARAM_PATTERNS, "*.txt", TextReader.PARAM_LANGUAGE, "en");

    // Tokenizer
    AnalysisEngineDescription segmenter = createEngineDescription(BreakIteratorSegmenter.class);

    // POS-Tagger
    AnalysisEngineDescription posTagger = createEngineDescription(OpenNlpPosTagger.class);

    // Lemmatizer
    AnalysisEngineDescription lemmatizer = createEngineDescription(MateLemmatizer.class);

    // Chunker
    AnalysisEngineDescription chunker = createEngineDescription(OpenNlpChunker.class);

    // Dependency Parser
    AnalysisEngineDescription parser = createEngineDescription(StanfordParser.class);

    // NER
    AnalysisEngineDescription ner = createEngineDescription(StanfordNamedEntityRecognizer.class);

    // Look-up sentiments from a predefined list
    AnalysisEngineDescription sentimentsFinder = createEngineDescription(DictionaryAnnotator.class,
        DictionaryAnnotator.PARAM_MODEL_LOCATION, SENTIMENT_PATH);

    // Feature Extractor
    AnalysisEngineDescription extractor = createEngineDescription(FeaturesExtractor.class,
        FeaturesExtractor.PARAM_VERBNET_PATH, VERBNET_PATH);

    // Feature Matrix Writer
    AnalysisEngineDescription featWriter =
        createPrimitiveDescription(FeatureMatrixWriter.class, FeatureMatrixWriter.PARAM_PATH, PATH);

    SimplePipeline.runPipeline(reader, segmenter, lemmatizer, posTagger, chunker, parser, ner,
        sentimentsFinder, extractor, featWriter);
  }

}
