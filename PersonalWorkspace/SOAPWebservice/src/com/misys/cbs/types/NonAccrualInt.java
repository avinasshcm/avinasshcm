
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nonAccrualInt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nonAccrualInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nonAccrualIntGross" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="nonAccrualIntNet" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="nonAccrualTaxAccrued" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="nonAccrualIntRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="nonAccrualTaxRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nonAccrualInt", propOrder = {
    "nonAccrualIntGross",
    "nonAccrualIntNet",
    "nonAccrualTaxAccrued",
    "nonAccrualIntRate",
    "nonAccrualTaxRate"
})
public class NonAccrualInt {

    protected BigDecimal nonAccrualIntGross;
    protected BigDecimal nonAccrualIntNet;
    protected BigDecimal nonAccrualTaxAccrued;
    protected BigDecimal nonAccrualIntRate;
    protected BigDecimal nonAccrualTaxRate;

    /**
     * Gets the value of the nonAccrualIntGross property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonAccrualIntGross() {
        return nonAccrualIntGross;
    }

    /**
     * Sets the value of the nonAccrualIntGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonAccrualIntGross(BigDecimal value) {
        this.nonAccrualIntGross = value;
    }

    /**
     * Gets the value of the nonAccrualIntNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonAccrualIntNet() {
        return nonAccrualIntNet;
    }

    /**
     * Sets the value of the nonAccrualIntNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonAccrualIntNet(BigDecimal value) {
        this.nonAccrualIntNet = value;
    }

    /**
     * Gets the value of the nonAccrualTaxAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonAccrualTaxAccrued() {
        return nonAccrualTaxAccrued;
    }

    /**
     * Sets the value of the nonAccrualTaxAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonAccrualTaxAccrued(BigDecimal value) {
        this.nonAccrualTaxAccrued = value;
    }

    /**
     * Gets the value of the nonAccrualIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonAccrualIntRate() {
        return nonAccrualIntRate;
    }

    /**
     * Sets the value of the nonAccrualIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonAccrualIntRate(BigDecimal value) {
        this.nonAccrualIntRate = value;
    }

    /**
     * Gets the value of the nonAccrualTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonAccrualTaxRate() {
        return nonAccrualTaxRate;
    }

    /**
     * Sets the value of the nonAccrualTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonAccrualTaxRate(BigDecimal value) {
        this.nonAccrualTaxRate = value;
    }

}
