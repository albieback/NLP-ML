
/* First created by JCasGen Fri Oct 02 17:50:02 CEST 2020 */
package lu.svv.saa.nlp.demo.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Oct 02 17:50:02 CEST 2020
 * @generated */
public class ProductReview_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ProductReview.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("lu.svv.saa.nlp.demo.type.ProductReview");
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "lu.svv.saa.nlp.demo.type.ProductReview");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "lu.svv.saa.nlp.demo.type.ProductReview");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_productName;
  /** @generated */
  final int     casFeatCode_productName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getProductName(int addr) {
        if (featOkTst && casFeat_productName == null)
      jcas.throwFeatMissing("productName", "lu.svv.saa.nlp.demo.type.ProductReview");
    return ll_cas.ll_getStringValue(addr, casFeatCode_productName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setProductName(int addr, String v) {
        if (featOkTst && casFeat_productName == null)
      jcas.throwFeatMissing("productName", "lu.svv.saa.nlp.demo.type.ProductReview");
    ll_cas.ll_setStringValue(addr, casFeatCode_productName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_starsRating;
  /** @generated */
  final int     casFeatCode_starsRating;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStarsRating(int addr) {
        if (featOkTst && casFeat_starsRating == null)
      jcas.throwFeatMissing("starsRating", "lu.svv.saa.nlp.demo.type.ProductReview");
    return ll_cas.ll_getIntValue(addr, casFeatCode_starsRating);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStarsRating(int addr, int v) {
        if (featOkTst && casFeat_starsRating == null)
      jcas.throwFeatMissing("starsRating", "lu.svv.saa.nlp.demo.type.ProductReview");
    ll_cas.ll_setIntValue(addr, casFeatCode_starsRating, v);}
    
  
 
  /** @generated */
  final Feature casFeat_reviewType;
  /** @generated */
  final int     casFeatCode_reviewType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getReviewType(int addr) {
        if (featOkTst && casFeat_reviewType == null)
      jcas.throwFeatMissing("reviewType", "lu.svv.saa.nlp.demo.type.ProductReview");
    return ll_cas.ll_getStringValue(addr, casFeatCode_reviewType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReviewType(int addr, String v) {
        if (featOkTst && casFeat_reviewType == null)
      jcas.throwFeatMissing("reviewType", "lu.svv.saa.nlp.demo.type.ProductReview");
    ll_cas.ll_setStringValue(addr, casFeatCode_reviewType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ProductReview_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_productName = jcas.getRequiredFeatureDE(casType, "productName", "uima.cas.String", featOkTst);
    casFeatCode_productName  = (null == casFeat_productName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_productName).getCode();

 
    casFeat_starsRating = jcas.getRequiredFeatureDE(casType, "starsRating", "uima.cas.Integer", featOkTst);
    casFeatCode_starsRating  = (null == casFeat_starsRating) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_starsRating).getCode();

 
    casFeat_reviewType = jcas.getRequiredFeatureDE(casType, "reviewType", "uima.cas.String", featOkTst);
    casFeatCode_reviewType  = (null == casFeat_reviewType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reviewType).getCode();

  }
}



    