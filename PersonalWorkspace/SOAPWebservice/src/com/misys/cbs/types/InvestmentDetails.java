
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for investmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="investmentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stocknShares" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="propertynOthers" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="businessPropertyOwned" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="rentedPropertyOwned" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="industrialPropertyOwned" type="{http://www.misys.com/cbs/types}currency"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "investmentDetails", propOrder = {
    "stocknShares",
    "propertynOthers",
    "businessPropertyOwned",
    "rentedPropertyOwned",
    "industrialPropertyOwned"
})
public class InvestmentDetails {

    @XmlElement(required = true)
    protected Currency stocknShares;
    @XmlElement(required = true)
    protected Currency propertynOthers;
    @XmlElement(required = true)
    protected Currency businessPropertyOwned;
    @XmlElement(required = true)
    protected Currency rentedPropertyOwned;
    @XmlElement(required = true)
    protected Currency industrialPropertyOwned;

    /**
     * Gets the value of the stocknShares property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getStocknShares() {
        return stocknShares;
    }

    /**
     * Sets the value of the stocknShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setStocknShares(Currency value) {
        this.stocknShares = value;
    }

    /**
     * Gets the value of the propertynOthers property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getPropertynOthers() {
        return propertynOthers;
    }

    /**
     * Sets the value of the propertynOthers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setPropertynOthers(Currency value) {
        this.propertynOthers = value;
    }

    /**
     * Gets the value of the businessPropertyOwned property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getBusinessPropertyOwned() {
        return businessPropertyOwned;
    }

    /**
     * Sets the value of the businessPropertyOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setBusinessPropertyOwned(Currency value) {
        this.businessPropertyOwned = value;
    }

    /**
     * Gets the value of the rentedPropertyOwned property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getRentedPropertyOwned() {
        return rentedPropertyOwned;
    }

    /**
     * Sets the value of the rentedPropertyOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setRentedPropertyOwned(Currency value) {
        this.rentedPropertyOwned = value;
    }

    /**
     * Gets the value of the industrialPropertyOwned property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getIndustrialPropertyOwned() {
        return industrialPropertyOwned;
    }

    /**
     * Sets the value of the industrialPropertyOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setIndustrialPropertyOwned(Currency value) {
        this.industrialPropertyOwned = value;
    }

}
