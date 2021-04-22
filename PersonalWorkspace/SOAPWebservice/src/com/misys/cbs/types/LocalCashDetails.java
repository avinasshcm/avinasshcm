
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for localCashDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="localCashDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lclCashReceived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lclCashAmtDetails" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="lclCashAcctDetails" type="{http://www.misys.com/cbs/types}accountKeys" minOccurs="0"/>
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
@XmlType(name = "localCashDetails", propOrder = {
    "lclCashReceived",
    "lclCashAmtDetails",
    "lclCashAcctDetails",
    "userExtension",
    "hostExtension"
})
public class LocalCashDetails {

    protected boolean lclCashReceived;
    @XmlElement(required = true)
    protected Currency lclCashAmtDetails;
    protected AccountKeys lclCashAcctDetails;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the lclCashReceived property.
     * 
     */
    public boolean isLclCashReceived() {
        return lclCashReceived;
    }

    /**
     * Sets the value of the lclCashReceived property.
     * 
     */
    public void setLclCashReceived(boolean value) {
        this.lclCashReceived = value;
    }

    /**
     * Gets the value of the lclCashAmtDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getLclCashAmtDetails() {
        return lclCashAmtDetails;
    }

    /**
     * Sets the value of the lclCashAmtDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setLclCashAmtDetails(Currency value) {
        this.lclCashAmtDetails = value;
    }

    /**
     * Gets the value of the lclCashAcctDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getLclCashAcctDetails() {
        return lclCashAcctDetails;
    }

    /**
     * Sets the value of the lclCashAcctDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setLclCashAcctDetails(AccountKeys value) {
        this.lclCashAcctDetails = value;
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
