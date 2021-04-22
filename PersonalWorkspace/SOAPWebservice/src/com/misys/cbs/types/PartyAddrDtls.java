
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyAddrDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyAddrDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyAddressDetails" type="{http://www.misys.com/cbs/types}partyAddrDtl"/>
 *         &lt;element name="partAddressSpecDetail" type="{http://www.misys.com/cbs/types}partyAddrSpecDtl"/>
 *         &lt;element name="extensionDetails" type="{http://www.misys.com/cbs/types}extensionDetails" minOccurs="0"/>
 *         &lt;element name="select" type="{http://www.misys.com/cbs/types}BOOLEAN"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyAddrDtls", propOrder = {
    "partyAddressDetails",
    "partAddressSpecDetail",
    "extensionDetails",
    "select"
})
public class PartyAddrDtls {

    @XmlElement(required = true)
    protected PartyAddrDtl partyAddressDetails;
    @XmlElement(required = true)
    protected PartyAddrSpecDtl partAddressSpecDetail;
    protected ExtensionDetails extensionDetails;
    @XmlElement(defaultValue = "false")
    protected boolean select;

    /**
     * Gets the value of the partyAddressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAddrDtl }
     *     
     */
    public PartyAddrDtl getPartyAddressDetails() {
        return partyAddressDetails;
    }

    /**
     * Sets the value of the partyAddressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAddrDtl }
     *     
     */
    public void setPartyAddressDetails(PartyAddrDtl value) {
        this.partyAddressDetails = value;
    }

    /**
     * Gets the value of the partAddressSpecDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAddrSpecDtl }
     *     
     */
    public PartyAddrSpecDtl getPartAddressSpecDetail() {
        return partAddressSpecDetail;
    }

    /**
     * Sets the value of the partAddressSpecDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAddrSpecDtl }
     *     
     */
    public void setPartAddressSpecDetail(PartyAddrSpecDtl value) {
        this.partAddressSpecDetail = value;
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
