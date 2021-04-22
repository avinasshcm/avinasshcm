
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxCalcResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxCalcResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxCode" type="{http://www.misys.com/cbs/types}taxCode"/>
 *         &lt;element name="taxRate" type="{http://www.misys.com/cbs/types}percentage"/>
 *         &lt;element name="taxThreshold" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="taxAmount" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="taxReceivingAcct" type="{http://www.misys.com/cbs/types}accountKeys"/>
 *         &lt;element name="taxNarrative" type="{http://www.misys.com/cbs/types}taxNarrative" minOccurs="0"/>
 *         &lt;element name="taxHostTxnCode" type="{http://www.misys.com/cbs/types}hostTxnCode" minOccurs="0"/>
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
@XmlType(name = "taxCalcResults", propOrder = {
    "taxCode",
    "taxRate",
    "taxThreshold",
    "taxAmount",
    "taxReceivingAcct",
    "taxNarrative",
    "taxHostTxnCode",
    "userExtension",
    "hostExtension"
})
public class TaxCalcResults {

    @XmlElement(required = true)
    protected String taxCode;
    @XmlElement(required = true)
    protected BigDecimal taxRate;
    protected BigDecimal taxThreshold;
    @XmlElement(required = true)
    protected Currency taxAmount;
    @XmlElement(required = true)
    protected AccountKeys taxReceivingAcct;
    protected String taxNarrative;
    protected String taxHostTxnCode;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxThreshold() {
        return taxThreshold;
    }

    /**
     * Sets the value of the taxThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxThreshold(BigDecimal value) {
        this.taxThreshold = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTaxAmount(Currency value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxReceivingAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getTaxReceivingAcct() {
        return taxReceivingAcct;
    }

    /**
     * Sets the value of the taxReceivingAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setTaxReceivingAcct(AccountKeys value) {
        this.taxReceivingAcct = value;
    }

    /**
     * Gets the value of the taxNarrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNarrative() {
        return taxNarrative;
    }

    /**
     * Sets the value of the taxNarrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNarrative(String value) {
        this.taxNarrative = value;
    }

    /**
     * Gets the value of the taxHostTxnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxHostTxnCode() {
        return taxHostTxnCode;
    }

    /**
     * Sets the value of the taxHostTxnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxHostTxnCode(String value) {
        this.taxHostTxnCode = value;
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
