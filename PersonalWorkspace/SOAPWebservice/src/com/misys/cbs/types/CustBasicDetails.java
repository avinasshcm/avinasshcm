
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for custBasicDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="custBasicDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerId" type="{http://www.misys.com/cbs/types}custId"/>
 *         &lt;element name="customerAlternativeId" type="{http://www.misys.com/cbs/types}customerAlternativeId" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.misys.com/cbs/types}custFullName"/>
 *         &lt;element name="equivalentCustomerName" type="{http://www.misys.com/cbs/types}custFullName" minOccurs="0"/>
 *         &lt;element name="shortName" type="{http://www.misys.com/cbs/types}custShortName" minOccurs="0"/>
 *         &lt;element name="equivalentShortName" type="{http://www.misys.com/cbs/types}custShortName" minOccurs="0"/>
 *         &lt;element name="partyStatus" type="{http://www.misys.com/cbs/types}partySts"/>
 *         &lt;element name="partyType" type="{http://www.misys.com/cbs/types}partyType" minOccurs="0"/>
 *         &lt;element name="partySubType" type="{http://www.misys.com/cbs/types}partySubType" minOccurs="0"/>
 *         &lt;element name="defaultBranchCode" type="{http://www.misys.com/cbs/types}branchCode" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.misys.com/cbs/types}address" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.misys.com/cbs/types}contactNumber" minOccurs="0"/>
 *         &lt;element name="taxIdentificationNumber" type="{http://www.misys.com/cbs/types}taxIdentificationNumber" minOccurs="0"/>
 *         &lt;element name="identificationReference1" type="{http://www.misys.com/cbs/types}custReferenceId" minOccurs="0"/>
 *         &lt;element name="identificationReference2" type="{http://www.misys.com/cbs/types}custReferenceId" minOccurs="0"/>
 *         &lt;element name="identificationReference3" type="{http://www.misys.com/cbs/types}custReferenceId" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.misys.com/cbs/types}language" minOccurs="0"/>
 *         &lt;element name="relationshipManager" type="{http://www.misys.com/cbs/types}userName" minOccurs="0"/>
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
@XmlType(name = "custBasicDetails", propOrder = {
    "customerId",
    "customerAlternativeId",
    "name",
    "equivalentCustomerName",
    "shortName",
    "equivalentShortName",
    "partyStatus",
    "partyType",
    "partySubType",
    "defaultBranchCode",
    "address",
    "phone",
    "taxIdentificationNumber",
    "identificationReference1",
    "identificationReference2",
    "identificationReference3",
    "language",
    "relationshipManager",
    "userExtension",
    "hostExtension"
})
public class CustBasicDetails {

    @XmlElement(required = true)
    protected String customerId;
    protected String customerAlternativeId;
    @XmlElement(required = true)
    protected String name;
    protected String equivalentCustomerName;
    protected String shortName;
    protected String equivalentShortName;
    @XmlElement(required = true)
    protected String partyStatus;
    protected String partyType;
    protected String partySubType;
    protected String defaultBranchCode;
    protected Address address;
    protected String phone;
    protected String taxIdentificationNumber;
    protected String identificationReference1;
    protected String identificationReference2;
    protected String identificationReference3;
    protected String language;
    protected String relationshipManager;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerAlternativeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAlternativeId() {
        return customerAlternativeId;
    }

    /**
     * Sets the value of the customerAlternativeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAlternativeId(String value) {
        this.customerAlternativeId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the equivalentCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentCustomerName() {
        return equivalentCustomerName;
    }

    /**
     * Sets the value of the equivalentCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentCustomerName(String value) {
        this.equivalentCustomerName = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the equivalentShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentShortName() {
        return equivalentShortName;
    }

    /**
     * Sets the value of the equivalentShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentShortName(String value) {
        this.equivalentShortName = value;
    }

    /**
     * Gets the value of the partyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyStatus() {
        return partyStatus;
    }

    /**
     * Sets the value of the partyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyStatus(String value) {
        this.partyStatus = value;
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyType(String value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the partySubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartySubType() {
        return partySubType;
    }

    /**
     * Sets the value of the partySubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartySubType(String value) {
        this.partySubType = value;
    }

    /**
     * Gets the value of the defaultBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultBranchCode() {
        return defaultBranchCode;
    }

    /**
     * Sets the value of the defaultBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultBranchCode(String value) {
        this.defaultBranchCode = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the taxIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    /**
     * Sets the value of the taxIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdentificationNumber(String value) {
        this.taxIdentificationNumber = value;
    }

    /**
     * Gets the value of the identificationReference1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationReference1() {
        return identificationReference1;
    }

    /**
     * Sets the value of the identificationReference1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationReference1(String value) {
        this.identificationReference1 = value;
    }

    /**
     * Gets the value of the identificationReference2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationReference2() {
        return identificationReference2;
    }

    /**
     * Sets the value of the identificationReference2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationReference2(String value) {
        this.identificationReference2 = value;
    }

    /**
     * Gets the value of the identificationReference3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationReference3() {
        return identificationReference3;
    }

    /**
     * Sets the value of the identificationReference3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationReference3(String value) {
        this.identificationReference3 = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the relationshipManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipManager() {
        return relationshipManager;
    }

    /**
     * Sets the value of the relationshipManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipManager(String value) {
        this.relationshipManager = value;
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
