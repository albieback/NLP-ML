package lu.svv.saa.nlp.demo.pipelines;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;
import static org.apache.uima.fit.factory.CollectionReaderFactory.createReaderDescription;
import static org.uimafit.factory.AnalysisEngineFactory.createPrimitiveDescription;
import java.io.IOException;
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
import lu.svv.saa.nlp.demo.io.FeatureMatrixWriter;;

public class FeatureExtractionPipeline {
  static String PATH = "src/main/resources/input/";
  static String SENTIMENT_PATH = "src/main/resources/dic/sentiments.lst";
  static String VERBNET_PATH = "src/main/resources/verbnet-3.1/";

  public static void main(String[] args) throws IOException, UIMAException {
    
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
