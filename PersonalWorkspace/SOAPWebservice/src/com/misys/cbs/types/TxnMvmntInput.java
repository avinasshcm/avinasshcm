
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for txnMvmntInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="txnMvmntInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerId" type="{http://www.misys.com/cbs/types}custId" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.misys.com/cbs/types}custFullName" minOccurs="0"/>
 *         &lt;element name="accountFormatType" type="{http://www.misys.com/cbs/types}accountFormatType" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.misys.com/cbs/types}inputAccountIdFilter" minOccurs="0"/>
 *         &lt;element name="startPostingDate" type="{http://www.misys.com/cbs/types}TIMESTAMP" minOccurs="0"/>
 *         &lt;element name="endPostingDate" type="{http://www.misys.com/cbs/types}TIMESTAMP" minOccurs="0"/>
 *         &lt;element name="startValueDate" type="{http://www.misys.com/cbs/types}TIMESTAMP" minOccurs="0"/>
 *         &lt;element name="endValueDate" type="{http://www.misys.com/cbs/types}TIMESTAMP" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.misys.com/cbs/types}channelId" minOccurs="0"/>
 *         &lt;element name="transactionRef" type="{http://www.misys.com/cbs/types}hostTxnRef" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.misys.com/cbs/types}hostTxnCode" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.misys.com/cbs/types}isoCurrencyCode" minOccurs="0"/>
 *         &lt;element name="transDirection" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *         &lt;element name="fromAmount" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="toAmount" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="txnRefOther" type="{http://www.misys.com/cbs/types}txnRefOther" minOccurs="0"/>
 *         &lt;element name="txnAction" type="{http://www.misys.com/cbs/types}txnAction" minOccurs="0"/>
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
@XmlType(name = "txnMvmntInput", propOrder = {
    "customerId",
    "customerName",
    "accountFormatType",
    "accountId",
    "startPostingDate",
    "endPostingDate",
    "startValueDate",
    "endValueDate",
    "channel",
    "transactionRef",
    "transactionType",
    "currency",
    "transDirection",
    "fromAmount",
    "toAmount",
    "txnRefOther",
    "txnAction",
    "userExtension",
    "hostExtension"
})
public class TxnMvmntInput {

    protected String customerId;
    protected String customerName;
    protected AccountFormatType accountFormatType;
    protected String accountId;
    protected XMLGregorianCalendar startPostingDate;
    protected XMLGregorianCalendar endPostingDate;
    protected XMLGregorianCalendar startValueDate;
    protected XMLGregorianCalendar endValueDate;
    protected String channel;
    protected String transactionRef;
    protected String transactionType;
    protected String currency;
    protected String transDirection;
    protected Currency fromAmount;
    protected Currency toAmount;
    protected String txnRefOther;
    protected TxnAction txnAction;
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
     * Gets the value of the startPostingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartPostingDate() {
        return startPostingDate;
    }

    /**
     * Sets the value of the startPostingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartPostingDate(XMLGregorianCalendar value) {
        this.startPostingDate = value;
    }

    /**
     * Gets the value of the endPostingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndPostingDate() {
        return endPostingDate;
    }

    /**
     * Sets the value of the endPostingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndPostingDate(XMLGregorianCalendar value) {
        this.endPostingDate = value;
    }

    /**
     * Gets the value of the startValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartValueDate() {
        return startValueDate;
    }

    /**
     * Sets the value of the startValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartValueDate(XMLGregorianCalendar value) {
        this.startValueDate = value;
    }

    /**
     * Gets the value of the endValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndValueDate() {
        return endValueDate;
    }

    /**
     * Sets the value of the endValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndValueDate(XMLGregorianCalendar value) {
        this.endValueDate = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the transactionRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionRef() {
        return transactionRef;
    }

    /**
     * Sets the value of the transactionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionRef(String value) {
        this.transactionRef = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
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
     * Gets the value of the transDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransDirection() {
        return transDirection;
    }

    /**
     * Sets the value of the transDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransDirection(String value) {
        this.transDirection = value;
    }

    /**
     * Gets the value of the fromAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getFromAmount() {
        return fromAmount;
    }

    /**
     * Sets the value of the fromAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setFromAmount(Currency value) {
        this.fromAmount = value;
    }

    /**
     * Gets the value of the toAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getToAmount() {
        return toAmount;
    }

    /**
     * Sets the value of the toAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setToAmount(Currency value) {
        this.toAmount = value;
    }

    /**
     * Gets the value of the txnRefOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnRefOther() {
        return txnRefOther;
    }

    /**
     * Sets the value of the txnRefOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnRefOther(String value) {
        this.txnRefOther = value;
    }

    /**
     * Gets the value of the txnAction property.
     * 
     * @return
     *     possible object is
     *     {@link TxnAction }
     *     
     */
    public TxnAction getTxnAction() {
        return txnAction;
    }

    /**
     * Sets the value of the txnAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnAction }
     *     
     */
    public void setTxnAction(TxnAction value) {
        this.txnAction = value;
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
