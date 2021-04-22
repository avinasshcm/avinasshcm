
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountKeys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardAccountId" type="{http://www.misys.com/cbs/types}standardAccountId" minOccurs="0"/>
 *         &lt;element name="pseudonym" type="{http://www.misys.com/cbs/types}pseudonym" minOccurs="0"/>
 *         &lt;element name="externalAccountId" type="{http://www.misys.com/cbs/types}externalAccountId" minOccurs="0"/>
 *         &lt;element name="IBAN" type="{http://www.misys.com/cbs/types}IBAN" minOccurs="0"/>
 *         &lt;element name="inputAccount" type="{http://www.misys.com/cbs/types}inputAccount" minOccurs="0"/>
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
@XmlType(name = "accountKeys", propOrder = {
    "standardAccountId",
    "pseudonym",
    "externalAccountId",
    "iban",
    "inputAccount",
    "userExtension",
    "hostExtension"
})
public class AccountKeys {

    protected String standardAccountId;
    protected Pseudonym pseudonym;
    protected String externalAccountId;
    @XmlElement(name = "IBAN")
    protected String iban;
    protected InputAccount inputAccount;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the standardAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardAccountId() {
        return standardAccountId;
    }

    /**
     * Sets the value of the standardAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardAccountId(String value) {
        this.standardAccountId = value;
    }

    /**
     * Gets the value of the pseudonym property.
     * 
     * @return
     *     possible object is
     *     {@link Pseudonym }
     *     
     */
    public Pseudonym getPseudonym() {
        return pseudonym;
    }

    /**
     * Sets the value of the pseudonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pseudonym }
     *     
     */
    public void setPseudonym(Pseudonym value) {
        this.pseudonym = value;
    }

    /**
     * Gets the value of the externalAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAccountId() {
        return externalAccountId;
    }

    /**
     * Sets the value of the externalAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAccountId(String value) {
        this.externalAccountId = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the inputAccount property.
     * 
     * @return
     *     possible object is
     *     {@link InputAccount }
     *     
     */
    public InputAccount getInputAccount() {
        return inputAccount;
    }

    /**
     * Sets the value of the inputAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputAccount }
     *     
     */
    public void setInputAccount(InputAccount value) {
        this.inputAccount = value;
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
