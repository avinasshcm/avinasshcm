
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
 * <p>Java class for limitDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="limitDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="limitType" type="{http://www.misys.com/cbs/types}periodNumber" minOccurs="0"/>
 *         &lt;element name="limitExcessAction" type="{http://www.misys.com/cbs/types}periodNumber" minOccurs="0"/>
 *         &lt;element name="limitReviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="newOverdraftLimit" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="newCreditLimit" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="newLimitExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="limitChangeValueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="additionalOdCode" type="{http://www.misys.com/cbs/types}interestRateCode" minOccurs="0"/>
 *         &lt;element name="additionalOdRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="odRateOnDebitBalance" type="{http://www.misys.com/cbs/types}BOOLEAN" minOccurs="0"/>
 *         &lt;element name="newOdCode" type="{http://www.misys.com/cbs/types}interestRateCode" minOccurs="0"/>
 *         &lt;element name="newOdRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="newOdCalculationBasis" type="{http://www.misys.com/cbs/types}BOOLEAN" minOccurs="0"/>
 *         &lt;element name="odRateChangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="limitRef1" type="{http://www.misys.com/cbs/types}reference"/>
 *         &lt;element name="limitRef2" type="{http://www.misys.com/cbs/types}reference"/>
 *         &lt;element name="limitRef3" type="{http://www.misys.com/cbs/types}reference"/>
 *         &lt;element name="limitRef4" type="{http://www.misys.com/cbs/types}reference"/>
 *         &lt;element name="limitRef5" type="{http://www.misys.com/cbs/types}reference"/>
 *         &lt;element name="temporaryOdLimit" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="temporaryOdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="limitPeriod" type="{http://www.misys.com/cbs/types}periodNumber" minOccurs="0"/>
 *         &lt;element name="limitPeriodDuration" type="{http://www.misys.com/cbs/types}periodCode"/>
 *         &lt;element name="limitReviewPeriod" type="{http://www.misys.com/cbs/types}periodNumber" minOccurs="0"/>
 *         &lt;element name="lmtReviewPeriodDuration" type="{http://www.misys.com/cbs/types}periodCode"/>
 *         &lt;element name="userExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="hostExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="significantExcessAmount" type="{http://www.misys.com/cbs/types}bigDecimal" minOccurs="0"/>
 *         &lt;element name="ubisallowlimit" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "limitDetails", propOrder = {
    "limitType",
    "limitExcessAction",
    "limitReviewDate",
    "creditLimit",
    "newOverdraftLimit",
    "newCreditLimit",
    "newLimitExpiryDate",
    "limitChangeValueDate",
    "additionalOdCode",
    "additionalOdRate",
    "odRateOnDebitBalance",
    "newOdCode",
    "newOdRate",
    "newOdCalculationBasis",
    "odRateChangeDate",
    "limitRef1",
    "limitRef2",
    "limitRef3",
    "limitRef4",
    "limitRef5",
    "temporaryOdLimit",
    "temporaryOdExpiryDate",
    "limitPeriod",
    "limitPeriodDuration",
    "limitReviewPeriod",
    "lmtReviewPeriodDuration",
    "userExtension",
    "hostExtension",
    "significantExcessAmount",
    "ubisallowlimit"
})
public class LimitDetails {

    protected BigInteger limitType;
    protected BigInteger limitExcessAction;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar limitReviewDate;
    protected Currency creditLimit;
    protected BigDecimal newOverdraftLimit;
    protected BigDecimal newCreditLimit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar newLimitExpiryDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar limitChangeValueDate;
    protected String additionalOdCode;
    protected BigDecimal additionalOdRate;
    protected Boolean odRateOnDebitBalance;
    protected String newOdCode;
    protected BigDecimal newOdRate;
    protected Boolean newOdCalculationBasis;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar odRateChangeDate;
    @XmlElement(required = true)
    protected String limitRef1;
    @XmlElement(required = true)
    protected String limitRef2;
    @XmlElement(required = true)
    protected String limitRef3;
    @XmlElement(required = true)
    protected String limitRef4;
    @XmlElement(required = true)
    protected String limitRef5;
    protected BigDecimal temporaryOdLimit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar temporaryOdExpiryDate;
    protected BigInteger limitPeriod;
    @XmlElement(required = true)
    protected String limitPeriodDuration;
    protected BigInteger limitReviewPeriod;
    @XmlElement(required = true)
    protected String lmtReviewPeriodDuration;
    protected Object userExtension;
    protected Object hostExtension;
    protected BigDecimal significantExcessAmount;
    protected String ubisallowlimit;

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitType(BigInteger value) {
        this.limitType = value;
    }

    /**
     * Gets the value of the limitExcessAction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitExcessAction() {
        return limitExcessAction;
    }

    /**
     * Sets the value of the limitExcessAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitExcessAction(BigInteger value) {
        this.limitExcessAction = value;
    }

    /**
     * Gets the value of the limitReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLimitReviewDate() {
        return limitReviewDate;
    }

    /**
     * Sets the value of the limitReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLimitReviewDate(XMLGregorianCalendar value) {
        this.limitReviewDate = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCreditLimit(Currency value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the newOverdraftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewOverdraftLimit() {
        return newOverdraftLimit;
    }

    /**
     * Sets the value of the newOverdraftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewOverdraftLimit(BigDecimal value) {
        this.newOverdraftLimit = value;
    }

    /**
     * Gets the value of the newCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewCreditLimit() {
        return newCreditLimit;
    }

    /**
     * Sets the value of the newCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewCreditLimit(BigDecimal value) {
        this.newCreditLimit = value;
    }

    /**
     * Gets the value of the newLimitExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewLimitExpiryDate() {
        return newLimitExpiryDate;
    }

    /**
     * Sets the value of the newLimitExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewLimitExpiryDate(XMLGregorianCalendar value) {
        this.newLimitExpiryDate = value;
    }

    /**
     * Gets the value of the limitChangeValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLimitChangeValueDate() {
        return limitChangeValueDate;
    }

    /**
     * Sets the value of the limitChangeValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLimitChangeValueDate(XMLGregorianCalendar value) {
        this.limitChangeValueDate = value;
    }

    /**
     * Gets the value of the additionalOdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalOdCode() {
        return additionalOdCode;
    }

    /**
     * Sets the value of the additionalOdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalOdCode(String value) {
        this.additionalOdCode = value;
    }

    /**
     * Gets the value of the additionalOdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdditionalOdRate() {
        return additionalOdRate;
    }

    /**
     * Sets the value of the additionalOdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdditionalOdRate(BigDecimal value) {
        this.additionalOdRate = value;
    }

    /**
     * Gets the value of the odRateOnDebitBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOdRateOnDebitBalance() {
        return odRateOnDebitBalance;
    }

    /**
     * Sets the value of the odRateOnDebitBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOdRateOnDebitBalance(Boolean value) {
        this.odRateOnDebitBalance = value;
    }

    /**
     * Gets the value of the newOdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewOdCode() {
        return newOdCode;
    }

    /**
     * Sets the value of the newOdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewOdCode(String value) {
        this.newOdCode = value;
    }

    /**
     * Gets the value of the newOdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewOdRate() {
        return newOdRate;
    }

    /**
     * Sets the value of the newOdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewOdRate(BigDecimal value) {
        this.newOdRate = value;
    }

    /**
     * Gets the value of the newOdCalculationBasis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewOdCalculationBasis() {
        return newOdCalculationBasis;
    }

    /**
     * Sets the value of the newOdCalculationBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewOdCalculationBasis(Boolean value) {
        this.newOdCalculationBasis = value;
    }

    /**
     * Gets the value of the odRateChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOdRateChangeDate() {
        return odRateChangeDate;
    }

    /**
     * Sets the value of the odRateChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOdRateChangeDate(XMLGregorianCalendar value) {
        this.odRateChangeDate = value;
    }

    /**
     * Gets the value of the limitRef1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitRef1() {
        return limitRef1;
    }

    /**
     * Sets the value of the limitRef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitRef1(String value) {
        this.limitRef1 = value;
    }

    /**
     * Gets the value of the limitRef2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitRef2() {
        return limitRef2;
    }

    /**
     * Sets the value of the limitRef2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitRef2(String value) {
        this.limitRef2 = value;
    }

    /**
     * Gets the value of the limitRef3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitRef3() {
        return limitRef3;
    }

    /**
     * Sets the value of the limitRef3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitRef3(String value) {
        this.limitRef3 = value;
    }

    /**
     * Gets the value of the limitRef4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitRef4() {
        return limitRef4;
    }

    /**
     * Sets the value of the limitRef4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitRef4(String value) {
        this.limitRef4 = value;
    }

    /**
     * Gets the value of the limitRef5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitRef5() {
        return limitRef5;
    }

    /**
     * Sets the value of the limitRef5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitRef5(String value) {
        this.limitRef5 = value;
    }

    /**
     * Gets the value of the temporaryOdLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTemporaryOdLimit() {
        return temporaryOdLimit;
    }

    /**
     * Sets the value of the temporaryOdLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTemporaryOdLimit(BigDecimal value) {
        this.temporaryOdLimit = value;
    }

    /**
     * Gets the value of the temporaryOdExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTemporaryOdExpiryDate() {
        return temporaryOdExpiryDate;
    }

    /**
     * Sets the value of the temporaryOdExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTemporaryOdExpiryDate(XMLGregorianCalendar value) {
        this.temporaryOdExpiryDate = value;
    }

    /**
     * Gets the value of the limitPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitPeriod() {
        return limitPeriod;
    }

    /**
     * Sets the value of the limitPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitPeriod(BigInteger value) {
        this.limitPeriod = value;
    }

    /**
     * Gets the value of the limitPeriodDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitPeriodDuration() {
        return limitPeriodDuration;
    }

    /**
     * Sets the value of the limitPeriodDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitPeriodDuration(String value) {
        this.limitPeriodDuration = value;
    }

    /**
     * Gets the value of the limitReviewPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitReviewPeriod() {
        return limitReviewPeriod;
    }

    /**
     * Sets the value of the limitReviewPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitReviewPeriod(BigInteger value) {
        this.limitReviewPeriod = value;
    }

    /**
     * Gets the value of the lmtReviewPeriodDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLmtReviewPeriodDuration() {
        return lmtReviewPeriodDuration;
    }

    /**
     * Sets the value of the lmtReviewPeriodDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLmtReviewPeriodDuration(String value) {
        this.lmtReviewPeriodDuration = value;
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

    /**
     * Gets the value of the significantExcessAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSignificantExcessAmount() {
        return significantExcessAmount;
    }

    /**
     * Sets the value of the significantExcessAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSignificantExcessAmount(BigDecimal value) {
        this.significantExcessAmount = value;
    }

    /**
     * Gets the value of the ubisallowlimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbisallowlimit() {
        return ubisallowlimit;
    }

    /**
     * Sets the value of the ubisallowlimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbisallowlimit(String value) {
        this.ubisallowlimit = value;
    }

}
