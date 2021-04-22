
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxCodeBK" type="{http://www.misys.com/cbs/types}taxCodeBK" minOccurs="0"/>
 *         &lt;element name="taxCode" type="{http://www.misys.com/cbs/types}taxCode"/>
 *         &lt;element name="description" type="{http://www.misys.com/cbs/types}descriptionMedium"/>
 *         &lt;element name="currency" type="{http://www.misys.com/cbs/types}isoCurrencyCode"/>
 *         &lt;element name="taxRate" type="{http://www.misys.com/cbs/types}taxRate"/>
 *         &lt;element name="taxThreshold" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="taxRecAcctId" type="{http://www.misys.com/cbs/types}standardAccountId" minOccurs="0"/>
 *         &lt;element name="taxRecPseudonymId" type="{http://www.misys.com/cbs/types}pseudonymId" minOccurs="0"/>
 *         &lt;element name="hostTxnCode" type="{http://www.misys.com/cbs/types}hostTxnCode" minOccurs="0"/>
 *         &lt;element name="taxNarrative" type="{http://www.misys.com/cbs/types}taxNarrative" minOccurs="0"/>
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
@XmlType(name = "taxDetails", propOrder = {
    "taxCodeBK",
    "taxCode",
    "description",
    "currency",
    "taxRate",
    "taxThreshold",
    "taxRecAcctId",
    "taxRecPseudonymId",
    "hostTxnCode",
    "taxNarrative",
    "userExtension",
    "hostExtension"
})
@XmlSeeAlso({
    ListTaxDetail.class
})
public class TaxDetails {

    protected String taxCodeBK;
    @XmlElement(required = true)
    protected String taxCode;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    protected BigDecimal taxRate;
    protected BigDecimal taxThreshold;
    protected String taxRecAcctId;
    protected String taxRecPseudonymId;
    protected String hostTxnCode;
    protected String taxNarrative;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the taxCodeBK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCodeBK() {
        return taxCodeBK;
    }

    /**
     * Sets the value of the taxCodeBK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCodeBK(String value) {
        this.taxCodeBK = value;
    }

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * Gets the value of the taxRecAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRecAcctId() {
        return taxRecAcctId;
    }

    /**
     * Sets the value of the taxRecAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRecAcctId(String value) {
        this.taxRecAcctId = value;
    }

    /**
     * Gets the value of the taxRecPseudonymId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRecPseudonymId() {
        return taxRecPseudonymId;
    }

    /**
     * Sets the value of the taxRecPseudonymId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRecPseudonymId(String value) {
        this.taxRecPseudonymId = value;
    }

    /**
     * Gets the value of the hostTxnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTxnCode() {
        return hostTxnCode;
    }

    /**
     * Sets the value of the hostTxnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTxnCode(String value) {
        this.hostTxnCode = value;
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
