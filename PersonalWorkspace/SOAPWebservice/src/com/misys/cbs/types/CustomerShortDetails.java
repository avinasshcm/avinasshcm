
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerShortDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerShortDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerId" type="{http://www.misys.com/cbs/types}custId"/>
 *         &lt;element name="customerName" type="{http://www.misys.com/cbs/types}custFullName"/>
 *         &lt;element name="equivalentCustName" type="{http://www.misys.com/cbs/types}custFullName" minOccurs="0"/>
 *         &lt;element name="partyType" type="{http://www.misys.com/cbs/types}partyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerShortDetails", propOrder = {
    "customerId",
    "customerName",
    "equivalentCustName",
    "partyType"
})
public class CustomerShortDetails {

    @XmlElement(required = true)
    protected String customerId;
    @XmlElement(required = true)
    protected String customerName;
    protected String equivalentCustName;
    protected String partyType;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the equivalentCustName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentCustName() {
        return equivalentCustName;
    }

    /**
     * Sets the value of the equivalentCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentCustName(String value) {
        this.equivalentCustName = value;
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyType(String value) {
        this.partyType = value;
    }

}
