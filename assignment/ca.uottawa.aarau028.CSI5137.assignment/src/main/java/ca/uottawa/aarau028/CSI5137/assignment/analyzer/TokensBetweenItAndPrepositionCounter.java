package ca.uottawa.aarau028.CSI5137.assignment.analyzer;

import java.util.ArrayList;
import java.util.List;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import ca.uottawa.aarau028.CSI5137.assignment.type.It;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;

public class TokensBetweenItAndPrepositionCounter extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {

		for (Sentence s : JCasUtil.select(aJCas, Sentence.class)) {
			List<Integer> prepositionPositions = new ArrayList<Integer>();
			int pos = 0;
			for (Token t : JCasUtil.selectCovered(Token.class, s)) {
				pos++;
			if (t.getPos().getCoarseValue().equals("ADP"))
				prepositionPositions.add(pos - 1);

			}

			for (It it : JCasUtil.selectCovered(It.class, s)) {
				if (prepositionPositions.size() == 0) {
					it.setTokensBetweenItAndPreposition(0);
				} else {
					for (int i : prepositionPositions) {
						if (i >= it.getItPosition()) {
							it.setTokensBetweenItAndPreposition(i-it.getItPosition());
							break;
						}
					}

				}
			}

		}

	}



}
