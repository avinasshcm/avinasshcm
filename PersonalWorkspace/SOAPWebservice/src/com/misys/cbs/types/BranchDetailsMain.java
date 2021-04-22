
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for branchDetailsMain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="branchDetailsMain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="branchDetailsShort" type="{http://www.misys.com/cbs/types}branchDetailsShort"/>
 *         &lt;element name="branchAddress" type="{http://www.misys.com/cbs/types}branchAddress"/>
 *         &lt;element name="bicCode" type="{http://www.misys.com/cbs/types}bicCode" minOccurs="0"/>
 *         &lt;element name="clearingDays" type="{http://www.misys.com/cbs/types}clearingDays" minOccurs="0"/>
 *         &lt;element name="contactNumber" type="{http://www.misys.com/cbs/types}contactNumber" minOccurs="0"/>
 *         &lt;element name="contactPerson" type="{http://www.misys.com/cbs/types}contactPerson" minOccurs="0"/>
 *         &lt;element name="rangeFrom" type="{http://www.misys.com/cbs/types}rangeFrom" minOccurs="0"/>
 *         &lt;element name="rangeTo" type="{http://www.misys.com/cbs/types}rangeTo" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://www.misys.com/cbs/types}locale" minOccurs="0"/>
 *         &lt;element name="branchTimeZone" type="{http://www.misys.com/cbs/types}timeZone"/>
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
@XmlType(name = "branchDetailsMain", propOrder = {
    "branchDetailsShort",
    "branchAddress",
    "bicCode",
    "clearingDays",
    "contactNumber",
    "contactPerson",
    "rangeFrom",
    "rangeTo",
    "locale",
    "branchTimeZone",
    "userExtension",
    "hostExtension"
})
public class BranchDetailsMain {

    @XmlElement(required = true)
    protected BranchDetailsShort branchDetailsShort;
    @XmlElement(required = true)
    protected BranchAddress branchAddress;
    protected String bicCode;
    protected Integer clearingDays;
    protected String contactNumber;
    protected String contactPerson;
    protected Integer rangeFrom;
    protected Integer rangeTo;
    protected String locale;
    @XmlElement(required = true)
    protected String branchTimeZone;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the branchDetailsShort property.
     * 
     * @return
     *     possible object is
     *     {@link BranchDetailsShort }
     *     
     */
    public BranchDetailsShort getBranchDetailsShort() {
        return branchDetailsShort;
    }

    /**
     * Sets the value of the branchDetailsShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchDetailsShort }
     *     
     */
    public void setBranchDetailsShort(BranchDetailsShort value) {
        this.branchDetailsShort = value;
    }

    /**
     * Gets the value of the branchAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAddress }
     *     
     */
    public BranchAddress getBranchAddress() {
        return branchAddress;
    }

    /**
     * Sets the value of the branchAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAddress }
     *     
     */
    public void setBranchAddress(BranchAddress value) {
        this.branchAddress = value;
    }

    /**
     * Gets the value of the bicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBicCode() {
        return bicCode;
    }

    /**
     * Sets the value of the bicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBicCode(String value) {
        this.bicCode = value;
    }

    /**
     * Gets the value of the clearingDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClearingDays() {
        return clearingDays;
    }

    /**
     * Sets the value of the clearingDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClearingDays(Integer value) {
        this.clearingDays = value;
    }

    /**
     * Gets the value of the contactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the value of the contactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber(String value) {
        this.contactNumber = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the rangeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRangeFrom() {
        return rangeFrom;
    }

    /**
     * Sets the value of the rangeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRangeFrom(Integer value) {
        this.rangeFrom = value;
    }

    /**
     * Gets the value of the rangeTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRangeTo() {
        return rangeTo;
    }

    /**
     * Sets the value of the rangeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRangeTo(Integer value) {
        this.rangeTo = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the branchTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchTimeZone() {
        return branchTimeZone;
    }

    /**
     * Sets the value of the branchTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchTimeZone(String value) {
        this.branchTimeZone = value;
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
