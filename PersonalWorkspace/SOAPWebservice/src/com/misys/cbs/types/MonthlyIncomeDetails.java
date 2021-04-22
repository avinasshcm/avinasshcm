
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monthlyIncomeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="monthlyIncomeDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="netSalary" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="pensions" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="investments" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="rentalIncome" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="benefits" type="{http://www.misys.com/cbs/types}currency"/>
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
@XmlType(name = "monthlyIncomeDetails", propOrder = {
    "netSalary",
    "pensions",
    "investments",
    "rentalIncome",
    "benefits",
    "others",
    "total"
})
public class MonthlyIncomeDetails {

    @XmlElement(required = true)
    protected Currency netSalary;
    @XmlElement(required = true)
    protected Currency pensions;
    @XmlElement(required = true)
    protected Currency investments;
    @XmlElement(required = true)
    protected Currency rentalIncome;
    @XmlElement(required = true)
    protected Currency benefits;
    @XmlElement(required = true)
    protected Currency others;
    @XmlElement(required = true)
    protected Currency total;

    /**
     * Gets the value of the netSalary property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getNetSalary() {
        return netSalary;
    }

    /**
     * Sets the value of the netSalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setNetSalary(Currency value) {
        this.netSalary = value;
    }

    /**
     * Gets the value of the pensions property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getPensions() {
        return pensions;
    }

    /**
     * Sets the value of the pensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setPensions(Currency value) {
        this.pensions = value;
    }

    /**
     * Gets the value of the investments property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getInvestments() {
        return investments;
    }

    /**
     * Sets the value of the investments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setInvestments(Currency value) {
        this.investments = value;
    }

    /**
     * Gets the value of the rentalIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getRentalIncome() {
        return rentalIncome;
    }

    /**
     * Sets the value of the rentalIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setRentalIncome(Currency value) {
        this.rentalIncome = value;
    }

    /**
     * Gets the value of the benefits property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getBenefits() {
        return benefits;
    }

    /**
     * Sets the value of the benefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setBenefits(Currency value) {
        this.benefits = value;
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
