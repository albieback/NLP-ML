package lu.svv.saa.nlp.demo.io;

import static org.apache.uima.fit.util.JCasUtil.select;
import static org.apache.uima.fit.util.JCasUtil.selectCovered;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import de.tudarmstadt.ukp.dkpro.core.api.coref.type.CoreferenceChain;
import de.tudarmstadt.ukp.dkpro.core.api.coref.type.CoreferenceLink;
import de.tudarmstadt.ukp.dkpro.core.api.ner.type.NamedEntity;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.api.semantics.type.SemPred;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.chunk.Chunk;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.constituent.ROOT;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency.Dependency;
import de.tudarmstadt.ukp.dkpro.core.io.penntree.PennTreeUtils;

public class AnnotationWriter extends JCasConsumer_ImplBase {

  @Override
  public void process(JCas cas) throws AnalysisEngineProcessException {
    int sent_index = 1;
    for (Sentence sentence : select(cas, Sentence.class)) {
      System.out.printf("%n== Sentence_%d ==%n", sent_index++);
      System.out.println(sentence.getCoveredText());

      System.out.printf("  %-16s %-10s %-10s %-10s %-10s %n", "TOKEN", "LEMMA", "STEM", "CPOS", "POS");
      for (Token token : selectCovered(Token.class, sentence)) {
        System.out.printf("  %-16s %-10s %-10s %-10s %-10s %n", token.getCoveredText(),
            token.getLemma() != null ? token.getLemma().getValue() : "",
            token.getStem() != null ? token.getStem().getValue() : "",
            token.getPos().getClass().getSimpleName(), token.getPos().getPosValue());
      }

      System.out.printf("%n  -- Named Entities --%n");
      System.out.printf("  %-16s %-10s%n", "ENTITY-TYPE", "ENTITY-VALUE");
      for (NamedEntity ne : selectCovered(NamedEntity.class, sentence)) {
        System.out.printf("  %-16s %-10s%n", ne.getValue(), ne.getCoveredText());
      }

      System.out.printf("%n  -- Constituents --%n");
      for (ROOT root : selectCovered(ROOT.class, sentence)) {
        System.out.printf("  %s%n", PennTreeUtils.toPennTree(PennTreeUtils.convertPennTree(root)));
      }

      System.out.printf("%n  -- Chunks --%n");
      System.out.printf("  %-10s %-10s %n", "Chunk", "Value");
      for (Chunk chunk : selectCovered(Chunk.class, sentence)) {
        System.out.printf("  %-10s %-10s %n", chunk.getChunkValue(), chunk.getCoveredText());
      }

      System.out.printf("%n  -- Dependency relations --%n");
      System.out.printf("  %-16s %-10s %-10s %n", "DEPREL", "DEP", "GOV");
      for (Dependency dep : selectCovered(Dependency.class, sentence)) {
        System.out.printf("  %-16s %-10s %-10s %n", dep.getDependencyType(),
            dep.getDependent().getCoveredText(), dep.getGovernor().getCoveredText());
      }
      System.out.printf("%n  -- Semantic structure --%n");
      for (SemPred pred : selectCovered(SemPred.class, sentence)) {
          System.out.printf("  %-10s  ", pred.getCategory());
         for (int i=0;i<pred.getArguments().size();++i){
            System.out.printf(" %2s: %-8s", pred.getArguments(i).getRole()
                , pred.getArguments(i).getTarget().getCoveredText());
          }
          System.out.printf("%n");
      }
    }

    System.out.printf("%n== Coreference chains (for the whole document) ==%n");
    for (CoreferenceChain chain : select(cas, CoreferenceChain.class)) {
      CoreferenceLink link = chain.getFirst();
      while (link.getNext() != null) {
        System.out.printf("-> %s (%s) ", link.getCoveredText(), link.getReferenceType());
        link = link.getNext();
      }
      System.out.printf("%n");
    }
  }

  @Override
  public void collectionProcessComplete() {
    // nothing
  }

}
