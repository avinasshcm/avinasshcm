
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for partyAddrSpecDtl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyAddrSpecDtl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressType" type="{http://www.misys.com/cbs/types}addressType"/>
 *         &lt;element name="faoName" type="{http://www.misys.com/cbs/types}custFullName" minOccurs="0"/>
 *         &lt;element name="fromDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="toDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="dunsNumber" type="{http://www.misys.com/cbs/types}dunsNumber" minOccurs="0"/>
 *         &lt;element name="statusAtTheAddress" type="{http://www.misys.com/cbs/types}statusAtTheAddress" minOccurs="0"/>
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
@XmlType(name = "partyAddrSpecDtl", propOrder = {
    "addressType",
    "faoName",
    "fromDate",
    "toDate",
    "dunsNumber",
    "statusAtTheAddress",
    "extensionDetails"
})
public class PartyAddrSpecDtl {

    @XmlElement(required = true)
    protected String addressType;
    protected String faoName;
    protected XMLGregorianCalendar fromDate;
    protected XMLGregorianCalendar toDate;
    protected String dunsNumber;
    protected String statusAtTheAddress;
    protected ExtensionDetails extensionDetails;

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the faoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaoName() {
        return faoName;
    }

    /**
     * Sets the value of the faoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaoName(String value) {
        this.faoName = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunsNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunsNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the statusAtTheAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusAtTheAddress() {
        return statusAtTheAddress;
    }

    /**
     * Sets the value of the statusAtTheAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusAtTheAddress(String value) {
        this.statusAtTheAddress = value;
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
