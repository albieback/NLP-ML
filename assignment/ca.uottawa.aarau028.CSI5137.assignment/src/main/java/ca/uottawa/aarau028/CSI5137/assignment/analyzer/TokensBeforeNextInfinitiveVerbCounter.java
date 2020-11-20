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

public class TokensBeforeNextInfinitiveVerbCounter extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {

		for (Sentence s : JCasUtil.select(aJCas, Sentence.class)) {
			List<Integer> infinitivePositions = new ArrayList<Integer>();
			int pos = 0;
			boolean toReached = false;
			boolean verbReached = false;
			for (Token t : JCasUtil.selectCovered(Token.class, s)) {
				pos++;
				if (t.getCoveredText().equalsIgnoreCase("to"))
					toReached = true;
				else if (toReached && t.getPos().getCoarseValue().equals("VERB"))
					verbReached = true;
				else {
					toReached = false;

					verbReached = false;

				}

				if (verbReached)
					infinitivePositions.add(pos - 2);

			}

			for (It it : JCasUtil.selectCovered(It.class, s)) {
				if (infinitivePositions.size() == 0) {
					it.setTokensBeforeNextVerbInf(0);
				} else {
					for (int i : infinitivePositions) {
						if (i >= it.getItPosition()) {
							it.setTokensBeforeNextVerbInf(i);
							break;
						}
					}

				}
			}

		}

	}

}
