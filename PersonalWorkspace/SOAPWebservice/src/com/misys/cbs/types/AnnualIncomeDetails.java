
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for annualIncomeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="annualIncomeDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grossNetSalary" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="grossPensions" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="grossInvestments" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="grossRentalIncome" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="grossBenefits" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="grossOthers" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="grossTotal" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="netGrossDisposalIncome" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="netDisposalIncome" type="{http://www.misys.com/cbs/types}currency"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "annualIncomeDetails", propOrder = {
    "grossNetSalary",
    "grossPensions",
    "grossInvestments",
    "grossRentalIncome",
    "grossBenefits",
    "grossOthers",
    "grossTotal",
    "netGrossDisposalIncome",
    "netDisposalIncome"
})
public class AnnualIncomeDetails {

    @XmlElement(required = true)
    protected Currency grossNetSalary;
    @XmlElement(required = true)
    protected Currency grossPensions;
    @XmlElement(required = true)
    protected Currency grossInvestments;
    @XmlElement(required = true)
    protected Currency grossRentalIncome;
    @XmlElement(required = true)
    protected Currency grossBenefits;
    @XmlElement(required = true)
    protected Currency grossOthers;
    @XmlElement(required = true)
    protected Currency grossTotal;
    @XmlElement(required = true)
    protected Currency netGrossDisposalIncome;
    @XmlElement(required = true)
    protected Currency netDisposalIncome;

    /**
     * Gets the value of the grossNetSalary property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getGrossNetSalary() {
        return grossNetSalary;
    }

    /**
     * Sets the value of the grossNetSalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setGrossNetSalary(Currency value) {
        this.grossNetSalary = value;
    }

    /**
     * Gets the value of the grossPensions property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getGrossPensions() {
        return grossPensions;
    }

    /**
     * Sets the value of the grossPensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setGrossPensions(Currency value) {
        this.grossPensions = value;
    }

    /**
     * Gets the value of the grossInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getGrossInvestments() {
        return grossInvestments;
    }

    /**
     * Sets the value of the grossInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setGrossInvestments(Currency value) {
        this.grossInvestments = value;
    }

    /**
     * Gets the value of the grossRentalIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getGrossRentalIncome() {
        return grossRentalIncome;
    }

    /**
     * Sets the value of the grossRentalIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setGrossRentalIncome(Currency value) {
        this.grossRentalIncome = value;
    }

    /**
     * Gets the value of the grossBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getGrossBenefits() {
        return grossBenefits;
    }

    /**
     * Sets the value of the grossBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setGrossBenefits(Currency value) {
        this.grossBenefits = value;
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

    /**
     * Gets the value of the netGrossDisposalIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getNetGrossDisposalIncome() {
        return netGrossDisposalIncome;
    }

    /**
     * Sets the value of the netGrossDisposalIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setNetGrossDisposalIncome(Currency value) {
        this.netGrossDisposalIncome = value;
    }

    /**
     * Gets the value of the netDisposalIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getNetDisposalIncome() {
        return netDisposalIncome;
    }

    /**
     * Sets the value of the netDisposalIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setNetDisposalIncome(Currency value) {
        this.netDisposalIncome = value;
    }

}
