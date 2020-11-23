package lu.svv.saa.nlp.demo.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;

public class SemanticFeatures extends Annotation {
  /**
   * @generated
   * @ordered
   */
  public final static int typeIndexID = JCasRegistry.register(SemanticFeatures.class);
  /**
   * @generated
   * @ordered
   */
  public final static int type = typeIndexID;

  /** @generated */
  @Override
  public int getTypeIndexID() {return typeIndexID;}
 
  /**
   * Never called. Disable default constructor
   * 
   * @generated
   */
  public SemanticFeatures() {/* intentionally empty block */}
    
  /**
   * Internal - constructor used by generator
   * 
   * @generated
   */
  public SemanticFeatures(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SemanticFeatures(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */
  public SemanticFeatures(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc --> Write your own initialization here <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {}

  //*--------------*
  //* Feature: hasStativeVerb

  /** getter for hasStativeVerb - gets Sem1-if the sentence contains a stative verb
   * @generated
   * @return value of the feature 
   */
  public boolean getHasStativeVerb() {
    if (SemanticFeatures_Type.featOkTst && ((SemanticFeatures_Type)jcasType).casFeat_hasStativeVerb == null)
      jcasType.jcas.throwFeatMissing("hasStativeVerb", "lu.svv.saa.nlp.demo.type.SemanticFeatures");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SemanticFeatures_Type)jcasType).casFeatCode_hasStativeVerb);}
    
  /**
   * setter for hasStativeVerb
   * 
   * @generated
   */
  public void setHasStativeVerb(boolean v) {
    if (SemanticFeatures_Type.featOkTst && ((SemanticFeatures_Type)jcasType).casFeat_hasStativeVerb == null)
      jcasType.jcas.throwFeatMissing("hasStativeVerb", "lu.svv.saa.nlp.demo.type.SemanticFeatures");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SemanticFeatures_Type)jcasType).casFeatCode_hasStativeVerb, v);}    
   
    
  //*--------------*
  //* Feature: isAnimateVerb

  /** getter for isAnimateVerb - gets Sem2-if any verb in the sentence requires an animate subject, e.g., to eat
   * @generated
   * @return value of the feature 
   */
  public boolean getIsAnimateVerb() {
    if (SemanticFeatures_Type.featOkTst && ((SemanticFeatures_Type)jcasType).casFeat_isAnimateVerb == null)
      jcasType.jcas.throwFeatMissing("isAnimateVerb", "lu.svv.saa.nlp.demo.type.SemanticFeatures");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SemanticFeatures_Type)jcasType).casFeatCode_isAnimateVerb);}
    
  /** setter for isAnimateVerb - sets Sem2-if any verb in the sentence requires an animate subject, e.g., to eat 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsAnimateVerb(boolean v) {
    if (SemanticFeatures_Type.featOkTst && ((SemanticFeatures_Type)jcasType).casFeat_isAnimateVerb == null)
      jcasType.jcas.throwFeatMissing("isAnimateVerb", "lu.svv.saa.nlp.demo.type.SemanticFeatures");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SemanticFeatures_Type)jcasType).casFeatCode_isAnimateVerb, v);}    
  }
