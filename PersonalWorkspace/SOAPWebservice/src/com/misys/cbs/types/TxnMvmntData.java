
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for txnMvmntData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="txnMvmntData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="select" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accountBasicDetails" type="{http://www.misys.com/cbs/types}accountBasicDetails"/>
 *         &lt;element name="postingDate" type="{http://www.misys.com/cbs/types}TIMESTAMP"/>
 *         &lt;element name="valueDate" type="{http://www.misys.com/cbs/types}TIMESTAMP"/>
 *         &lt;element name="transactionRef" type="{http://www.misys.com/cbs/types}hostTxnRef"/>
 *         &lt;element name="transactionType" type="{http://www.misys.com/cbs/types}hostTxnCode"/>
 *         &lt;element name="transactionDesc" type="{http://www.misys.com/cbs/types}hostTxnDescription" minOccurs="0"/>
 *         &lt;element name="transactionCurrency" type="{http://www.misys.com/cbs/types}isoCurrencyCode"/>
 *         &lt;element name="narrative" type="{http://www.misys.com/cbs/types}narrLineLong"/>
 *         &lt;element name="postingAction" type="{http://www.misys.com/cbs/types}postingAction"/>
 *         &lt;element name="amount" type="{http://www.misys.com/cbs/types}amountEdited"/>
 *         &lt;element name="debitAmount" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="creditAmount" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="baseCcyEquivalent" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://www.misys.com/cbs/types}exchangeRate" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.misys.com/cbs/types}channelId" minOccurs="0"/>
 *         &lt;element name="txnRefOther" type="{http://www.misys.com/cbs/types}txnRefOther"/>
 *         &lt;element name="txnTypeCategory" type="{http://www.misys.com/cbs/types}txnTypeCategory"/>
 *         &lt;element name="txnSerialNum" type="{http://www.misys.com/cbs/types}hostTxnRef"/>
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
@XmlType(name = "txnMvmntData", propOrder = {
    "select",
    "accountBasicDetails",
    "postingDate",
    "valueDate",
    "transactionRef",
    "transactionType",
    "transactionDesc",
    "transactionCurrency",
    "narrative",
    "postingAction",
    "amount",
    "debitAmount",
    "creditAmount",
    "baseCcyEquivalent",
    "exchangeRate",
    "channel",
    "txnRefOther",
    "txnTypeCategory",
    "txnSerialNum",
    "txnAction",
    "userExtension",
    "hostExtension"
})
public class TxnMvmntData {

    @XmlElement(defaultValue = "false")
    protected boolean select;
    @XmlElement(required = true)
    protected AccountBasicDetails accountBasicDetails;
    @XmlElement(required = true)
    protected XMLGregorianCalendar postingDate;
    @XmlElement(required = true)
    protected XMLGregorianCalendar valueDate;
    @XmlElement(required = true)
    protected String transactionRef;
    @XmlElement(required = true)
    protected String transactionType;
    protected String transactionDesc;
    @XmlElement(required = true)
    protected String transactionCurrency;
    @XmlElement(required = true)
    protected String narrative;
    @XmlElement(required = true)
    protected String postingAction;
    @XmlElement(required = true)
    protected BigDecimal amount;
    protected BigDecimal debitAmount;
    protected BigDecimal creditAmount;
    protected Currency baseCcyEquivalent;
    protected BigDecimal exchangeRate;
    protected String channel;
    @XmlElement(required = true)
    protected String txnRefOther;
    @XmlElement(required = true)
    protected String txnTypeCategory;
    @XmlElement(required = true)
    protected String txnSerialNum;
    protected TxnAction txnAction;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the select property.
     * 
     */
    public boolean isSelect() {
        return select;
    }

    /**
     * Sets the value of the select property.
     * 
     */
    public void setSelect(boolean value) {
        this.select = value;
    }

    /**
     * Gets the value of the accountBasicDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountBasicDetails }
     *     
     */
    public AccountBasicDetails getAccountBasicDetails() {
        return accountBasicDetails;
    }

    /**
     * Sets the value of the accountBasicDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountBasicDetails }
     *     
     */
    public void setAccountBasicDetails(AccountBasicDetails value) {
        this.accountBasicDetails = value;
    }

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingDate(XMLGregorianCalendar value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
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
     * Gets the value of the transactionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDesc() {
        return transactionDesc;
    }

    /**
     * Sets the value of the transactionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDesc(String value) {
        this.transactionDesc = value;
    }

    /**
     * Gets the value of the transactionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    /**
     * Sets the value of the transactionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCurrency(String value) {
        this.transactionCurrency = value;
    }

    /**
     * Gets the value of the narrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrative() {
        return narrative;
    }

    /**
     * Sets the value of the narrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrative(String value) {
        this.narrative = value;
    }

    /**
     * Gets the value of the postingAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingAction() {
        return postingAction;
    }

    /**
     * Sets the value of the postingAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingAction(String value) {
        this.postingAction = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the debitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitAmount() {
        return debitAmount;
    }

    /**
     * Sets the value of the debitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitAmount(BigDecimal value) {
        this.debitAmount = value;
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditAmount(BigDecimal value) {
        this.creditAmount = value;
    }

    /**
     * Gets the value of the baseCcyEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getBaseCcyEquivalent() {
        return baseCcyEquivalent;
    }

    /**
     * Sets the value of the baseCcyEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setBaseCcyEquivalent(Currency value) {
        this.baseCcyEquivalent = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
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
     * Gets the value of the txnTypeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnTypeCategory() {
        return txnTypeCategory;
    }

    /**
     * Sets the value of the txnTypeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnTypeCategory(String value) {
        this.txnTypeCategory = value;
    }

    /**
     * Gets the value of the txnSerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnSerialNum() {
        return txnSerialNum;
    }

    /**
     * Sets the value of the txnSerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnSerialNum(String value) {
        this.txnSerialNum = value;
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
