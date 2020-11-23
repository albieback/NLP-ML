
/* First created by JCasGen Sun Nov 08 21:03:37 BRT 2020 */
package ca.uottawa.aarau028.CSI5137.assignment.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Mon Nov 23 04:11:48 BRT 2020
 * @generated */
public class It_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = It.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("ca.uottawa.aarau028.CSI5137.assignment.type.It");
 
  /** @generated */
  final Feature casFeat_itPosition;
  /** @generated */
  final int     casFeatCode_itPosition;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getItPosition(int addr) {
        if (featOkTst && casFeat_itPosition == null)
      jcas.throwFeatMissing("itPosition", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getIntValue(addr, casFeatCode_itPosition);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setItPosition(int addr, int v) {
        if (featOkTst && casFeat_itPosition == null)
      jcas.throwFeatMissing("itPosition", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setIntValue(addr, casFeatCode_itPosition, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentenceLength;
  /** @generated */
  final int     casFeatCode_sentenceLength;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSentenceLength(int addr) {
        if (featOkTst && casFeat_sentenceLength == null)
      jcas.throwFeatMissing("sentenceLength", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getIntValue(addr, casFeatCode_sentenceLength);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentenceLength(int addr, int v) {
        if (featOkTst && casFeat_sentenceLength == null)
      jcas.throwFeatMissing("sentenceLength", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setIntValue(addr, casFeatCode_sentenceLength, v);}
    
  
 
  /** @generated */
  final Feature casFeat_punctuationCount;
  /** @generated */
  final int     casFeatCode_punctuationCount;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPunctuationCount(int addr) {
        if (featOkTst && casFeat_punctuationCount == null)
      jcas.throwFeatMissing("punctuationCount", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getIntValue(addr, casFeatCode_punctuationCount);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPunctuationCount(int addr, int v) {
        if (featOkTst && casFeat_punctuationCount == null)
      jcas.throwFeatMissing("punctuationCount", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setIntValue(addr, casFeatCode_punctuationCount, v);}
    
  
 
  /** @generated */
  final Feature casFeat_precedingNPs;
  /** @generated */
  final int     casFeatCode_precedingNPs;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPrecedingNPs(int addr) {
        if (featOkTst && casFeat_precedingNPs == null)
      jcas.throwFeatMissing("precedingNPs", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getIntValue(addr, casFeatCode_precedingNPs);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrecedingNPs(int addr, int v) {
        if (featOkTst && casFeat_precedingNPs == null)
      jcas.throwFeatMissing("precedingNPs", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setIntValue(addr, casFeatCode_precedingNPs, v);}
    
  
 
  /** @generated */
  final Feature casFeat_succedingNPs;
  /** @generated */
  final int     casFeatCode_succedingNPs;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSuccedingNPs(int addr) {
        if (featOkTst && casFeat_succedingNPs == null)
      jcas.throwFeatMissing("succedingNPs", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getIntValue(addr, casFeatCode_succedingNPs);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSuccedingNPs(int addr, int v) {
        if (featOkTst && casFeat_succedingNPs == null)
      jcas.throwFeatMissing("succedingNPs", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setIntValue(addr, casFeatCode_succedingNPs, v);}
    
  
 
  /** @generated */
  final Feature casFeat_immediatelyFollowsPP;
  /** @generated */
  final int     casFeatCode_immediatelyFollowsPP;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getImmediatelyFollowsPP(int addr) {
        if (featOkTst && casFeat_immediatelyFollowsPP == null)
      jcas.throwFeatMissing("immediatelyFollowsPP", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_immediatelyFollowsPP);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setImmediatelyFollowsPP(int addr, boolean v) {
        if (featOkTst && casFeat_immediatelyFollowsPP == null)
      jcas.throwFeatMissing("immediatelyFollowsPP", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_immediatelyFollowsPP, v);}
    
  
 
  /** @generated */
  final Feature casFeat_neighborPOSTags;
  /** @generated */
  final int     casFeatCode_neighborPOSTags;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNeighborPOSTags(int addr) {
        if (featOkTst && casFeat_neighborPOSTags == null)
      jcas.throwFeatMissing("neighborPOSTags", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getStringValue(addr, casFeatCode_neighborPOSTags);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNeighborPOSTags(int addr, String v) {
        if (featOkTst && casFeat_neighborPOSTags == null)
      jcas.throwFeatMissing("neighborPOSTags", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setStringValue(addr, casFeatCode_neighborPOSTags, v);}
    
  
 
  /** @generated */
  final Feature casFeat_followedByIngVerb;
  /** @generated */
  final int     casFeatCode_followedByIngVerb;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getFollowedByIngVerb(int addr) {
        if (featOkTst && casFeat_followedByIngVerb == null)
      jcas.throwFeatMissing("followedByIngVerb", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_followedByIngVerb);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFollowedByIngVerb(int addr, boolean v) {
        if (featOkTst && casFeat_followedByIngVerb == null)
      jcas.throwFeatMissing("followedByIngVerb", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_followedByIngVerb, v);}
    
  
 
  /** @generated */
  final Feature casFeat_followedByPreposition;
  /** @generated */
  final int     casFeatCode_followedByPreposition;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getFollowedByPreposition(int addr) {
        if (featOkTst && casFeat_followedByPreposition == null)
      jcas.throwFeatMissing("followedByPreposition", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_followedByPreposition);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFollowedByPreposition(int addr, boolean v) {
        if (featOkTst && casFeat_followedByPreposition == null)
      jcas.throwFeatMissing("followedByPreposition", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_followedByPreposition, v);}
    
  
 
  /** @generated */
  final Feature casFeat_adjectivesAfterCount;
  /** @generated */
  final int     casFeatCode_adjectivesAfterCount;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAdjectivesAfterCount(int addr) {
        if (featOkTst && casFeat_adjectivesAfterCount == null)
      jcas.throwFeatMissing("adjectivesAfterCount", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getIntValue(addr, casFeatCode_adjectivesAfterCount);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAdjectivesAfterCount(int addr, int v) {
        if (featOkTst && casFeat_adjectivesAfterCount == null)
      jcas.throwFeatMissing("adjectivesAfterCount", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setIntValue(addr, casFeatCode_adjectivesAfterCount, v);}
    
  
 
  /** @generated */
  final Feature casFeat_verbBefore;
  /** @generated */
  final int     casFeatCode_verbBefore;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getVerbBefore(int addr) {
        if (featOkTst && casFeat_verbBefore == null)
      jcas.throwFeatMissing("verbBefore", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_verbBefore);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVerbBefore(int addr, boolean v) {
        if (featOkTst && casFeat_verbBefore == null)
      jcas.throwFeatMissing("verbBefore", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_verbBefore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_verbAfter;
  /** @generated */
  final int     casFeatCode_verbAfter;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getVerbAfter(int addr) {
        if (featOkTst && casFeat_verbAfter == null)
      jcas.throwFeatMissing("verbAfter", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_verbAfter);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVerbAfter(int addr, boolean v) {
        if (featOkTst && casFeat_verbAfter == null)
      jcas.throwFeatMissing("verbAfter", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_verbAfter, v);}
    
  
 
  /** @generated */
  final Feature casFeat_adjectivesAfter;
  /** @generated */
  final int     casFeatCode_adjectivesAfter;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getAdjectivesAfter(int addr) {
        if (featOkTst && casFeat_adjectivesAfter == null)
      jcas.throwFeatMissing("adjectivesAfter", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_adjectivesAfter);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAdjectivesAfter(int addr, boolean v) {
        if (featOkTst && casFeat_adjectivesAfter == null)
      jcas.throwFeatMissing("adjectivesAfter", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_adjectivesAfter, v);}
    
  
 
  /** @generated */
  final Feature casFeat_nounPhraseWithAdjectiveAfter;
  /** @generated */
  final int     casFeatCode_nounPhraseWithAdjectiveAfter;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getNounPhraseWithAdjectiveAfter(int addr) {
        if (featOkTst && casFeat_nounPhraseWithAdjectiveAfter == null)
      jcas.throwFeatMissing("nounPhraseWithAdjectiveAfter", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_nounPhraseWithAdjectiveAfter);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNounPhraseWithAdjectiveAfter(int addr, boolean v) {
        if (featOkTst && casFeat_nounPhraseWithAdjectiveAfter == null)
      jcas.throwFeatMissing("nounPhraseWithAdjectiveAfter", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_nounPhraseWithAdjectiveAfter, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokensBeforeNextVerbInf;
  /** @generated */
  final int     casFeatCode_tokensBeforeNextVerbInf;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTokensBeforeNextVerbInf(int addr) {
        if (featOkTst && casFeat_tokensBeforeNextVerbInf == null)
      jcas.throwFeatMissing("tokensBeforeNextVerbInf", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getIntValue(addr, casFeatCode_tokensBeforeNextVerbInf);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokensBeforeNextVerbInf(int addr, int v) {
        if (featOkTst && casFeat_tokensBeforeNextVerbInf == null)
      jcas.throwFeatMissing("tokensBeforeNextVerbInf", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setIntValue(addr, casFeatCode_tokensBeforeNextVerbInf, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokensBetweenItAndPreposition;
  /** @generated */
  final int     casFeatCode_tokensBetweenItAndPreposition;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTokensBetweenItAndPreposition(int addr) {
        if (featOkTst && casFeat_tokensBetweenItAndPreposition == null)
      jcas.throwFeatMissing("tokensBetweenItAndPreposition", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getIntValue(addr, casFeatCode_tokensBetweenItAndPreposition);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokensBetweenItAndPreposition(int addr, int v) {
        if (featOkTst && casFeat_tokensBetweenItAndPreposition == null)
      jcas.throwFeatMissing("tokensBetweenItAndPreposition", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setIntValue(addr, casFeatCode_tokensBetweenItAndPreposition, v);}
    
  
 
  /** @generated */
  final Feature casFeat_itImmediatelyFollowedByAdjNounPhrase;
  /** @generated */
  final int     casFeatCode_itImmediatelyFollowedByAdjNounPhrase;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getItImmediatelyFollowedByAdjNounPhrase(int addr) {
        if (featOkTst && casFeat_itImmediatelyFollowedByAdjNounPhrase == null)
      jcas.throwFeatMissing("itImmediatelyFollowedByAdjNounPhrase", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_itImmediatelyFollowedByAdjNounPhrase);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setItImmediatelyFollowedByAdjNounPhrase(int addr, boolean v) {
        if (featOkTst && casFeat_itImmediatelyFollowedByAdjNounPhrase == null)
      jcas.throwFeatMissing("itImmediatelyFollowedByAdjNounPhrase", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_itImmediatelyFollowedByAdjNounPhrase, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dependencyToClosest;
  /** @generated */
  final int     casFeatCode_dependencyToClosest;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDependencyToClosest(int addr) {
        if (featOkTst && casFeat_dependencyToClosest == null)
      jcas.throwFeatMissing("dependencyToClosest", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getStringValue(addr, casFeatCode_dependencyToClosest);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDependencyToClosest(int addr, String v) {
        if (featOkTst && casFeat_dependencyToClosest == null)
      jcas.throwFeatMissing("dependencyToClosest", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setStringValue(addr, casFeatCode_dependencyToClosest, v);}
    
  
 
  /** @generated */
  final Feature casFeat_followedByWeatherVerb;
  /** @generated */
  final int     casFeatCode_followedByWeatherVerb;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getFollowedByWeatherVerb(int addr) {
        if (featOkTst && casFeat_followedByWeatherVerb == null)
      jcas.throwFeatMissing("followedByWeatherVerb", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_followedByWeatherVerb);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFollowedByWeatherVerb(int addr, boolean v) {
        if (featOkTst && casFeat_followedByWeatherVerb == null)
      jcas.throwFeatMissing("followedByWeatherVerb", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_followedByWeatherVerb, v);}
    
  
 
  /** @generated */
  final Feature casFeat_followedByCognitiveVerb;
  /** @generated */
  final int     casFeatCode_followedByCognitiveVerb;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getFollowedByCognitiveVerb(int addr) {
        if (featOkTst && casFeat_followedByCognitiveVerb == null)
      jcas.throwFeatMissing("followedByCognitiveVerb", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_followedByCognitiveVerb);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFollowedByCognitiveVerb(int addr, boolean v) {
        if (featOkTst && casFeat_followedByCognitiveVerb == null)
      jcas.throwFeatMissing("followedByCognitiveVerb", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_followedByCognitiveVerb, v);}
    
  
 
  /** @generated */
  final Feature casFeat_debug;
  /** @generated */
  final int     casFeatCode_debug;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDebug(int addr) {
        if (featOkTst && casFeat_debug == null)
      jcas.throwFeatMissing("debug", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    return ll_cas.ll_getStringValue(addr, casFeatCode_debug);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDebug(int addr, String v) {
        if (featOkTst && casFeat_debug == null)
      jcas.throwFeatMissing("debug", "ca.uottawa.aarau028.CSI5137.assignment.type.It");
    ll_cas.ll_setStringValue(addr, casFeatCode_debug, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public It_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_itPosition = jcas.getRequiredFeatureDE(casType, "itPosition", "uima.cas.Integer", featOkTst);
    casFeatCode_itPosition  = (null == casFeat_itPosition) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_itPosition).getCode();

 
    casFeat_sentenceLength = jcas.getRequiredFeatureDE(casType, "sentenceLength", "uima.cas.Integer", featOkTst);
    casFeatCode_sentenceLength  = (null == casFeat_sentenceLength) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentenceLength).getCode();

 
    casFeat_punctuationCount = jcas.getRequiredFeatureDE(casType, "punctuationCount", "uima.cas.Integer", featOkTst);
    casFeatCode_punctuationCount  = (null == casFeat_punctuationCount) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_punctuationCount).getCode();

 
    casFeat_precedingNPs = jcas.getRequiredFeatureDE(casType, "precedingNPs", "uima.cas.Integer", featOkTst);
    casFeatCode_precedingNPs  = (null == casFeat_precedingNPs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precedingNPs).getCode();

 
    casFeat_succedingNPs = jcas.getRequiredFeatureDE(casType, "succedingNPs", "uima.cas.Integer", featOkTst);
    casFeatCode_succedingNPs  = (null == casFeat_succedingNPs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_succedingNPs).getCode();

 
    casFeat_immediatelyFollowsPP = jcas.getRequiredFeatureDE(casType, "immediatelyFollowsPP", "uima.cas.Boolean", featOkTst);
    casFeatCode_immediatelyFollowsPP  = (null == casFeat_immediatelyFollowsPP) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_immediatelyFollowsPP).getCode();

 
    casFeat_neighborPOSTags = jcas.getRequiredFeatureDE(casType, "neighborPOSTags", "uima.cas.String", featOkTst);
    casFeatCode_neighborPOSTags  = (null == casFeat_neighborPOSTags) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_neighborPOSTags).getCode();

 
    casFeat_followedByIngVerb = jcas.getRequiredFeatureDE(casType, "followedByIngVerb", "uima.cas.Boolean", featOkTst);
    casFeatCode_followedByIngVerb  = (null == casFeat_followedByIngVerb) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_followedByIngVerb).getCode();

 
    casFeat_followedByPreposition = jcas.getRequiredFeatureDE(casType, "followedByPreposition", "uima.cas.Boolean", featOkTst);
    casFeatCode_followedByPreposition  = (null == casFeat_followedByPreposition) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_followedByPreposition).getCode();

 
    casFeat_adjectivesAfterCount = jcas.getRequiredFeatureDE(casType, "adjectivesAfterCount", "uima.cas.Integer", featOkTst);
    casFeatCode_adjectivesAfterCount  = (null == casFeat_adjectivesAfterCount) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_adjectivesAfterCount).getCode();

 
    casFeat_verbBefore = jcas.getRequiredFeatureDE(casType, "verbBefore", "uima.cas.Boolean", featOkTst);
    casFeatCode_verbBefore  = (null == casFeat_verbBefore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_verbBefore).getCode();

 
    casFeat_verbAfter = jcas.getRequiredFeatureDE(casType, "verbAfter", "uima.cas.Boolean", featOkTst);
    casFeatCode_verbAfter  = (null == casFeat_verbAfter) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_verbAfter).getCode();

 
    casFeat_adjectivesAfter = jcas.getRequiredFeatureDE(casType, "adjectivesAfter", "uima.cas.Boolean", featOkTst);
    casFeatCode_adjectivesAfter  = (null == casFeat_adjectivesAfter) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_adjectivesAfter).getCode();

 
    casFeat_nounPhraseWithAdjectiveAfter = jcas.getRequiredFeatureDE(casType, "nounPhraseWithAdjectiveAfter", "uima.cas.Boolean", featOkTst);
    casFeatCode_nounPhraseWithAdjectiveAfter  = (null == casFeat_nounPhraseWithAdjectiveAfter) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nounPhraseWithAdjectiveAfter).getCode();

 
    casFeat_tokensBeforeNextVerbInf = jcas.getRequiredFeatureDE(casType, "tokensBeforeNextVerbInf", "uima.cas.Integer", featOkTst);
    casFeatCode_tokensBeforeNextVerbInf  = (null == casFeat_tokensBeforeNextVerbInf) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokensBeforeNextVerbInf).getCode();

 
    casFeat_tokensBetweenItAndPreposition = jcas.getRequiredFeatureDE(casType, "tokensBetweenItAndPreposition", "uima.cas.Integer", featOkTst);
    casFeatCode_tokensBetweenItAndPreposition  = (null == casFeat_tokensBetweenItAndPreposition) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokensBetweenItAndPreposition).getCode();

 
    casFeat_itImmediatelyFollowedByAdjNounPhrase = jcas.getRequiredFeatureDE(casType, "itImmediatelyFollowedByAdjNounPhrase", "uima.cas.Boolean", featOkTst);
    casFeatCode_itImmediatelyFollowedByAdjNounPhrase  = (null == casFeat_itImmediatelyFollowedByAdjNounPhrase) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_itImmediatelyFollowedByAdjNounPhrase).getCode();

 
    casFeat_dependencyToClosest = jcas.getRequiredFeatureDE(casType, "dependencyToClosest", "uima.cas.String", featOkTst);
    casFeatCode_dependencyToClosest  = (null == casFeat_dependencyToClosest) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dependencyToClosest).getCode();

 
    casFeat_followedByWeatherVerb = jcas.getRequiredFeatureDE(casType, "followedByWeatherVerb", "uima.cas.Boolean", featOkTst);
    casFeatCode_followedByWeatherVerb  = (null == casFeat_followedByWeatherVerb) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_followedByWeatherVerb).getCode();

 
    casFeat_followedByCognitiveVerb = jcas.getRequiredFeatureDE(casType, "followedByCognitiveVerb", "uima.cas.Boolean", featOkTst);
    casFeatCode_followedByCognitiveVerb  = (null == casFeat_followedByCognitiveVerb) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_followedByCognitiveVerb).getCode();

 
    casFeat_debug = jcas.getRequiredFeatureDE(casType, "debug", "uima.cas.String", featOkTst);
    casFeatCode_debug  = (null == casFeat_debug) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_debug).getCode();

  }
}



    