
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for accountCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountCharacteristics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isJoint" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isDormant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dormancyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isClosed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isPassbook" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isChargeWaived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isInternalAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isMinor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isDeceasedLiquidated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deceasedLiquidaatedDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="isNarrativeMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allCreditsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allCreditsReferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allDebitsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allDebitsReferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allTransactionsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pswdForPosting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pswdForEnquiry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pswdForDebit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pswdForCredit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enquiryallowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isStoped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isStatementAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isChequeBookAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "accountCharacteristics", propOrder = {
    "isJoint",
    "isDormant",
    "dormancyDate",
    "isClosed",
    "isPassbook",
    "isChargeWaived",
    "isInternalAccount",
    "isMinor",
    "isDeceasedLiquidated",
    "deceasedLiquidaatedDt",
    "isNarrativeMandatory",
    "allCreditsBlocked",
    "allCreditsReferred",
    "allDebitsBlocked",
    "allDebitsReferred",
    "allTransactionsBlocked",
    "pswdForPosting",
    "pswdForEnquiry",
    "pswdForDebit",
    "pswdForCredit",
    "enquiryallowed",
    "isStoped",
    "isStatementAvailable",
    "isChequeBookAvailable",
    "userExtension",
    "hostExtension"
})
@XmlSeeAlso({
    AcctCharacteristics.class
})
public class AccountCharacteristics {

    @XmlElement(defaultValue = "false")
    protected boolean isJoint;
    @XmlElement(defaultValue = "false")
    protected boolean isDormant;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dormancyDate;
    @XmlElement(defaultValue = "false")
    protected boolean isClosed;
    @XmlElement(defaultValue = "false")
    protected boolean isPassbook;
    @XmlElement(defaultValue = "false")
    protected boolean isChargeWaived;
    @XmlElement(defaultValue = "false")
    protected boolean isInternalAccount;
    @XmlElement(defaultValue = "false")
    protected boolean isMinor;
    @XmlElement(defaultValue = "false")
    protected boolean isDeceasedLiquidated;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deceasedLiquidaatedDt;
    @XmlElement(defaultValue = "false")
    protected boolean isNarrativeMandatory;
    @XmlElement(defaultValue = "false")
    protected boolean allCreditsBlocked;
    @XmlElement(defaultValue = "false")
    protected boolean allCreditsReferred;
    @XmlElement(defaultValue = "false")
    protected boolean allDebitsBlocked;
    @XmlElement(defaultValue = "false")
    protected boolean allDebitsReferred;
    @XmlElement(defaultValue = "false")
    protected boolean allTransactionsBlocked;
    @XmlElement(defaultValue = "false")
    protected boolean pswdForPosting;
    @XmlElement(defaultValue = "false")
    protected boolean pswdForEnquiry;
    @XmlElement(defaultValue = "false")
    protected boolean pswdForDebit;
    @XmlElement(defaultValue = "false")
    protected boolean pswdForCredit;
    @XmlElement(defaultValue = "false")
    protected boolean enquiryallowed;
    @XmlElement(defaultValue = "false")
    protected Boolean isStoped;
    @XmlElement(defaultValue = "false")
    protected boolean isStatementAvailable;
    @XmlElement(defaultValue = "false")
    protected boolean isChequeBookAvailable;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the isJoint property.
     * 
     */
    public boolean isIsJoint() {
        return isJoint;
    }

    /**
     * Sets the value of the isJoint property.
     * 
     */
    public void setIsJoint(boolean value) {
        this.isJoint = value;
    }

    /**
     * Gets the value of the isDormant property.
     * 
     */
    public boolean isIsDormant() {
        return isDormant;
    }

    /**
     * Sets the value of the isDormant property.
     * 
     */
    public void setIsDormant(boolean value) {
        this.isDormant = value;
    }

    /**
     * Gets the value of the dormancyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDormancyDate() {
        return dormancyDate;
    }

    /**
     * Sets the value of the dormancyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDormancyDate(XMLGregorianCalendar value) {
        this.dormancyDate = value;
    }

    /**
     * Gets the value of the isClosed property.
     * 
     */
    public boolean isIsClosed() {
        return isClosed;
    }

    /**
     * Sets the value of the isClosed property.
     * 
     */
    public void setIsClosed(boolean value) {
        this.isClosed = value;
    }

    /**
     * Gets the value of the isPassbook property.
     * 
     */
    public boolean isIsPassbook() {
        return isPassbook;
    }

    /**
     * Sets the value of the isPassbook property.
     * 
     */
    public void setIsPassbook(boolean value) {
        this.isPassbook = value;
    }

    /**
     * Gets the value of the isChargeWaived property.
     * 
     */
    public boolean isIsChargeWaived() {
        return isChargeWaived;
    }

    /**
     * Sets the value of the isChargeWaived property.
     * 
     */
    public void setIsChargeWaived(boolean value) {
        this.isChargeWaived = value;
    }

    /**
     * Gets the value of the isInternalAccount property.
     * 
     */
    public boolean isIsInternalAccount() {
        return isInternalAccount;
    }

    /**
     * Sets the value of the isInternalAccount property.
     * 
     */
    public void setIsInternalAccount(boolean value) {
        this.isInternalAccount = value;
    }

    /**
     * Gets the value of the isMinor property.
     * 
     */
    public boolean isIsMinor() {
        return isMinor;
    }

