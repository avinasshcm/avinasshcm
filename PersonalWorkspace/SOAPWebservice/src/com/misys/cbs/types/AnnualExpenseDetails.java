
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for annualExpenseDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="annualExpenseDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grosssMortgageOrRent" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="grossLoanPayments" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="grossInsurance" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="grossTravel" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="grossHouseHold" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="grossOthers" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="grossTotal" type="{http://www.misys.com/cbs/types}currency"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "annualExpenseDetails", propOrder = {
    "grosssMortgageOrRent",
    "grossLoanPayments",
    "grossInsurance",
    "grossTravel",
    "grossHouseHold",
    "grossOthers",
    "grossTotal"
})
public class AnnualExpenseDetails {

    @XmlElement(required = true)
    protected Currency grosssMortgageOrRent;
    @XmlElement(required = true)
    protected Currency grossLoanPayments;
    @XmlElement(required = true)
    protected Currency grossInsurance;
    @XmlElement(required = true)
    protected Currency grossTravel;
    @XmlElement(required = true)
    protected Currency grossHouseHold;
    @XmlElement(required = true)
    protected Currency grossOthers;
    @XmlElement(required = true)
    protected Currency grossTotal;

    /**
     * Gets the value of the grosssMortgageOrRent property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getGrosssMortgageOrRent() {
        return grosssMortgageOrRent;
    }

    /**
     * Sets the value of the grosssMortgageOrRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setGrosssMortgageOrRent(Currency value) {
        this.grosssMortgageOrRent = value;
    }

    /**
     * Gets the value of the grossLoanPayments property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getGrossLoanPayments() {
        return grossLoanPayments;
    }

    /**
     * Sets the value of the grossLoanPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setGrossLoanPayments(Currency value) {
        this.grossLoanPayments = value;
    }

    /**
     * Gets the value of the grossInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getGrossInsurance() {
        return grossInsurance;
    }

    /**
     * Sets the value of the grossInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setGrossInsurance(Currency value) {
        this.grossInsurance = value;
    }

    /**
     * Gets the value of the grossTravel property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getGrossTravel() {
        return grossTravel;
    }

    /**
     * Sets the value of the grossTravel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setGrossTravel(Currency value) {
        this.grossTravel = value;
    }

    /**
     * Gets the value of the grossHouseHold property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getGrossHouseHold() {
        return grossHouseHold;
    }

    /**
     * Sets the value of the grossHouseHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setGrossHouseHold(Currency value) {
        this.grossHouseHold = value;
    }

    /**
     * Gets the value of the grossOthers property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getGrossOthers() {
        return grossOthers;
    }

    /**
     * Sets the value of the grossOthers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setGrossOthers(Currency value) {
        this.grossOthers = value;
    }

    /**
     * Gets the value of the grossTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getGrossTotal() {
        return grossTotal;
    }

    /**
     * Sets the value of the grossTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setGrossTotal(Currency value) {
        this.grossTotal = value;
    }

}
