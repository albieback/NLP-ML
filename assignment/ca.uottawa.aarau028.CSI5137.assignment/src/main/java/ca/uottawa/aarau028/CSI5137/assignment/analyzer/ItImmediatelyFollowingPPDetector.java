package ca.uottawa.aarau028.CSI5137.assignment.analyzer;

import static org.apache.uima.fit.util.JCasUtil.select;

import java.util.List;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import ca.uottawa.aarau028.CSI5137.assignment.type.It;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.chunk.Chunk;

public class ItImmediatelyFollowingPPDetector extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		for(It it : select(aJCas, It.class))
		{
			List<Chunk> previous = JCasUtil.selectPreceding(Chunk.class, it, 1);
			if (previous.size()>0 && previous.get(0).getChunkValue().equals("PP")) {
				
				it.setImmediatelyFollowsPP(true);
			}
			else it.setImmediatelyFollowsPP(false);


		}

	}

}