    /**
     * Sets the value of the isMinor property.
     * 
     */
    public void setIsMinor(boolean value) {
        this.isMinor = value;
    }

    /**
     * Gets the value of the isDeceasedLiquidated property.
     * 
     */
    public boolean isIsDeceasedLiquidated() {
        return isDeceasedLiquidated;
    }

    /**
     * Sets the value of the isDeceasedLiquidated property.
     * 
     */
    public void setIsDeceasedLiquidated(boolean value) {
        this.isDeceasedLiquidated = value;
    }

    /**
     * Gets the value of the deceasedLiquidaatedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeceasedLiquidaatedDt() {
        return deceasedLiquidaatedDt;
    }

    /**
     * Sets the value of the deceasedLiquidaatedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeceasedLiquidaatedDt(XMLGregorianCalendar value) {
        this.deceasedLiquidaatedDt = value;
    }

    /**
     * Gets the value of the isNarrativeMandatory property.
     * 
     */
    public boolean isIsNarrativeMandatory() {
        return isNarrativeMandatory;
    }

    /**
     * Sets the value of the isNarrativeMandatory property.
     * 
     */
    public void setIsNarrativeMandatory(boolean value) {
        this.isNarrativeMandatory = value;
    }

    /**
     * Gets the value of the allCreditsBlocked property.
     * 
     */
    public boolean isAllCreditsBlocked() {
        return allCreditsBlocked;
    }

    /**
     * Sets the value of the allCreditsBlocked property.
     * 
     */
    public void setAllCreditsBlocked(boolean value) {
        this.allCreditsBlocked = value;
    }

    /**
     * Gets the value of the allCreditsReferred property.
     * 
     */
    public boolean isAllCreditsReferred() {
        return allCreditsReferred;
    }

    /**
     * Sets the value of the allCreditsReferred property.
     * 
     */
    public void setAllCreditsReferred(boolean value) {
        this.allCreditsReferred = value;
    }

    /**
     * Gets the value of the allDebitsBlocked property.
     * 
     */
    public boolean isAllDebitsBlocked() {
        return allDebitsBlocked;
    }

    /**
     * Sets the value of the allDebitsBlocked property.
     * 
     */
    public void setAllDebitsBlocked(boolean value) {
        this.allDebitsBlocked = value;
    }

    /**
     * Gets the value of the allDebitsReferred property.
     * 
     */
    public boolean isAllDebitsReferred() {
        return allDebitsReferred;
    }

    /**
     * Sets the value of the allDebitsReferred property.
     * 
     */
    public void setAllDebitsReferred(boolean value) {
        this.allDebitsReferred = value;
    }

    /**
     * Gets the value of the allTransactionsBlocked property.
     * 
     */
    public boolean isAllTransactionsBlocked() {
        return allTransactionsBlocked;
    }

    /**
     * Sets the value of the allTransactionsBlocked property.
     * 
     */
    public void setAllTransactionsBlocked(boolean value) {
        this.allTransactionsBlocked = value;
    }

    /**
     * Gets the value of the pswdForPosting property.
     * 
     */
    public boolean isPswdForPosting() {
        return pswdForPosting;
    }

    /**
     * Sets the value of the pswdForPosting property.
     * 
     */
    public void setPswdForPosting(boolean value) {
        this.pswdForPosting = value;
    }

    /**
     * Gets the value of the pswdForEnquiry property.
     * 
     */
    public boolean isPswdForEnquiry() {
        return pswdForEnquiry;
    }

    /**
     * Sets the value of the pswdForEnquiry property.
     * 
     */
    public void setPswdForEnquiry(boolean value) {
        this.pswdForEnquiry = value;
    }

    /**
     * Gets the value of the pswdForDebit property.
     * 
     */
    public boolean isPswdForDebit() {
        return pswdForDebit;
    }

    /**
     * Sets the value of the pswdForDebit property.
     * 
     */
    public void setPswdForDebit(boolean value) {
        this.pswdForDebit = value;
    }

    /**
     * Gets the value of the pswdForCredit property.
     * 
     */
    public boolean isPswdForCredit() {
        return pswdForCredit;
    }

    /**
     * Sets the value of the pswdForCredit property.
     * 
     */
    public void setPswdForCredit(boolean value) {
        this.pswdForCredit = value;
    }

    /**
     * Gets the value of the enquiryallowed property.
     * 
     */
    public boolean isEnquiryallowed() {
        return enquiryallowed;
    }

    /**
     * Sets the value of the enquiryallowed property.
     * 
     */
    public void setEnquiryallowed(boolean value) {
        this.enquiryallowed = value;
    }

    /**
     * Gets the value of the isStoped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStoped() {
        return isStoped;
    }

    /**
     * Sets the value of the isStoped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStoped(Boolean value) {
        this.isStoped = value;
    }

    /**
     * Gets the value of the isStatementAvailable property.
     * 
     */
    public boolean isIsStatementAvailable() {
        return isStatementAvailable;
    }

    /**
     * Sets the value of the isStatementAvailable property.
     * 
     */
    public void setIsStatementAvailable(boolean value) {
        this.isStatementAvailable = value;
    }

    /**
     * Gets the value of the isChequeBookAvailable property.
     * 
     */
    public boolean isIsChequeBookAvailable() {
        return isChequeBookAvailable;
    }

    /**
     * Sets the value of the isChequeBookAvailable property.
     * 
     */
    public void setIsChequeBookAvailable(boolean value) {
        this.isChequeBookAvailable = value;
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
