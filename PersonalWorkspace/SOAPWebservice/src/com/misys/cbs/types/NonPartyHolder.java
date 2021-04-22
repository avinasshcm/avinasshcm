
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nonPartyHolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nonPartyHolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="holderBasicDetails" type="{http://www.misys.com/cbs/types}custBasicDetails"/>
 *         &lt;element name="personDetails" type="{http://www.misys.com/cbs/types}personDetails" minOccurs="0"/>
 *         &lt;element name="enterpriseDetails" type="{http://www.misys.com/cbs/types}enterpriseDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nonPartyHolder", propOrder = {
    "holderBasicDetails",
    "personDetails",
    "enterpriseDetails"
})
public class NonPartyHolder {

    @XmlElement(required = true)
    protected CustBasicDetails holderBasicDetails;
    protected PersonDetails personDetails;
    protected EnterpriseDetails enterpriseDetails;

    /**
     * Gets the value of the holderBasicDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustBasicDetails }
     *     
     */
    public CustBasicDetails getHolderBasicDetails() {
        return holderBasicDetails;
    }

    /**
     * Sets the value of the holderBasicDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustBasicDetails }
     *     
     */
    public void setHolderBasicDetails(CustBasicDetails value) {
        this.holderBasicDetails = value;
    }

    /**
     * Gets the value of the personDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PersonDetails }
     *     
     */
    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    /**
     * Sets the value of the personDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonDetails }
     *     
     */
    public void setPersonDetails(PersonDetails value) {
        this.personDetails = value;
    }

    /**
     * Gets the value of the enterpriseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseDetails }
     *     
     */
    public EnterpriseDetails getEnterpriseDetails() {
        return enterpriseDetails;
    }

    /**
     * Sets the value of the enterpriseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseDetails }
     *     
     */
    public void setEnterpriseDetails(EnterpriseDetails value) {
        this.enterpriseDetails = value;
    }

}
