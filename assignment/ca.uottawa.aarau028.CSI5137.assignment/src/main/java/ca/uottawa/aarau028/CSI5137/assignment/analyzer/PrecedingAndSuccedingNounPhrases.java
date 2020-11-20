package ca.uottawa.aarau028.CSI5137.assignment.analyzer;

import static org.apache.uima.fit.util.JCasUtil.select;
import static org.apache.uima.fit.util.JCasUtil.selectCovered;

import java.util.List;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import ca.uottawa.aarau028.CSI5137.assignment.type.It;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.chunk.Chunk;

public class PrecedingAndSuccedingNounPhrases extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		for (Sentence s : select(aJCas, Sentence.class)) {
			   int nps = 0;
			   
			   // iterate over chunks in the sentence
			   List<Chunk> chunks = selectCovered(Chunk.class, s);
			    for (Chunk chunk : chunks) {
		    	
			    	// if chunk is NP, set every It in it to
			    	// receive NP counting so far
			      if (chunk.getChunkValue().equals("NP")) {
			    	  for (It it : selectCovered(It.class, chunk)) {
			    		  it.setPrecedingNPs(nps);
			    	  }
			    	  
			    	  nps++;
			      }
			        
			    }
			    
			    int i = 1;
	    
			    for (Chunk chunk : chunks) {
			    	
			    	// if chunk is NP, set every It in it to
			    	// receive chunk counting so far
			    	
			    	//note that every it is in a noun phrase
			      if (chunk.getChunkValue().equals("NP")) {
			    	  for (It it : selectCovered(It.class, chunk)) {
			    		  it.setSuccedingNPs(nps-i);
			    	  }
			    	  
			    	  i++;
			      }
			        
			    }

			    
			}

		}

	}


