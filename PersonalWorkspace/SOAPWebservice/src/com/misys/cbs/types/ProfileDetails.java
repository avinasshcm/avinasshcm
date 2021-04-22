
package com.misys.cbs.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.misys.com/cbs/types}descriptionLong" minOccurs="0"/>
 *         &lt;element name="adhocGeneration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pageFull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="linesPerPage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="suppressReversal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dormantStatement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="holidayProcessing" type="{http://www.misys.com/cbs/types}holidayProcessMode" minOccurs="0"/>
 *         &lt;element name="statementTemplate" type="{http://www.misys.com/cbs/types}descriptionLong" minOccurs="0"/>
 *         &lt;element name="statementFreq" type="{http://www.misys.com/cbs/types}frequency" minOccurs="0"/>
 *         &lt;element name="stmtDayInMonth" type="{http://www.misys.com/cbs/types}dayInMonth" minOccurs="0"/>
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
@XmlType(name = "profileDetails", propOrder = {
    "description",
    "adhocGeneration",
    "pageFull",
    "linesPerPage",
    "suppressReversal",
    "dormantStatement",
    "holidayProcessing",
    "statementTemplate",
    "statementFreq",
    "stmtDayInMonth",
    "stmtMonth",
    "userExtension",
    "hostExtension"
})
public class ProfileDetails {

    protected String description;
    protected Boolean adhocGeneration;
    protected Boolean pageFull;
    protected BigInteger linesPerPage;
    protected Boolean suppressReversal;
    protected Boolean dormantStatement;
    protected String holidayProcessing;
    protected String statementTemplate;
    protected String statementFreq;
    protected BigInteger stmtDayInMonth;
    protected String stmtMonth;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the statementTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementTemplate() {
        return statementTemplate;
    }

    /**
     * Sets the value of the statementTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementTemplate(String value) {
        this.statementTemplate = value;
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
