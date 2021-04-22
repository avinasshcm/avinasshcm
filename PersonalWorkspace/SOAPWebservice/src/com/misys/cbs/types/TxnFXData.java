
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txnFXData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="txnFXData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buyEquivalent" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="sellEquivalent" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="buyAmtEntered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="exhangeRateDetails" type="{http://www.misys.com/cbs/types}exchangeRateDetails"/>
 *         &lt;element name="localRoundingDetails" type="{http://www.misys.com/cbs/types}localRoundingDetails" minOccurs="0"/>
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
@XmlType(name = "txnFXData", propOrder = {
    "buyEquivalent",
    "sellEquivalent",
    "buyAmtEntered",
    "exhangeRateDetails",
    "localRoundingDetails",
    "userExtension",
    "hostExtension"
})
public class TxnFXData {

    @XmlElement(required = true)
    protected Currency buyEquivalent;
    @XmlElement(required = true)
    protected Currency sellEquivalent;
    @XmlElement(defaultValue = "false")
    protected boolean buyAmtEntered;
    @XmlElement(required = true)
    protected ExchangeRateDetails exhangeRateDetails;
    protected LocalRoundingDetails localRoundingDetails;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the buyEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getBuyEquivalent() {
        return buyEquivalent;
    }

    /**
     * Sets the value of the buyEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setBuyEquivalent(Currency value) {
        this.buyEquivalent = value;
    }

    /**
     * Gets the value of the sellEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getSellEquivalent() {
        return sellEquivalent;
    }

    /**
     * Sets the value of the sellEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setSellEquivalent(Currency value) {
        this.sellEquivalent = value;
    }

    /**
     * Gets the value of the buyAmtEntered property.
     * 
     */
    public boolean isBuyAmtEntered() {
        return buyAmtEntered;
    }

    /**
     * Sets the value of the buyAmtEntered property.
     * 
     */
    public void setBuyAmtEntered(boolean value) {
        this.buyAmtEntered = value;
    }

    /**
     * Gets the value of the exhangeRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateDetails }
     *     
     */
    public ExchangeRateDetails getExhangeRateDetails() {
        return exhangeRateDetails;
    }

    /**
     * Sets the value of the exhangeRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateDetails }
     *     
     */
    public void setExhangeRateDetails(ExchangeRateDetails value) {
        this.exhangeRateDetails = value;
    }

    /**
     * Gets the value of the localRoundingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocalRoundingDetails }
     *     
     */
    public LocalRoundingDetails getLocalRoundingDetails() {
        return localRoundingDetails;
    }

    /**
     * Sets the value of the localRoundingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalRoundingDetails }
     *     
     */
    public void setLocalRoundingDetails(LocalRoundingDetails value) {
        this.localRoundingDetails = value;
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
