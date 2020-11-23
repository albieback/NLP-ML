package lu.svv.saa.nlp.demo.type;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation_Type;


public class LexicalFeatures_Type extends Annotation_Type {
  /** @generated */
  public final static int typeIndexID = LexicalFeatures.typeIndexID;
  /**
   * @generated
   * @modifiable
   */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("lu.svv.saa.nlp.demo.type.LexicalFeatures");

  /**** Feature: numTokens ****/
  /** @generated */
  final Feature casFeat_numTokens;
  /** @generated */
  final int casFeatCode_numTokens;

  /** @generated */
  public int getNumTokens(int addr) {
        if (featOkTst && casFeat_numTokens == null)
      jcas.throwFeatMissing("numTokens", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numTokens);
  }
  /** @generated */
  public void setNumTokens(int addr, int v) {
        if (featOkTst && casFeat_numTokens == null)
      jcas.throwFeatMissing("numTokens", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    ll_cas.ll_setIntValue(addr, casFeatCode_numTokens, v);}
    
  
 
  /**** Feature: numPunctuation ***/
  /** @generated */
  final Feature casFeat_numPunctuation;
  /** @generated */
  final int casFeatCode_numPunctuation;

  /** @generated */
  public int getNumPunctuation(int addr) {
        if (featOkTst && casFeat_numPunctuation == null)
      jcas.throwFeatMissing("numPunctuation", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numPunctuation);
  }
  /** @generated */
  public void setNumPunctuation(int addr, int v) {
        if (featOkTst && casFeat_numPunctuation == null)
      jcas.throwFeatMissing("numPunctuation", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    ll_cas.ll_setIntValue(addr, casFeatCode_numPunctuation, v);}
    
  
 
  /**** Feature: hasTokensWithRepetitiveLetters ****/
  /** @generated */
  final Feature casFeat_hasTokensWithRepetitiveLetters;
  /** @generated */
  final int casFeatCode_hasTokensWithRepetitiveLetters;

  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasTokensWithRepetitiveLetters(int addr) {
        if (featOkTst && casFeat_hasTokensWithRepetitiveLetters == null)
      jcas.throwFeatMissing("hasTokensWithRepetitiveLetters", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasTokensWithRepetitiveLetters);
  }
  /** @generated */
  public void setHasTokensWithRepetitiveLetters(int addr, boolean v) {
        if (featOkTst && casFeat_hasTokensWithRepetitiveLetters == null)
      jcas.throwFeatMissing("hasTokensWithRepetitiveLetters", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasTokensWithRepetitiveLetters, v);}
    
  
 
  /**** Feature: hasSentiment ***/
  /** @generated */
  final Feature casFeat_hasSentiment;
  /** @generated */
  final int casFeatCode_hasSentiment;

  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasSentiment(int addr) {
        if (featOkTst && casFeat_hasSentiment == null)
      jcas.throwFeatMissing("hasSentiment", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasSentiment);
  }
  /** @generated */
  public void setHasSentiment(int addr, boolean v) {
        if (featOkTst && casFeat_hasSentiment == null)
      jcas.throwFeatMissing("hasSentiment", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasSentiment, v);}
    
  
 
  /**** Feature: hasNE ***/
  /** @generated */
  final Feature casFeat_hasNE;
  /** @generated */
  final int casFeatCode_hasNE;

  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasNE(int addr) {
        if (featOkTst && casFeat_hasNE == null)
      jcas.throwFeatMissing("hasNE", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasNE);
  }
  /** @generated */
  public void setHasNE(int addr, boolean v) {
        if (featOkTst && casFeat_hasNE == null)
      jcas.throwFeatMissing("hasNE", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasNE, v);}
    
  



  /**
   * initialize variables to correspond with Cas Type and Features
   * 
   * @generated
   */
  public LexicalFeatures_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_numTokens = jcas.getRequiredFeatureDE(casType, "numTokens", "uima.cas.Integer", featOkTst);
    casFeatCode_numTokens  = (null == casFeat_numTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numTokens).getCode();

 
    casFeat_numPunctuation = jcas.getRequiredFeatureDE(casType, "numPunctuation", "uima.cas.Integer", featOkTst);
    casFeatCode_numPunctuation  = (null == casFeat_numPunctuation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numPunctuation).getCode();

 
    casFeat_hasTokensWithRepetitiveLetters = jcas.getRequiredFeatureDE(casType, "hasTokensWithRepetitiveLetters", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasTokensWithRepetitiveLetters  = (null == casFeat_hasTokensWithRepetitiveLetters) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasTokensWithRepetitiveLetters).getCode();

 
    casFeat_hasSentiment = jcas.getRequiredFeatureDE(casType, "hasSentiment", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasSentiment  = (null == casFeat_hasSentiment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasSentiment).getCode();

 
    casFeat_hasNE = jcas.getRequiredFeatureDE(casType, "hasNE", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasNE  = (null == casFeat_hasNE) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasNE).getCode();

  }
}
