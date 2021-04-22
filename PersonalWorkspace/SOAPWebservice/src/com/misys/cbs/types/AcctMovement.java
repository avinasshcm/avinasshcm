
package com.misys.cbs.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for acctMovement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctMovement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postingDate" type="{http://www.misys.com/cbs/types}DATE"/>
 *         &lt;element name="valueDate" type="{http://www.misys.com/cbs/types}DATE"/>
 *         &lt;element name="postingTime" type="{http://www.misys.com/cbs/types}TIME" minOccurs="0"/>
 *         &lt;element name="valueTime" type="{http://www.misys.com/cbs/types}TIME" minOccurs="0"/>
 *         &lt;element name="transactionRef" type="{http://www.misys.com/cbs/types}hostTxnRef"/>
 *         &lt;element name="transactionType" type="{http://www.misys.com/cbs/types}hostTxnCode"/>
 *         &lt;element name="transactionDesc" type="{http://www.misys.com/cbs/types}hostTxnCodeDescription" minOccurs="0"/>
 *         &lt;element name="postingAction" type="{http://www.misys.com/cbs/types}postingAction"/>
 *         &lt;element name="amount" type="{http://www.misys.com/cbs/types}amountEdited"/>
 *         &lt;element name="amountFormatted" type="{http://www.misys.com/cbs/types}cbsBfCurrencyAmount"/>
 *         &lt;element name="runningBookBalance" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="runningBookBalanceFormatted" type="{http://www.misys.com/cbs/types}cbsBfCurrencyAmount" minOccurs="0"/>
 *         &lt;element name="narrative" type="{http://www.misys.com/cbs/types}narrLineLong"/>
 *         &lt;element name="narrative2" type="{http://www.misys.com/cbs/types}narrLineLong" minOccurs="0"/>
 *         &lt;element name="narrative3" type="{http://www.misys.com/cbs/types}narrLineLong" minOccurs="0"/>
 *         &lt;element name="narrative4" type="{http://www.misys.com/cbs/types}narrLineLong" minOccurs="0"/>
 *         &lt;element name="select" type="{http://www.misys.com/cbs/types}BOOLEAN"/>
 *         &lt;element name="txnCurrency" type="{http://www.misys.com/cbs/types}isoCurrencyCode" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://www.misys.com/cbs/types}exchangeRate" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.misys.com/cbs/types}channelId" minOccurs="0"/>
 *         &lt;element name="reversalIndicator" type="{http://www.misys.com/cbs/types}reversalIndicator" minOccurs="0"/>
 *         &lt;element name="txnRefOther" type="{http://www.misys.com/cbs/types}txnRefOther" minOccurs="0"/>
 *         &lt;element name="runningClearedBal" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="runningClearedBalFormatted" type="{http://www.misys.com/cbs/types}cbsBfCurrencyAmount" minOccurs="0"/>
 *         &lt;element name="postingRef" type="{http://www.misys.com/cbs/types}postingRef" minOccurs="0"/>
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
@XmlType(name = "acctMovement", propOrder = {
    "postingDate",
    "valueDate",
    "postingTime",
    "valueTime",
    "transactionRef",
    "transactionType",
    "transactionDesc",
    "postingAction",
    "amount",
    "amountFormatted",
    "runningBookBalance",
    "runningBookBalanceFormatted",
    "narrative",
    "narrative2",
    "narrative3",
    "narrative4",
    "select",
    "txnCurrency",
    "exchangeRate",
    "channel",
    "reversalIndicator",
    "txnRefOther",
    "runningClearedBal",
    "runningClearedBalFormatted",
    "postingRef",
    "userExtension",
    "hostExtension"
})
public class AcctMovement {

    @XmlElement(required = true)
    protected XMLGregorianCalendar postingDate;
    @XmlElement(required = true)
    protected XMLGregorianCalendar valueDate;
    protected XMLGregorianCalendar postingTime;
    protected XMLGregorianCalendar valueTime;
    @XmlElement(required = true)
    protected String transactionRef;
    @XmlElement(required = true)
    protected String transactionType;
    protected String transactionDesc;
    @XmlElement(required = true)
    protected String postingAction;
    @XmlElement(required = true)
    protected BigDecimal amount;
    @XmlElement(required = true)
    protected CbsBfCurrencyAmount amountFormatted;
    protected BigDecimal runningBookBalance;
    protected CbsBfCurrencyAmount runningBookBalanceFormatted;
    @XmlElement(required = true)
    protected String narrative;
    protected String narrative2;
    protected String narrative3;
    protected String narrative4;
    protected boolean select;
    protected String txnCurrency;
    protected BigDecimal exchangeRate;
    protected String channel;
    protected BigInteger reversalIndicator;
    protected String txnRefOther;
    protected Currency runningClearedBal;
    protected CbsBfCurrencyAmount runningClearedBalFormatted;
    protected String postingRef;
    protected Object userExtension;
    protected Object hostExtension;

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
     * Gets the value of the postingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingTime() {
        return postingTime;
    }

    /**
     * Sets the value of the postingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingTime(XMLGregorianCalendar value) {
        this.postingTime = value;
    }

    /**
     * Gets the value of the valueTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueTime() {
        return valueTime;
    }

    /**
     * Sets the value of the valueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueTime(XMLGregorianCalendar value) {
        this.valueTime = value;
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
     * Gets the value of the amountFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public CbsBfCurrencyAmount getAmountFormatted() {
        return amountFormatted;
    }

    /**
     * Sets the value of the amountFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public void setAmountFormatted(CbsBfCurrencyAmount value) {
        this.amountFormatted = value;
    }

    /**
     * Gets the value of the runningBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRunningBookBalance() {
        return runningBookBalance;
    }

    /**
     * Sets the value of the runningBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRunningBookBalance(BigDecimal value) {
        this.runningBookBalance = value;
    }

    /**
     * Gets the value of the runningBookBalanceFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public CbsBfCurrencyAmount getRunningBookBalanceFormatted() {
        return runningBookBalanceFormatted;
    }

    /**
     * Sets the value of the runningBookBalanceFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public void setRunningBookBalanceFormatted(CbsBfCurrencyAmount value) {
        this.runningBookBalanceFormatted = value;
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
     * Gets the value of the narrative2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrative2() {
        return narrative2;
    }

    /**
     * Sets the value of the narrative2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrative2(String value) {
        this.narrative2 = value;
    }

    /**
     * Gets the value of the narrative3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrative3() {
        return narrative3;
    }

    /**
     * Sets the value of the narrative3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrative3(String value) {
        this.narrative3 = value;
    }

    /**
     * Gets the value of the narrative4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrative4() {
        return narrative4;
    }

    /**
     * Sets the value of the narrative4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrative4(String value) {
        this.narrative4 = value;
    }

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
     * Gets the value of the txnCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnCurrency() {
        return txnCurrency;
    }

    /**
     * Sets the value of the txnCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnCurrency(String value) {
        this.txnCurrency = value;
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
     * Gets the value of the reversalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReversalIndicator() {
        return reversalIndicator;
    }

    /**
     * Sets the value of the reversalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReversalIndicator(BigInteger value) {
        this.reversalIndicator = value;
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
     * Gets the value of the runningClearedBal property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getRunningClearedBal() {
        return runningClearedBal;
    }

    /**
     * Sets the value of the runningClearedBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setRunningClearedBal(Currency value) {
        this.runningClearedBal = value;
    }

    /**
     * Gets the value of the runningClearedBalFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public CbsBfCurrencyAmount getRunningClearedBalFormatted() {
        return runningClearedBalFormatted;
    }

    /**
     * Sets the value of the runningClearedBalFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public void setRunningClearedBalFormatted(CbsBfCurrencyAmount value) {
        this.runningClearedBalFormatted = value;
    }

    /**
     * Gets the value of the postingRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingRef() {
        return postingRef;
    }

    /**
     * Sets the value of the postingRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingRef(String value) {
        this.postingRef = value;
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
