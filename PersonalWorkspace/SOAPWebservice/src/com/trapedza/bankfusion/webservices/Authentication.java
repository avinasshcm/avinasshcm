
package com.trapedza.bankfusion.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://webservices.bankfusion.trapedza.com}authgroup"/>
 *         &lt;element ref="{http://webservices.bankfusion.trapedza.com}passCode" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.bankfusion.trapedza.com}userLocator" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.bankfusion.trapedza.com}casRestletUrl" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.bankfusion.trapedza.com}casValidateUrl" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userName",
    "password",
    "passCode",
    "userLocator",
    "casRestletUrl",
    "casValidateUrl"
})
@XmlRootElement(name = "authentication")
public class Authentication {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String password;
    protected String passCode;
    protected String userLocator;
    protected String casRestletUrl;
    protected String casValidateUrl;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the passCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassCode() {
        return passCode;
    }

    /**
     * Sets the value of the passCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassCode(String value) {
        this.passCode = value;
    }

    /**
     * Gets the value of the userLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLocator() {
        return userLocator;
    }

    /**
     * Sets the value of the userLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLocator(String value) {
        this.userLocator = value;
    }

    /**
     * Gets the value of the casRestletUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasRestletUrl() {
        return casRestletUrl;
    }

    /**
     * Sets the value of the casRestletUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasRestletUrl(String value) {
        this.casRestletUrl = value;
    }

    /**
     * Gets the value of the casValidateUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasValidateUrl() {
        return casValidateUrl;
    }

    /**
     * Sets the value of the casValidateUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasValidateUrl(String value) {
        this.casValidateUrl = value;
    }

}
