
package com.misys.cbs.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contactDtl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactDtl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="select" type="{http://www.misys.com/cbs/types}BOOLEAN"/>
 *         &lt;element name="contactMethod" type="{http://www.misys.com/cbs/types}contactMethod"/>
 *         &lt;element name="contactType" type="{http://www.misys.com/cbs/types}contactType"/>
 *         &lt;element name="contactDesc" type="{http://www.misys.com/cbs/types}descriptionMedium"/>
 *         &lt;element name="contactName" type="{http://www.misys.com/cbs/types}custShortName"/>
 *         &lt;element name="contactPosition" type="{http://www.misys.com/cbs/types}contactPos"/>
 *         &lt;element name="contactTelNum" type="{http://www.misys.com/cbs/types}ptyContactNumber"/>
 *         &lt;element name="contactAltTel" type="{http://www.misys.com/cbs/types}ptyContactNumber"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="isApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prefOrder" type="{http://www.misys.com/cbs/types}noOfPages"/>
 *         &lt;element name="contactEmailId" type="{http://www.misys.com/cbs/types}ptyEmail"/>
 *         &lt;element name="contactAddressId" type="{http://www.misys.com/cbs/types}uniqueId"/>
 *         &lt;element name="contactDtlId" type="{http://www.misys.com/cbs/types}uniqueId"/>
 *         &lt;element name="extensionDetails" type="{http://www.misys.com/cbs/types}extensionDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactDtl", propOrder = {
    "select",
    "contactMethod",
    "contactType",
    "contactDesc",
    "contactName",
    "contactPosition",
    "contactTelNum",
    "contactAltTel",
    "startDate",
    "endDate",
    "isApplicable",
    "prefOrder",
    "contactEmailId",
    "contactAddressId",
    "contactDtlId",
    "extensionDetails"
})
public class ContactDtl {

    protected boolean select;
    @XmlElement(required = true)
    protected String contactMethod;
    @XmlElement(required = true)
    protected String contactType;
    @XmlElement(required = true)
    protected String contactDesc;
    @XmlElement(required = true)
    protected String contactName;
    @XmlElement(required = true)
    protected String contactPosition;
    @XmlElement(required = true)
    protected String contactTelNum;
    @XmlElement(required = true)
    protected String contactAltTel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    protected boolean isApplicable;
    @XmlElement(required = true)
    protected BigInteger prefOrder;
    @XmlElement(required = true)
    protected String contactEmailId;
    @XmlElement(required = true)
    protected String contactAddressId;
    @XmlElement(required = true)
    protected String contactDtlId;
    protected ExtensionDetails extensionDetails;

    /**
     * Gets the value of the select property.
     * 
     */
    public boolean isSelect() {
        return select;
    }

    /**
     * Sets the value of the select property.
     * 
     */
    public void setSelect(boolean value) {
        this.select = value;
    }

    /**
     * Gets the value of the contactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMethod() {
        return contactMethod;
    }

    /**
     * Sets the value of the contactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMethod(String value) {
        this.contactMethod = value;
    }

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the contactDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDesc() {
        return contactDesc;
    }

    /**
     * Sets the value of the contactDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDesc(String value) {
        this.contactDesc = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPosition() {
        return contactPosition;
    }

    /**
     * Sets the value of the contactPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPosition(String value) {
        this.contactPosition = value;
    }

    /**
     * Gets the value of the contactTelNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTelNum() {
        return contactTelNum;
    }

    /**
     * Sets the value of the contactTelNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTelNum(String value) {
        this.contactTelNum = value;
    }

    /**
     * Gets the value of the contactAltTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAltTel() {
        return contactAltTel;
    }

    /**
     * Sets the value of the contactAltTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAltTel(String value) {
        this.contactAltTel = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the isApplicable property.
     * 
     */
    public boolean isIsApplicable() {
        return isApplicable;
    }

    /**
     * Sets the value of the isApplicable property.
     * 
     */
    public void setIsApplicable(boolean value) {
        this.isApplicable = value;
    }

    /**
     * Gets the value of the prefOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrefOrder() {
        return prefOrder;
    }

    /**
     * Sets the value of the prefOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrefOrder(BigInteger value) {
        this.prefOrder = value;
    }

    /**
     * Gets the value of the contactEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmailId() {
        return contactEmailId;
    }

    /**
     * Sets the value of the contactEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmailId(String value) {
        this.contactEmailId = value;
    }

    /**
     * Gets the value of the contactAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddressId() {
        return contactAddressId;
    }

    /**
     * Sets the value of the contactAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddressId(String value) {
        this.contactAddressId = value;
    }

    /**
     * Gets the value of the contactDtlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDtlId() {
        return contactDtlId;
    }

    /**
     * Sets the value of the contactDtlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDtlId(String value) {
        this.contactDtlId = value;
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

}
