package lu.svv.saa.nlp.demo.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;

public class LexicalFeatures extends Annotation {
  /**
   * @generated
   * @ordered
   */
  public final static int typeIndexID = JCasRegistry.register(LexicalFeatures.class);
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
  public LexicalFeatures() {/* intentionally empty block */}
    
  /**
   * Internal - constructor used by generator
   * 
   * @generated
   */
  public LexicalFeatures(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public LexicalFeatures(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */
  public LexicalFeatures(JCas jcas, int begin, int end) {
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
   * setter for hasTokensWithRepetitiveLetters
   * 
   * @generated
   */
  public void setHasTokensWithRepetitiveLetters(boolean v) {
    if (LexicalFeatures_Type.featOkTst && ((LexicalFeatures_Type)jcasType).casFeat_hasTokensWithRepetitiveLetters == null)
      jcasType.jcas.throwFeatMissing("hasTokensWithRepetitiveLetters", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((LexicalFeatures_Type)jcasType).casFeatCode_hasTokensWithRepetitiveLetters, v);}    
   
    
  //*--------------*
  //* Feature: hasSentiment

  /** getter for hasSentiment - gets Lex3-has a common adjective that expresses sentiment
   * @generated
   * @return value of the feature 
   */
  public boolean getHasSentiment() {
    if (LexicalFeatures_Type.featOkTst && ((LexicalFeatures_Type)jcasType).casFeat_hasSentiment == null)
      jcasType.jcas.throwFeatMissing("hasSentiment", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((LexicalFeatures_Type)jcasType).casFeatCode_hasSentiment);}
    
  // *--------------*
  // * Feature: numTokens

  /**
   * getter for number of tokens
   * 
   * @generated
   */
  public int getNumTokens() {
    if (LexicalFeatures_Type.featOkTst && ((LexicalFeatures_Type)jcasType).casFeat_numTokens == null)
      jcasType.jcas.throwFeatMissing("numTokens", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    return jcasType.ll_cas.ll_getIntValue(addr, ((LexicalFeatures_Type)jcasType).casFeatCode_numTokens);}
    
  /**
   * setter for number of tokens
   * 
   * @generated
   */
  public void setNumTokens(int v) {
    if (LexicalFeatures_Type.featOkTst && ((LexicalFeatures_Type)jcasType).casFeat_numTokens == null)
      jcasType.jcas.throwFeatMissing("numTokens", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    jcasType.ll_cas.ll_setIntValue(addr, ((LexicalFeatures_Type)jcasType).casFeatCode_numTokens, v);}    
   
    
  // *--------------*
  // * Feature: numPunctuation

  /**
   * getter for number of Punctuation words
   * 
   * @generated
   */
  public int getNumPunctuation() {
    if (LexicalFeatures_Type.featOkTst && ((LexicalFeatures_Type)jcasType).casFeat_numPunctuation == null)
      jcasType.jcas.throwFeatMissing("numPunctuation", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    return jcasType.ll_cas.ll_getIntValue(addr, ((LexicalFeatures_Type)jcasType).casFeatCode_numPunctuation);}
    
  /**
   * setter for number of words
   * 
   * @generated
   */
  public void setNumPunctuation(int v) {
    if (LexicalFeatures_Type.featOkTst && ((LexicalFeatures_Type)jcasType).casFeat_numPunctuation == null)
      jcasType.jcas.throwFeatMissing("numPunctuation", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    jcasType.ll_cas.ll_setIntValue(addr, ((LexicalFeatures_Type)jcasType).casFeatCode_numPunctuation, v);}    
   
    
  //*--------------*
  //* Feature: hasTokensWithRepetitiveLetters

  /** getter for hasTokensWithRepetitiveLetters - gets if the sentence contains tokens with repetitive letters
   * @generated
   * @return value of the feature 
   */
  public boolean getHasTokensWithRepetitiveLetters() {
    if (LexicalFeatures_Type.featOkTst && ((LexicalFeatures_Type)jcasType).casFeat_hasTokensWithRepetitiveLetters == null)
      jcasType.jcas.throwFeatMissing("hasTokensWithRepetitiveLetters", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((LexicalFeatures_Type)jcasType).casFeatCode_hasTokensWithRepetitiveLetters);}
    
  /**
   * setter for hasSentiment
   * 
   * @generated
   */
  public void setHasSentiment(boolean v) {
    if (LexicalFeatures_Type.featOkTst && ((LexicalFeatures_Type)jcasType).casFeat_hasSentiment == null)
      jcasType.jcas.throwFeatMissing("hasSentiment", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((LexicalFeatures_Type)jcasType).casFeatCode_hasSentiment, v);}    
   
    
  //*--------------*
  //* Feature: hasNE

  /** getter for hasNE - gets Lex4-has a named entity
   * @generated
   * @return value of the feature 
   */
  public boolean getHasNE() {
    if (LexicalFeatures_Type.featOkTst && ((LexicalFeatures_Type)jcasType).casFeat_hasNE == null)
      jcasType.jcas.throwFeatMissing("hasNE", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((LexicalFeatures_Type)jcasType).casFeatCode_hasNE);}
    
  /**
   * setter for hasNE
   * 
   * @generated
   */
  public void setHasNE(boolean v) {
    if (LexicalFeatures_Type.featOkTst && ((LexicalFeatures_Type)jcasType).casFeat_hasNE == null)
      jcasType.jcas.throwFeatMissing("hasNE", "lu.svv.saa.nlp.demo.type.LexicalFeatures");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((LexicalFeatures_Type)jcasType).casFeatCode_hasNE, v);}    
  }
