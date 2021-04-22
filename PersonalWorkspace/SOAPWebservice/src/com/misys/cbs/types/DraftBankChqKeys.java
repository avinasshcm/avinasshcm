
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for draftBankChqKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="draftBankChqKeys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="draftBankChqRef" type="{http://www.misys.com/cbs/types}draftBankChqRef"/>
 *         &lt;element name="draftType" type="{http://www.misys.com/cbs/types}instrumentType"/>
 *         &lt;element name="issuingBankCode" type="{http://www.misys.com/cbs/types}issuingBankCode"/>
 *         &lt;element name="issuingBankBranchCode" type="{http://www.misys.com/cbs/types}issuingBankBranchCode" minOccurs="0"/>
 *         &lt;element name="isoCurrencyCode" type="{http://www.misys.com/cbs/types}isoCurrencyCode"/>
 *         &lt;element name="userExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="hostExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "draftBankChqKeys", propOrder = {
    "draftBankChqRef",
    "draftType",
    "issuingBankCode",
    "issuingBankBranchCode",
    "isoCurrencyCode",
    "userExtension",
    "hostExtension"
})
public class DraftBankChqKeys {

    @XmlElement(required = true)
    protected String draftBankChqRef;
    @XmlElement(required = true)
    protected String draftType;
    @XmlElement(required = true)
    protected String issuingBankCode;
    protected String issuingBankBranchCode;
    @XmlElement(required = true)
    protected String isoCurrencyCode;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the draftBankChqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraftBankChqRef() {
        return draftBankChqRef;
    }

    /**
     * Sets the value of the draftBankChqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraftBankChqRef(String value) {
        this.draftBankChqRef = value;
    }

    /**
     * Gets the value of the draftType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraftType() {
        return draftType;
    }

    /**
     * Sets the value of the draftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraftType(String value) {
        this.draftType = value;
    }

    /**
     * Gets the value of the issuingBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBankCode() {
        return issuingBankCode;
    }

    /**
     * Sets the value of the issuingBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBankCode(String value) {
        this.issuingBankCode = value;
    }

    /**
     * Gets the value of the issuingBankBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBankBranchCode() {
        return issuingBankBranchCode;
    }

    /**
     * Sets the value of the issuingBankBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBankBranchCode(String value) {
        this.issuingBankBranchCode = value;
    }

    /**
     * Gets the value of the isoCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCurrencyCode() {
        return isoCurrencyCode;
    }

    /**
     * Sets the value of the isoCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCurrencyCode(String value) {
        this.isoCurrencyCode = value;
    }

    /**
     * Gets the value of the userExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUserExtension() {
        return userExtension;
    }

    /**
     * Sets the value of the userExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUserExtension(Object value) {
        this.userExtension = value;
    }

    /**
     * Gets the value of the hostExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHostExtension() {
        return hostExtension;
    }

    /**
     * Sets the value of the hostExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHostExtension(Object value) {
        this.hostExtension = value;
    }

}
