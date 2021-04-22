
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acctOpeningSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctOpeningSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountSearch" type="{http://www.misys.com/cbs/types}accountSearch"/>
 *         &lt;element name="customerName" type="{http://www.misys.com/cbs/types}custFullName"/>
 *         &lt;element name="inputUser" type="{http://www.misys.com/cbs/types}userId"/>
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
@XmlType(name = "acctOpeningSearch", propOrder = {
    "accountSearch",
    "customerName",
    "inputUser",
    "userExtension",
    "hostExtension"
})
public class AcctOpeningSearch {

    @XmlElement(required = true)
    protected AccountSearch accountSearch;
    @XmlElement(required = true)
    protected String customerName;
    @XmlElement(required = true)
    protected String inputUser;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the accountSearch property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearch }
     *     
     */
    public AccountSearch getAccountSearch() {
        return accountSearch;
    }

    /**
     * Sets the value of the accountSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearch }
     *     
     */
    public void setAccountSearch(AccountSearch value) {
        this.accountSearch = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the inputUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputUser() {
        return inputUser;
    }

    /**
     * Sets the value of the inputUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputUser(String value) {
        this.inputUser = value;
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
