
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for localRoundingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="localRoundingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localCashDetails" type="{http://www.misys.com/cbs/types}localCashDetails" minOccurs="0"/>
 *         &lt;element name="localEquivDetails" type="{http://www.misys.com/cbs/types}localEquivalentDetails"/>
 *         &lt;element name="lclChargeDetails" type="{http://www.misys.com/cbs/types}localChargeDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localRoundingDetails", propOrder = {
    "localCashDetails",
    "localEquivDetails",
    "lclChargeDetails"
})
public class LocalRoundingDetails {

    protected LocalCashDetails localCashDetails;
    @XmlElement(required = true)
    protected LocalEquivalentDetails localEquivDetails;
    protected LocalChargeDetails lclChargeDetails;

    /**
     * Gets the value of the localCashDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocalCashDetails }
     *     
     */
    public LocalCashDetails getLocalCashDetails() {
        return localCashDetails;
    }

    /**
     * Sets the value of the localCashDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalCashDetails }
     *     
     */
    public void setLocalCashDetails(LocalCashDetails value) {
        this.localCashDetails = value;
    }

    /**
     * Gets the value of the localEquivDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocalEquivalentDetails }
     *     
     */
    public LocalEquivalentDetails getLocalEquivDetails() {
        return localEquivDetails;
    }

    /**
     * Sets the value of the localEquivDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalEquivalentDetails }
     *     
     */
    public void setLocalEquivDetails(LocalEquivalentDetails value) {
        this.localEquivDetails = value;
    }

    /**
     * Gets the value of the lclChargeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocalChargeDetails }
     *     
     */
    public LocalChargeDetails getLclChargeDetails() {
        return lclChargeDetails;
    }

    /**
     * Sets the value of the lclChargeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalChargeDetails }
     *     
     */
    public void setLclChargeDetails(LocalChargeDetails value) {
        this.lclChargeDetails = value;
    }

}
