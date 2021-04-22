
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readAccountRightsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readAccountRightsOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctBasicDetails" type="{http://www.misys.com/cbs/types}accountBasicDetails"/>
 *         &lt;element name="acctRightsDetails" type="{http://www.misys.com/cbs/types}acctRightsDetails"/>
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
@XmlType(name = "readAccountRightsOutput", propOrder = {
    "acctBasicDetails",
    "acctRightsDetails",
    "userExtension",
    "hostExtension"
})
public class ReadAccountRightsOutput {

    @XmlElement(required = true)
    protected AccountBasicDetails acctBasicDetails;
    @XmlElement(required = true)
    protected AcctRightsDetails acctRightsDetails;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the acctBasicDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountBasicDetails }
     *     
     */
    public AccountBasicDetails getAcctBasicDetails() {
        return acctBasicDetails;
    }

    /**
     * Sets the value of the acctBasicDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountBasicDetails }
     *     
     */
    public void setAcctBasicDetails(AccountBasicDetails value) {
        this.acctBasicDetails = value;
    }

    /**
     * Gets the value of the acctRightsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRightsDetails }
     *     
     */
    public AcctRightsDetails getAcctRightsDetails() {
        return acctRightsDetails;
    }

    /**
     * Sets the value of the acctRightsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRightsDetails }
     *     
     */
    public void setAcctRightsDetails(AcctRightsDetails value) {
        this.acctRightsDetails = value;
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
