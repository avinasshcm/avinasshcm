
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyAddrDtl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyAddrDtl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressLine1" type="{http://www.misys.com/cbs/types}addrLine"/>
 *         &lt;element name="addressLine2" type="{http://www.misys.com/cbs/types}addrLine" minOccurs="0"/>
 *         &lt;element name="addressLine3" type="{http://www.misys.com/cbs/types}addrLine" minOccurs="0"/>
 *         &lt;element name="addressLine4" type="{http://www.misys.com/cbs/types}addrLine" minOccurs="0"/>
 *         &lt;element name="addressLine5" type="{http://www.misys.com/cbs/types}addrLine" minOccurs="0"/>
 *         &lt;element name="addressLine6" type="{http://www.misys.com/cbs/types}addrLine" minOccurs="0"/>
 *         &lt;element name="addressLine7" type="{http://www.misys.com/cbs/types}addrLine" minOccurs="0"/>
 *         &lt;element name="addressLine8" type="{http://www.misys.com/cbs/types}addrLine" minOccurs="0"/>
 *         &lt;element name="addressLine9" type="{http://www.misys.com/cbs/types}addrLine" minOccurs="0"/>
 *         &lt;element name="addressLine10" type="{http://www.misys.com/cbs/types}addrLine" minOccurs="0"/>
 *         &lt;element name="townOrCity" type="{http://www.misys.com/cbs/types}townCity" minOccurs="0"/>
 *         &lt;element name="postCode" type="{http://www.misys.com/cbs/types}postCode" minOccurs="0"/>
 *         &lt;element name="region" type="{http://www.misys.com/cbs/types}region" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.misys.com/cbs/types}country" minOccurs="0"/>
 *         &lt;element name="extensionDetails" type="{http://www.misys.com/cbs/types}extensionDetails" minOccurs="0"/>
 *         &lt;element name="select" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyAddrDtl", propOrder = {
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "addressLine5",
    "addressLine6",
    "addressLine7",
    "addressLine8",
    "addressLine9",
    "addressLine10",
    "townOrCity",
    "postCode",
    "region",
    "country",
    "extensionDetails",
    "select"
})
public class PartyAddrDtl {

    @XmlElement(required = true)
    protected String addressLine1;
    protected String addressLine2;
    protected String addressLine3;
    protected String addressLine4;
    protected String addressLine5;
    protected String addressLine6;
    protected String addressLine7;
    protected String addressLine8;
    protected String addressLine9;
    protected String addressLine10;
    protected String townOrCity;
    protected String postCode;
    protected String region;
    protected String country;
    protected ExtensionDetails extensionDetails;
    @XmlElement(defaultValue = "false")
    protected boolean select;

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine4(String value) {
        this.addressLine4 = value;
    }

    /**
     * Gets the value of the addressLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine5() {
        return addressLine5;
    }

    /**
     * Sets the value of the addressLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine5(String value) {
        this.addressLine5 = value;
    }

    /**
     * Gets the value of the addressLine6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine6() {
        return addressLine6;
    }

    /**
     * Sets the value of the addressLine6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine6(String value) {
        this.addressLine6 = value;
    }

    /**
     * Gets the value of the addressLine7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine7() {
        return addressLine7;
    }

    /**
     * Sets the value of the addressLine7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine7(String value) {
        this.addressLine7 = value;
    }

    /**
     * Gets the value of the addressLine8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine8() {
        return addressLine8;
    }

    /**
     * Sets the value of the addressLine8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine8(String value) {
        this.addressLine8 = value;
    }

    /**
     * Gets the value of the addressLine9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine9() {
        return addressLine9;
    }

    /**
     * Sets the value of the addressLine9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine9(String value) {
        this.addressLine9 = value;
    }

    /**
     * Gets the value of the addressLine10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine10() {
        return addressLine10;
    }

    /**
     * Sets the value of the addressLine10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine10(String value) {
        this.addressLine10 = value;
    }

    /**
     * Gets the value of the townOrCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownOrCity() {
        return townOrCity;
    }

    /**
     * Sets the value of the townOrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownOrCity(String value) {
        this.townOrCity = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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

}
