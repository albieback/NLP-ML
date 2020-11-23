

/* First created by JCasGen Fri Oct 02 17:50:02 CEST 2020 */
package lu.svv.saa.nlp.demo.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Oct 02 17:50:02 CEST 2020
 * XML source: /Users/sallam.abualhaija/eclipse-workspace/lu.svv.saa.nlp-demo/src/main/resources/desc/type/ProductReview.xml
 * @generated */
public class ProductReview extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ProductReview.class);
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
  protected ProductReview() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ProductReview(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ProductReview(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ProductReview(JCas jcas, int begin, int end) {
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
  //* Feature: id

  /** getter for id - gets F1-A unique identifier for this review
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (ProductReview_Type.featOkTst && ((ProductReview_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "lu.svv.saa.nlp.demo.type.ProductReview");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ProductReview_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets F1-A unique identifier for this review 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (ProductReview_Type.featOkTst && ((ProductReview_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "lu.svv.saa.nlp.demo.type.ProductReview");
    jcasType.ll_cas.ll_setStringValue(addr, ((ProductReview_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: productName

  /** getter for productName - gets F2-The name of product for on which this review is
   * @generated
   * @return value of the feature 
   */
  public String getProductName() {
    if (ProductReview_Type.featOkTst && ((ProductReview_Type)jcasType).casFeat_productName == null)
      jcasType.jcas.throwFeatMissing("productName", "lu.svv.saa.nlp.demo.type.ProductReview");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ProductReview_Type)jcasType).casFeatCode_productName);}
    
  /** setter for productName - sets F2-The name of product for on which this review is 
   * @generated
   * @param v value to set into the feature 
   */
  public void setProductName(String v) {
    if (ProductReview_Type.featOkTst && ((ProductReview_Type)jcasType).casFeat_productName == null)
      jcasType.jcas.throwFeatMissing("productName", "lu.svv.saa.nlp.demo.type.ProductReview");
    jcasType.ll_cas.ll_setStringValue(addr, ((ProductReview_Type)jcasType).casFeatCode_productName, v);}    
   
    
  //*--------------*
  //* Feature: starsRating

  /** getter for starsRating - gets F3-The number of stars given for this product
   * @generated
   * @return value of the feature 
   */
  public int getStarsRating() {
    if (ProductReview_Type.featOkTst && ((ProductReview_Type)jcasType).casFeat_starsRating == null)
      jcasType.jcas.throwFeatMissing("starsRating", "lu.svv.saa.nlp.demo.type.ProductReview");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ProductReview_Type)jcasType).casFeatCode_starsRating);}
    
  /** setter for starsRating - sets F3-The number of stars given for this product 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStarsRating(int v) {
    if (ProductReview_Type.featOkTst && ((ProductReview_Type)jcasType).casFeat_starsRating == null)
      jcasType.jcas.throwFeatMissing("starsRating", "lu.svv.saa.nlp.demo.type.ProductReview");
    jcasType.ll_cas.ll_setIntValue(addr, ((ProductReview_Type)jcasType).casFeatCode_starsRating, v);}    
   
    
  //*--------------*
  //* Feature: reviewType

  /** getter for reviewType - gets F4-The type of review (e.g., positive or critical)
   * @generated
   * @return value of the feature 
   */
  public String getReviewType() {
    if (ProductReview_Type.featOkTst && ((ProductReview_Type)jcasType).casFeat_reviewType == null)
      jcasType.jcas.throwFeatMissing("reviewType", "lu.svv.saa.nlp.demo.type.ProductReview");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ProductReview_Type)jcasType).casFeatCode_reviewType);}
    
  /** setter for reviewType - sets F4-The type of review (e.g., positive or critical) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReviewType(String v) {
    if (ProductReview_Type.featOkTst && ((ProductReview_Type)jcasType).casFeat_reviewType == null)
      jcasType.jcas.throwFeatMissing("reviewType", "lu.svv.saa.nlp.demo.type.ProductReview");
    jcasType.ll_cas.ll_setStringValue(addr, ((ProductReview_Type)jcasType).casFeatCode_reviewType, v);}    
  }

    