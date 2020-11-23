package lu.svv.saa.nlp.demo.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;

public class SyntacticFeatures extends Annotation {
  /**
   * @generated
   * @ordered
   */
  public final static int typeIndexID = JCasRegistry.register(SyntacticFeatures.class);
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
  public SyntacticFeatures() {/* intentionally empty block */}
    
  /**
   * Internal - constructor used by generator
   * 
   * @generated
   */
  public SyntacticFeatures(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SyntacticFeatures(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */
  public SyntacticFeatures(JCas jcas, int begin, int end) {
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


  /**
   * Setter for hasFirstPersonPronouns
   * 
   * @generated
   */
  public void setHasFirstPersonPronouns(boolean v) {
    if (SyntacticFeatures_Type.featOkTst && ((SyntacticFeatures_Type)jcasType).casFeat_hasFirstPersonPronouns == null)
      jcasType.jcas.throwFeatMissing("hasFirstPersonPronouns", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SyntacticFeatures_Type)jcasType).casFeatCode_hasFirstPersonPronouns, v);}    
   
    
  // *--------------*
  // * Feature: numPronouns

  /**
   * Getter for numPronouns
   * 
   * @generated
   */
  public int getNumPronouns() {
    if (SyntacticFeatures_Type.featOkTst && ((SyntacticFeatures_Type)jcasType).casFeat_numPronouns == null)
      jcasType.jcas.throwFeatMissing("numPronouns", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    return jcasType.ll_cas.ll_getIntValue(addr, ((SyntacticFeatures_Type)jcasType).casFeatCode_numPronouns);}
    
  /**
   * Setter for numPronouns
   * 
   * @generated
   */
  public void setNumPronouns(int v) {
    if (SyntacticFeatures_Type.featOkTst && ((SyntacticFeatures_Type)jcasType).casFeat_numPronouns == null)
      jcasType.jcas.throwFeatMissing("numPronouns", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    jcasType.ll_cas.ll_setIntValue(addr, ((SyntacticFeatures_Type)jcasType).casFeatCode_numPronouns, v);}    
   
    
  //*--------------*
  //* Feature: hasFirstPersonPronouns

  /** getter for hasFirstPersonPronouns - gets Syn2-if the sentence has a first-person pronoun
   * @generated
   * @return value of the feature 
   */
  public boolean getHasFirstPersonPronouns() {
    if (SyntacticFeatures_Type.featOkTst && ((SyntacticFeatures_Type)jcasType).casFeat_hasFirstPersonPronouns == null)
      jcasType.jcas.throwFeatMissing("hasFirstPersonPronouns", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SyntacticFeatures_Type)jcasType).casFeatCode_hasFirstPersonPronouns);}
    
  // *--------------*
  // * Feature: numNPs

  /**
   * Getter for numNPs
   * 
   * @generated
   */
  public int getNumNPs() {
    if (SyntacticFeatures_Type.featOkTst && ((SyntacticFeatures_Type)jcasType).casFeat_numNPs == null)
      jcasType.jcas.throwFeatMissing("numNPs", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    return jcasType.ll_cas.ll_getIntValue(addr, ((SyntacticFeatures_Type)jcasType).casFeatCode_numNPs);}
    
  /**
   * Setter for numNPs
   * 
   * @generated
   */
  public void setNumNPs(int v) {
    if (SyntacticFeatures_Type.featOkTst && ((SyntacticFeatures_Type)jcasType).casFeat_numNPs == null)
      jcasType.jcas.throwFeatMissing("numNPs", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    jcasType.ll_cas.ll_setIntValue(addr, ((SyntacticFeatures_Type)jcasType).casFeatCode_numNPs, v);}    
   
    
  //*--------------*
  //* Feature: hasVerbToBeAdj

  /** getter for hasVerbToBeAdj - gets Syn4-if the sentence has a verb-to-be followed by an adjective
   * @generated
   * @return value of the feature 
   */
  public boolean getHasVerbToBeAdj() {
    if (SyntacticFeatures_Type.featOkTst && ((SyntacticFeatures_Type)jcasType).casFeat_hasVerbToBeAdj == null)
      jcasType.jcas.throwFeatMissing("hasVerbToBeAdj", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SyntacticFeatures_Type)jcasType).casFeatCode_hasVerbToBeAdj);}
    
  /**
   * setter for hasPassive
   * 
   * @generated
   */
  public void setHasPassive(boolean v) {
    if (SyntacticFeatures_Type.featOkTst && ((SyntacticFeatures_Type)jcasType).casFeat_hasPassive == null)
      jcasType.jcas.throwFeatMissing("hasPassive", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SyntacticFeatures_Type)jcasType).casFeatCode_hasPassive, v);}    
    /**
   * setter for hasVerbToBeAdj
   * 
   * @generated
   */
  public void setHasVerbToBeAdj(boolean v) {
    if (SyntacticFeatures_Type.featOkTst && ((SyntacticFeatures_Type)jcasType).casFeat_hasVerbToBeAdj == null)
      jcasType.jcas.throwFeatMissing("hasVerbToBeAdj", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SyntacticFeatures_Type)jcasType).casFeatCode_hasVerbToBeAdj, v);}    
   
    
  //*--------------*
  //* Feature: hasPassive

  /** getter for hasPassive - gets Syn5-if the sentence has passive voice
   * @generated
   * @return value of the feature 
   */
  public boolean getHasPassive() {
    if (SyntacticFeatures_Type.featOkTst && ((SyntacticFeatures_Type)jcasType).casFeat_hasPassive == null)
      jcasType.jcas.throwFeatMissing("hasPassive", "lu.svv.saa.nlp.demo.type.SyntacticFeatures");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SyntacticFeatures_Type)jcasType).casFeatCode_hasPassive);}
    
}
