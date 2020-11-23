package lu.svv.saa.nlp.demo.analysis;

import static org.apache.uima.fit.util.JCasUtil.select;
import static org.apache.uima.fit.util.JCasUtil.selectCovered;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.uimafit.component.JCasAnnotator_ImplBase;
import org.uimafit.descriptor.ConfigurationParameter;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS_VERB;
import de.tudarmstadt.ukp.dkpro.core.api.ner.type.NamedEntity;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.NGram;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.chunk.Chunk;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency.Dependency;
import edu.mit.jverbnet.data.IFrame;
import edu.mit.jverbnet.data.IThematicRole;
import edu.mit.jverbnet.data.IVerbClass;
import edu.mit.jverbnet.data.selection.SemRestrType;
import edu.mit.jverbnet.index.VerbIndex;
import lu.svv.saa.nlp.demo.type.LexicalFeatures;
import lu.svv.saa.nlp.demo.type.SemanticFeatures;
import lu.svv.saa.nlp.demo.type.SyntacticFeatures;
import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.data.Synset;
import net.sf.extjwnl.dictionary.Dictionary;

public class FeaturesExtractor extends JCasAnnotator_ImplBase {

  public static final String PARAM_VERBNET_PATH = "pathToVerbnet";
  @ConfigurationParameter(name = PARAM_VERBNET_PATH, mandatory = true,
      description = "the path to the verbnet")
  private String pathToVerbnet;

  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException {
    for (Sentence sent : select(jcas, Sentence.class)) {

      LexicalFeatures lexFeat = new LexicalFeatures(jcas);
      lexFeat.setBegin(sent.getBegin());
      lexFeat.setEnd(sent.getEnd());

      lexFeat.setNumTokens(getNumTokens(sent));
      lexFeat.setHasTokensWithRepetitiveLetters(repetitiveCharsToken(sent));
      lexFeat.setNumPunctuation(numPunctuation(sent));
      lexFeat.setHasSentiment(lookupSentiments(sent));
      lexFeat.setHasNE(hasNE(sent));

      lexFeat.addToIndexes();

      SyntacticFeatures synFeat = new SyntacticFeatures(jcas);
      synFeat.setBegin(sent.getBegin());
      synFeat.setEnd(sent.getEnd());

      synFeat.setNumPronouns(numPronouns(sent));
      synFeat.setNumNPs(numNPs(sent));
      synFeat.setHasFirstPersonPronouns(hasFirstPronouns(sent));
      synFeat.setHasVerbToBeAdj(hasVBToBeAdj(sent));
      synFeat.setHasPassive(hasPassive(sent));
      synFeat.addToIndexes();

      SemanticFeatures semFeat = new SemanticFeatures(jcas);
      semFeat.setBegin(sent.getBegin());
      semFeat.setEnd(sent.getEnd());

      try {
        semFeat.setHasStativeVerb(hasStativeVerb(sent));
        semFeat.setIsAnimateVerb(isAnimate(sent));
      } catch (JWNLException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
      semFeat.addToIndexes();
    }
  }

  /**** Lexical Features *****/
  // number of tokens
  public int getNumTokens(Sentence sent) {
    return selectCovered(Token.class, sent).size();
  }

  // Lex1-number of tokens with repetitive tokens
  public boolean repetitiveCharsToken(Sentence sent) {
    int consecutives = 0;
    for (Token token : selectCovered(Token.class, sent)) {
      char currentC = token.getCoveredText().toCharArray()[0];
      int index = 1;
      while (index < token.getCoveredText().toCharArray().length) {
        char nextC = token.getCoveredText().toCharArray()[index];
        if (currentC == nextC)
          ++consecutives;
        else
          currentC = nextC;
        if (consecutives > 2) {
          return true;
        }
        ++index;
      }
    }
    return false;
  }

  // Lex2-Number of punctuation marks in the sentence
  public int numPunctuation(Sentence sent) {
    int punctuationMarks = 0;
    for (Token token : selectCovered(Token.class, sent)) {
      if (token.getPos().getCoarseValue().toLowerCase().contains("punct")) {
        ++punctuationMarks;
      }
    }
    return punctuationMarks;
  }

  // Lex3-Look up sentiment adjectives from an external list
  private boolean lookupSentiments(Sentence sent) {
    if (selectCovered(NGram.class, sent).size() > 0)
      return true;
    return false;
  }

  // Lex4-Check if the sentence contains NE
  public boolean hasNE(Sentence sent) {
    if (selectCovered(NamedEntity.class, sent).size() > 0)
      return true;
    return false;
  }

  /**** Syntactic Features *****/
  // Syn1-Number of pronouns in the sentence
  public int numPronouns(Sentence sent) {
    int pronouns = 0;
    for (Token token : selectCovered(Token.class, sent)) {
      if (token.getPosValue().toLowerCase().startsWith("pr")) {
        ++pronouns;
      }
    }
    return pronouns;
  }

  // Syn2-Number of NPs in the sentence
  public int numNPs(Sentence sent) {
    int nps = 0;
    for (Chunk chunk : selectCovered(Chunk.class, sent)) {
      if (chunk.getChunkValue().equals("NP"))
        ++nps;
    }
    return nps;
  }

  // Syn3-Check if the sentence contains first person pronoun
  public boolean hasFirstPronouns(Sentence sent) {
    List<String> firsPronouns = new ArrayList<String>(Arrays.asList("i", "my", "we"));
    for (Token token : selectCovered(Token.class, sent)) {
      if (token.getPosValue().toLowerCase().startsWith("prp")
          && firsPronouns.contains(token.getCoveredText().toLowerCase())) {
        return true;
      }
    }
    return false;
  }

  // Syn4-Check if the sentence contains a verb-to-be followed by an adjective
  public boolean hasVBToBeAdj(Sentence sent) {
    boolean hasVB = false;
    boolean hasAdj = false;
    String vb = "";
    String adj = "";
    for (Dependency dep : selectCovered(Dependency.class, sent)) {
      // A cop (copula) is the relation of a function word used to link a subject to a nonverbal
      // predicate
      if (dep.getDependencyType().equalsIgnoreCase("cop")) {
        vb = dep.getDependent().getCoveredText();
        adj = dep.getGovernor().getCoveredText();
      }
    }
    for (Token token : selectCovered(Token.class, sent)) {
      if (token.getCoveredText().equals(vb) && token.getPosValue().toLowerCase().startsWith("vb"))
        hasVB = true;
      if (token.getCoveredText().equals(adj) && token.getPosValue().toLowerCase().equals("jj"))
        hasAdj = true;
    }
    return hasVB && hasAdj;
  }

  // Syn5-Check if the sentence has some passive voice
  public boolean hasPassive(Sentence sent) {
    boolean hasAux = false;
    boolean hasPP = false;
    String aux = "";
    String pp = "";
    for (Dependency dep : selectCovered(Dependency.class, sent)) {
      // "auxpass"-A passive auxiliary of a clause contains the passive information
      if (dep.getDependencyType().equalsIgnoreCase("auxpass")) {
        aux = dep.getDependent().getCoveredText();
        pp = dep.getGovernor().getCoveredText();
      }
    }
    for (Token token : selectCovered(Token.class, sent)) {
      // vbn-Verb, past participle
      if (token.getCoveredText().equals(aux) && token.getPosValue().toLowerCase().startsWith("vb"))
        hasAux = true;
      if (token.getCoveredText().equals(pp) && token.getPosValue().toLowerCase().equals("vbn"))
        hasPP = true;
    }
    return hasAux && hasPP;
  }

  /****
   * Semantic Features
   * 
   * @throws JWNLException
   *****/
  // Sem1-If the sentence has a stative verb
  public boolean hasStativeVerb(Sentence sent) throws JWNLException {
    Dictionary d = Dictionary.getDefaultResourceInstance();
    for (POS_VERB verb : selectCovered(POS_VERB.class, sent)) {
      IndexWord v;
      v = d.lookupIndexWord(POS.VERB, verb.getCoveredText());
      if (v != null && v.getSenses().size() > 0) {
        for (Synset synset : v.getSenses()) {
          if (synset.getLexFileName().contains("stative"))
            return true;
        }
      }
    }
    return false;
  }

  // Sem2-If any verb in the sentence requires an animate subject
  public boolean isAnimate(Sentence sent) throws IOException {
    File directory = new File(pathToVerbnet);
    final String[] files = directory.list();

    List<String> verbs = new ArrayList<String>();
    // get the verbs lemmas
    for (Token token : selectCovered(Token.class, sent)) {
      if (token.getPosValue().startsWith("VB")) {
        verbs.add(token.getLemmaValue());
      }
    }

    // look the verb up in verbnet
    for (String verb : verbs) {
      boolean found = false;
      for (final String filename : files) {
        if (filename.contains(verb)) {
          verb = filename.replace(".xml", "");
          found = true;
        }
      }

      if (found) {
        URL url = new URL("file", null, pathToVerbnet);
        VerbIndex index = new VerbIndex(url);
        index.open();
        IVerbClass v = index.getRootVerb(verb);
        if (v != null) {
          for (IFrame f : v.getFrames()) {
            for (IThematicRole t : f.getVerbClass().getThematicRoles()) {
              if (t.getType().getID().equalsIgnoreCase("agent"))
                for (Entry<SemRestrType, Boolean> entry : t.getSelRestrictions()
                    .getTypeRestrictions().entrySet()) {
                  if (entry.getKey().getID().equalsIgnoreCase("animate"))
                    return true;
                }
            }
          }
        }
        index.close();
      }
    }
    return false;
  }

  @Override
  public void collectionProcessComplete() {
    // nothing
  }
}
