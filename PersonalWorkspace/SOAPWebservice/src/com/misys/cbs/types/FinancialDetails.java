
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for financialDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="financialDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="investmentDetails" type="{http://www.misys.com/cbs/types}investmentDetails"/>
 *         &lt;element name="monthlyIncomeDetails" type="{http://www.misys.com/cbs/types}monthlyIncomeDetails"/>
 *         &lt;element name="monthlyExpenseDetails" type="{http://www.misys.com/cbs/types}monthlyExpenseDetails"/>
 *         &lt;element name="annualIncomeDetails" type="{http://www.misys.com/cbs/types}annualIncomeDetails" minOccurs="0"/>
 *         &lt;element name="annualExpenseDetails" type="{http://www.misys.com/cbs/types}annualExpenseDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financialDetails", propOrder = {
    "investmentDetails",
    "monthlyIncomeDetails",
    "monthlyExpenseDetails",
    "annualIncomeDetails",
    "annualExpenseDetails"
})
public class FinancialDetails {

    @XmlElement(required = true)
    protected InvestmentDetails investmentDetails;
    @XmlElement(required = true)
    protected MonthlyIncomeDetails monthlyIncomeDetails;
    @XmlElement(required = true)
    protected MonthlyExpenseDetails monthlyExpenseDetails;
    protected AnnualIncomeDetails annualIncomeDetails;
    protected AnnualExpenseDetails annualExpenseDetails;

    /**
     * Gets the value of the investmentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentDetails }
     *     
     */
    public InvestmentDetails getInvestmentDetails() {
        return investmentDetails;
    }

    /**
     * Sets the value of the investmentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentDetails }
     *     
     */
    public void setInvestmentDetails(InvestmentDetails value) {
        this.investmentDetails = value;
    }

    /**
     * Gets the value of the monthlyIncomeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyIncomeDetails }
     *     
     */
    public MonthlyIncomeDetails getMonthlyIncomeDetails() {
        return monthlyIncomeDetails;
    }

    /**
     * Sets the value of the monthlyIncomeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyIncomeDetails }
     *     
     */
    public void setMonthlyIncomeDetails(MonthlyIncomeDetails value) {
        this.monthlyIncomeDetails = value;
    }

    /**
     * Gets the value of the monthlyExpenseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyExpenseDetails }
     *     
     */
    public MonthlyExpenseDetails getMonthlyExpenseDetails() {
        return monthlyExpenseDetails;
    }

    /**
     * Sets the value of the monthlyExpenseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyExpenseDetails }
     *     
     */
    public void setMonthlyExpenseDetails(MonthlyExpenseDetails value) {
        this.monthlyExpenseDetails = value;
    }

    /**
     * Gets the value of the annualIncomeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AnnualIncomeDetails }
     *     
     */
    public AnnualIncomeDetails getAnnualIncomeDetails() {
        return annualIncomeDetails;
    }

    /**
     * Sets the value of the annualIncomeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnualIncomeDetails }
     *     
     */
    public void setAnnualIncomeDetails(AnnualIncomeDetails value) {
        this.annualIncomeDetails = value;
    }

    /**
     * Gets the value of the annualExpenseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AnnualExpenseDetails }
     *     
     */
    public AnnualExpenseDetails getAnnualExpenseDetails() {
        return annualExpenseDetails;
    }

    /**
     * Sets the value of the annualExpenseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnualExpenseDetails }
     *     
     */
    public void setAnnualExpenseDetails(AnnualExpenseDetails value) {
        this.annualExpenseDetails = value;
    }

}
