package ca.uottawa.aarau028.CSI5137.assignment.analyzer;

import java.util.List;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import ca.uottawa.aarau028.CSI5137.assignment.type.It;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.chunk.Chunk;

public class ItImmediatelyFollowedByAdjNounPhraseDetector extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		for (Sentence s: JCasUtil.select(aJCas, Sentence.class))
		{
			for(It it: JCasUtil.selectCovered(It.class, s))
			{
				it.setItImmediatelyFollowedByAdjNounPhrase(false);
				List<Chunk> chunks = JCasUtil.selectFollowing(Chunk.class,it, 1);
				if (chunks.size()!=0)
				{
					Chunk chunk = chunks.get(0);
					if (chunk.getChunkValue().equalsIgnoreCase("np"))
					{
						Token t = JCasUtil.selectCovered(Token.class, chunk).get(0);
						if (t.getPos().getCoarseValue().equalsIgnoreCase("ADJ")) {
							it.setItImmediatelyFollowedByAdjNounPhrase(true);
						}
					}
				}
						
			}
		}

	}

}
