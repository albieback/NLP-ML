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


public class SyntacticFeatures_Type extends Annotation_Type {
  /** @generated */
  public final static int typeIndexID = SyntacticFeatures.typeIndexID;
  /**
   * @generated
   * @modifiable
   */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("lu.svv.saa.nlp.demo.type.SyntacticFeatures");

  /**** Feature: numPronouns ****/
  /** @generated */
  final Feature casFeat_numPronouns;
  /** @generated */
  final int casFeatCode_numPronouns;

  /** @generated */
  public int getNumPronouns(int addr) {
        if (featOkTst && casFeat_numPronouns == null)
      jcas.throwFeatMissing("numPronouns", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numPronouns);
  }
  /** @generated */
  public void setNumPronouns(int addr, int v) {
        if (featOkTst && casFeat_numPronouns == null)
      jcas.throwFeatMissing("numPronouns", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    ll_cas.ll_setIntValue(addr, casFeatCode_numPronouns, v);}
    
  
 
  /**** Feature: numNPs ****/
  /** @generated */
  final Feature casFeat_numNPs;
  /** @generated */
  final int casFeatCode_numNPs;

  /** @generated */
  public int getNumNPs(int addr) {
        if (featOkTst && casFeat_numNPs == null)
      jcas.throwFeatMissing("numNPs", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numNPs);
  }
  /** @generated */
  public void setNumNPs(int addr, int v) {
        if (featOkTst && casFeat_numNPs == null)
      jcas.throwFeatMissing("numNPs", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    ll_cas.ll_setIntValue(addr, casFeatCode_numNPs, v);}
    
  
 
  /**** Feature: hasFirstPersonPronouns ****/
  /** @generated */
  final Feature casFeat_hasFirstPersonPronouns;
  /** @generated */
  final int casFeatCode_hasFirstPersonPronouns;

  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasFirstPersonPronouns(int addr) {
        if (featOkTst && casFeat_hasFirstPersonPronouns == null)
      jcas.throwFeatMissing("hasFirstPersonPronouns", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasFirstPersonPronouns);
  }
  /** @generated */
  public void setHasFirstPersonPronouns(int addr, boolean v) {
        if (featOkTst && casFeat_hasFirstPersonPronouns == null)
      jcas.throwFeatMissing("hasFirstPersonPronouns", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasFirstPersonPronouns, v);}
    
  
 
  /**** Feature: hasVerbToBeAdj ***/
  /** @generated */
  final Feature casFeat_hasVerbToBeAdj;
  /** @generated */
  final int casFeatCode_hasVerbToBeAdj;

  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasVerbToBeAdj(int addr) {
        if (featOkTst && casFeat_hasVerbToBeAdj == null)
      jcas.throwFeatMissing("hasVerbToBeAdj", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasVerbToBeAdj);
  }
  /** @generated */
  public void setHasVerbToBeAdj(int addr, boolean v) {
        if (featOkTst && casFeat_hasVerbToBeAdj == null)
      jcas.throwFeatMissing("hasVerbToBeAdj", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasVerbToBeAdj, v);}
    
  
 
  /**** Feature: hasPassive ***/
  /** @generated */
  final Feature casFeat_hasPassive;
  /** @generated */
  final int casFeatCode_hasPassive;

  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasPassive(int addr) {
        if (featOkTst && casFeat_hasPassive == null)
      jcas.throwFeatMissing("hasPassive", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasPassive);
  }
  /** @generated */
  public void setHasPassive(int addr, boolean v) {
        if (featOkTst && casFeat_hasPassive == null)
      jcas.throwFeatMissing("hasPassive", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasPassive, v);}
    
  



  /**
   * initialize variables to correspond with Cas Type and Features
   * 
   * @generated
   */
  public SyntacticFeatures_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_numPronouns = jcas.getRequiredFeatureDE(casType, "numPronouns", "uima.cas.Integer", featOkTst);
    casFeatCode_numPronouns  = (null == casFeat_numPronouns) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numPronouns).getCode();

 
    casFeat_hasFirstPersonPronouns = jcas.getRequiredFeatureDE(casType, "hasFirstPersonPronouns", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasFirstPersonPronouns  = (null == casFeat_hasFirstPersonPronouns) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasFirstPersonPronouns).getCode();

 
    casFeat_numNPs = jcas.getRequiredFeatureDE(casType, "numNPs", "uima.cas.Integer", featOkTst);
    casFeatCode_numNPs  = (null == casFeat_numNPs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numNPs).getCode();

 
    casFeat_hasVerbToBeAdj = jcas.getRequiredFeatureDE(casType, "hasVerbToBeAdj", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasVerbToBeAdj  = (null == casFeat_hasVerbToBeAdj) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasVerbToBeAdj).getCode();

 
    casFeat_hasPassive = jcas.getRequiredFeatureDE(casType, "hasPassive", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasPassive  = (null == casFeat_hasPassive) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasPassive).getCode();

  }
}
