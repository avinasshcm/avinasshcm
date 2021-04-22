
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for accountBasicDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountBasicDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountKeys" type="{http://www.misys.com/cbs/types}accountKeys"/>
 *         &lt;element name="productId" type="{http://www.misys.com/cbs/types}productId" minOccurs="0"/>
 *         &lt;element name="subProductId" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *         &lt;element name="productDescription" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *         &lt;element name="taxCrIndicator" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *         &lt;element name="taxDrIndicator" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *         &lt;element name="subProductDescription" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *         &lt;element name="accountName" type="{http://www.misys.com/cbs/types}accountName"/>
 *         &lt;element name="equivalentAccountName" type="{http://www.misys.com/cbs/types}accountName" minOccurs="0"/>
 *         &lt;element name="customerShortDetails" type="{http://www.misys.com/cbs/types}customerShortDetails"/>
 *         &lt;element name="currency" type="{http://www.misys.com/cbs/types}isoCurrencyCode"/>
 *         &lt;element name="hostBranchCode" type="{http://www.misys.com/cbs/types}hostBranchCode" minOccurs="0"/>
 *         &lt;element name="dateOpened" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="closingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="overdraftLimit" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="tempOverdraftLimit" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="debitLimit" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="overdraftLimitFormatted" type="{http://www.misys.com/cbs/types}cbsBfCurrencyAmount" minOccurs="0"/>
 *         &lt;element name="overdraftExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="limitExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tempLimitExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "accountBasicDetails", propOrder = {
    "accountKeys",
    "productId",
    "subProductId",
    "productDescription",
    "taxCrIndicator",
    "taxDrIndicator",
    "subProductDescription",
    "accountName",
    "equivalentAccountName",
    "customerShortDetails",
    "currency",
    "hostBranchCode",
    "dateOpened",
    "closingDate",
    "overdraftLimit",
    "tempOverdraftLimit",
    "debitLimit",
    "overdraftLimitFormatted",
    "overdraftExpiryDate",
    "limitExpiryDate",
    "tempLimitExpiryDate",
    "userExtension",
    "hostExtension"
})
public class AccountBasicDetails {

    @XmlElement(required = true)
    protected AccountKeys accountKeys;
    protected String productId;
    protected String subProductId;
    protected String productDescription;
    protected String taxCrIndicator;
    protected String taxDrIndicator;
    protected String subProductDescription;
    @XmlElement(required = true)
    protected String accountName;
    protected String equivalentAccountName;
    @XmlElement(required = true)
    protected CustomerShortDetails customerShortDetails;
    @XmlElement(required = true)
    protected String currency;
    protected String hostBranchCode;
    @XmlElement(required = true, defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOpened;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closingDate;
    protected BigDecimal overdraftLimit;
    protected BigDecimal tempOverdraftLimit;
    protected BigDecimal debitLimit;
    protected CbsBfCurrencyAmount overdraftLimitFormatted;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overdraftExpiryDate;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar limitExpiryDate;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tempLimitExpiryDate;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the accountKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getAccountKeys() {
        return accountKeys;
    }

    /**
     * Sets the value of the accountKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setAccountKeys(AccountKeys value) {
        this.accountKeys = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
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
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the taxCrIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCrIndicator() {
        return taxCrIndicator;
    }

    /**
     * Sets the value of the taxCrIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCrIndicator(String value) {
        this.taxCrIndicator = value;
    }

    /**
     * Gets the value of the taxDrIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDrIndicator() {
        return taxDrIndicator;
    }

    /**
     * Sets the value of the taxDrIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDrIndicator(String value) {
        this.taxDrIndicator = value;
    }

    /**
     * Gets the value of the subProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubProductDescription() {
        return subProductDescription;
    }

    /**
     * Sets the value of the subProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubProductDescription(String value) {
        this.subProductDescription = value;
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
     * Gets the value of the equivalentAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentAccountName() {
        return equivalentAccountName;
    }

    /**
     * Sets the value of the equivalentAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentAccountName(String value) {
        this.equivalentAccountName = value;
    }

    /**
     * Gets the value of the customerShortDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerShortDetails }
     *     
     */
    public CustomerShortDetails getCustomerShortDetails() {
        return customerShortDetails;
    }

    /**
     * Sets the value of the customerShortDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerShortDetails }
     *     
     */
    public void setCustomerShortDetails(CustomerShortDetails value) {
        this.customerShortDetails = value;
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
     * Gets the value of the hostBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostBranchCode() {
        return hostBranchCode;
    }

    /**
     * Sets the value of the hostBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostBranchCode(String value) {
        this.hostBranchCode = value;
    }

    /**
     * Gets the value of the dateOpened property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOpened() {
        return dateOpened;
    }

    /**
     * Sets the value of the dateOpened property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOpened(XMLGregorianCalendar value) {
        this.dateOpened = value;
    }

    /**
     * Gets the value of the closingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosingDate() {
        return closingDate;
    }

    /**
     * Sets the value of the closingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosingDate(XMLGregorianCalendar value) {
        this.closingDate = value;
    }

    /**
     * Gets the value of the overdraftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdraftLimit() {
        return overdraftLimit;
    }

    /**
     * Sets the value of the overdraftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdraftLimit(BigDecimal value) {
        this.overdraftLimit = value;
    }

    /**
     * Gets the value of the tempOverdraftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTempOverdraftLimit() {
        return tempOverdraftLimit;
    }

    /**
     * Sets the value of the tempOverdraftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTempOverdraftLimit(BigDecimal value) {
        this.tempOverdraftLimit = value;
    }

    /**
     * Gets the value of the debitLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitLimit() {
        return debitLimit;
    }

    /**
     * Sets the value of the debitLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitLimit(BigDecimal value) {
        this.debitLimit = value;
    }

    /**
     * Gets the value of the overdraftLimitFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public CbsBfCurrencyAmount getOverdraftLimitFormatted() {
        return overdraftLimitFormatted;
    }

    /**
     * Sets the value of the overdraftLimitFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public void setOverdraftLimitFormatted(CbsBfCurrencyAmount value) {
        this.overdraftLimitFormatted = value;
    }

    /**
     * Gets the value of the overdraftExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverdraftExpiryDate() {
        return overdraftExpiryDate;
    }

    /**
     * Sets the value of the overdraftExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverdraftExpiryDate(XMLGregorianCalendar value) {
        this.overdraftExpiryDate = value;
    }

    /**
     * Gets the value of the limitExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLimitExpiryDate() {
        return limitExpiryDate;
    }

    /**
     * Sets the value of the limitExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLimitExpiryDate(XMLGregorianCalendar value) {
        this.limitExpiryDate = value;
    }

    /**
     * Gets the value of the tempLimitExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempLimitExpiryDate() {
        return tempLimitExpiryDate;
    }

    /**
     * Sets the value of the tempLimitExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempLimitExpiryDate(XMLGregorianCalendar value) {
        this.tempLimitExpiryDate = value;
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
