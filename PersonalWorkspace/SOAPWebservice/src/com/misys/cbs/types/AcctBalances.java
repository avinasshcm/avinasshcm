
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acctBalances complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctBalances">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clearedBalance" type="{http://www.misys.com/cbs/types}acctBalance" minOccurs="0"/>
 *         &lt;element name="clearedBalanceFormatted" type="{http://www.misys.com/cbs/types}cbsBfCurrencyAmount" minOccurs="0"/>
 *         &lt;element name="availableBalance" type="{http://www.misys.com/cbs/types}acctBalance" minOccurs="0"/>
 *         &lt;element name="availableBalanceFormatted" type="{http://www.misys.com/cbs/types}cbsBfCurrencyAmount" minOccurs="0"/>
 *         &lt;element name="ledgerBalance" type="{http://www.misys.com/cbs/types}acctBalance" minOccurs="0"/>
 *         &lt;element name="shadowDebits" type="{http://www.misys.com/cbs/types}acctBalance" minOccurs="0"/>
 *         &lt;element name="shadowCredits" type="{http://www.misys.com/cbs/types}acctBalance" minOccurs="0"/>
 *         &lt;element name="shadowCreditsFormatted" type="{http://www.misys.com/cbs/types}cbsBfCurrencyAmount" minOccurs="0"/>
 *         &lt;element name="bookedBalance" type="{http://www.misys.com/cbs/types}acctBalance" minOccurs="0"/>
 *         &lt;element name="bookedBalanceFormatted" type="{http://www.misys.com/cbs/types}cbsBfCurrencyAmount" minOccurs="0"/>
 *         &lt;element name="statusBalance" type="{http://www.misys.com/cbs/types}acctBalance" minOccurs="0"/>
 *         &lt;element name="unclearedBalance" type="{http://www.misys.com/cbs/types}acctBalance" minOccurs="0"/>
 *         &lt;element name="holdAmount" type="{http://www.misys.com/cbs/types}acctBalance" minOccurs="0"/>
 *         &lt;element name="holdAmountFormatted" type="{http://www.misys.com/cbs/types}cbsBfCurrencyAmount" minOccurs="0"/>
 *         &lt;element name="minimumBalance" type="{http://www.misys.com/cbs/types}acctBalance" minOccurs="0"/>
 *         &lt;element name="balOrdAvailBal" type="{http://www.misys.com/cbs/types}acctBalance" minOccurs="0"/>
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
@XmlType(name = "acctBalances", propOrder = {
    "clearedBalance",
    "clearedBalanceFormatted",
    "availableBalance",
    "availableBalanceFormatted",
    "ledgerBalance",
    "shadowDebits",
    "shadowCredits",
    "shadowCreditsFormatted",
    "bookedBalance",
    "bookedBalanceFormatted",
    "statusBalance",
    "unclearedBalance",
    "holdAmount",
    "holdAmountFormatted",
    "minimumBalance",
    "balOrdAvailBal",
    "userExtension",
    "hostExtension"
})
public class AcctBalances {

