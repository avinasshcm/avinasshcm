
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxCalcInputs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxCalcInputs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxCodeBK" type="{http://www.misys.com/cbs/types}taxCodeBK"/>
 *         &lt;element name="hostBranchCode" type="{http://www.misys.com/cbs/types}hostBranchCode"/>
 *         &lt;element name="taxableAmount" type="{http://www.misys.com/cbs/types}currency"/>
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
@XmlType(name = "taxCalcInputs", propOrder = {
    "taxCodeBK",
    "hostBranchCode",
    "taxableAmount",
    "userExtension",
    "hostExtension"
})
public class TaxCalcInputs {

    @XmlElement(required = true)
    protected String taxCodeBK;
    @XmlElement(required = true)
    protected String hostBranchCode;
    @XmlElement(required = true)
    protected Currency taxableAmount;
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
     * Gets the value of the hostBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostBranchCode() {
        return hostBranchCode;
    }

    /**
     * Sets the value of the hostBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostBranchCode(String value) {
        this.hostBranchCode = value;
    }

    /**
     * Gets the value of the taxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Sets the value of the taxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTaxableAmount(Currency value) {
        this.taxableAmount = value;
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
