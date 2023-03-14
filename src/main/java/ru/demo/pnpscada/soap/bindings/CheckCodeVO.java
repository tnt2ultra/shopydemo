//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.14 at 03:37:10 PM MSK 
//


package ru.demo.pnpscada.soap.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkCodeVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkCodeVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeIsUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isBranchUser" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isUsedAll" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isUsedDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="locationChainId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="locationPromotionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkCodeVO", propOrder = {
    "codeIsUsed",
    "content",
    "isBranchUser",
    "isUsed",
    "isUsedAll",
    "isUsedDate",
    "locationChainId",
    "locationPromotionId"
})
public class CheckCodeVO {

    protected Boolean codeIsUsed;
    protected String content;
    protected Integer isBranchUser;
    protected Integer isUsed;
    protected Integer isUsedAll;
    protected Integer isUsedDate;
    protected Integer locationChainId;
    protected Integer locationPromotionId;

    /**
     * Gets the value of the codeIsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCodeIsUsed() {
        return codeIsUsed;
    }

    /**
     * Sets the value of the codeIsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCodeIsUsed(Boolean value) {
        this.codeIsUsed = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the isBranchUser property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsBranchUser() {
        return isBranchUser;
    }

    /**
     * Sets the value of the isBranchUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsBranchUser(Integer value) {
        this.isBranchUser = value;
    }

    /**
     * Gets the value of the isUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsUsed() {
        return isUsed;
    }

    /**
     * Sets the value of the isUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsUsed(Integer value) {
        this.isUsed = value;
    }

    /**
     * Gets the value of the isUsedAll property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsUsedAll() {
        return isUsedAll;
    }

    /**
     * Sets the value of the isUsedAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsUsedAll(Integer value) {
        this.isUsedAll = value;
    }

    /**
     * Gets the value of the isUsedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsUsedDate() {
        return isUsedDate;
    }

    /**
     * Sets the value of the isUsedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsUsedDate(Integer value) {
        this.isUsedDate = value;
    }

    /**
     * Gets the value of the locationChainId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocationChainId() {
        return locationChainId;
    }

    /**
     * Sets the value of the locationChainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocationChainId(Integer value) {
        this.locationChainId = value;
    }

    /**
     * Gets the value of the locationPromotionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocationPromotionId() {
        return locationPromotionId;
    }

    /**
     * Sets the value of the locationPromotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocationPromotionId(Integer value) {
        this.locationPromotionId = value;
    }

}