    protected AcctBalance clearedBalance;
    protected CbsBfCurrencyAmount clearedBalanceFormatted;
    protected AcctBalance availableBalance;
    protected CbsBfCurrencyAmount availableBalanceFormatted;
    protected AcctBalance ledgerBalance;
    protected AcctBalance shadowDebits;
    protected AcctBalance shadowCredits;
    protected CbsBfCurrencyAmount shadowCreditsFormatted;
    protected AcctBalance bookedBalance;
    protected CbsBfCurrencyAmount bookedBalanceFormatted;
    protected AcctBalance statusBalance;
    protected AcctBalance unclearedBalance;
    protected AcctBalance holdAmount;
    protected CbsBfCurrencyAmount holdAmountFormatted;
    protected AcctBalance minimumBalance;
    protected AcctBalance balOrdAvailBal;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the clearedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalance }
     *     
     */
    public AcctBalance getClearedBalance() {
        return clearedBalance;
    }

    /**
     * Sets the value of the clearedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalance }
     *     
     */
    public void setClearedBalance(AcctBalance value) {
        this.clearedBalance = value;
    }

    /**
     * Gets the value of the clearedBalanceFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public CbsBfCurrencyAmount getClearedBalanceFormatted() {
        return clearedBalanceFormatted;
    }

    /**
     * Sets the value of the clearedBalanceFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public void setClearedBalanceFormatted(CbsBfCurrencyAmount value) {
        this.clearedBalanceFormatted = value;
    }

    /**
     * Gets the value of the availableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalance }
     *     
     */
    public AcctBalance getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets the value of the availableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalance }
     *     
     */
    public void setAvailableBalance(AcctBalance value) {
        this.availableBalance = value;
    }

    /**
     * Gets the value of the availableBalanceFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public CbsBfCurrencyAmount getAvailableBalanceFormatted() {
        return availableBalanceFormatted;
    }

    /**
     * Sets the value of the availableBalanceFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public void setAvailableBalanceFormatted(CbsBfCurrencyAmount value) {
        this.availableBalanceFormatted = value;
    }

    /**
     * Gets the value of the ledgerBalance property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalance }
     *     
     */
    public AcctBalance getLedgerBalance() {
        return ledgerBalance;
    }

    /**
     * Sets the value of the ledgerBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalance }
     *     
     */
    public void setLedgerBalance(AcctBalance value) {
        this.ledgerBalance = value;
    }

    /**
     * Gets the value of the shadowDebits property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalance }
     *     
     */
    public AcctBalance getShadowDebits() {
        return shadowDebits;
    }

    /**
     * Sets the value of the shadowDebits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalance }
     *     
     */
    public void setShadowDebits(AcctBalance value) {
        this.shadowDebits = value;
    }

    /**
     * Gets the value of the shadowCredits property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalance }
     *     
     */
    public AcctBalance getShadowCredits() {
        return shadowCredits;
    }

    /**
     * Sets the value of the shadowCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalance }
     *     
     */
    public void setShadowCredits(AcctBalance value) {
        this.shadowCredits = value;
    }

    /**
     * Gets the value of the shadowCreditsFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public CbsBfCurrencyAmount getShadowCreditsFormatted() {
        return shadowCreditsFormatted;
    }

    /**
     * Sets the value of the shadowCreditsFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public void setShadowCreditsFormatted(CbsBfCurrencyAmount value) {
        this.shadowCreditsFormatted = value;
    }

    /**
     * Gets the value of the bookedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalance }
     *     
     */
    public AcctBalance getBookedBalance() {
        return bookedBalance;
    }

    /**
     * Sets the value of the bookedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalance }
     *     
     */
    public void setBookedBalance(AcctBalance value) {
        this.bookedBalance = value;
    }

    /**
     * Gets the value of the bookedBalanceFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public CbsBfCurrencyAmount getBookedBalanceFormatted() {
        return bookedBalanceFormatted;
    }

    /**
     * Sets the value of the bookedBalanceFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public void setBookedBalanceFormatted(CbsBfCurrencyAmount value) {
        this.bookedBalanceFormatted = value;
    }

    /**
     * Gets the value of the statusBalance property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalance }
     *     
     */
    public AcctBalance getStatusBalance() {
        return statusBalance;
    }

    /**
     * Sets the value of the statusBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalance }
     *     
     */
    public void setStatusBalance(AcctBalance value) {
        this.statusBalance = value;
    }

    /**
     * Gets the value of the unclearedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalance }
     *     
     */
    public AcctBalance getUnclearedBalance() {
        return unclearedBalance;
    }

    /**
     * Sets the value of the unclearedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalance }
     *     
     */
    public void setUnclearedBalance(AcctBalance value) {
        this.unclearedBalance = value;
    }

    /**
     * Gets the value of the holdAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalance }
     *     
     */
    public AcctBalance getHoldAmount() {
        return holdAmount;
    }

    /**
     * Sets the value of the holdAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalance }
     *     
     */
    public void setHoldAmount(AcctBalance value) {
        this.holdAmount = value;
    }

    /**
     * Gets the value of the holdAmountFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public CbsBfCurrencyAmount getHoldAmountFormatted() {
        return holdAmountFormatted;
    }

    /**
     * Sets the value of the holdAmountFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbsBfCurrencyAmount }
     *     
     */
    public void setHoldAmountFormatted(CbsBfCurrencyAmount value) {
        this.holdAmountFormatted = value;
    }

    /**
     * Gets the value of the minimumBalance property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalance }
     *     
     */
    public AcctBalance getMinimumBalance() {
        return minimumBalance;
    }

    /**
     * Sets the value of the minimumBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalance }
     *     
     */
    public void setMinimumBalance(AcctBalance value) {
        this.minimumBalance = value;
    }

    /**
     * Gets the value of the balOrdAvailBal property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalance }
     *     
     */
    public AcctBalance getBalOrdAvailBal() {
        return balOrdAvailBal;
    }

    /**
     * Sets the value of the balOrdAvailBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalance }
     *     
     */
    public void setBalOrdAvailBal(AcctBalance value) {
        this.balOrdAvailBal = value;
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
