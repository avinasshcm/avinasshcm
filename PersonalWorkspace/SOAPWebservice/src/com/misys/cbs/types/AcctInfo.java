
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acctInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctBasicDetails" type="{http://www.misys.com/cbs/types}accountBasicDetails"/>
 *         &lt;element name="acctBalances" type="{http://www.misys.com/cbs/types}acctBalances"/>
 *         &lt;element name="accountCharacteristics" type="{http://www.misys.com/cbs/types}acctCharacteristics"/>
 *         &lt;element name="listMandateDetails" type="{http://www.misys.com/cbs/types}listMandateDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acctInfo", propOrder = {
    "acctBasicDetails",
    "acctBalances",
    "accountCharacteristics",
    "listMandateDetails"
})
public class AcctInfo {

    @XmlElement(required = true)
    protected AccountBasicDetails acctBasicDetails;
    @XmlElement(required = true)
    protected AcctBalances acctBalances;
    @XmlElement(required = true)
    protected AcctCharacteristics accountCharacteristics;
    @XmlElement(required = true)
    protected ListMandateDetails listMandateDetails;

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
     * Gets the value of the accountCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link AcctCharacteristics }
     *     
     */
    public AcctCharacteristics getAccountCharacteristics() {
        return accountCharacteristics;
    }

    /**
     * Sets the value of the accountCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctCharacteristics }
     *     
     */
    public void setAccountCharacteristics(AcctCharacteristics value) {
        this.accountCharacteristics = value;
    }

    /**
     * Gets the value of the listMandateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ListMandateDetails }
     *     
     */
    public ListMandateDetails getListMandateDetails() {
        return listMandateDetails;
    }

    /**
     * Sets the value of the listMandateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListMandateDetails }
     *     
     */
    public void setListMandateDetails(ListMandateDetails value) {
        this.listMandateDetails = value;
    }

}
