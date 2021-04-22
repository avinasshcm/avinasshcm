
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pseudonym complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pseudonym">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pseudonymId" type="{http://www.misys.com/cbs/types}pseudonymId"/>
 *         &lt;element name="pseudonymType" type="{http://www.misys.com/cbs/types}pseudonymType"/>
 *         &lt;element name="isoCurrencyCode" type="{http://www.misys.com/cbs/types}isoCurrencyCode"/>
 *         &lt;element name="branchCode" type="{http://www.misys.com/cbs/types}branchSortCode"/>
 *         &lt;element name="contextType" type="{http://www.misys.com/cbs/types}contextType"/>
 *         &lt;element name="contextValue" type="{http://www.misys.com/cbs/types}contextValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pseudonym", propOrder = {
    "pseudonymId",
    "pseudonymType",
    "isoCurrencyCode",
    "branchCode",
    "contextType",
    "contextValue"
})
public class Pseudonym {

    @XmlElement(required = true)
    protected String pseudonymId;
    @XmlElement(required = true)
    protected PseudonymType pseudonymType;
    @XmlElement(required = true)
    protected String isoCurrencyCode;
    @XmlElement(required = true)
    protected String branchCode;
    @XmlElement(required = true)
    protected ContextType contextType;
    @XmlElement(required = true)
    protected String contextValue;

    /**
     * Gets the value of the pseudonymId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudonymId() {
        return pseudonymId;
    }

    /**
     * Sets the value of the pseudonymId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudonymId(String value) {
        this.pseudonymId = value;
    }

    /**
     * Gets the value of the pseudonymType property.
     * 
     * @return
     *     possible object is
     *     {@link PseudonymType }
     *     
     */
    public PseudonymType getPseudonymType() {
        return pseudonymType;
    }

    /**
     * Sets the value of the pseudonymType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PseudonymType }
     *     
     */
    public void setPseudonymType(PseudonymType value) {
        this.pseudonymType = value;
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
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the contextType property.
     * 
     * @return
     *     possible object is
     *     {@link ContextType }
     *     
     */
    public ContextType getContextType() {
        return contextType;
    }

    /**
     * Sets the value of the contextType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextType }
     *     
     */
    public void setContextType(ContextType value) {
        this.contextType = value;
    }

    /**
     * Gets the value of the contextValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextValue() {
        return contextValue;
    }

    /**
     * Sets the value of the contextValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextValue(String value) {
        this.contextValue = value;
    }

}
