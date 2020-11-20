package ca.uottawa.aarau028.CSI5137.assignment.analyzer;

import static org.apache.uima.fit.util.JCasUtil.select;
import static org.apache.uima.fit.util.JCasUtil.selectCovered;

import java.util.List;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import ca.uottawa.aarau028.CSI5137.assignment.type.It;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;

/**
 * Detects the position of the it Token in the sentence (F1)
 * 
 * @author aarau028
 *
 */

public class ItPositioner extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		for (Sentence s : select(aJCas, Sentence.class)) {
			int pos = 1;
			for (Token t : selectCovered(Token.class, s)) {
				List<It> listIt = selectCovered(It.class, t);
				if (listIt.size() != 0) {
					It it = listIt.get(0);
					it.setItPosition(pos);
				}
				pos++;

			}
		}

	}

}
