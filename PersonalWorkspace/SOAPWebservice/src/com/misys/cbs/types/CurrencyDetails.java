
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currencyDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="currencyDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyCodeDetails" type="{http://www.misys.com/cbs/types}currencyCodeDetails"/>
 *         &lt;element name="currencyShortDetails" type="{http://www.misys.com/cbs/types}currencyShortDetails" minOccurs="0"/>
 *         &lt;element name="currencyLongDetails" type="{http://www.misys.com/cbs/types}currencyLongDetails"/>
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
@XmlType(name = "currencyDetails", propOrder = {
    "currencyCodeDetails",
    "currencyShortDetails",
    "currencyLongDetails",
    "userExtension",
    "hostExtension"
})
public class CurrencyDetails {

    @XmlElement(required = true)
    protected CurrencyCodeDetails currencyCodeDetails;
    protected CurrencyShortDetails currencyShortDetails;
    @XmlElement(required = true)
    protected CurrencyLongDetails currencyLongDetails;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the currencyCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeDetails }
     *     
     */
    public CurrencyCodeDetails getCurrencyCodeDetails() {
        return currencyCodeDetails;
    }

    /**
     * Sets the value of the currencyCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeDetails }
     *     
     */
    public void setCurrencyCodeDetails(CurrencyCodeDetails value) {
        this.currencyCodeDetails = value;
    }

    /**
     * Gets the value of the currencyShortDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyShortDetails }
     *     
     */
    public CurrencyShortDetails getCurrencyShortDetails() {
        return currencyShortDetails;
    }

    /**
     * Sets the value of the currencyShortDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyShortDetails }
     *     
     */
    public void setCurrencyShortDetails(CurrencyShortDetails value) {
        this.currencyShortDetails = value;
    }

    /**
     * Gets the value of the currencyLongDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyLongDetails }
     *     
     */
    public CurrencyLongDetails getCurrencyLongDetails() {
        return currencyLongDetails;
    }

    /**
     * Sets the value of the currencyLongDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyLongDetails }
     *     
     */
    public void setCurrencyLongDetails(CurrencyLongDetails value) {
        this.currencyLongDetails = value;
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
