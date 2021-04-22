
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for draftDtlsAll complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="draftDtlsAll">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="draftBankChqRef" type="{http://www.misys.com/cbs/types}draftBankChqRef"/>
 *         &lt;element name="draftType" type="{http://www.misys.com/cbs/types}instrumentType"/>
 *         &lt;element name="isInternational" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="draftAmount" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="clearingAccount" type="{http://www.misys.com/cbs/types}standardAccountId"/>
 *         &lt;element name="issuingBankCode" type="{http://www.misys.com/cbs/types}issuingBankCode"/>
 *         &lt;element name="issuingBranch" type="{http://www.misys.com/cbs/types}issuingBranch"/>
 *         &lt;element name="drawnOnBank" type="{http://www.misys.com/cbs/types}bankCode" minOccurs="0"/>
 *         &lt;element name="drawnOnBankBranch" type="{http://www.misys.com/cbs/types}branchCode" minOccurs="0"/>
 *         &lt;element name="depositBranch" type="{http://www.misys.com/cbs/types}branchCode" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="depositDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="draftStatus" type="{http://www.misys.com/cbs/types}draftAction"/>
 *         &lt;element name="draftStatusDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="draftStatusReason" type="{http://www.misys.com/cbs/types}descriptionMedium" minOccurs="0"/>
 *         &lt;element name="purchaser" type="{http://www.misys.com/cbs/types}partyId" minOccurs="0"/>
 *         &lt;element name="payee" type="{http://www.misys.com/cbs/types}draftPayeeKeys"/>
 *         &lt;element name="user" type="{http://www.misys.com/cbs/types}userId" minOccurs="0"/>
 *         &lt;element name="stopDraftBranch" type="{http://www.misys.com/cbs/types}branchCode" minOccurs="0"/>
 *         &lt;element name="stopDraftReason" type="{http://www.misys.com/cbs/types}descriptionMedium" minOccurs="0"/>
 *         &lt;element name="cancelDraftBranch" type="{http://www.misys.com/cbs/types}branchCode" minOccurs="0"/>
 *         &lt;element name="cancelDraftReason" type="{http://www.misys.com/cbs/types}descriptionMedium" minOccurs="0"/>
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
@XmlType(name = "draftDtlsAll", propOrder = {
    "draftBankChqRef",
    "draftType",
    "isInternational",
    "draftAmount",
    "clearingAccount",
    "issuingBankCode",
    "issuingBranch",
    "drawnOnBank",
    "drawnOnBankBranch",
    "depositBranch",
    "issueDate",
    "depositDate",
    "draftStatus",
    "draftStatusDateTime",
    "draftStatusReason",
    "purchaser",
    "payee",
    "user",
    "stopDraftBranch",
    "stopDraftReason",
    "cancelDraftBranch",
    "cancelDraftReason",
    "userExtension",
    "hostExtension"
})
@XmlSeeAlso({
    DraftSearchDetail.class
})
public class DraftDtlsAll {

    @XmlElement(required = true)
    protected String draftBankChqRef;
    @XmlElement(required = true)
    protected String draftType;
    @XmlElement(defaultValue = "false")
    protected boolean isInternational;
    @XmlElement(required = true)
    protected Currency draftAmount;
    @XmlElement(required = true)
    protected String clearingAccount;
    @XmlElement(required = true)
    protected String issuingBankCode;
    @XmlElement(required = true)
    protected IssuingBranch issuingBranch;
    protected String drawnOnBank;
    protected String drawnOnBankBranch;
    protected String depositBranch;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depositDate;
    @XmlElement(required = true)
    protected DraftAction draftStatus;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar draftStatusDateTime;
    protected String draftStatusReason;
    protected String purchaser;
    @XmlElement(required = true)
    protected String payee;
    protected String user;
    protected String stopDraftBranch;
    protected String stopDraftReason;
    protected String cancelDraftBranch;
    protected String cancelDraftReason;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the draftBankChqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraftBankChqRef() {
        return draftBankChqRef;
    }

    /**
     * Sets the value of the draftBankChqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraftBankChqRef(String value) {
        this.draftBankChqRef = value;
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
     * Gets the value of the isInternational property.
     * 
     */
    public boolean isIsInternational() {
        return isInternational;
    }

    /**
     * Sets the value of the isInternational property.
     * 
     */
    public void setIsInternational(boolean value) {
        this.isInternational = value;
    }

    /**
     * Gets the value of the draftAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getDraftAmount() {
        return draftAmount;
    }

    /**
     * Sets the value of the draftAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setDraftAmount(Currency value) {
        this.draftAmount = value;
    }

    /**
     * Gets the value of the clearingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingAccount() {
        return clearingAccount;
    }

    /**
     * Sets the value of the clearingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingAccount(String value) {
        this.clearingAccount = value;
    }

    /**
     * Gets the value of the issuingBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBankCode() {
        return issuingBankCode;
    }

    /**
     * Sets the value of the issuingBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBankCode(String value) {
        this.issuingBankCode = value;
    }

    /**
     * Gets the value of the issuingBranch property.
     * 
     * @return
     *     possible object is
     *     {@link IssuingBranch }
     *     
     */
    public IssuingBranch getIssuingBranch() {
        return issuingBranch;
    }

    /**
     * Sets the value of the issuingBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuingBranch }
     *     
     */
    public void setIssuingBranch(IssuingBranch value) {
        this.issuingBranch = value;
    }

    /**
     * Gets the value of the drawnOnBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawnOnBank() {
        return drawnOnBank;
    }

    /**
     * Sets the value of the drawnOnBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawnOnBank(String value) {
        this.drawnOnBank = value;
    }

    /**
     * Gets the value of the drawnOnBankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawnOnBankBranch() {
        return drawnOnBankBranch;
    }

    /**
     * Sets the value of the drawnOnBankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawnOnBankBranch(String value) {
        this.drawnOnBankBranch = value;
    }

    /**
     * Gets the value of the depositBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositBranch() {
        return depositBranch;
    }

    /**
     * Sets the value of the depositBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositBranch(String value) {
        this.depositBranch = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the depositDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositDate() {
        return depositDate;
    }

    /**
     * Sets the value of the depositDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositDate(XMLGregorianCalendar value) {
        this.depositDate = value;
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
     * Gets the value of the draftStatusDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDraftStatusDateTime() {
        return draftStatusDateTime;
    }

    /**
     * Sets the value of the draftStatusDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDraftStatusDateTime(XMLGregorianCalendar value) {
        this.draftStatusDateTime = value;
    }

    /**
     * Gets the value of the draftStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraftStatusReason() {
        return draftStatusReason;
    }

    /**
     * Sets the value of the draftStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraftStatusReason(String value) {
        this.draftStatusReason = value;
    }

    /**
     * Gets the value of the purchaser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaser() {
        return purchaser;
    }

    /**
     * Sets the value of the purchaser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaser(String value) {
        this.purchaser = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayee(String value) {
        this.payee = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the stopDraftBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopDraftBranch() {
        return stopDraftBranch;
    }

    /**
     * Sets the value of the stopDraftBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopDraftBranch(String value) {
        this.stopDraftBranch = value;
    }

    /**
     * Gets the value of the stopDraftReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopDraftReason() {
        return stopDraftReason;
    }

    /**
     * Sets the value of the stopDraftReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopDraftReason(String value) {
        this.stopDraftReason = value;
    }

    /**
     * Gets the value of the cancelDraftBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDraftBranch() {
        return cancelDraftBranch;
    }

    /**
     * Sets the value of the cancelDraftBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDraftBranch(String value) {
        this.cancelDraftBranch = value;
    }

    /**
     * Gets the value of the cancelDraftReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDraftReason() {
        return cancelDraftReason;
    }

    /**
     * Sets the value of the cancelDraftReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDraftReason(String value) {
        this.cancelDraftReason = value;
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
