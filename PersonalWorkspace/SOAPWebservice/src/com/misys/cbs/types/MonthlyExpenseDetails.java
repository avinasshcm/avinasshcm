
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monthlyExpenseDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="monthlyExpenseDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mortgageOrRent" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="loanPayments" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="insurance" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="travel" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="houseHold" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="others" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="total" type="{http://www.misys.com/cbs/types}currency"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monthlyExpenseDetails", propOrder = {
    "mortgageOrRent",
    "loanPayments",
    "insurance",
    "travel",
    "houseHold",
    "others",
    "total"
})
public class MonthlyExpenseDetails {

    @XmlElement(required = true)
    protected Currency mortgageOrRent;
    @XmlElement(required = true)
    protected Currency loanPayments;
    @XmlElement(required = true)
    protected Currency insurance;
    @XmlElement(required = true)
    protected Currency travel;
    @XmlElement(required = true)
    protected Currency houseHold;
    @XmlElement(required = true)
    protected Currency others;
    @XmlElement(required = true)
    protected Currency total;

    /**
     * Gets the value of the mortgageOrRent property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getMortgageOrRent() {
        return mortgageOrRent;
    }

    /**
     * Sets the value of the mortgageOrRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setMortgageOrRent(Currency value) {
        this.mortgageOrRent = value;
    }

    /**
     * Gets the value of the loanPayments property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getLoanPayments() {
        return loanPayments;
    }

    /**
     * Sets the value of the loanPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setLoanPayments(Currency value) {
        this.loanPayments = value;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setInsurance(Currency value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the travel property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTravel() {
        return travel;
    }

    /**
     * Sets the value of the travel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTravel(Currency value) {
        this.travel = value;
    }

    /**
     * Gets the value of the houseHold property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getHouseHold() {
        return houseHold;
    }

    /**
     * Sets the value of the houseHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setHouseHold(Currency value) {
        this.houseHold = value;
    }

    /**
     * Gets the value of the others property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getOthers() {
        return others;
    }

    /**
     * Sets the value of the others property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setOthers(Currency value) {
        this.others = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTotal(Currency value) {
        this.total = value;
    }

}
