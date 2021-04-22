
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
 * <p>Java class for debitIntDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="debitIntDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="debitIntBaseCode" type="{http://www.misys.com/cbs/types}interestRateCode" minOccurs="0"/>
 *         &lt;element name="debitIntBaseCodedesc" type="{http://www.misys.com/cbs/types}narrLineShort" minOccurs="0"/>
 *         &lt;element name="debitIntMargin" type="{http://www.misys.com/cbs/types}interestRateMargin" minOccurs="0"/>
 *         &lt;element name="debitIntDifferential" type="{http://www.misys.com/cbs/types}interestRateCode" minOccurs="0"/>
 *         &lt;element name="debitIntRate" type="{http://www.misys.com/cbs/types}interestRate"/>
 *         &lt;element name="debitIntDaysBasis" type="{http://www.misys.com/cbs/types}interestDaysBasis" minOccurs="0"/>
 *         &lt;element name="debitIntCapFreq" type="{http://www.misys.com/cbs/types}frequency" minOccurs="0"/>
 *         &lt;element name="nextDRIntCapDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="debitDayInMonth" type="{http://www.misys.com/cbs/types}dayInMonth" minOccurs="0"/>
 *         &lt;element name="debitIntCalcType" type="{http://www.misys.com/cbs/types}intCalcType" minOccurs="0"/>
 *         &lt;element name="debitIntCalcType2" type="{http://www.misys.com/cbs/types}intCalcType2" minOccurs="0"/>
 *         &lt;element name="debitIntTierCode" type="{http://www.misys.com/cbs/types}interestTierCode" minOccurs="0"/>
 *         &lt;element name="debitIntTaxCode1" type="{http://www.misys.com/cbs/types}interestTaxCode" minOccurs="0"/>
 *         &lt;element name="debitIntTaxCode2" type="{http://www.misys.com/cbs/types}interestTaxCode2" minOccurs="0"/>
 *         &lt;element name="isPegged" type="{http://www.misys.com/cbs/types}BOOLEAN" minOccurs="0"/>
 *         &lt;element name="debitRolloverFreq" type="{http://www.misys.com/cbs/types}frequency" minOccurs="0"/>
 *         &lt;element name="debitRolloverDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="effectiveInterestRate" type="{http://www.misys.com/cbs/types}interestRate"/>
 *         &lt;element name="drRolloverDayInMonth" type="{http://www.misys.com/cbs/types}dayInMonth" minOccurs="0"/>
 *         &lt;element name="debitMinInterest" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="debitMaxInterest" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="debitIntAccount" type="{http://www.misys.com/cbs/types}accountKeys" minOccurs="0"/>
 *         &lt;element name="newDrIntBaseCode" type="{http://www.misys.com/cbs/types}interestRateCode" minOccurs="0"/>
 *         &lt;element name="newDrIntMargin" type="{http://www.misys.com/cbs/types}interestRateMargin" minOccurs="0"/>
 *         &lt;element name="newDrintDifferential" type="{http://www.misys.com/cbs/types}interestRateCode" minOccurs="0"/>
 *         &lt;element name="newDrIntRate" type="{http://www.misys.com/cbs/types}interestRate"/>
 *         &lt;element name="newDrIntCalcType" type="{http://www.misys.com/cbs/types}intCalcType" minOccurs="0"/>
 *         &lt;element name="newDrIntCalcType2" type="{http://www.misys.com/cbs/types}intCalcType2" minOccurs="0"/>
 *         &lt;element name="newDrIntTierCode" type="{http://www.misys.com/cbs/types}interestTierCode" minOccurs="0"/>
 *         &lt;element name="newIsPegged" type="{http://www.misys.com/cbs/types}BOOLEAN" minOccurs="0"/>
 *         &lt;element name="newDrIntDaysBasis" type="{http://www.misys.com/cbs/types}interestDaysBasis" minOccurs="0"/>
 *         &lt;element name="newDrIntCapFreq" type="{http://www.misys.com/cbs/types}frequency" minOccurs="0"/>
 *         &lt;element name="newNextDrIntCapDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="newDrIntDayInMonth" type="{http://www.misys.com/cbs/types}dayInMonth" minOccurs="0"/>
 *         &lt;element name="drIntChangeValueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="applicationInMonth" type="{http://www.misys.com/cbs/types}descriptionMedium" minOccurs="0"/>
 *         &lt;element name="whtApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="intPayawayDRAccount" type="{http://www.misys.com/cbs/types}accountKeys" minOccurs="0"/>
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
@XmlType(name = "debitIntDtls", propOrder = {
    "debitIntBaseCode",
    "debitIntBaseCodedesc",
    "debitIntMargin",
    "debitIntDifferential",
    "debitIntRate",
    "debitIntDaysBasis",
    "debitIntCapFreq",
    "nextDRIntCapDate",
    "debitDayInMonth",
    "debitIntCalcType",
    "debitIntCalcType2",
    "debitIntTierCode",
    "debitIntTaxCode1",
    "debitIntTaxCode2",
    "isPegged",
    "debitRolloverFreq",
    "debitRolloverDate",
    "effectiveInterestRate",
    "drRolloverDayInMonth",
    "debitMinInterest",
    "debitMaxInterest",
    "debitIntAccount",
    "newDrIntBaseCode",
    "newDrIntMargin",
    "newDrintDifferential",
    "newDrIntRate",
    "newDrIntCalcType",
    "newDrIntCalcType2",
    "newDrIntTierCode",
    "newIsPegged",
    "newDrIntDaysBasis",
    "newDrIntCapFreq",
    "newNextDrIntCapDate",
    "newDrIntDayInMonth",
    "drIntChangeValueDate",
    "applicationInMonth",
    "whtApplicable",
    "intPayawayDRAccount",
    "extensionDetails",
    "userExtension",
    "hostExtension"
})
public class DebitIntDtls {

    protected String debitIntBaseCode;
    protected String debitIntBaseCodedesc;
    protected BigDecimal debitIntMargin;
    protected String debitIntDifferential;
    @XmlElement(required = true)
    protected BigDecimal debitIntRate;
    protected String debitIntDaysBasis;
    protected String debitIntCapFreq;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextDRIntCapDate;
    protected BigInteger debitDayInMonth;
    protected String debitIntCalcType;
    protected String debitIntCalcType2;
    protected String debitIntTierCode;
    protected String debitIntTaxCode1;
    protected String debitIntTaxCode2;
    protected Boolean isPegged;
    protected String debitRolloverFreq;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar debitRolloverDate;
    @XmlElement(required = true)
    protected BigDecimal effectiveInterestRate;
    protected BigInteger drRolloverDayInMonth;
    protected BigDecimal debitMinInterest;
    protected BigDecimal debitMaxInterest;
    protected AccountKeys debitIntAccount;
    protected String newDrIntBaseCode;
    protected BigDecimal newDrIntMargin;
    protected String newDrintDifferential;
    @XmlElement(required = true)
    protected BigDecimal newDrIntRate;
    protected String newDrIntCalcType;
    protected String newDrIntCalcType2;
    protected String newDrIntTierCode;
    protected Boolean newIsPegged;
    protected String newDrIntDaysBasis;
    protected String newDrIntCapFreq;
    protected XMLGregorianCalendar newNextDrIntCapDate;
    protected BigInteger newDrIntDayInMonth;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar drIntChangeValueDate;
    protected String applicationInMonth;
    protected Boolean whtApplicable;
    protected AccountKeys intPayawayDRAccount;
    @XmlElement(required = true)
    protected ExtensionDetails extensionDetails;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the debitIntBaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitIntBaseCode() {
        return debitIntBaseCode;
    }

    /**
     * Sets the value of the debitIntBaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitIntBaseCode(String value) {
        this.debitIntBaseCode = value;
    }

    /**
     * Gets the value of the debitIntBaseCodedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitIntBaseCodedesc() {
        return debitIntBaseCodedesc;
    }

    /**
     * Sets the value of the debitIntBaseCodedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitIntBaseCodedesc(String value) {
        this.debitIntBaseCodedesc = value;
    }

    /**
     * Gets the value of the debitIntMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitIntMargin() {
        return debitIntMargin;
    }

    /**
     * Sets the value of the debitIntMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitIntMargin(BigDecimal value) {
        this.debitIntMargin = value;
    }

    /**
     * Gets the value of the debitIntDifferential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitIntDifferential() {
        return debitIntDifferential;
    }

    /**
     * Sets the value of the debitIntDifferential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitIntDifferential(String value) {
        this.debitIntDifferential = value;
    }

    /**
     * Gets the value of the debitIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitIntRate() {
        return debitIntRate;
    }

    /**
     * Sets the value of the debitIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitIntRate(BigDecimal value) {
        this.debitIntRate = value;
    }

    /**
     * Gets the value of the debitIntDaysBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitIntDaysBasis() {
        return debitIntDaysBasis;
    }

    /**
     * Sets the value of the debitIntDaysBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitIntDaysBasis(String value) {
        this.debitIntDaysBasis = value;
    }

    /**
     * Gets the value of the debitIntCapFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitIntCapFreq() {
        return debitIntCapFreq;
    }

    /**
     * Sets the value of the debitIntCapFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitIntCapFreq(String value) {
        this.debitIntCapFreq = value;
    }

    /**
     * Gets the value of the nextDRIntCapDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextDRIntCapDate() {
        return nextDRIntCapDate;
    }

    /**
     * Sets the value of the nextDRIntCapDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextDRIntCapDate(XMLGregorianCalendar value) {
        this.nextDRIntCapDate = value;
    }

    /**
     * Gets the value of the debitDayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDebitDayInMonth() {
        return debitDayInMonth;
    }

    /**
     * Sets the value of the debitDayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDebitDayInMonth(BigInteger value) {
        this.debitDayInMonth = value;
    }

    /**
     * Gets the value of the debitIntCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitIntCalcType() {
        return debitIntCalcType;
    }

    /**
     * Sets the value of the debitIntCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitIntCalcType(String value) {
        this.debitIntCalcType = value;
    }

    /**
     * Gets the value of the debitIntCalcType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitIntCalcType2() {
        return debitIntCalcType2;
    }

    /**
     * Sets the value of the debitIntCalcType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitIntCalcType2(String value) {
        this.debitIntCalcType2 = value;
    }

    /**
     * Gets the value of the debitIntTierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitIntTierCode() {
        return debitIntTierCode;
    }

    /**
     * Sets the value of the debitIntTierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitIntTierCode(String value) {
        this.debitIntTierCode = value;
    }

    /**
     * Gets the value of the debitIntTaxCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitIntTaxCode1() {
        return debitIntTaxCode1;
    }

    /**
     * Sets the value of the debitIntTaxCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitIntTaxCode1(String value) {
        this.debitIntTaxCode1 = value;
    }

    /**
     * Gets the value of the debitIntTaxCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitIntTaxCode2() {
        return debitIntTaxCode2;
    }

    /**
     * Sets the value of the debitIntTaxCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitIntTaxCode2(String value) {
        this.debitIntTaxCode2 = value;
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
     * Gets the value of the debitRolloverFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitRolloverFreq() {
        return debitRolloverFreq;
    }

    /**
     * Sets the value of the debitRolloverFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitRolloverFreq(String value) {
        this.debitRolloverFreq = value;
    }

    /**
     * Gets the value of the debitRolloverDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDebitRolloverDate() {
        return debitRolloverDate;
    }

    /**
     * Sets the value of the debitRolloverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDebitRolloverDate(XMLGregorianCalendar value) {
        this.debitRolloverDate = value;
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
     * Gets the value of the drRolloverDayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDrRolloverDayInMonth() {
        return drRolloverDayInMonth;
    }

    /**
     * Sets the value of the drRolloverDayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDrRolloverDayInMonth(BigInteger value) {
        this.drRolloverDayInMonth = value;
    }

    /**
     * Gets the value of the debitMinInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitMinInterest() {
        return debitMinInterest;
    }

    /**
     * Sets the value of the debitMinInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitMinInterest(BigDecimal value) {
        this.debitMinInterest = value;
    }

    /**
     * Gets the value of the debitMaxInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitMaxInterest() {
        return debitMaxInterest;
    }

    /**
     * Sets the value of the debitMaxInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitMaxInterest(BigDecimal value) {
        this.debitMaxInterest = value;
    }

    /**
     * Gets the value of the debitIntAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getDebitIntAccount() {
        return debitIntAccount;
    }

    /**
     * Sets the value of the debitIntAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setDebitIntAccount(AccountKeys value) {
        this.debitIntAccount = value;
    }

    /**
     * Gets the value of the newDrIntBaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDrIntBaseCode() {
        return newDrIntBaseCode;
    }

    /**
     * Sets the value of the newDrIntBaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDrIntBaseCode(String value) {
        this.newDrIntBaseCode = value;
    }

    /**
     * Gets the value of the newDrIntMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewDrIntMargin() {
        return newDrIntMargin;
    }

    /**
     * Sets the value of the newDrIntMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewDrIntMargin(BigDecimal value) {
        this.newDrIntMargin = value;
    }

    /**
     * Gets the value of the newDrintDifferential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDrintDifferential() {
        return newDrintDifferential;
    }

    /**
     * Sets the value of the newDrintDifferential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDrintDifferential(String value) {
        this.newDrintDifferential = value;
    }

    /**
     * Gets the value of the newDrIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewDrIntRate() {
        return newDrIntRate;
    }

    /**
     * Sets the value of the newDrIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewDrIntRate(BigDecimal value) {
        this.newDrIntRate = value;
    }

    /**
     * Gets the value of the newDrIntCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDrIntCalcType() {
        return newDrIntCalcType;
    }

    /**
     * Sets the value of the newDrIntCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDrIntCalcType(String value) {
        this.newDrIntCalcType = value;
    }

    /**
     * Gets the value of the newDrIntCalcType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDrIntCalcType2() {
        return newDrIntCalcType2;
    }

    /**
     * Sets the value of the newDrIntCalcType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDrIntCalcType2(String value) {
        this.newDrIntCalcType2 = value;
    }

    /**
     * Gets the value of the newDrIntTierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDrIntTierCode() {
        return newDrIntTierCode;
    }

    /**
     * Sets the value of the newDrIntTierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDrIntTierCode(String value) {
        this.newDrIntTierCode = value;
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
     * Gets the value of the newDrIntDaysBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDrIntDaysBasis() {
        return newDrIntDaysBasis;
    }

    /**
     * Sets the value of the newDrIntDaysBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDrIntDaysBasis(String value) {
        this.newDrIntDaysBasis = value;
    }

    /**
     * Gets the value of the newDrIntCapFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDrIntCapFreq() {
        return newDrIntCapFreq;
    }

    /**
     * Sets the value of the newDrIntCapFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDrIntCapFreq(String value) {
        this.newDrIntCapFreq = value;
    }

    /**
     * Gets the value of the newNextDrIntCapDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewNextDrIntCapDate() {
        return newNextDrIntCapDate;
    }

    /**
     * Sets the value of the newNextDrIntCapDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewNextDrIntCapDate(XMLGregorianCalendar value) {
        this.newNextDrIntCapDate = value;
    }

    /**
     * Gets the value of the newDrIntDayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNewDrIntDayInMonth() {
        return newDrIntDayInMonth;
    }

    /**
     * Sets the value of the newDrIntDayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNewDrIntDayInMonth(BigInteger value) {
        this.newDrIntDayInMonth = value;
    }

    /**
     * Gets the value of the drIntChangeValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDrIntChangeValueDate() {
        return drIntChangeValueDate;
    }

    /**
     * Sets the value of the drIntChangeValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDrIntChangeValueDate(XMLGregorianCalendar value) {
        this.drIntChangeValueDate = value;
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
     * Gets the value of the intPayawayDRAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getIntPayawayDRAccount() {
        return intPayawayDRAccount;
    }

    /**
     * Sets the value of the intPayawayDRAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setIntPayawayDRAccount(AccountKeys value) {
        this.intPayawayDRAccount = value;
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
