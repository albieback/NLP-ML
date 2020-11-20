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
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.chunk.Chunk;

public class NounPhraseWithAdjectiveAfterDetector extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		for (Sentence s : select(aJCas, Sentence.class)) {
			int npwa = 0;

			// iterate over chunks in the sentence
			List<Chunk> chunks = selectCovered(Chunk.class, s);
			for (Chunk chunk : chunks) {

				for (Token t : selectCovered(Token.class, chunk)) {
					if (t.getPos().getCoarseValue().equals("ADJ"))
						npwa++;
				}
			}

			int i = 0;
			for (Chunk chunk : chunks) {

				for (Token t : selectCovered(Token.class, chunk)) {
					if (t.getPos().getCoarseValue().equals("ADJ")) {
						i++;
					}
				}

				for (It it : selectCovered(It.class, chunk)) {
					it.setNounPhraseWithAdjectiveAfter(npwa - i > 0);

				}

			}

		}
	}
}