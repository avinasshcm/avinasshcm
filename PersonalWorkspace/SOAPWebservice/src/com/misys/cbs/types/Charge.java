
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for charge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="charge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargeCcyAmtDetails" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="fundingAcctCcyDetails" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="chargeExRateDetails" type="{http://www.misys.com/cbs/types}exchangeRateDetails" minOccurs="0"/>
 *         &lt;element name="chargePostingTxnCode" type="{http://www.misys.com/cbs/types}hostTxnCode" minOccurs="0"/>
 *         &lt;element name="chargeNarrative" type="{http://www.misys.com/cbs/types}chargeNarrative" minOccurs="0"/>
 *         &lt;element name="chargeRecAcctDetails" type="{http://www.misys.com/cbs/types}accountKeys"/>
 *         &lt;element name="fundingAccount" type="{http://www.misys.com/cbs/types}accountKeys" minOccurs="0"/>
 *         &lt;element name="taxCode" type="{http://www.misys.com/cbs/types}taxCode" minOccurs="0"/>
 *         &lt;element name="taxFndAcctAmtDetails" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="taxCcyAmtDetails" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="taxTxnCode" type="{http://www.misys.com/cbs/types}hostTxnCode" minOccurs="0"/>
 *         &lt;element name="taxExchangeRateDetails" type="{http://www.misys.com/cbs/types}exchangeRateDetails" minOccurs="0"/>
 *         &lt;element name="taxNarrative" type="{http://www.misys.com/cbs/types}chargeNarrative" minOccurs="0"/>
 *         &lt;element name="taxRecAcct" type="{http://www.misys.com/cbs/types}accountKeys" minOccurs="0"/>
 *         &lt;element name="chargeDetailId" type="{http://www.misys.com/cbs/types}uniqueId" minOccurs="0"/>
 *         &lt;element name="chargeCode" type="{http://www.misys.com/cbs/types}chargeCode" minOccurs="0"/>
 *         &lt;element name="chargeBasis" type="{http://www.misys.com/cbs/types}chargeBasis" minOccurs="0"/>
 *         &lt;element name="chargeCalculationCode" type="{http://www.misys.com/cbs/types}chargeCalcType" minOccurs="0"/>
 *         &lt;element name="originalChargeAmount" type="{http://www.misys.com/cbs/types}amount" minOccurs="0"/>
 *         &lt;element name="originalTaxAmount" type="{http://www.misys.com/cbs/types}amount" minOccurs="0"/>
 *         &lt;element name="waiverReason" type="{http://www.misys.com/cbs/types}descriptionMedium" minOccurs="0"/>
 *         &lt;element name="isDuplicateCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="earningMethod" type="{http://www.misys.com/cbs/types}earningMethod" minOccurs="0"/>
 *         &lt;element name="earningRule" type="{http://www.misys.com/cbs/types}chargeEarningRule" minOccurs="0"/>
 *         &lt;element name="earningFrequencyCode" type="{http://www.misys.com/cbs/types}frequency" minOccurs="0"/>
 *         &lt;element name="earningFrequencyUnit" type="{http://www.misys.com/cbs/types}frequencyNumber" minOccurs="0"/>
 *         &lt;element name="earningEndDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
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
@XmlType(name = "charge", propOrder = {
    "chargeCcyAmtDetails",
    "fundingAcctCcyDetails",
    "chargeExRateDetails",
    "chargePostingTxnCode",
    "chargeNarrative",
    "chargeRecAcctDetails",
    "fundingAccount",
    "taxCode",
    "taxFndAcctAmtDetails",
    "taxCcyAmtDetails",
    "taxTxnCode",
    "taxExchangeRateDetails",
    "taxNarrative",
    "taxRecAcct",
    "chargeDetailId",
    "chargeCode",
    "chargeBasis",
    "chargeCalculationCode",
    "originalChargeAmount",
    "originalTaxAmount",
    "waiverReason",
    "isDuplicateCharge",
    "earningMethod",
    "earningRule",
    "earningFrequencyCode",
    "earningFrequencyUnit",
    "earningEndDate",
    "userExtension",
    "hostExtension"
})
public class Charge {

    @XmlElement(required = true)
    protected Currency chargeCcyAmtDetails;
    @XmlElement(required = true)
    protected Currency fundingAcctCcyDetails;
    protected ExchangeRateDetails chargeExRateDetails;
    protected String chargePostingTxnCode;
    protected String chargeNarrative;
    @XmlElement(required = true)
    protected AccountKeys chargeRecAcctDetails;
    protected AccountKeys fundingAccount;
    protected String taxCode;
    protected Currency taxFndAcctAmtDetails;
    protected Currency taxCcyAmtDetails;
    protected String taxTxnCode;
    protected ExchangeRateDetails taxExchangeRateDetails;
    protected String taxNarrative;
    protected AccountKeys taxRecAcct;
    protected String chargeDetailId;
    protected String chargeCode;
    protected String chargeBasis;
    protected String chargeCalculationCode;
    protected Amount originalChargeAmount;
    protected Amount originalTaxAmount;
    protected String waiverReason;
    protected Boolean isDuplicateCharge;
    protected String earningMethod;
    protected String earningRule;
    protected String earningFrequencyCode;
    protected Integer earningFrequencyUnit;
    protected XMLGregorianCalendar earningEndDate;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the chargeCcyAmtDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getChargeCcyAmtDetails() {
        return chargeCcyAmtDetails;
    }

    /**
     * Sets the value of the chargeCcyAmtDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setChargeCcyAmtDetails(Currency value) {
        this.chargeCcyAmtDetails = value;
    }

    /**
     * Gets the value of the fundingAcctCcyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getFundingAcctCcyDetails() {
        return fundingAcctCcyDetails;
    }

    /**
     * Sets the value of the fundingAcctCcyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setFundingAcctCcyDetails(Currency value) {
        this.fundingAcctCcyDetails = value;
    }

    /**
     * Gets the value of the chargeExRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateDetails }
     *     
     */
    public ExchangeRateDetails getChargeExRateDetails() {
        return chargeExRateDetails;
    }

    /**
     * Sets the value of the chargeExRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateDetails }
     *     
     */
    public void setChargeExRateDetails(ExchangeRateDetails value) {
        this.chargeExRateDetails = value;
    }

    /**
     * Gets the value of the chargePostingTxnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargePostingTxnCode() {
        return chargePostingTxnCode;
    }

    /**
     * Sets the value of the chargePostingTxnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargePostingTxnCode(String value) {
        this.chargePostingTxnCode = value;
    }

    /**
     * Gets the value of the chargeNarrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeNarrative() {
        return chargeNarrative;
    }

    /**
     * Sets the value of the chargeNarrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeNarrative(String value) {
        this.chargeNarrative = value;
    }

    /**
     * Gets the value of the chargeRecAcctDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getChargeRecAcctDetails() {
        return chargeRecAcctDetails;
    }

    /**
     * Sets the value of the chargeRecAcctDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setChargeRecAcctDetails(AccountKeys value) {
        this.chargeRecAcctDetails = value;
    }

    /**
     * Gets the value of the fundingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getFundingAccount() {
        return fundingAccount;
    }

    /**
     * Sets the value of the fundingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setFundingAccount(AccountKeys value) {
        this.fundingAccount = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxFndAcctAmtDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTaxFndAcctAmtDetails() {
        return taxFndAcctAmtDetails;
    }

    /**
     * Sets the value of the taxFndAcctAmtDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTaxFndAcctAmtDetails(Currency value) {
        this.taxFndAcctAmtDetails = value;
    }

    /**
     * Gets the value of the taxCcyAmtDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTaxCcyAmtDetails() {
        return taxCcyAmtDetails;
    }

    /**
     * Sets the value of the taxCcyAmtDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTaxCcyAmtDetails(Currency value) {
        this.taxCcyAmtDetails = value;
    }

    /**
     * Gets the value of the taxTxnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTxnCode() {
        return taxTxnCode;
    }

    /**
     * Sets the value of the taxTxnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTxnCode(String value) {
        this.taxTxnCode = value;
    }

    /**
     * Gets the value of the taxExchangeRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateDetails }
     *     
     */
    public ExchangeRateDetails getTaxExchangeRateDetails() {
        return taxExchangeRateDetails;
    }

    /**
     * Sets the value of the taxExchangeRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateDetails }
     *     
     */
    public void setTaxExchangeRateDetails(ExchangeRateDetails value) {
        this.taxExchangeRateDetails = value;
    }

    /**
     * Gets the value of the taxNarrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNarrative() {
        return taxNarrative;
    }

    /**
     * Sets the value of the taxNarrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNarrative(String value) {
        this.taxNarrative = value;
    }

    /**
     * Gets the value of the taxRecAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getTaxRecAcct() {
        return taxRecAcct;
    }

    /**
     * Sets the value of the taxRecAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setTaxRecAcct(AccountKeys value) {
        this.taxRecAcct = value;
    }

    /**
     * Gets the value of the chargeDetailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeDetailId() {
        return chargeDetailId;
    }

    /**
     * Sets the value of the chargeDetailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeDetailId(String value) {
        this.chargeDetailId = value;
    }

    /**
     * Gets the value of the chargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * Sets the value of the chargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCode(String value) {
        this.chargeCode = value;
    }

    /**
     * Gets the value of the chargeBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeBasis() {
        return chargeBasis;
    }

    /**
     * Sets the value of the chargeBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeBasis(String value) {
        this.chargeBasis = value;
    }

    /**
     * Gets the value of the chargeCalculationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCalculationCode() {
        return chargeCalculationCode;
    }

    /**
     * Sets the value of the chargeCalculationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCalculationCode(String value) {
        this.chargeCalculationCode = value;
    }

    /**
     * Gets the value of the originalChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOriginalChargeAmount() {
        return originalChargeAmount;
    }

    /**
     * Sets the value of the originalChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOriginalChargeAmount(Amount value) {
        this.originalChargeAmount = value;
    }

    /**
     * Gets the value of the originalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOriginalTaxAmount() {
        return originalTaxAmount;
    }

    /**
     * Sets the value of the originalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOriginalTaxAmount(Amount value) {
        this.originalTaxAmount = value;
    }

    /**
     * Gets the value of the waiverReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverReason() {
        return waiverReason;
    }

    /**
     * Sets the value of the waiverReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverReason(String value) {
        this.waiverReason = value;
    }

    /**
     * Gets the value of the isDuplicateCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDuplicateCharge() {
        return isDuplicateCharge;
    }

    /**
     * Sets the value of the isDuplicateCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDuplicateCharge(Boolean value) {
        this.isDuplicateCharge = value;
    }

    /**
     * Gets the value of the earningMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarningMethod() {
        return earningMethod;
    }

    /**
     * Sets the value of the earningMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarningMethod(String value) {
        this.earningMethod = value;
    }

    /**
     * Gets the value of the earningRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarningRule() {
        return earningRule;
    }

    /**
     * Sets the value of the earningRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarningRule(String value) {
        this.earningRule = value;
    }

    /**
     * Gets the value of the earningFrequencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarningFrequencyCode() {
        return earningFrequencyCode;
    }

    /**
     * Sets the value of the earningFrequencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarningFrequencyCode(String value) {
        this.earningFrequencyCode = value;
    }

    /**
     * Gets the value of the earningFrequencyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEarningFrequencyUnit() {
        return earningFrequencyUnit;
    }

    /**
     * Sets the value of the earningFrequencyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEarningFrequencyUnit(Integer value) {
        this.earningFrequencyUnit = value;
    }

    /**
     * Gets the value of the earningEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarningEndDate() {
        return earningEndDate;
    }

    /**
     * Sets the value of the earningEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarningEndDate(XMLGregorianCalendar value) {
        this.earningEndDate = value;
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
