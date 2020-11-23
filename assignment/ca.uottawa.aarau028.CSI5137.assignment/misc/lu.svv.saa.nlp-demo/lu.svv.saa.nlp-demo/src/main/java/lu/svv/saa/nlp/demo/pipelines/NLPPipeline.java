package lu.svv.saa.nlp.demo.pipelines;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;
import static org.apache.uima.fit.factory.CollectionReaderFactory.createReaderDescription;
import static org.uimafit.factory.AnalysisEngineFactory.createPrimitiveDescription;
import java.io.IOException;
import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.collection.CollectionReaderDescription;
import org.apache.uima.fit.pipeline.SimplePipeline;
import org.uimafit.component.xwriter.CASDumpWriter;
import de.tudarmstadt.ukp.dkpro.core.clearnlp.ClearNlpSemanticRoleLabeler;
import de.tudarmstadt.ukp.dkpro.core.io.text.TextReader;
import de.tudarmstadt.ukp.dkpro.core.matetools.MateLemmatizer;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpChunker;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpPosTagger;
import de.tudarmstadt.ukp.dkpro.core.snowball.SnowballStemmer;
import de.tudarmstadt.ukp.dkpro.core.stanfordnlp.StanfordCoreferenceResolver;
import de.tudarmstadt.ukp.dkpro.core.stanfordnlp.StanfordNamedEntityRecognizer;
import de.tudarmstadt.ukp.dkpro.core.stanfordnlp.StanfordParser;
import de.tudarmstadt.ukp.dkpro.core.tokit.BreakIteratorSegmenter;
import lu.svv.saa.nlp.demo.io.AnnotationWriter;

public class NLPPipeline {

  private static String PATH = "src/main/resources/input/";
  
  public static void main(String[] args) throws IOException, UIMAException {
    
    
    runBasicPipeline();
    
    //runFullPipeline();
  }

  private static void runBasicPipeline() throws UIMAException, IOException {

    // Collection Reader
    CollectionReaderDescription reader = createReaderDescription(TextReader.class,
        TextReader.PARAM_SOURCE_LOCATION, PATH, 
        TextReader.PARAM_PATTERNS, "*.txt",
        TextReader.PARAM_LANGUAGE, "en");
    
    // Tokenizer
    AnalysisEngineDescription segmenter = createEngineDescription(BreakIteratorSegmenter.class);
        
    // POS-Tagger
    AnalysisEngineDescription posTagger = createEngineDescription(OpenNlpPosTagger.class);

    // Lemmatizer
    AnalysisEngineDescription lemmatizer = createEngineDescription(MateLemmatizer.class);
    
    // dump consumer
    AnalysisEngineDescription consumer = createPrimitiveDescription(CASDumpWriter.class);
   
    // Pipeline
    SimplePipeline.runPipeline(reader, segmenter, posTagger, lemmatizer, consumer); 
  }
  

  private static void runFullPipeline() throws UIMAException, IOException {

    // Collection Reader
    CollectionReaderDescription reader = createReaderDescription(TextReader.class,
        TextReader.PARAM_SOURCE_LOCATION, PATH, 
        TextReader.PARAM_PATTERNS, "*.txt",
        TextReader.PARAM_LANGUAGE, "en");
    
    // Tokenizer
    AnalysisEngineDescription segmenter = createEngineDescription(BreakIteratorSegmenter.class);
        
    // POS-Tagger
    AnalysisEngineDescription posTagger = createEngineDescription(OpenNlpPosTagger.class);

    // Lemmatizer
    AnalysisEngineDescription lemmatizer = createEngineDescription(MateLemmatizer.class);
    
    // Stemmer
    AnalysisEngineDescription stemmer = createEngineDescription(SnowballStemmer.class);
    
    // Constituency + Dependency Parser
    AnalysisEngineDescription parser = createEngineDescription(StanfordParser.class);
    
    // Chunker
    AnalysisEngineDescription chunker = createEngineDescription(OpenNlpChunker.class);
  
    // NER
    AnalysisEngineDescription ner = createEngineDescription(StanfordNamedEntityRecognizer.class);
    
    // Semantic Role Labeling
    AnalysisEngineDescription srl = createEngineDescription(ClearNlpSemanticRoleLabeler.class);
    
    // Coreference resolver
    AnalysisEngineDescription coref = createEngineDescription(StanfordCoreferenceResolver.class);
        
    // my Writer
    AnalysisEngineDescription myWriter = createPrimitiveDescription(AnnotationWriter.class);

    // Pipeline
    SimplePipeline.runPipeline(reader, segmenter, posTagger, lemmatizer, stemmer,
        parser, chunker, ner, srl, coref, myWriter); 
  }

}
