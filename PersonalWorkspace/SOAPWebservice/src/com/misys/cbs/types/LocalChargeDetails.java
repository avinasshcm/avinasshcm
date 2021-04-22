
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for localChargeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="localChargeDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lclChgAmtDetails" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="lclChgChgAcct" type="{http://www.misys.com/cbs/types}accountKeys"/>
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
@XmlType(name = "localChargeDetails", propOrder = {
    "lclChgAmtDetails",
    "lclChgChgAcct",
    "userExtension",
    "hostExtension"
})
public class LocalChargeDetails {

    @XmlElement(required = true)
    protected Currency lclChgAmtDetails;
    @XmlElement(required = true)
    protected AccountKeys lclChgChgAcct;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the lclChgAmtDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getLclChgAmtDetails() {
        return lclChgAmtDetails;
    }

    /**
     * Sets the value of the lclChgAmtDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setLclChgAmtDetails(Currency value) {
        this.lclChgAmtDetails = value;
    }

    /**
     * Gets the value of the lclChgChgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getLclChgChgAcct() {
        return lclChgChgAcct;
    }

    /**
     * Sets the value of the lclChgChgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setLclChgChgAcct(AccountKeys value) {
        this.lclChgChgAcct = value;
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
