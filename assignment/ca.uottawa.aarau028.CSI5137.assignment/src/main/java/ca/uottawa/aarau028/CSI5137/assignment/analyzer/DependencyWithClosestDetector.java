package ca.uottawa.aarau028.CSI5137.assignment.analyzer;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import ca.uottawa.aarau028.CSI5137.assignment.type.It;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency.Dependency;

public class DependencyWithClosestDetector extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		for (Sentence s : JCasUtil.select(aJCas, Sentence.class)) {
			for (It it : JCasUtil.selectCovered(It.class, s)) {
				String typeClosest = "NO_DEP";
				int distanceClosest = Integer.MAX_VALUE;

				int currentPos = 0;

				for (Token tok : JCasUtil.selectCovered(Token.class, it)) {
					currentPos++;
					for (Dependency dp : JCasUtil.selectCovered(Dependency.class, tok)) {
						if (dp.getGovernor().getCoveredText().equalsIgnoreCase(it.getCoveredText())
								|| dp.getDependent().getCoveredText().equalsIgnoreCase(it.getCoveredText())) {
							int distance = Math.abs(currentPos-it.getItPosition());
							if (distance < distanceClosest)
							{
								distanceClosest = distance;
								typeClosest = dp.getDependencyType();
							}

						}
					}

				}
				it.setDependencyToClosest(typeClosest);

			}
		}
	}
}
