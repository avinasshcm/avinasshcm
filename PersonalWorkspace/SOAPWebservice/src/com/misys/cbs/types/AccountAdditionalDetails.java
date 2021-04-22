
package com.misys.cbs.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for accountAdditionalDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountAdditionalDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nextDRIntCapDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nextCRIntCapDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="noticeDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="chargeFndAcct" type="{http://www.misys.com/cbs/types}accountKeys" minOccurs="0"/>
 *         &lt;element name="lastCreditTxnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastDebitTxnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="portfolioId" type="{http://www.misys.com/cbs/types}portfolioId" minOccurs="0"/>
 *         &lt;element name="openingStatus" type="{http://www.misys.com/cbs/types}acctOpeningStatus" minOccurs="0"/>
 *         &lt;element name="movementProductId" type="{http://www.misys.com/cbs/types}cbsProductId" minOccurs="0"/>
 *         &lt;element name="inputUser" type="{http://www.misys.com/cbs/types}userId" minOccurs="0"/>
 *         &lt;element name="authoriser" type="{http://www.misys.com/cbs/types}userId" minOccurs="0"/>
 *         &lt;element name="acctLanguage" type="{http://www.misys.com/cbs/types}language" minOccurs="0"/>
 *         &lt;element name="department" type="{http://www.misys.com/cbs/types}department" minOccurs="0"/>
 *         &lt;element name="chargeStmtFreq" type="{http://www.misys.com/cbs/types}frequency" minOccurs="0"/>
 *         &lt;element name="nextChgStmtDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="chgStmtDayInMonth" type="{http://www.misys.com/cbs/types}dayInMonth" minOccurs="0"/>
 *         &lt;element name="IntBillingFreq" type="{http://www.misys.com/cbs/types}frequency" minOccurs="0"/>
 *         &lt;element name="nextIntBillDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="inBillDayInMonth" type="{http://www.misys.com/cbs/types}dayInMonth" minOccurs="0"/>
 *         &lt;element name="riskCountry" type="{http://www.misys.com/cbs/types}isoCountryCode" minOccurs="0"/>
 *         &lt;element name="internalRiskCountry" type="{http://www.misys.com/cbs/types}isoCountryCode" minOccurs="0"/>
 *         &lt;element name="industrySector" type="{http://www.misys.com/cbs/types}industrySector" minOccurs="0"/>
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
@XmlType(name = "accountAdditionalDetails", propOrder = {
    "nextDRIntCapDate",
    "nextCRIntCapDate",
    "noticeDays",
    "chargeFndAcct",
    "lastCreditTxnDate",
    "lastDebitTxnDate",
    "portfolioId",
    "openingStatus",
    "movementProductId",
    "inputUser",
    "authoriser",
    "acctLanguage",
    "department",
    "chargeStmtFreq",
    "nextChgStmtDate",
    "chgStmtDayInMonth",
    "intBillingFreq",
    "nextIntBillDate",
    "inBillDayInMonth",
    "riskCountry",
    "internalRiskCountry",
    "industrySector",
    "userExtension",
    "hostExtension"
})
public class AccountAdditionalDetails {

    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextDRIntCapDate;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextCRIntCapDate;
    protected Integer noticeDays;
    protected AccountKeys chargeFndAcct;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCreditTxnDate;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDebitTxnDate;
    protected String portfolioId;
    protected String openingStatus;
    protected String movementProductId;
    protected String inputUser;
    protected String authoriser;
    protected String acctLanguage;
    protected String department;
    protected String chargeStmtFreq;
    protected XMLGregorianCalendar nextChgStmtDate;
    protected BigInteger chgStmtDayInMonth;
    @XmlElement(name = "IntBillingFreq")
    protected String intBillingFreq;
    protected XMLGregorianCalendar nextIntBillDate;
    protected BigInteger inBillDayInMonth;
    protected String riskCountry;
    protected String internalRiskCountry;
    protected String industrySector;
    protected Object userExtension;
    protected Object hostExtension;

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
     * Gets the value of the noticeDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoticeDays() {
        return noticeDays;
    }

    /**
     * Sets the value of the noticeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoticeDays(Integer value) {
        this.noticeDays = value;
    }

    /**
     * Gets the value of the chargeFndAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getChargeFndAcct() {
        return chargeFndAcct;
    }

    /**
     * Sets the value of the chargeFndAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setChargeFndAcct(AccountKeys value) {
        this.chargeFndAcct = value;
    }

    /**
     * Gets the value of the lastCreditTxnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCreditTxnDate() {
        return lastCreditTxnDate;
    }

    /**
     * Sets the value of the lastCreditTxnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCreditTxnDate(XMLGregorianCalendar value) {
        this.lastCreditTxnDate = value;
    }

    /**
     * Gets the value of the lastDebitTxnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDebitTxnDate() {
        return lastDebitTxnDate;
    }

    /**
     * Sets the value of the lastDebitTxnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDebitTxnDate(XMLGregorianCalendar value) {
        this.lastDebitTxnDate = value;
    }

    /**
     * Gets the value of the portfolioId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortfolioId() {
        return portfolioId;
    }

    /**
     * Sets the value of the portfolioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortfolioId(String value) {
        this.portfolioId = value;
    }

    /**
     * Gets the value of the openingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningStatus() {
        return openingStatus;
    }

    /**
     * Sets the value of the openingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningStatus(String value) {
        this.openingStatus = value;
    }

    /**
     * Gets the value of the movementProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementProductId() {
        return movementProductId;
    }

    /**
     * Sets the value of the movementProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementProductId(String value) {
        this.movementProductId = value;
    }

    /**
     * Gets the value of the inputUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputUser() {
        return inputUser;
    }

    /**
     * Sets the value of the inputUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputUser(String value) {
        this.inputUser = value;
    }

    /**
     * Gets the value of the authoriser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthoriser() {
        return authoriser;
    }

    /**
     * Sets the value of the authoriser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthoriser(String value) {
        this.authoriser = value;
    }

    /**
     * Gets the value of the acctLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctLanguage() {
        return acctLanguage;
    }

    /**
     * Sets the value of the acctLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctLanguage(String value) {
        this.acctLanguage = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the chargeStmtFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeStmtFreq() {
        return chargeStmtFreq;
    }

    /**
     * Sets the value of the chargeStmtFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeStmtFreq(String value) {
        this.chargeStmtFreq = value;
    }

    /**
     * Gets the value of the nextChgStmtDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextChgStmtDate() {
        return nextChgStmtDate;
    }

    /**
     * Sets the value of the nextChgStmtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextChgStmtDate(XMLGregorianCalendar value) {
        this.nextChgStmtDate = value;
    }

    /**
     * Gets the value of the chgStmtDayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChgStmtDayInMonth() {
        return chgStmtDayInMonth;
    }

    /**
     * Sets the value of the chgStmtDayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChgStmtDayInMonth(BigInteger value) {
        this.chgStmtDayInMonth = value;
    }

    /**
     * Gets the value of the intBillingFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntBillingFreq() {
        return intBillingFreq;
    }

    /**
     * Sets the value of the intBillingFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntBillingFreq(String value) {
        this.intBillingFreq = value;
    }

    /**
     * Gets the value of the nextIntBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextIntBillDate() {
        return nextIntBillDate;
    }

    /**
     * Sets the value of the nextIntBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextIntBillDate(XMLGregorianCalendar value) {
        this.nextIntBillDate = value;
    }

    /**
     * Gets the value of the inBillDayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInBillDayInMonth() {
        return inBillDayInMonth;
    }

    /**
     * Sets the value of the inBillDayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInBillDayInMonth(BigInteger value) {
        this.inBillDayInMonth = value;
    }

    /**
     * Gets the value of the riskCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskCountry() {
        return riskCountry;
    }

    /**
     * Sets the value of the riskCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskCountry(String value) {
        this.riskCountry = value;
    }

    /**
     * Gets the value of the internalRiskCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalRiskCountry() {
        return internalRiskCountry;
    }

    /**
     * Sets the value of the internalRiskCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalRiskCountry(String value) {
        this.internalRiskCountry = value;
    }

    /**
     * Gets the value of the industrySector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustrySector() {
        return industrySector;
    }

    /**
     * Sets the value of the industrySector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustrySector(String value) {
        this.industrySector = value;
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
