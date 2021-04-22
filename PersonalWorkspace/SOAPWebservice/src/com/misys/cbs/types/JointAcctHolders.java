
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jointAcctHolders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jointAcctHolders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerShortDetails" type="{http://www.misys.com/cbs/types}customerShortDetails" minOccurs="0"/>
 *         &lt;element name="fiscalIdNumber" type="{http://www.misys.com/cbs/types}fiscalIdNumber"/>
 *         &lt;element name="investmentPercentage" type="{http://www.misys.com/cbs/types}percentage"/>
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
@XmlType(name = "jointAcctHolders", propOrder = {
    "customerShortDetails",
    "fiscalIdNumber",
    "investmentPercentage",
    "userExtension",
    "hostExtension"
})
public class JointAcctHolders {

    protected CustomerShortDetails customerShortDetails;
    @XmlElement(required = true)
    protected String fiscalIdNumber;
    @XmlElement(required = true)
    protected BigDecimal investmentPercentage;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the customerShortDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerShortDetails }
     *     
     */
    public CustomerShortDetails getCustomerShortDetails() {
        return customerShortDetails;
    }

    /**
     * Sets the value of the customerShortDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerShortDetails }
     *     
     */
    public void setCustomerShortDetails(CustomerShortDetails value) {
        this.customerShortDetails = value;
    }

    /**
     * Gets the value of the fiscalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalIdNumber() {
        return fiscalIdNumber;
    }

    /**
     * Sets the value of the fiscalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalIdNumber(String value) {
        this.fiscalIdNumber = value;
    }

    /**
     * Gets the value of the investmentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvestmentPercentage() {
        return investmentPercentage;
    }

    /**
     * Sets the value of the investmentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvestmentPercentage(BigDecimal value) {
        this.investmentPercentage = value;
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
