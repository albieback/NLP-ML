package lu.svv.saa.nlp.demo.type;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation_Type;


public class SemanticFeatures_Type extends Annotation_Type {
  /** @generated */
  public final static int typeIndexID = SemanticFeatures.typeIndexID;
  /**
   * @generated
   * @modifiable
   */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("lu.svv.saa.nlp.demo.type.SemanticFeatures");


 
  /**** Feature: hasStativeVerb ****/
  /** @generated */
  final Feature casFeat_hasStativeVerb;
  /** @generated */
  final int casFeatCode_hasStativeVerb;

  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasStativeVerb(int addr) {
        if (featOkTst && casFeat_hasStativeVerb == null)
      jcas.throwFeatMissing("hasStativeVerb", "lu.svv.saa.nlp.demo.type.SemanticFeatures");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasStativeVerb);
  }
  /** @generated */
  public void setHasStativeVerb(int addr, boolean v) {
        if (featOkTst && casFeat_hasStativeVerb == null)
      jcas.throwFeatMissing("hasStativeVerb", "lu.svv.saa.nlp.demo.type.SemanticFeatures");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasStativeVerb, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isAnimateVerb;
  /** @generated */
  final int     casFeatCode_isAnimateVerb;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsAnimateVerb(int addr) {
        if (featOkTst && casFeat_isAnimateVerb == null)
      jcas.throwFeatMissing("isAnimateVerb", "lu.svv.saa.nlp.demo.type.SemanticFeatures");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isAnimateVerb);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsAnimateVerb(int addr, boolean v) {
        if (featOkTst && casFeat_isAnimateVerb == null)
      jcas.throwFeatMissing("isAnimateVerb", "lu.svv.saa.nlp.demo.type.SemanticFeatures");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isAnimateVerb, v);}
    
  



  /**
   * initialize variables to correspond with Cas Type and Features
   * 
   * @generated
   */
  public SemanticFeatures_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_hasStativeVerb = jcas.getRequiredFeatureDE(casType, "hasStativeVerb", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasStativeVerb  = (null == casFeat_hasStativeVerb) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasStativeVerb).getCode();

 
    casFeat_isAnimateVerb = jcas.getRequiredFeatureDE(casType, "isAnimateVerb", "uima.cas.Boolean", featOkTst);
    casFeatCode_isAnimateVerb  = (null == casFeat_isAnimateVerb) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isAnimateVerb).getCode();

  }
}
