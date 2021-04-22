
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mandateDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mandateDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custId" type="{http://www.misys.com/cbs/types}custId"/>
 *         &lt;element name="misTxnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="narration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="financialLimit" type="{http://www.misys.com/cbs/types}cbsBfCurrencyAmount"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="select" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mandateDtls", propOrder = {
    "custId",
    "misTxnCode",
    "narration",
    "role",
    "financialLimit",
    "isActive",
    "select"
})
public class MandateDtls {

    @XmlElement(required = true)
    protected String custId;
    @XmlElement(required = true)
    protected String misTxnCode;
    @XmlElement(required = true)
    protected String narration;
    @XmlElement(required = true)
    protected String role;
    @XmlElement(required = true)
    protected CbsBfCurrencyAmount financialLimit;
    @XmlElement(defaultValue = "false")
    protected boolean isActive;
    @XmlElement(defaultValue = "false")
    protected boolean select;

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Gets the value of the misTxnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMisTxnCode() {
        return misTxnCode;
    }

    /**
     * Sets the value of the misTxnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMisTxnCode(String value) {
        this.misTxnCode = value;
    }

    /**
     * Gets the value of the narration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarration() {
        return narration;
    }

    /**
     * Sets the value of the narration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarration(String value) {
        this.narration = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the financialLimit property.
     * 
     * @return
     *     possible object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public CbsBfCurrencyAmount getFinancialLimit() {
        return financialLimit;
    }

    /**
     * Sets the value of the financialLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public void setFinancialLimit(CbsBfCurrencyAmount value) {
        this.financialLimit = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the select property.
     * 
     */
    public boolean isSelect() {
        return select;
    }

    /**
     * Sets the value of the select property.
     * 
     */
    public void setSelect(boolean value) {
        this.select = value;
    }

}
