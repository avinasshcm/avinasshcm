
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for penalIntAccrued complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="penalIntAccrued">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="penalIntAccruedGross" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="penalIntAccruedNet" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="penalIntTaxAccrued" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="penalIntRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="penalIntTaxRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="penalIntAdjustment" type="{http://www.misys.com/cbs/types}amountEdited"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "penalIntAccrued", propOrder = {
    "penalIntAccruedGross",
    "penalIntAccruedNet",
    "penalIntTaxAccrued",
    "penalIntRate",
    "penalIntTaxRate",
    "penalIntAdjustment"
})
public class PenalIntAccrued {

    protected BigDecimal penalIntAccruedGross;
    protected BigDecimal penalIntAccruedNet;
    protected BigDecimal penalIntTaxAccrued;
    protected BigDecimal penalIntRate;
    protected BigDecimal penalIntTaxRate;
    @XmlElement(required = true)
    protected BigDecimal penalIntAdjustment;

    /**
     * Gets the value of the penalIntAccruedGross property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenalIntAccruedGross() {
        return penalIntAccruedGross;
    }

    /**
     * Sets the value of the penalIntAccruedGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenalIntAccruedGross(BigDecimal value) {
        this.penalIntAccruedGross = value;
    }

    /**
     * Gets the value of the penalIntAccruedNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenalIntAccruedNet() {
        return penalIntAccruedNet;
    }

    /**
     * Sets the value of the penalIntAccruedNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenalIntAccruedNet(BigDecimal value) {
        this.penalIntAccruedNet = value;
    }

    /**
     * Gets the value of the penalIntTaxAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenalIntTaxAccrued() {
        return penalIntTaxAccrued;
    }

    /**
     * Sets the value of the penalIntTaxAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenalIntTaxAccrued(BigDecimal value) {
        this.penalIntTaxAccrued = value;
    }

    /**
     * Gets the value of the penalIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenalIntRate() {
        return penalIntRate;
    }

    /**
     * Sets the value of the penalIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenalIntRate(BigDecimal value) {
        this.penalIntRate = value;
    }

    /**
     * Gets the value of the penalIntTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenalIntTaxRate() {
        return penalIntTaxRate;
    }

    /**
     * Sets the value of the penalIntTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenalIntTaxRate(BigDecimal value) {
        this.penalIntTaxRate = value;
    }

    /**
     * Gets the value of the penalIntAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenalIntAdjustment() {
        return penalIntAdjustment;
    }

    /**
     * Sets the value of the penalIntAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenalIntAdjustment(BigDecimal value) {
        this.penalIntAdjustment = value;
    }

}
