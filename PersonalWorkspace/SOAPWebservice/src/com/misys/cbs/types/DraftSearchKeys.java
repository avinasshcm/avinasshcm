
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for draftSearchKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="draftSearchKeys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="draftBankChqFilter" type="{http://www.misys.com/cbs/types}draftBankChqFilter" minOccurs="0"/>
 *         &lt;element name="draftType" type="{http://www.misys.com/cbs/types}instrumentType" minOccurs="0"/>
 *         &lt;element name="draftStatus" type="{http://www.misys.com/cbs/types}draftAction" minOccurs="0"/>
 *         &lt;element name="issueDepositDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="issueDepositDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="isoCurrencyCode" type="{http://www.misys.com/cbs/types}isoCurrencyCode" minOccurs="0"/>
 *         &lt;element name="draftPayeeKeys" type="{http://www.misys.com/cbs/types}draftPayeeKeys" minOccurs="0"/>
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
@XmlType(name = "draftSearchKeys", propOrder = {
    "draftBankChqFilter",
    "draftType",
    "draftStatus",
    "issueDepositDateFrom",
    "issueDepositDateTo",
    "amount",
    "isoCurrencyCode",
    "draftPayeeKeys",
    "userExtension",
    "hostExtension"
})
public class DraftSearchKeys {

    protected String draftBankChqFilter;
    protected String draftType;
    protected DraftAction draftStatus;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDepositDateFrom;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDepositDateTo;
    protected BigDecimal amount;
    protected String isoCurrencyCode;
    protected String draftPayeeKeys;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the draftBankChqFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraftBankChqFilter() {
        return draftBankChqFilter;
    }

    /**
     * Sets the value of the draftBankChqFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraftBankChqFilter(String value) {
        this.draftBankChqFilter = value;
    }

    /**
     * Gets the value of the draftType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraftType() {
        return draftType;
    }

    /**
     * Sets the value of the draftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraftType(String value) {
        this.draftType = value;
    }

    /**
     * Gets the value of the draftStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DraftAction }
     *     
     */
    public DraftAction getDraftStatus() {
        return draftStatus;
    }

    /**
     * Sets the value of the draftStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DraftAction }
     *     
     */
    public void setDraftStatus(DraftAction value) {
        this.draftStatus = value;
    }

    /**
     * Gets the value of the issueDepositDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDepositDateFrom() {
        return issueDepositDateFrom;
    }

    /**
     * Sets the value of the issueDepositDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDepositDateFrom(XMLGregorianCalendar value) {
        this.issueDepositDateFrom = value;
    }

    /**
     * Gets the value of the issueDepositDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDepositDateTo() {
        return issueDepositDateTo;
    }

    /**
     * Sets the value of the issueDepositDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDepositDateTo(XMLGregorianCalendar value) {
        this.issueDepositDateTo = value;
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
     * Gets the value of the isoCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCurrencyCode() {
        return isoCurrencyCode;
    }

    /**
     * Sets the value of the isoCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCurrencyCode(String value) {
        this.isoCurrencyCode = value;
    }

    /**
     * Gets the value of the draftPayeeKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraftPayeeKeys() {
        return draftPayeeKeys;
    }

    /**
     * Sets the value of the draftPayeeKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraftPayeeKeys(String value) {
        this.draftPayeeKeys = value;
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
