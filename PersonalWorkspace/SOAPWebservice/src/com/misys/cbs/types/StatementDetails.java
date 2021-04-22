
package com.misys.cbs.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for statementDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statementDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctStmtId" type="{http://www.misys.com/cbs/types}acctStmtId" minOccurs="0"/>
 *         &lt;element name="nextStatementDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="lastStatementDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="statementFreq" type="{http://www.misys.com/cbs/types}frequency" minOccurs="0"/>
 *         &lt;element name="stmtDayInMonth" type="{http://www.misys.com/cbs/types}dayInMonth"/>
 *         &lt;element name="stmtAddress" type="{http://www.misys.com/cbs/types}addressType" minOccurs="0"/>
 *         &lt;element name="stmtMethod" type="{http://www.misys.com/cbs/types}mailMethod" minOccurs="0"/>
 *         &lt;element name="lastStmtNo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastStmtPg" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="currentStmtNo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="currentStmtPg" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="broughtFwdBal" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="adhocGeneration" type="{http://www.misys.com/cbs/types}BOOLEAN" minOccurs="0"/>
 *         &lt;element name="pageFull" type="{http://www.misys.com/cbs/types}BOOLEAN" minOccurs="0"/>
 *         &lt;element name="linesPerPage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="suppressReversal" type="{http://www.misys.com/cbs/types}BOOLEAN" minOccurs="0"/>
 *         &lt;element name="dormantStatement" type="{http://www.misys.com/cbs/types}BOOLEAN" minOccurs="0"/>
 *         &lt;element name="holidayProcessing" type="{http://www.misys.com/cbs/types}holidayProcessMode" minOccurs="0"/>
 *         &lt;element name="stmtMonth" type="{http://www.misys.com/cbs/types}month" minOccurs="0"/>
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
@XmlType(name = "statementDetails", propOrder = {
    "acctStmtId",
    "nextStatementDate",
    "lastStatementDate",
    "statementFreq",
    "stmtDayInMonth",
    "stmtAddress",
    "stmtMethod",
    "lastStmtNo",
    "lastStmtPg",
    "currentStmtNo",
    "currentStmtPg",
    "broughtFwdBal",
    "adhocGeneration",
    "pageFull",
    "linesPerPage",
    "suppressReversal",
    "dormantStatement",
    "holidayProcessing",
    "stmtMonth",
    "userExtension",
    "hostExtension"
})
public class StatementDetails {

    protected String acctStmtId;
    protected XMLGregorianCalendar nextStatementDate;
    protected XMLGregorianCalendar lastStatementDate;
    protected String statementFreq;
    @XmlElement(required = true)
    protected BigInteger stmtDayInMonth;
    protected String stmtAddress;
    protected String stmtMethod;
    protected BigInteger lastStmtNo;
    protected BigInteger lastStmtPg;
    protected BigInteger currentStmtNo;
    protected BigInteger currentStmtPg;
    protected BigDecimal broughtFwdBal;
    protected Boolean adhocGeneration;
    protected Boolean pageFull;
    protected BigInteger linesPerPage;
    protected Boolean suppressReversal;
    protected Boolean dormantStatement;
    protected String holidayProcessing;
    protected String stmtMonth;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the acctStmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctStmtId() {
        return acctStmtId;
    }

    /**
     * Sets the value of the acctStmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctStmtId(String value) {
        this.acctStmtId = value;
    }

    /**
     * Gets the value of the nextStatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextStatementDate() {
        return nextStatementDate;
    }

    /**
     * Sets the value of the nextStatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextStatementDate(XMLGregorianCalendar value) {
        this.nextStatementDate = value;
    }

    /**
     * Gets the value of the lastStatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastStatementDate() {
        return lastStatementDate;
    }

    /**
     * Sets the value of the lastStatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastStatementDate(XMLGregorianCalendar value) {
        this.lastStatementDate = value;
    }

    /**
     * Gets the value of the statementFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementFreq() {
        return statementFreq;
    }

    /**
     * Sets the value of the statementFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementFreq(String value) {
        this.statementFreq = value;
    }

    /**
     * Gets the value of the stmtDayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStmtDayInMonth() {
        return stmtDayInMonth;
    }

    /**
     * Sets the value of the stmtDayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStmtDayInMonth(BigInteger value) {
        this.stmtDayInMonth = value;
    }

    /**
     * Gets the value of the stmtAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtAddress() {
        return stmtAddress;
    }

    /**
     * Sets the value of the stmtAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtAddress(String value) {
        this.stmtAddress = value;
    }

    /**
     * Gets the value of the stmtMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtMethod() {
        return stmtMethod;
    }

    /**
     * Sets the value of the stmtMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtMethod(String value) {
        this.stmtMethod = value;
    }

    /**
     * Gets the value of the lastStmtNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastStmtNo() {
        return lastStmtNo;
    }

    /**
     * Sets the value of the lastStmtNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastStmtNo(BigInteger value) {
        this.lastStmtNo = value;
    }

    /**
     * Gets the value of the lastStmtPg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastStmtPg() {
        return lastStmtPg;
    }

    /**
     * Sets the value of the lastStmtPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastStmtPg(BigInteger value) {
        this.lastStmtPg = value;
    }

    /**
     * Gets the value of the currentStmtNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentStmtNo() {
        return currentStmtNo;
    }

    /**
     * Sets the value of the currentStmtNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentStmtNo(BigInteger value) {
        this.currentStmtNo = value;
    }

    /**
     * Gets the value of the currentStmtPg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentStmtPg() {
        return currentStmtPg;
    }

    /**
     * Sets the value of the currentStmtPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentStmtPg(BigInteger value) {
        this.currentStmtPg = value;
    }

    /**
     * Gets the value of the broughtFwdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBroughtFwdBal() {
        return broughtFwdBal;
    }

    /**
     * Sets the value of the broughtFwdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBroughtFwdBal(BigDecimal value) {
        this.broughtFwdBal = value;
    }

    /**
     * Gets the value of the adhocGeneration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdhocGeneration() {
        return adhocGeneration;
    }

    /**
     * Sets the value of the adhocGeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdhocGeneration(Boolean value) {
        this.adhocGeneration = value;
    }

    /**
     * Gets the value of the pageFull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPageFull() {
        return pageFull;
    }

    /**
     * Sets the value of the pageFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPageFull(Boolean value) {
        this.pageFull = value;
    }

    /**
     * Gets the value of the linesPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinesPerPage() {
        return linesPerPage;
    }

    /**
     * Sets the value of the linesPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinesPerPage(BigInteger value) {
        this.linesPerPage = value;
    }

    /**
     * Gets the value of the suppressReversal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressReversal() {
        return suppressReversal;
    }

    /**
     * Sets the value of the suppressReversal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressReversal(Boolean value) {
        this.suppressReversal = value;
    }

    /**
     * Gets the value of the dormantStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDormantStatement() {
        return dormantStatement;
    }

    /**
     * Sets the value of the dormantStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDormantStatement(Boolean value) {
        this.dormantStatement = value;
    }

    /**
     * Gets the value of the holidayProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolidayProcessing() {
        return holidayProcessing;
    }

    /**
     * Sets the value of the holidayProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolidayProcessing(String value) {
        this.holidayProcessing = value;
    }

    /**
     * Gets the value of the stmtMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtMonth() {
        return stmtMonth;
    }

    /**
     * Sets the value of the stmtMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtMonth(String value) {
        this.stmtMonth = value;
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
