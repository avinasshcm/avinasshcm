
package com.misys.cbs.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for acctTxntOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctTxntOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="txnMovements" type="{http://www.misys.com/cbs/types}txnMvmntData"/>
 *         &lt;element name="originalTxnAmount" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://www.misys.com/cbs/types}exchangeRate" minOccurs="0"/>
 *         &lt;element name="exchangeRateType" type="{http://www.misys.com/cbs/types}exchangeRateType" minOccurs="0"/>
 *         &lt;element name="baseCcyEquivalent" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="baseCcyExchangeRate" type="{http://www.misys.com/cbs/types}exchangeRate" minOccurs="0"/>
 *         &lt;element name="baseExchangeRateType" type="{http://www.misys.com/cbs/types}exchangeRateType" minOccurs="0"/>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reversalIndicator" type="{http://www.misys.com/cbs/types}reversalIndicator" minOccurs="0"/>
 *         &lt;element name="chqNum" type="{http://www.misys.com/cbs/types}chqNum" minOccurs="0"/>
 *         &lt;element name="runningBookBalance" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="runningClearedBal" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="staticDataChange" type="{http://www.misys.com/cbs/types}staticDataChange" minOccurs="0"/>
 *         &lt;element name="authUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reversalIndicatorDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intAdjAmtcr" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="intAdjAmtdr" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acctTxntOutput", propOrder = {
    "txnMovements",
    "originalTxnAmount",
    "exchangeRate",
    "exchangeRateType",
    "baseCcyEquivalent",
    "baseCcyExchangeRate",
    "baseExchangeRateType",
    "transactionDate",
    "reversalIndicator",
    "chqNum",
    "runningBookBalance",
    "runningClearedBal",
    "staticDataChange",
    "authUserId",
    "branchDesc",
    "reversalIndicatorDesc",
    "transactionTypeDesc",
    "intAdjAmtcr",
    "intAdjAmtdr"
})
public class AcctTxntOutput {

    @XmlElement(required = true)
    protected TxnMvmntData txnMovements;
    protected Currency originalTxnAmount;
    protected BigDecimal exchangeRate;
    protected String exchangeRateType;
    protected Currency baseCcyEquivalent;
    protected BigDecimal baseCcyExchangeRate;
    protected String baseExchangeRateType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    protected BigInteger reversalIndicator;
    protected String chqNum;
    protected Currency runningBookBalance;
    protected Currency runningClearedBal;
    protected StaticDataChange staticDataChange;
    protected String authUserId;
    protected String branchDesc;
    protected String reversalIndicatorDesc;
    protected String transactionTypeDesc;
    protected Currency intAdjAmtcr;
    protected Currency intAdjAmtdr;

    /**
     * Gets the value of the txnMovements property.
     * 
     * @return
     *     possible object is
     *     {@link TxnMvmntData }
     *     
     */
    public TxnMvmntData getTxnMovements() {
        return txnMovements;
    }

    /**
     * Sets the value of the txnMovements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnMvmntData }
     *     
     */
    public void setTxnMovements(TxnMvmntData value) {
        this.txnMovements = value;
    }

    /**
     * Gets the value of the originalTxnAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getOriginalTxnAmount() {
        return originalTxnAmount;
    }

    /**
     * Sets the value of the originalTxnAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setOriginalTxnAmount(Currency value) {
        this.originalTxnAmount = value;
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
     * Gets the value of the exchangeRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateType() {
        return exchangeRateType;
    }

    /**
     * Sets the value of the exchangeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateType(String value) {
        this.exchangeRateType = value;
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
     * Gets the value of the baseCcyExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseCcyExchangeRate() {
        return baseCcyExchangeRate;
    }

    /**
     * Sets the value of the baseCcyExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseCcyExchangeRate(BigDecimal value) {
        this.baseCcyExchangeRate = value;
    }

    /**
     * Gets the value of the baseExchangeRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseExchangeRateType() {
        return baseExchangeRateType;
    }

    /**
     * Sets the value of the baseExchangeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseExchangeRateType(String value) {
        this.baseExchangeRateType = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
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
     * Gets the value of the chqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChqNum() {
        return chqNum;
    }

    /**
     * Sets the value of the chqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChqNum(String value) {
        this.chqNum = value;
    }

    /**
     * Gets the value of the runningBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getRunningBookBalance() {
        return runningBookBalance;
    }

    /**
     * Sets the value of the runningBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setRunningBookBalance(Currency value) {
        this.runningBookBalance = value;
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
     * Gets the value of the staticDataChange property.
     * 
     * @return
     *     possible object is
     *     {@link StaticDataChange }
     *     
     */
    public StaticDataChange getStaticDataChange() {
        return staticDataChange;
    }

    /**
     * Sets the value of the staticDataChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticDataChange }
     *     
     */
    public void setStaticDataChange(StaticDataChange value) {
        this.staticDataChange = value;
    }

    /**
     * Gets the value of the authUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthUserId() {
        return authUserId;
    }

    /**
     * Sets the value of the authUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthUserId(String value) {
        this.authUserId = value;
    }

    /**
     * Gets the value of the branchDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchDesc() {
        return branchDesc;
    }

    /**
     * Sets the value of the branchDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchDesc(String value) {
        this.branchDesc = value;
    }

    /**
     * Gets the value of the reversalIndicatorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversalIndicatorDesc() {
        return reversalIndicatorDesc;
    }

    /**
     * Sets the value of the reversalIndicatorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversalIndicatorDesc(String value) {
        this.reversalIndicatorDesc = value;
    }

    /**
     * Gets the value of the transactionTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTypeDesc() {
        return transactionTypeDesc;
    }

    /**
     * Sets the value of the transactionTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTypeDesc(String value) {
        this.transactionTypeDesc = value;
    }

    /**
     * Gets the value of the intAdjAmtcr property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getIntAdjAmtcr() {
        return intAdjAmtcr;
    }

    /**
     * Sets the value of the intAdjAmtcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setIntAdjAmtcr(Currency value) {
        this.intAdjAmtcr = value;
    }

    /**
     * Gets the value of the intAdjAmtdr property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getIntAdjAmtdr() {
        return intAdjAmtdr;
    }

    /**
     * Sets the value of the intAdjAmtdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setIntAdjAmtdr(Currency value) {
        this.intAdjAmtdr = value;
    }

}
