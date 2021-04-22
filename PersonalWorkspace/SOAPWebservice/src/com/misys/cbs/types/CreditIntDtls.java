
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
 * <p>Java class for creditIntDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditIntDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditIntBaseCode" type="{http://www.misys.com/cbs/types}interestRateCode" minOccurs="0"/>
 *         &lt;element name="creditIntBaseCodedesc" type="{http://www.misys.com/cbs/types}narrLineShort" minOccurs="0"/>
 *         &lt;element name="creditIntMargin" type="{http://www.misys.com/cbs/types}interestRateMargin" minOccurs="0"/>
 *         &lt;element name="creditIntDifferential" type="{http://www.misys.com/cbs/types}interestRateCode" minOccurs="0"/>
 *         &lt;element name="creditIntRate" type="{http://www.misys.com/cbs/types}interestRate"/>
 *         &lt;element name="effectiveInterestRate" type="{http://www.misys.com/cbs/types}interestRate"/>
 *         &lt;element name="creditIntDaysBasis" type="{http://www.misys.com/cbs/types}interestDaysBasis" minOccurs="0"/>
 *         &lt;element name="creditIntCapFreq" type="{http://www.misys.com/cbs/types}frequency" minOccurs="0"/>
 *         &lt;element name="nextCRIntCapDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="creditDayInMonth" type="{http://www.misys.com/cbs/types}dayInMonth" minOccurs="0"/>
 *         &lt;element name="applicationInMonth" type="{http://www.misys.com/cbs/types}descriptionMedium" minOccurs="0"/>
 *         &lt;element name="creditIntCalcType" type="{http://www.misys.com/cbs/types}intCalcType"/>
 *         &lt;element name="creditIntCalcType2" type="{http://www.misys.com/cbs/types}intCalcType2" minOccurs="0"/>
 *         &lt;element name="creditIntTierCode" type="{http://www.misys.com/cbs/types}interestTierCode" minOccurs="0"/>
 *         &lt;element name="creditIntTaxCode1" type="{http://www.misys.com/cbs/types}interestTaxCode" minOccurs="0"/>
 *         &lt;element name="whtApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="creditIntTaxCode2" type="{http://www.misys.com/cbs/types}interestTaxCode2" minOccurs="0"/>
 *         &lt;element name="isPegged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="creditRolloverFreq" type="{http://www.misys.com/cbs/types}frequency" minOccurs="0"/>
 *         &lt;element name="creditRolloverDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="crRolloverDayInMonth" type="{http://www.misys.com/cbs/types}dayInMonth" minOccurs="0"/>
 *         &lt;element name="creditMinInterest" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="creditMaxInterest" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="creditBaseLineValue" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="creditIntAccount" type="{http://www.misys.com/cbs/types}accountKeys" minOccurs="0"/>
 *         &lt;element name="newCrIntBaseCode" type="{http://www.misys.com/cbs/types}interestRateCode" minOccurs="0"/>
 *         &lt;element name="newCrIntMargin" type="{http://www.misys.com/cbs/types}interestRateMargin" minOccurs="0"/>
 *         &lt;element name="newCrintDifferential" type="{http://www.misys.com/cbs/types}interestRateCode" minOccurs="0"/>
 *         &lt;element name="newCrIntRate" type="{http://www.misys.com/cbs/types}interestRate"/>
 *         &lt;element name="newCrIntCalcType" type="{http://www.misys.com/cbs/types}intCalcType" minOccurs="0"/>
 *         &lt;element name="newCrIntCalcType2" type="{http://www.misys.com/cbs/types}intCalcType2" minOccurs="0"/>
 *         &lt;element name="newCrIntTierCode" type="{http://www.misys.com/cbs/types}interestTierCode" minOccurs="0"/>
 *         &lt;element name="newIsPegged" type="{http://www.misys.com/cbs/types}BOOLEAN" minOccurs="0"/>
 *         &lt;element name="newCrIntDaysBasis" type="{http://www.misys.com/cbs/types}interestDaysBasis" minOccurs="0"/>
 *         &lt;element name="newCrIntCapFreq" type="{http://www.misys.com/cbs/types}frequency" minOccurs="0"/>
 *         &lt;element name="newNextCrIntCapDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="newCrIntDayInMonth" type="{http://www.misys.com/cbs/types}dayInMonth" minOccurs="0"/>
 *         &lt;element name="crIntChangeValueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="intPayawayCRAccount" type="{http://www.misys.com/cbs/types}accountKeys" minOccurs="0"/>
 *         &lt;element name="extensionDetails" type="{http://www.misys.com/cbs/types}extensionDetails"/>
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
@XmlType(name = "creditIntDtls", propOrder = {
    "creditIntBaseCode",
    "creditIntBaseCodedesc",
    "creditIntMargin",
    "creditIntDifferential",
    "creditIntRate",
    "effectiveInterestRate",
    "creditIntDaysBasis",
    "creditIntCapFreq",
    "nextCRIntCapDate",
    "creditDayInMonth",
    "applicationInMonth",
    "creditIntCalcType",
    "creditIntCalcType2",
    "creditIntTierCode",
    "creditIntTaxCode1",
    "whtApplicable",
    "creditIntTaxCode2",
    "isPegged",
    "creditRolloverFreq",
    "creditRolloverDate",
    "crRolloverDayInMonth",
    "creditMinInterest",
    "creditMaxInterest",
    "creditBaseLineValue",
    "creditIntAccount",
    "newCrIntBaseCode",
    "newCrIntMargin",
    "newCrintDifferential",
    "newCrIntRate",
    "newCrIntCalcType",
    "newCrIntCalcType2",
    "newCrIntTierCode",
    "newIsPegged",
    "newCrIntDaysBasis",
    "newCrIntCapFreq",
    "newNextCrIntCapDate",
    "newCrIntDayInMonth",
    "crIntChangeValueDate",
    "intPayawayCRAccount",
    "extensionDetails",
    "userExtension",
    "hostExtension"
})
public class CreditIntDtls {

    protected String creditIntBaseCode;
    protected String creditIntBaseCodedesc;
    protected BigDecimal creditIntMargin;
    protected String creditIntDifferential;
    @XmlElement(required = true)
    protected BigDecimal creditIntRate;
    @XmlElement(required = true)
    protected BigDecimal effectiveInterestRate;
    protected String creditIntDaysBasis;
    protected String creditIntCapFreq;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextCRIntCapDate;
    protected BigInteger creditDayInMonth;
    protected String applicationInMonth;
    @XmlElement(required = true)
    protected String creditIntCalcType;
    protected String creditIntCalcType2;
    protected String creditIntTierCode;
    protected String creditIntTaxCode1;
    protected Boolean whtApplicable;
    protected String creditIntTaxCode2;
    protected Boolean isPegged;
    protected String creditRolloverFreq;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditRolloverDate;
    protected BigInteger crRolloverDayInMonth;
    protected BigDecimal creditMinInterest;
    protected BigDecimal creditMaxInterest;
    protected Currency creditBaseLineValue;
    protected AccountKeys creditIntAccount;
    protected String newCrIntBaseCode;
    protected BigDecimal newCrIntMargin;
    protected String newCrintDifferential;
    @XmlElement(required = true)
    protected BigDecimal newCrIntRate;
    protected String newCrIntCalcType;
    protected String newCrIntCalcType2;
    protected String newCrIntTierCode;
    protected Boolean newIsPegged;
    protected String newCrIntDaysBasis;
    protected String newCrIntCapFreq;
    protected XMLGregorianCalendar newNextCrIntCapDate;
    protected BigInteger newCrIntDayInMonth;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crIntChangeValueDate;
    protected AccountKeys intPayawayCRAccount;
    @XmlElement(required = true)
    protected ExtensionDetails extensionDetails;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the creditIntBaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditIntBaseCode() {
        return creditIntBaseCode;
    }

    /**
     * Sets the value of the creditIntBaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditIntBaseCode(String value) {
        this.creditIntBaseCode = value;
    }

    /**
     * Gets the value of the creditIntBaseCodedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditIntBaseCodedesc() {
        return creditIntBaseCodedesc;
    }

    /**
     * Sets the value of the creditIntBaseCodedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditIntBaseCodedesc(String value) {
        this.creditIntBaseCodedesc = value;
    }

    /**
     * Gets the value of the creditIntMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditIntMargin() {
        return creditIntMargin;
    }

    /**
     * Sets the value of the creditIntMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditIntMargin(BigDecimal value) {
        this.creditIntMargin = value;
    }

    /**
     * Gets the value of the creditIntDifferential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditIntDifferential() {
        return creditIntDifferential;
    }

    /**
     * Sets the value of the creditIntDifferential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditIntDifferential(String value) {
        this.creditIntDifferential = value;
    }

    /**
     * Gets the value of the creditIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditIntRate() {
        return creditIntRate;
    }

    /**
     * Sets the value of the creditIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditIntRate(BigDecimal value) {
        this.creditIntRate = value;
    }

    /**
     * Gets the value of the effectiveInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEffectiveInterestRate() {
        return effectiveInterestRate;
    }

    /**
     * Sets the value of the effectiveInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEffectiveInterestRate(BigDecimal value) {
        this.effectiveInterestRate = value;
    }

    /**
     * Gets the value of the creditIntDaysBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditIntDaysBasis() {
        return creditIntDaysBasis;
    }

    /**
     * Sets the value of the creditIntDaysBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditIntDaysBasis(String value) {
        this.creditIntDaysBasis = value;
    }

    /**
     * Gets the value of the creditIntCapFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditIntCapFreq() {
        return creditIntCapFreq;
    }

    /**
     * Sets the value of the creditIntCapFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditIntCapFreq(String value) {
        this.creditIntCapFreq = value;
    }

    /**
     * Gets the value of the nextCRIntCapDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextCRIntCapDate() {
        return nextCRIntCapDate;
    }

    /**
     * Sets the value of the nextCRIntCapDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextCRIntCapDate(XMLGregorianCalendar value) {
        this.nextCRIntCapDate = value;
    }

    /**
     * Gets the value of the creditDayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreditDayInMonth() {
        return creditDayInMonth;
    }

    /**
     * Sets the value of the creditDayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreditDayInMonth(BigInteger value) {
        this.creditDayInMonth = value;
    }

    /**
     * Gets the value of the applicationInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationInMonth() {
        return applicationInMonth;
    }

    /**
     * Sets the value of the applicationInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationInMonth(String value) {
        this.applicationInMonth = value;
    }

    /**
     * Gets the value of the creditIntCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditIntCalcType() {
        return creditIntCalcType;
    }

    /**
     * Sets the value of the creditIntCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditIntCalcType(String value) {
        this.creditIntCalcType = value;
    }

    /**
     * Gets the value of the creditIntCalcType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditIntCalcType2() {
        return creditIntCalcType2;
    }

    /**
     * Sets the value of the creditIntCalcType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditIntCalcType2(String value) {
        this.creditIntCalcType2 = value;
    }

    /**
     * Gets the value of the creditIntTierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditIntTierCode() {
        return creditIntTierCode;
    }

    /**
     * Sets the value of the creditIntTierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditIntTierCode(String value) {
        this.creditIntTierCode = value;
    }

    /**
     * Gets the value of the creditIntTaxCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditIntTaxCode1() {
        return creditIntTaxCode1;
    }

    /**
     * Sets the value of the creditIntTaxCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditIntTaxCode1(String value) {
        this.creditIntTaxCode1 = value;
    }

    /**
     * Gets the value of the whtApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWhtApplicable() {
        return whtApplicable;
    }

    /**
     * Sets the value of the whtApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWhtApplicable(Boolean value) {
        this.whtApplicable = value;
    }

    /**
     * Gets the value of the creditIntTaxCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditIntTaxCode2() {
        return creditIntTaxCode2;
    }

    /**
     * Sets the value of the creditIntTaxCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditIntTaxCode2(String value) {
        this.creditIntTaxCode2 = value;
    }

    /**
     * Gets the value of the isPegged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPegged() {
        return isPegged;
    }

    /**
     * Sets the value of the isPegged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPegged(Boolean value) {
        this.isPegged = value;
    }

    /**
     * Gets the value of the creditRolloverFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRolloverFreq() {
        return creditRolloverFreq;
    }

    /**
     * Sets the value of the creditRolloverFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRolloverFreq(String value) {
        this.creditRolloverFreq = value;
    }

    /**
     * Gets the value of the creditRolloverDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditRolloverDate() {
        return creditRolloverDate;
    }

    /**
     * Sets the value of the creditRolloverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditRolloverDate(XMLGregorianCalendar value) {
        this.creditRolloverDate = value;
    }

    /**
     * Gets the value of the crRolloverDayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCrRolloverDayInMonth() {
        return crRolloverDayInMonth;
    }

    /**
     * Sets the value of the crRolloverDayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCrRolloverDayInMonth(BigInteger value) {
        this.crRolloverDayInMonth = value;
    }

    /**
     * Gets the value of the creditMinInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditMinInterest() {
        return creditMinInterest;
    }

    /**
     * Sets the value of the creditMinInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditMinInterest(BigDecimal value) {
        this.creditMinInterest = value;
    }

    /**
     * Gets the value of the creditMaxInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditMaxInterest() {
        return creditMaxInterest;
    }

    /**
     * Sets the value of the creditMaxInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditMaxInterest(BigDecimal value) {
        this.creditMaxInterest = value;
    }

    /**
     * Gets the value of the creditBaseLineValue property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCreditBaseLineValue() {
        return creditBaseLineValue;
    }

    /**
     * Sets the value of the creditBaseLineValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCreditBaseLineValue(Currency value) {
        this.creditBaseLineValue = value;
    }

    /**
     * Gets the value of the creditIntAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getCreditIntAccount() {
        return creditIntAccount;
    }

    /**
     * Sets the value of the creditIntAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setCreditIntAccount(AccountKeys value) {
        this.creditIntAccount = value;
    }

    /**
     * Gets the value of the newCrIntBaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCrIntBaseCode() {
        return newCrIntBaseCode;
    }

    /**
     * Sets the value of the newCrIntBaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCrIntBaseCode(String value) {
        this.newCrIntBaseCode = value;
    }

    /**
     * Gets the value of the newCrIntMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewCrIntMargin() {
        return newCrIntMargin;
    }

    /**
     * Sets the value of the newCrIntMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewCrIntMargin(BigDecimal value) {
        this.newCrIntMargin = value;
    }

    /**
     * Gets the value of the newCrintDifferential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCrintDifferential() {
        return newCrintDifferential;
    }

    /**
     * Sets the value of the newCrintDifferential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCrintDifferential(String value) {
        this.newCrintDifferential = value;
    }

    /**
     * Gets the value of the newCrIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewCrIntRate() {
        return newCrIntRate;
    }

    /**
     * Sets the value of the newCrIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewCrIntRate(BigDecimal value) {
        this.newCrIntRate = value;
    }

    /**
     * Gets the value of the newCrIntCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCrIntCalcType() {
        return newCrIntCalcType;
    }

    /**
     * Sets the value of the newCrIntCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCrIntCalcType(String value) {
        this.newCrIntCalcType = value;
    }

    /**
     * Gets the value of the newCrIntCalcType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCrIntCalcType2() {
        return newCrIntCalcType2;
    }

    /**
     * Sets the value of the newCrIntCalcType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCrIntCalcType2(String value) {
        this.newCrIntCalcType2 = value;
    }

    /**
     * Gets the value of the newCrIntTierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCrIntTierCode() {
        return newCrIntTierCode;
    }

    /**
     * Sets the value of the newCrIntTierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCrIntTierCode(String value) {
        this.newCrIntTierCode = value;
    }

    /**
     * Gets the value of the newIsPegged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewIsPegged() {
        return newIsPegged;
    }

    /**
     * Sets the value of the newIsPegged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewIsPegged(Boolean value) {
        this.newIsPegged = value;
    }

    /**
     * Gets the value of the newCrIntDaysBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCrIntDaysBasis() {
        return newCrIntDaysBasis;
    }

    /**
     * Sets the value of the newCrIntDaysBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCrIntDaysBasis(String value) {
        this.newCrIntDaysBasis = value;
    }

    /**
     * Gets the value of the newCrIntCapFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCrIntCapFreq() {
        return newCrIntCapFreq;
    }

    /**
     * Sets the value of the newCrIntCapFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCrIntCapFreq(String value) {
        this.newCrIntCapFreq = value;
    }

    /**
     * Gets the value of the newNextCrIntCapDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewNextCrIntCapDate() {
        return newNextCrIntCapDate;
    }

    /**
     * Sets the value of the newNextCrIntCapDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewNextCrIntCapDate(XMLGregorianCalendar value) {
        this.newNextCrIntCapDate = value;
    }

    /**
     * Gets the value of the newCrIntDayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNewCrIntDayInMonth() {
        return newCrIntDayInMonth;
    }

    /**
     * Sets the value of the newCrIntDayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNewCrIntDayInMonth(BigInteger value) {
        this.newCrIntDayInMonth = value;
    }

    /**
     * Gets the value of the crIntChangeValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrIntChangeValueDate() {
        return crIntChangeValueDate;
    }

    /**
     * Sets the value of the crIntChangeValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCrIntChangeValueDate(XMLGregorianCalendar value) {
        this.crIntChangeValueDate = value;
    }

    /**
     * Gets the value of the intPayawayCRAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getIntPayawayCRAccount() {
        return intPayawayCRAccount;
    }

    /**
     * Sets the value of the intPayawayCRAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setIntPayawayCRAccount(AccountKeys value) {
        this.intPayawayCRAccount = value;
    }

    /**
     * Gets the value of the extensionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDetails }
     *     
     */
    public ExtensionDetails getExtensionDetails() {
        return extensionDetails;
    }

    /**
     * Sets the value of the extensionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDetails }
     *     
     */
    public void setExtensionDetails(ExtensionDetails value) {
        this.extensionDetails = value;
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
