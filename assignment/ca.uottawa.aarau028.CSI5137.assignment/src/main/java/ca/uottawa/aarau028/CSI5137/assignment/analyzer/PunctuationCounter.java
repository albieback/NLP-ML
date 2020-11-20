package ca.uottawa.aarau028.CSI5137.assignment.analyzer;

import static org.apache.uima.fit.util.JCasUtil.select;
import static org.apache.uima.fit.util.JCasUtil.selectCovered;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import ca.uottawa.aarau028.CSI5137.assignment.type.It;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;

public class PunctuationCounter extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		for (Sentence s : select(aJCas, Sentence.class)) {
			int punctuationMarks = 0;
			for (Token t : selectCovered(Token.class, s)) {
				if (t.getPos().getCoarseValue().toLowerCase().contains("punct")) {
					++punctuationMarks;
				}
				for (It it : selectCovered(It.class, s)) {
					it.setPunctuationCount(punctuationMarks);
				}
			}

		}

	}
}