
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyAddrDtlsLst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyAddrDtlsLst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addrBusKey" type="{http://www.misys.com/cbs/types}uniqueId"/>
 *         &lt;element name="partyAddressDetail" type="{http://www.misys.com/cbs/types}partyAddrDtl"/>
 *         &lt;element name="partyAddressSpecDetails" type="{http://www.misys.com/cbs/types}partyAddrSpecDtl" minOccurs="0"/>
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
@XmlType(name = "partyAddrDtlsLst", propOrder = {
    "addrBusKey",
    "partyAddressDetail",
    "partyAddressSpecDetails",
    "select"
})
public class PartyAddrDtlsLst {

    @XmlElement(required = true)
    protected String addrBusKey;
    @XmlElement(required = true)
    protected PartyAddrDtl partyAddressDetail;
    protected PartyAddrSpecDtl partyAddressSpecDetails;
    @XmlElement(defaultValue = "false")
    protected boolean select;

    /**
     * Gets the value of the addrBusKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrBusKey() {
        return addrBusKey;
    }

    /**
     * Sets the value of the addrBusKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrBusKey(String value) {
        this.addrBusKey = value;
    }

    /**
     * Gets the value of the partyAddressDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAddrDtl }
     *     
     */
    public PartyAddrDtl getPartyAddressDetail() {
        return partyAddressDetail;
    }

    /**
     * Sets the value of the partyAddressDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAddrDtl }
     *     
     */
    public void setPartyAddressDetail(PartyAddrDtl value) {
        this.partyAddressDetail = value;
    }

    /**
     * Gets the value of the partyAddressSpecDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAddrSpecDtl }
     *     
     */
    public PartyAddrSpecDtl getPartyAddressSpecDetails() {
        return partyAddressSpecDetails;
    }

    /**
     * Sets the value of the partyAddressSpecDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAddrSpecDtl }
     *     
     */
    public void setPartyAddressSpecDetails(PartyAddrSpecDtl value) {
        this.partyAddressSpecDetails = value;
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
