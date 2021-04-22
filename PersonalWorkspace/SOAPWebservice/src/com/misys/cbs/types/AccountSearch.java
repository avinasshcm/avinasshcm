
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for accountSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerId" type="{http://www.misys.com/cbs/types}custId" minOccurs="0"/>
 *         &lt;element name="accountFormatType" type="{http://www.misys.com/cbs/types}accountFormatType" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.misys.com/cbs/types}inputAccountIdFilter" minOccurs="0"/>
 *         &lt;element name="accountName" type="{http://www.misys.com/cbs/types}accountNameFilter" minOccurs="0"/>
 *         &lt;element name="acctRelationship" type="{http://www.misys.com/cbs/types}acctRelationship" minOccurs="0"/>
 *         &lt;element name="branch" type="{http://www.misys.com/cbs/types}branchSortCode" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.misys.com/cbs/types}productId" minOccurs="0"/>
 *         &lt;element name="subProductId" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.misys.com/cbs/types}isoCurrencyCode" minOccurs="0"/>
 *         &lt;element name="dateAccountOpenedFrom" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="dateAccountOpenedTo" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="accountStatus" type="{http://www.misys.com/cbs/types}acctStatus" minOccurs="0"/>
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
@XmlType(name = "accountSearch", propOrder = {
    "customerId",
    "accountFormatType",
    "accountId",
    "accountName",
    "acctRelationship",
    "branch",
    "product",
    "subProductId",
    "currency",
    "dateAccountOpenedFrom",
    "dateAccountOpenedTo",
    "accountStatus",
    "userExtension",
    "hostExtension"
})
public class AccountSearch {

    protected String customerId;
    protected AccountFormatType accountFormatType;
    protected String accountId;
    protected String accountName;
    protected String acctRelationship;
    protected String branch;
    protected String product;
    protected String subProductId;
    protected String currency;
    protected XMLGregorianCalendar dateAccountOpenedFrom;
    protected XMLGregorianCalendar dateAccountOpenedTo;
    protected String accountStatus;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the accountFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountFormatType }
     *     
     */
    public AccountFormatType getAccountFormatType() {
        return accountFormatType;
    }

    /**
     * Sets the value of the accountFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountFormatType }
     *     
     */
    public void setAccountFormatType(AccountFormatType value) {
        this.accountFormatType = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the acctRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctRelationship() {
        return acctRelationship;
    }

    /**
     * Sets the value of the acctRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctRelationship(String value) {
        this.acctRelationship = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the subProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubProductId() {
        return subProductId;
    }

    /**
     * Sets the value of the subProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubProductId(String value) {
        this.subProductId = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the dateAccountOpenedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAccountOpenedFrom() {
        return dateAccountOpenedFrom;
    }

    /**
     * Sets the value of the dateAccountOpenedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAccountOpenedFrom(XMLGregorianCalendar value) {
        this.dateAccountOpenedFrom = value;
    }

    /**
     * Gets the value of the dateAccountOpenedTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAccountOpenedTo() {
        return dateAccountOpenedTo;
    }

    /**
     * Sets the value of the dateAccountOpenedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAccountOpenedTo(XMLGregorianCalendar value) {
        this.dateAccountOpenedTo = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
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
