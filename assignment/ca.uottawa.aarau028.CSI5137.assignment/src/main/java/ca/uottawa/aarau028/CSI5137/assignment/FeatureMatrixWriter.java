package ca.uottawa.aarau028.CSI5137.assignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.uimafit.component.JCasConsumer_ImplBase;
import org.uimafit.descriptor.ConfigurationParameter;

import ca.uottawa.aarau028.CSI5137.assignment.type.It;
import de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;

public class FeatureMatrixWriter extends JCasConsumer_ImplBase {
    public static final String PARAM_PATH = "path";
    @ConfigurationParameter(name = PARAM_PATH, mandatory = true, description = "the path to the dataset")

    private String path;

    StringBuilder featMatrix;

    @Override
    public void initialize(final UimaContext context) throws ResourceInitializationException {
        super.initialize(context);
        featMatrix = new StringBuilder();
    }

    @Override
    public void process(JCas aJCas) throws AnalysisEngineProcessException {

        DocumentMetaData metadata = DocumentMetaData.get(aJCas);
        String theClass = metadata.getDocumentTitle().substring(0, metadata.getDocumentTitle().indexOf("."))
                .toUpperCase();
        for (Sentence sentence : JCasUtil.select(aJCas, Sentence.class)) {
            for (It it : JCasUtil.selectCovered(It.class, sentence)) {
                featMatrix.append(it.getItPosition() + "," + it.getSentenceLength() + "," + it.getPunctuationCount()
                        + "," + it.getPrecedingNPs() + "," + it.getSuccedingNPs() + "," + it.getImmediatelyFollowsPP()
                        + "," + it.getNeighborPOSTags() + "," + it.getFollowedByIngVerb() + ","
                        + it.getFollowedByPreposition() + "," + it.getAdjectivesAfterCount() + "," + it.getVerbBefore()
                        + "," + it.getVerbAfter() + "," + it.getAdjectivesAfter() + ","
                        + it.getNounPhraseWithAdjectiveAfter() + "," + it.getTokensBeforeNextVerbInf() + ","
                        + it.getTokensBetweenItAndPreposition() + "," + it.getItImmediatelyFollowedByAdjNounPhrase()
                        + "," + it.getDependencyToClosest() + "," + it.getFollowedByWeatherVerb() + ","
                        + it.getFollowedByCognitiveVerb() + ",");
                featMatrix.append(theClass + "\n");
            }
        }

    }

    public void writeToFile(String content) {

        StringBuilder header = new StringBuilder();

        header.append("@relation ASSIGNMENT3-AASL\n\n");

        header.append("@attribute itPosition numeric\n");
        header.append("@attribute sentenceLength numeric\n");
        header.append("@attribute punctuationCount numeric\n");
        header.append("@attribute precedingNPs numeric\n");
        header.append("@attribute succedingNPs numeric \n");
        header.append("@attribute immediatelyFollowsPP numeric\n");
        header.append("@attribute neighborPOSTags1 string\n");
        header.append("@attribute neighborPOSTags2 string\n");
        header.append("@attribute neighborPOSTags3 string\n");
        header.append("@attribute neighborPOSTags4 string\n");
        header.append("@attribute neighborPOSTags5 string\n");
        header.append("@attribute neighborPOSTags6 string\n");
        header.append("@attribute neighborPOSTags7 string\n");
        header.append("@attribute neighborPOSTags8 string\n");
        header.append("@attribute followedByIngVerb numeric\n");
        header.append("@attribute followedByPreposition numeric\n");
        header.append("@attribute adjectivesAfterCount numeric\n");
        header.append("@attribute verbBefore numeric\n");
        header.append("@attribute verbAfter numeric\n");
        header.append("@attribute adjectivesAfter numeric\n");
        header.append("@attribute nounPhraseWithAdjectiveAfter numeric\n");
        header.append("@attribute tokensBeforeNextVerbInf numeric\n");
        header.append("@attribute tokensBetweenItAndPreposition numeric\n");
        header.append("@attribute itImmediatelyFollowedByAdjNounPhrase numeric\n");
        header.append("@attribute dependencyToClosest string\n");
        header.append("@attribute followedByWeatherVerb numeric\n");
        header.append("@attribute followedByCognitiveVerb numeric\n");

        header.append("@attribute class {NOMANAPH, CLAUSEANAPH}\n\n");
        header.append("@data\n");

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("output/feature-matrix-a3.arff"));
            writer.write(header.toString() + content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void collectionProcessComplete() {
        String data = featMatrix.toString().replaceAll("true", "1").replaceAll("false", "0");

        writeToFile(data);

        System.out.println("Dataset created successfully... ");

        System.out.println(featMatrix);

    }

}