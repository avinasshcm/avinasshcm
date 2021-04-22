
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctBasicDetails" type="{http://www.misys.com/cbs/types}accountBasicDetails"/>
 *         &lt;element name="acctBalances" type="{http://www.misys.com/cbs/types}acctBalances"/>
 *         &lt;element name="acctCharacteristics" type="{http://www.misys.com/cbs/types}accountCharacteristics"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountInfo", propOrder = {
    "acctBasicDetails",
    "acctBalances",
    "acctCharacteristics"
})
public class AccountInfo {

    @XmlElement(required = true)
    protected AccountBasicDetails acctBasicDetails;
    @XmlElement(required = true)
    protected AcctBalances acctBalances;
    @XmlElement(required = true)
    protected AccountCharacteristics acctCharacteristics;

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
     * Gets the value of the acctBalances property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalances }
     *     
     */
    public AcctBalances getAcctBalances() {
        return acctBalances;
    }

    /**
     * Sets the value of the acctBalances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalances }
     *     
     */
    public void setAcctBalances(AcctBalances value) {
        this.acctBalances = value;
    }

    /**
     * Gets the value of the acctCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCharacteristics }
     *     
     */
    public AccountCharacteristics getAcctCharacteristics() {
        return acctCharacteristics;
    }

    /**
     * Sets the value of the acctCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCharacteristics }
     *     
     */
    public void setAcctCharacteristics(AccountCharacteristics value) {
        this.acctCharacteristics = value;
    }

}
