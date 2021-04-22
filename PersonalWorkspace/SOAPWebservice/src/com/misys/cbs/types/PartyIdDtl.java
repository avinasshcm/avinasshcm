
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyIdDtl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyIdDtl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idReference" type="{http://www.misys.com/cbs/types}partyId"/>
 *         &lt;element name="idType" type="{http://www.misys.com/cbs/types}partyIdType"/>
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
@XmlType(name = "partyIdDtl", propOrder = {
    "idReference",
    "idType",
    "extensionDetails"
})
public class PartyIdDtl {

    @XmlElement(required = true)
    protected String idReference;
    @XmlElement(required = true)
    protected String idType;
    protected ExtensionDetails extensionDetails;

    /**
     * Gets the value of the idReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReference() {
        return idReference;
    }

    /**
     * Sets the value of the idReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReference(String value) {
        this.idReference = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
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
