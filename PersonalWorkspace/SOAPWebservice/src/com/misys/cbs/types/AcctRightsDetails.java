
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for acctRightsDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctRightsDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allCreditsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allCreditReferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allDebitsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allDebitsReferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allTransactionsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pswdForPosting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pswdForEnquiry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pswdForDebit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pswdForCredit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enquiryallowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="changeReason" type="{http://www.misys.com/cbs/types}narrLineLong" minOccurs="0"/>
 *         &lt;element name="changUser" type="{http://www.misys.com/cbs/types}userId"/>
 *         &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
@XmlType(name = "acctRightsDetails", propOrder = {
    "allCreditsBlocked",
    "allCreditReferred",
    "allDebitsBlocked",
    "allDebitsReferred",
    "allTransactionsBlocked",
    "pswdForPosting",
    "pswdForEnquiry",
    "pswdForDebit",
    "pswdForCredit",
    "enquiryallowed",
    "changeReason",
    "changUser",
    "changeDate",
    "userExtension",
    "hostExtension"
})
public class AcctRightsDetails {

    @XmlElement(defaultValue = "false")
    protected boolean allCreditsBlocked;
    @XmlElement(defaultValue = "false")
    protected boolean allCreditReferred;
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
    @XmlElement(defaultValue = "true")
    protected boolean enquiryallowed;
    protected String changeReason;
    @XmlElement(required = true)
    protected String changUser;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar changeDate;
    protected Object userExtension;
    protected Object hostExtension;

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
     * Gets the value of the allCreditReferred property.
     * 
     */
    public boolean isAllCreditReferred() {
        return allCreditReferred;
    }

    /**
     * Sets the value of the allCreditReferred property.
     * 
     */
    public void setAllCreditReferred(boolean value) {
        this.allCreditReferred = value;
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
     * Gets the value of the changeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeReason() {
        return changeReason;
    }

    /**
     * Sets the value of the changeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeReason(String value) {
        this.changeReason = value;
    }

    /**
     * Gets the value of the changUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangUser() {
        return changUser;
    }

    /**
     * Sets the value of the changUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangUser(String value) {
        this.changUser = value;
    }

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
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
