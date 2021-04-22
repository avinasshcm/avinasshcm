
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for partyStaticDtl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyStaticDtl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyId" type="{http://www.misys.com/cbs/types}partyId"/>
 *         &lt;element name="partyMainName" type="{http://www.misys.com/cbs/types}custFullName"/>
 *         &lt;element name="correspondAddr" type="{http://www.misys.com/cbs/types}partyAddrDtlsLst"/>
 *         &lt;element name="partyType" type="{http://www.misys.com/cbs/types}partyType"/>
 *         &lt;element name="partySubType" type="{http://www.misys.com/cbs/types}partySubType" minOccurs="0"/>
 *         &lt;element name="partyCategory" type="{http://www.misys.com/cbs/types}partyCategory" minOccurs="0"/>
 *         &lt;element name="partyStatus" type="{http://www.misys.com/cbs/types}partySts" minOccurs="0"/>
 *         &lt;element name="relManager" type="{http://www.misys.com/cbs/types}userName" minOccurs="0"/>
 *         &lt;element name="department" type="{http://www.misys.com/cbs/types}department" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.misys.com/cbs/types}language" minOccurs="0"/>
 *         &lt;element name="creditRating" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *         &lt;element name="partyIdDtl" type="{http://www.misys.com/cbs/types}partyIdDtls" minOccurs="0"/>
 *         &lt;element name="mobContactDtl" type="{http://www.misys.com/cbs/types}contactDtls" minOccurs="0"/>
 *         &lt;element name="defaultBranch" type="{http://www.misys.com/cbs/types}branchCode" minOccurs="0"/>
 *         &lt;element name="localityType" type="{http://www.misys.com/cbs/types}localityType" minOccurs="0"/>
 *         &lt;element name="originDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="dateInCorp" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="prefContactDtl" type="{http://www.misys.com/cbs/types}contactDtl" minOccurs="0"/>
 *         &lt;element name="residentStatus" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *         &lt;element name="entRegNumber" type="{http://www.misys.com/cbs/types}uniqueId" minOccurs="0"/>
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
@XmlType(name = "partyStaticDtl", propOrder = {
    "partyId",
    "partyMainName",
    "correspondAddr",
    "partyType",
    "partySubType",
    "partyCategory",
    "partyStatus",
    "relManager",
    "department",
    "language",
    "creditRating",
    "partyIdDtl",
    "mobContactDtl",
    "defaultBranch",
    "localityType",
    "originDate",
    "dateOfBirth",
    "dateInCorp",
    "prefContactDtl",
    "residentStatus",
    "entRegNumber",
    "userExtension",
    "hostExtension"
})
public class PartyStaticDtl {

    @XmlElement(required = true)
    protected String partyId;
    @XmlElement(required = true)
    protected String partyMainName;
    @XmlElement(required = true)
    protected PartyAddrDtlsLst correspondAddr;
    @XmlElement(required = true)
    protected String partyType;
    protected String partySubType;
    protected String partyCategory;
    protected String partyStatus;
    protected String relManager;
    protected String department;
    protected String language;
    protected String creditRating;
    protected PartyIdDtls partyIdDtl;
    protected ContactDtls mobContactDtl;
    protected String defaultBranch;
    protected String localityType;
    protected XMLGregorianCalendar originDate;
    protected XMLGregorianCalendar dateOfBirth;
    protected XMLGregorianCalendar dateInCorp;
    protected ContactDtl prefContactDtl;
    protected String residentStatus;
    protected String entRegNumber;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the partyMainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyMainName() {
        return partyMainName;
    }

    /**
     * Sets the value of the partyMainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyMainName(String value) {
        this.partyMainName = value;
    }

    /**
     * Gets the value of the correspondAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAddrDtlsLst }
     *     
     */
    public PartyAddrDtlsLst getCorrespondAddr() {
        return correspondAddr;
    }

    /**
     * Sets the value of the correspondAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAddrDtlsLst }
     *     
     */
    public void setCorrespondAddr(PartyAddrDtlsLst value) {
        this.correspondAddr = value;
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
     * Gets the value of the partyCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyCategory() {
        return partyCategory;
    }

    /**
     * Sets the value of the partyCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyCategory(String value) {
        this.partyCategory = value;
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
     * Gets the value of the relManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelManager() {
        return relManager;
    }

    /**
     * Sets the value of the relManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelManager(String value) {
        this.relManager = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
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
     * Gets the value of the creditRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRating() {
        return creditRating;
    }

    /**
     * Sets the value of the creditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRating(String value) {
        this.creditRating = value;
    }

    /**
     * Gets the value of the partyIdDtl property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdDtls }
     *     
     */
    public PartyIdDtls getPartyIdDtl() {
        return partyIdDtl;
    }

    /**
     * Sets the value of the partyIdDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdDtls }
     *     
     */
    public void setPartyIdDtl(PartyIdDtls value) {
        this.partyIdDtl = value;
    }

    /**
     * Gets the value of the mobContactDtl property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDtls }
     *     
     */
    public ContactDtls getMobContactDtl() {
        return mobContactDtl;
    }

    /**
     * Sets the value of the mobContactDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDtls }
     *     
     */
    public void setMobContactDtl(ContactDtls value) {
        this.mobContactDtl = value;
    }

    /**
     * Gets the value of the defaultBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
     * Sets the value of the defaultBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultBranch(String value) {
        this.defaultBranch = value;
    }

    /**
     * Gets the value of the localityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalityType() {
        return localityType;
    }

    /**
     * Sets the value of the localityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalityType(String value) {
        this.localityType = value;
    }

    /**
     * Gets the value of the originDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginDate() {
        return originDate;
    }

    /**
     * Sets the value of the originDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginDate(XMLGregorianCalendar value) {
        this.originDate = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the dateInCorp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateInCorp() {
        return dateInCorp;
    }

    /**
     * Sets the value of the dateInCorp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateInCorp(XMLGregorianCalendar value) {
        this.dateInCorp = value;
    }

    /**
     * Gets the value of the prefContactDtl property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDtl }
     *     
     */
    public ContactDtl getPrefContactDtl() {
        return prefContactDtl;
    }

    /**
     * Sets the value of the prefContactDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDtl }
     *     
     */
    public void setPrefContactDtl(ContactDtl value) {
        this.prefContactDtl = value;
    }

    /**
     * Gets the value of the residentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentStatus() {
        return residentStatus;
    }

    /**
     * Sets the value of the residentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentStatus(String value) {
        this.residentStatus = value;
    }

    /**
     * Gets the value of the entRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntRegNumber() {
        return entRegNumber;
    }

    /**
     * Sets the value of the entRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntRegNumber(String value) {
        this.entRegNumber = value;
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
