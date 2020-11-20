package ca.uottawa.aarau028.CSI5137.assignment.analyzer;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import ca.uottawa.aarau028.CSI5137.assignment.type.It;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;

public class ItDetector extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas cas) throws AnalysisEngineProcessException {
		for (Token t : JCasUtil.select(cas, Token.class)) {
			if (t.getCoveredText().toLowerCase().equals("it")) {
				It annotation = new It(cas);
				annotation.setBegin(t.getBegin());
				annotation.setEnd(t.getEnd());
				annotation.addToIndexes();

			}
		}

	}

}
