package lu.svv.saa.nlp.demo.io;

import static org.apache.uima.fit.util.JCasUtil.select;
import static org.apache.uima.fit.util.JCasUtil.selectCovered;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.uima.UimaContext;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.uimafit.component.JCasConsumer_ImplBase;
import org.uimafit.descriptor.ConfigurationParameter;
import de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import lu.svv.saa.nlp.demo.type.LexicalFeatures;
import lu.svv.saa.nlp.demo.type.SemanticFeatures;
import lu.svv.saa.nlp.demo.type.SyntacticFeatures;

public class FeatureMatrixWriter extends JCasConsumer_ImplBase {
  public static final String PARAM_PATH = "path";
  @ConfigurationParameter(name = PARAM_PATH, mandatory = true,
      description = "the path to the dataset")
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
    String cl = metadata.getDocumentTitle().substring(0, metadata.getDocumentTitle().indexOf("."))
        .toUpperCase();
    for (Sentence sentence : select(aJCas, Sentence.class)) {
      for (LexicalFeatures lexFeat : selectCovered(LexicalFeatures.class, sentence)) {
        featMatrix.append(lexFeat.getNumTokens() + "," + lexFeat.getNumPunctuation() + ","
            + lexFeat.getHasTokensWithRepetitiveLetters() + "," + lexFeat.getHasSentiment() + ","
            + lexFeat.getHasNE() + ",");
      }

      for (SyntacticFeatures synFeat : selectCovered(SyntacticFeatures.class, sentence)) {
        featMatrix.append(synFeat.getNumPronouns() + "," + synFeat.getNumNPs() + ","
            + synFeat.getHasFirstPersonPronouns() + "," + synFeat.getHasVerbToBeAdj() + ","
            + synFeat.getHasPassive() + ",");
      }

      for (SemanticFeatures semFeat : selectCovered(SemanticFeatures.class, sentence)) {
        featMatrix.append(semFeat.getHasStativeVerb() + "," + semFeat.getIsAnimateVerb() + ",");
      }

      featMatrix.append(cl + "\n");
    }
  }

  public void writeToFile(String content) {
    StringBuilder header = new StringBuilder();

    header.append("@relation OPINION-FACT\n\n");

    header.append("@attribute numTokens numeric\n");
    header.append("@attribute numPunctuation numeric\n");
    header.append("@attribute hasTokensWithRepetitiveLetters numeric\n");
    header.append("@attribute hasSentiment numeric\n");
    header.append("@attribute hasNE numeric\n");
    header.append("@attribute numPronouns numeric\n");
    header.append("@attribute numNPs numeric\n");
    header.append("@attribute hasFirstPersonPronouns numeric\n");
    header.append("@attribute hasVerbToBeAdj numeric\n");
    header.append("@attribute hasPassive numeric\n");
    header.append("@attribute hasStativeVerb numeric\n");
    header.append("@attribute isAnimateVerb numeric\n");

    header.append("@attribute class {OPINION, FACT}\n\n");
    header.append("@data\n");

    BufferedWriter writer = null;
    try {
      writer = new BufferedWriter(new FileWriter(path + "dataset.arff"));
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
    
  }

}
