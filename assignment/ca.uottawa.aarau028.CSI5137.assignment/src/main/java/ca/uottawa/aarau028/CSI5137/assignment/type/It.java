

/* First created by JCasGen Sun Nov 08 21:03:37 BRT 2020 */
package ca.uottawa.aarau028.CSI5137.assignment.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Nov 23 00:01:07 BRT 2020
 * XML source: C:/Users/17141908897/git/NLP-ML/assignment/ca.uottawa.aarau028.CSI5137.assignment/src/main/resources/desc/type/FirstTypeSystem.xml
 * @generated */
public class It extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(It.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected It() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public It(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public It(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public It(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: itPosition

  /** getter for itPosition - gets The position of the it token in the sentence (F1).
   * @generated
   * @return value of the feature 
   */
  public int getItPosition() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_itPosition == null)
      jcasType.jcas.throwFeatMissing("itPosition", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getIntValue(addr, ((It_Type)jcasType).casFeatCode_itPosition);}
    
  /** setter for itPosition - sets The position of the it token in the sentence (F1). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setItPosition(int v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_itPosition == null)
      jcasType.jcas.throwFeatMissing("itPosition", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setIntValue(addr, ((It_Type)jcasType).casFeatCode_itPosition, v);}    
   
    
  //*--------------*
  //* Feature: sentenceLength

  /** getter for sentenceLength - gets F2
   * @generated
   * @return value of the feature 
   */
  public int getSentenceLength() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_sentenceLength == null)
      jcasType.jcas.throwFeatMissing("sentenceLength", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getIntValue(addr, ((It_Type)jcasType).casFeatCode_sentenceLength);}
    
  /** setter for sentenceLength - sets F2 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceLength(int v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_sentenceLength == null)
      jcasType.jcas.throwFeatMissing("sentenceLength", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setIntValue(addr, ((It_Type)jcasType).casFeatCode_sentenceLength, v);}    
   
    
  //*--------------*
  //* Feature: punctuationCount

  /** getter for punctuationCount - gets F3
   * @generated
   * @return value of the feature 
   */
  public int getPunctuationCount() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_punctuationCount == null)
      jcasType.jcas.throwFeatMissing("punctuationCount", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getIntValue(addr, ((It_Type)jcasType).casFeatCode_punctuationCount);}
    
  /** setter for punctuationCount - sets F3 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPunctuationCount(int v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_punctuationCount == null)
      jcasType.jcas.throwFeatMissing("punctuationCount", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setIntValue(addr, ((It_Type)jcasType).casFeatCode_punctuationCount, v);}    
   
    
  //*--------------*
  //* Feature: precedingNPs

  /** getter for precedingNPs - gets F4
   * @generated
   * @return value of the feature 
   */
  public int getPrecedingNPs() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_precedingNPs == null)
      jcasType.jcas.throwFeatMissing("precedingNPs", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getIntValue(addr, ((It_Type)jcasType).casFeatCode_precedingNPs);}
    
  /** setter for precedingNPs - sets F4 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecedingNPs(int v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_precedingNPs == null)
      jcasType.jcas.throwFeatMissing("precedingNPs", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setIntValue(addr, ((It_Type)jcasType).casFeatCode_precedingNPs, v);}    
   
    
  //*--------------*
  //* Feature: succedingNPs

  /** getter for succedingNPs - gets F5
   * @generated
   * @return value of the feature 
   */
  public int getSuccedingNPs() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_succedingNPs == null)
      jcasType.jcas.throwFeatMissing("succedingNPs", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getIntValue(addr, ((It_Type)jcasType).casFeatCode_succedingNPs);}
    
  /** setter for succedingNPs - sets F5 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuccedingNPs(int v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_succedingNPs == null)
      jcasType.jcas.throwFeatMissing("succedingNPs", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setIntValue(addr, ((It_Type)jcasType).casFeatCode_succedingNPs, v);}    
   
    
  //*--------------*
  //* Feature: immediatelyFollowsPP

  /** getter for immediatelyFollowsPP - gets F6
   * @generated
   * @return value of the feature 
   */
  public boolean getImmediatelyFollowsPP() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_immediatelyFollowsPP == null)
      jcasType.jcas.throwFeatMissing("immediatelyFollowsPP", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((It_Type)jcasType).casFeatCode_immediatelyFollowsPP);}
    
  /** setter for immediatelyFollowsPP - sets F6 
   * @generated
   * @param v value to set into the feature 
   */
  public void setImmediatelyFollowsPP(boolean v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_immediatelyFollowsPP == null)
      jcasType.jcas.throwFeatMissing("immediatelyFollowsPP", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((It_Type)jcasType).casFeatCode_immediatelyFollowsPP, v);}    
   
    
  //*--------------*
  //* Feature: neighborPOSTags

  /** getter for neighborPOSTags - gets F7
   * @generated
   * @return value of the feature 
   */
  public String getNeighborPOSTags() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_neighborPOSTags == null)
      jcasType.jcas.throwFeatMissing("neighborPOSTags", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getStringValue(addr, ((It_Type)jcasType).casFeatCode_neighborPOSTags);}
    
  /** setter for neighborPOSTags - sets F7 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNeighborPOSTags(String v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_neighborPOSTags == null)
      jcasType.jcas.throwFeatMissing("neighborPOSTags", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setStringValue(addr, ((It_Type)jcasType).casFeatCode_neighborPOSTags, v);}    
   
    
  //*--------------*
  //* Feature: followedByIngVerb

  /** getter for followedByIngVerb - gets F8
   * @generated
   * @return value of the feature 
   */
  public boolean getFollowedByIngVerb() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_followedByIngVerb == null)
      jcasType.jcas.throwFeatMissing("followedByIngVerb", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((It_Type)jcasType).casFeatCode_followedByIngVerb);}
    
  /** setter for followedByIngVerb - sets F8 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFollowedByIngVerb(boolean v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_followedByIngVerb == null)
      jcasType.jcas.throwFeatMissing("followedByIngVerb", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((It_Type)jcasType).casFeatCode_followedByIngVerb, v);}    
   
    
  //*--------------*
  //* Feature: followedByPreposition

  /** getter for followedByPreposition - gets F9
   * @generated
   * @return value of the feature 
   */
  public boolean getFollowedByPreposition() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_followedByPreposition == null)
      jcasType.jcas.throwFeatMissing("followedByPreposition", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((It_Type)jcasType).casFeatCode_followedByPreposition);}
    
  /** setter for followedByPreposition - sets F9 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFollowedByPreposition(boolean v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_followedByPreposition == null)
      jcasType.jcas.throwFeatMissing("followedByPreposition", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((It_Type)jcasType).casFeatCode_followedByPreposition, v);}    
   
    
  //*--------------*
  //* Feature: adjectivesAfterCount

  /** getter for adjectivesAfterCount - gets F10
   * @generated
   * @return value of the feature 
   */
  public int getAdjectivesAfterCount() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_adjectivesAfterCount == null)
      jcasType.jcas.throwFeatMissing("adjectivesAfterCount", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getIntValue(addr, ((It_Type)jcasType).casFeatCode_adjectivesAfterCount);}
    
  /** setter for adjectivesAfterCount - sets F10 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdjectivesAfterCount(int v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_adjectivesAfterCount == null)
      jcasType.jcas.throwFeatMissing("adjectivesAfterCount", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setIntValue(addr, ((It_Type)jcasType).casFeatCode_adjectivesAfterCount, v);}    
   
    
  //*--------------*
  //* Feature: verbBefore

  /** getter for verbBefore - gets F11
   * @generated
   * @return value of the feature 
   */
  public boolean getVerbBefore() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_verbBefore == null)
      jcasType.jcas.throwFeatMissing("verbBefore", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((It_Type)jcasType).casFeatCode_verbBefore);}
    
  /** setter for verbBefore - sets F11 
   * @generated
   * @param v value to set into the feature 
   */
  public void setVerbBefore(boolean v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_verbBefore == null)
      jcasType.jcas.throwFeatMissing("verbBefore", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((It_Type)jcasType).casFeatCode_verbBefore, v);}    
   
    
  //*--------------*
  //* Feature: verbAfter

  /** getter for verbAfter - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getVerbAfter() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_verbAfter == null)
      jcasType.jcas.throwFeatMissing("verbAfter", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((It_Type)jcasType).casFeatCode_verbAfter);}
    
  /** setter for verbAfter - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVerbAfter(boolean v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_verbAfter == null)
      jcasType.jcas.throwFeatMissing("verbAfter", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((It_Type)jcasType).casFeatCode_verbAfter, v);}    
   
    
  //*--------------*
  //* Feature: adjectivesAfter

  /** getter for adjectivesAfter - gets F13
   * @generated
   * @return value of the feature 
   */
  public boolean getAdjectivesAfter() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_adjectivesAfter == null)
      jcasType.jcas.throwFeatMissing("adjectivesAfter", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((It_Type)jcasType).casFeatCode_adjectivesAfter);}
    
  /** setter for adjectivesAfter - sets F13 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdjectivesAfter(boolean v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_adjectivesAfter == null)
      jcasType.jcas.throwFeatMissing("adjectivesAfter", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((It_Type)jcasType).casFeatCode_adjectivesAfter, v);}    
   
    
  //*--------------*
  //* Feature: nounPhraseWithAdjectiveAfter

  /** getter for nounPhraseWithAdjectiveAfter - gets F14
   * @generated
   * @return value of the feature 
   */
  public boolean getNounPhraseWithAdjectiveAfter() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_nounPhraseWithAdjectiveAfter == null)
      jcasType.jcas.throwFeatMissing("nounPhraseWithAdjectiveAfter", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((It_Type)jcasType).casFeatCode_nounPhraseWithAdjectiveAfter);}
    
  /** setter for nounPhraseWithAdjectiveAfter - sets F14 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNounPhraseWithAdjectiveAfter(boolean v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_nounPhraseWithAdjectiveAfter == null)
      jcasType.jcas.throwFeatMissing("nounPhraseWithAdjectiveAfter", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((It_Type)jcasType).casFeatCode_nounPhraseWithAdjectiveAfter, v);}    
   
    
  //*--------------*
  //* Feature: tokensBeforeNextVerbInf

  /** getter for tokensBeforeNextVerbInf - gets F15
   * @generated
   * @return value of the feature 
   */
  public int getTokensBeforeNextVerbInf() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_tokensBeforeNextVerbInf == null)
      jcasType.jcas.throwFeatMissing("tokensBeforeNextVerbInf", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getIntValue(addr, ((It_Type)jcasType).casFeatCode_tokensBeforeNextVerbInf);}
    
  /** setter for tokensBeforeNextVerbInf - sets F15 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokensBeforeNextVerbInf(int v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_tokensBeforeNextVerbInf == null)
      jcasType.jcas.throwFeatMissing("tokensBeforeNextVerbInf", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setIntValue(addr, ((It_Type)jcasType).casFeatCode_tokensBeforeNextVerbInf, v);}    
   
    
  //*--------------*
  //* Feature: tokensBetweenItAndPreposition

  /** getter for tokensBetweenItAndPreposition - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTokensBetweenItAndPreposition() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_tokensBetweenItAndPreposition == null)
      jcasType.jcas.throwFeatMissing("tokensBetweenItAndPreposition", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getIntValue(addr, ((It_Type)jcasType).casFeatCode_tokensBetweenItAndPreposition);}
    
  /** setter for tokensBetweenItAndPreposition - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokensBetweenItAndPreposition(int v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_tokensBetweenItAndPreposition == null)
      jcasType.jcas.throwFeatMissing("tokensBetweenItAndPreposition", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setIntValue(addr, ((It_Type)jcasType).casFeatCode_tokensBetweenItAndPreposition, v);}    
   
    
  //*--------------*
  //* Feature: itImmediatelyFollowedByAdjNounPhrase

  /** getter for itImmediatelyFollowedByAdjNounPhrase - gets F17
   * @generated
   * @return value of the feature 
   */
  public boolean getItImmediatelyFollowedByAdjNounPhrase() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_itImmediatelyFollowedByAdjNounPhrase == null)
      jcasType.jcas.throwFeatMissing("itImmediatelyFollowedByAdjNounPhrase", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((It_Type)jcasType).casFeatCode_itImmediatelyFollowedByAdjNounPhrase);}
    
  /** setter for itImmediatelyFollowedByAdjNounPhrase - sets F17 
   * @generated
   * @param v value to set into the feature 
   */
  public void setItImmediatelyFollowedByAdjNounPhrase(boolean v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_itImmediatelyFollowedByAdjNounPhrase == null)
      jcasType.jcas.throwFeatMissing("itImmediatelyFollowedByAdjNounPhrase", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((It_Type)jcasType).casFeatCode_itImmediatelyFollowedByAdjNounPhrase, v);}    
   
    
  //*--------------*
  //* Feature: dependencyToClosest

  /** getter for dependencyToClosest - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDependencyToClosest() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_dependencyToClosest == null)
      jcasType.jcas.throwFeatMissing("dependencyToClosest", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getStringValue(addr, ((It_Type)jcasType).casFeatCode_dependencyToClosest);}
    
  /** setter for dependencyToClosest - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDependencyToClosest(String v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_dependencyToClosest == null)
      jcasType.jcas.throwFeatMissing("dependencyToClosest", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setStringValue(addr, ((It_Type)jcasType).casFeatCode_dependencyToClosest, v);}    
   
    
  //*--------------*
  //* Feature: followedByWeatherVerb

  /** getter for followedByWeatherVerb - gets F19
   * @generated
   * @return value of the feature 
   */
  public boolean getFollowedByWeatherVerb() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_followedByWeatherVerb == null)
      jcasType.jcas.throwFeatMissing("followedByWeatherVerb", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((It_Type)jcasType).casFeatCode_followedByWeatherVerb);}
    
  /** setter for followedByWeatherVerb - sets F19 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFollowedByWeatherVerb(boolean v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_followedByWeatherVerb == null)
      jcasType.jcas.throwFeatMissing("followedByWeatherVerb", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((It_Type)jcasType).casFeatCode_followedByWeatherVerb, v);}    
   
    
  //*--------------*
  //* Feature: FollowedByCognitiveVerb

  /** getter for FollowedByCognitiveVerb - gets F20
   * @generated
   * @return value of the feature 
   */
  public boolean getFollowedByCognitiveVerb() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_FollowedByCognitiveVerb == null)
      jcasType.jcas.throwFeatMissing("FollowedByCognitiveVerb", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((It_Type)jcasType).casFeatCode_FollowedByCognitiveVerb);}
    
  /** setter for FollowedByCognitiveVerb - sets F20 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFollowedByCognitiveVerb(boolean v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_FollowedByCognitiveVerb == null)
      jcasType.jcas.throwFeatMissing("FollowedByCognitiveVerb", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((It_Type)jcasType).casFeatCode_FollowedByCognitiveVerb, v);}    
   
    
  //*--------------*
  //* Feature: debug

  /** getter for debug - gets debug feature
   * @generated
   * @return value of the feature 
   */
  public String getDebug() {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_debug == null)
      jcasType.jcas.throwFeatMissing("debug", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return jcasType.ll_cas.ll_getStringValue(addr, ((It_Type)jcasType).casFeatCode_debug);}
    
  /** setter for debug - sets debug feature 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDebug(String v) {
    if (It_Type.featOkTst && ((It_Type)jcasType).casFeat_debug == null)
      jcasType.jcas.throwFeatMissing("debug", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    jcasType.ll_cas.ll_setStringValue(addr, ((It_Type)jcasType).casFeatCode_debug, v);}    
  }

    