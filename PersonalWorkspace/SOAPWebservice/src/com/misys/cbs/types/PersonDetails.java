
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for personDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gender" type="{http://www.misys.com/cbs/types}gender" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.misys.com/cbs/types}maritalStatus" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.misys.com/cbs/types}title" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.misys.com/cbs/types}custShortName" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.misys.com/cbs/types}custShortName" minOccurs="0"/>
 *         &lt;element name="surnameatBirth" type="{http://www.misys.com/cbs/types}custShortName" minOccurs="0"/>
 *         &lt;element name="mothersMaidenName" type="{http://www.misys.com/cbs/types}custShortName" minOccurs="0"/>
 *         &lt;element name="fathersName" type="{http://www.misys.com/cbs/types}custShortName" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="educationLevels" type="{http://www.misys.com/cbs/types}educationLevels" minOccurs="0"/>
 *         &lt;element name="numberOfDependents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="residencyStatus" type="{http://www.misys.com/cbs/types}residencyStatus" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.misys.com/cbs/types}nationality" minOccurs="0"/>
 *         &lt;element name="countryOfDomicile" type="{http://www.misys.com/cbs/types}country" minOccurs="0"/>
 *         &lt;element name="countryOfResidence" type="{http://www.misys.com/cbs/types}country" minOccurs="0"/>
 *         &lt;element name="citizenship" type="{http://www.misys.com/cbs/types}country" minOccurs="0"/>
 *         &lt;element name="placeOfBirth" type="{http://www.misys.com/cbs/types}townCity" minOccurs="0"/>
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
@XmlType(name = "personDetails", propOrder = {
    "gender",
    "maritalStatus",
    "title",
    "middleName",
    "lastName",
    "surnameatBirth",
    "mothersMaidenName",
    "fathersName",
    "dateOfBirth",
    "educationLevels",
    "numberOfDependents",
    "residencyStatus",
    "nationality",
    "countryOfDomicile",
    "countryOfResidence",
    "citizenship",
    "placeOfBirth",
    "userExtension",
    "hostExtension"
})
public class PersonDetails {

    protected String gender;
    protected String maritalStatus;
    protected String title;
    protected String middleName;
    protected String lastName;
    protected String surnameatBirth;
    protected String mothersMaidenName;
    protected String fathersName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected EducationLevels educationLevels;
    @XmlElement(defaultValue = "0")
    protected Integer numberOfDependents;
    protected String residencyStatus;
    protected String nationality;
    protected String countryOfDomicile;
    protected String countryOfResidence;
    protected String citizenship;
    protected String placeOfBirth;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the surnameatBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameatBirth() {
        return surnameatBirth;
    }

    /**
     * Sets the value of the surnameatBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameatBirth(String value) {
        this.surnameatBirth = value;
    }

    /**
     * Gets the value of the mothersMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    /**
     * Sets the value of the mothersMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMothersMaidenName(String value) {
        this.mothersMaidenName = value;
    }

    /**
     * Gets the value of the fathersName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFathersName() {
        return fathersName;
    }

    /**
     * Sets the value of the fathersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFathersName(String value) {
        this.fathersName = value;
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
     * Gets the value of the educationLevels property.
     * 
     * @return
     *     possible object is
     *     {@link EducationLevels }
     *     
     */
    public EducationLevels getEducationLevels() {
        return educationLevels;
    }

    /**
     * Sets the value of the educationLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationLevels }
     *     
     */
    public void setEducationLevels(EducationLevels value) {
        this.educationLevels = value;
    }

    /**
     * Gets the value of the numberOfDependents property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDependents() {
        return numberOfDependents;
    }

    /**
     * Sets the value of the numberOfDependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDependents(Integer value) {
        this.numberOfDependents = value;
    }

    /**
     * Gets the value of the residencyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidencyStatus() {
        return residencyStatus;
    }

    /**
     * Sets the value of the residencyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidencyStatus(String value) {
        this.residencyStatus = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the countryOfDomicile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfDomicile() {
        return countryOfDomicile;
    }

    /**
     * Sets the value of the countryOfDomicile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfDomicile(String value) {
        this.countryOfDomicile = value;
    }

    /**
     * Gets the value of the countryOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * Sets the value of the countryOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfResidence(String value) {
        this.countryOfResidence = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
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
