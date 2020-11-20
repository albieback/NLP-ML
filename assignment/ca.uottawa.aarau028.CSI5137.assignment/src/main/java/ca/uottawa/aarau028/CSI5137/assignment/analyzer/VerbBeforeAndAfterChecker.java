package ca.uottawa.aarau028.CSI5137.assignment.analyzer;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import ca.uottawa.aarau028.CSI5137.assignment.type.It;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;

public class VerbBeforeAndAfterChecker extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		for (Sentence s : JCasUtil.select(aJCas, Sentence.class)) {
			for (It it : JCasUtil.selectCovered(It.class, s)) {
				it.setVerbAfter(false);
				for(Token token : JCasUtil.selectFollowing(Token.class, it, it.getSentenceLength()-it.getItPosition()))
				{
					if (token.getPos().getCoarseValue().contentEquals("VERB")) it.setVerbAfter(true);
				}
				it.setVerbBefore(false);
				for(Token token : JCasUtil.selectPreceding(Token.class, it, it.getItPosition()))
				{
					if (token.getPos().getCoarseValue().contentEquals("VERB")) it.setVerbBefore(true);
				}

			}

		}

	}

}
