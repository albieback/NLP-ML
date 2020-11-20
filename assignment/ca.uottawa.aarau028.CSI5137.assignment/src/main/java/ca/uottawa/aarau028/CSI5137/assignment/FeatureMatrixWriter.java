package ca.uottawa.aarau028.CSI5137.assignment;

import static org.apache.uima.fit.util.JCasUtil.select;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.uimafit.component.JCasConsumer_ImplBase;
import org.uimafit.descriptor.ConfigurationParameter;

import ca.uottawa.aarau028.CSI5137.assignment.type.It;

public class FeatureMatrixWriter extends JCasConsumer_ImplBase {
  public static final String PARAM_PATH = "path";
  @ConfigurationParameter(name = PARAM_PATH, mandatory = true,
      description = "the path to the dataset")
  
  
  
  
  private String path;

  StringBuilder featMatrix;

  @Override
  public void initialize(final UimaContext context) throws ResourceInitializationException {
    super.initialize(context);
    featMatrix = new StringBuilder();
  }

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
	  
	  featMatrix.append("IT_POSITION");
	  featMatrix.append(",");
	  featMatrix.append("SENTENCE_LENGTH");
	  featMatrix.append(",");
	  featMatrix.append("PUNCTUATION_COUNT");
	  featMatrix.append(",");
	  featMatrix.append("PRECEDING_NPS");
	  featMatrix.append(",");
	  featMatrix.append("SUCCEDING_NPS");
	  featMatrix.append(",");
	  featMatrix.append("IMMEDIATELY_FOLLOWS_PP");
	  featMatrix.append(",");
	  featMatrix.append("NEIGHBORS_POS_TAGS");
	  featMatrix.append(",");
	  featMatrix.append("FOLLOWED_BY_ING_VERB");
	  featMatrix.append(",");
	  featMatrix.append("FOLLOWED_BY_PREPOSITION");
	  featMatrix.append(",");
	  featMatrix.append("ADJECTIVES_AFTER_COUNT");
	  featMatrix.append(",");
	  featMatrix.append("VERB_BEFORE");
	  featMatrix.append(",");
	  featMatrix.append("VERB_AFTER");
	  featMatrix.append(",");
	  featMatrix.append("ADJECTIVES_AFTER");
	  featMatrix.append(",");
	  featMatrix.append("NOUN_PHRASE_WITH_ADJECTIVE_AFTER");
	  featMatrix.append(",");
	  featMatrix.append("TOKENS_BEFORE_NEXT_VERB_INF");
	  featMatrix.append(",");
	  featMatrix.append("TOKENS_BETWEEN_IT_AND_PREPOSITION");
	  featMatrix.append(",");
	  featMatrix.append("IMMEDIATELY_FOLLLOWED_BY_NOUN_ADJECTIVE");
	  featMatrix.append(",");
	  featMatrix.append("CLOSEST_DEPENDENCY");
	  
	  featMatrix.append("\n");
	  
	  
	  
	  for (It it: select(aJCas,It.class))
	  {
		  featMatrix.append(it.getItPosition());
		  featMatrix.append(",");
		  featMatrix.append(it.getSentenceLength());
		  featMatrix.append(",");
		  featMatrix.append(it.getPunctuationCount());
		  featMatrix.append(",");
		  featMatrix.append(it.getPrecedingNPs());
		  featMatrix.append(",");
		  featMatrix.append(it.getSuccedingNPs());
		  featMatrix.append(",");
		  featMatrix.append(it.getImmediatelyFollowsPP());
		  featMatrix.append(",");
		  featMatrix.append(it.getNeighborPOSTags());
		  featMatrix.append(",");
		  featMatrix.append(it.getFollowedByIngVerb());
		  featMatrix.append(",");
		  featMatrix.append(it.getFollowedByPreposition());
		  featMatrix.append(",");
		  featMatrix.append(it.getAdjectivesAfterCount());
		  featMatrix.append(",");
		  featMatrix.append(it.getVerbBefore());
		  featMatrix.append(",");
		  featMatrix.append(it.getVerbAfter());
		  featMatrix.append(",");
		  featMatrix.append(it.getAdjectivesAfter());
		  featMatrix.append(",");
		  featMatrix.append(it.getNounPhraseWithAdjectiveAfter());
		  featMatrix.append(",");
		  featMatrix.append(it.getTokensBeforeNextVerbInf());
		  featMatrix.append(",");
		  featMatrix.append(it.getTokensBetweenItAndPreposition());
		  featMatrix.append(",");
		  featMatrix.append(it.getItImmediatelyFollowedByAdjNounPhrase());
		  featMatrix.append(",");
		  featMatrix.append(it.getDependencyToClosest());
		  
		  featMatrix.append("\n");
	  }
		  
  }

  public void writeToFile(String content) {
    BufferedWriter writer = null;
    try {
      writer = new BufferedWriter(new FileWriter(path + "output-a2.csv"));
      writer.write(content);
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void collectionProcessComplete() {
    writeToFile(featMatrix.toString());

    System.out.println("Dataset created successfully... ");
    
    System.out.println(featMatrix);
    
  }

}