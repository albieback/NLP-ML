package ca.uottawa.aarau028.CSI5137.assignment.analyzer;

import java.util.List;

import javax.swing.JOptionPane;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import ca.uottawa.aarau028.CSI5137.assignment.type.It;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.data.Synset;
import net.sf.extjwnl.dictionary.Dictionary;

public class FollowedByCognitiveVerbDetector extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		try {
			Dictionary d = Dictionary.getDefaultResourceInstance();
			for (Sentence sent : JCasUtil.select(aJCas, Sentence.class)) {
				for (It it : JCasUtil.selectCovered(It.class, sent)) {
					it.setFollowedByCognitiveVerb(false);
					for (Token token : JCasUtil.selectFollowing(Token.class, it, 1)) {
						IndexWord v;
						v = d.lookupIndexWord(POS.VERB, token.getCoveredText());
						if (v!= null) {
						List<Synset> senses = v.getSenses();
							for (Synset s : senses) {
								it.setDebug(s.getLexFileName());
								if (s.getLexFileName().contentEquals("verb.cognition")) {
									it.setFollowedByCognitiveVerb(true);
																	}
								
							}
						}

					}
				}
			}
		} catch (JWNLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}