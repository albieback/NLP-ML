package ca.uottawa.aarau028.CSI5137.assignment.analyzer;

import static org.apache.uima.fit.util.JCasUtil.select;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import ca.uottawa.aarau028.CSI5137.assignment.type.It;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;

public class NeighborPOSTagsExtractor extends JCasAnnotator_ImplBase {

	// I am assuming that the following and preceding POS tags include
	// the ones from preceding and following sentences, since
	// nothing was said about that in the specification

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		for (Sentence s : select(aJCas, Sentence.class)) {
			Token currentToken = JCasUtil.selectCovered(Token.class, s).get(0);

			for (It it : JCasUtil.selectCovered(It.class, s)) {
				int pos = it.getItPosition();
				int absBefore = pos < 4 ? 5 - pos : 0;
				int absAfter = (it.getSentenceLength() - pos) < 4 ? 4 - (it.getSentenceLength() - pos) : 0;

				StringBuffer output = new StringBuffer();

				for (int i = 0; i < absBefore; i++) {
					output.append("ABS,");
				}

				if (absBefore < 4) {
					currentToken = JCasUtil
							.selectPreceding(Token.class, JCasUtil.selectCovered(Token.class, it).get(0), 4 - absBefore)
							.get(0);

					for (int i = 0; i < 4 - (absBefore); i++) {
						output.append(currentToken.getPos().getCoarseValue() + ",");
						currentToken = JCasUtil.selectFollowing(Token.class, currentToken, 1).get(0);
					}
				}

				for (int i = 0; i < 4 - (absAfter); i++) {
					
					currentToken = JCasUtil.selectFollowing(Token.class, currentToken, 1).get(0);
					output.append(currentToken.getPos().getCoarseValue() + ",");
				}
				for (int i = 0; i < absAfter; i++) {
					output.append("ABS,");
				}

				output.deleteCharAt(output.length() - 1);
				it.setNeighborPOSTags(output.toString());

			}
		}
	}

}
