
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acctAccruedCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctAccruedCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargeType" type="{http://www.misys.com/cbs/types}chargeType"/>
 *         &lt;element name="chargeDescription" type="{http://www.misys.com/cbs/types}descriptionLong"/>
 *         &lt;element name="chargeAccruedGross" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="chargeAccruedNet" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="chargeTaxAmount" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="chargeTaxRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acctAccruedCharge", propOrder = {
    "chargeType",
    "chargeDescription",
    "chargeAccruedGross",
    "chargeAccruedNet",
    "chargeTaxAmount",
    "chargeTaxRate"
})
public class AcctAccruedCharge {

    @XmlElement(required = true)
    protected String chargeType;
    @XmlElement(required = true)
    protected String chargeDescription;
    protected BigDecimal chargeAccruedGross;
    protected BigDecimal chargeAccruedNet;
    protected BigDecimal chargeTaxAmount;
    protected BigDecimal chargeTaxRate;

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the chargeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeDescription() {
        return chargeDescription;
    }

    /**
     * Sets the value of the chargeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeDescription(String value) {
        this.chargeDescription = value;
    }

    /**
     * Gets the value of the chargeAccruedGross property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeAccruedGross() {
        return chargeAccruedGross;
    }

    /**
     * Sets the value of the chargeAccruedGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeAccruedGross(BigDecimal value) {
        this.chargeAccruedGross = value;
    }

    /**
     * Gets the value of the chargeAccruedNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeAccruedNet() {
        return chargeAccruedNet;
    }

    /**
     * Sets the value of the chargeAccruedNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeAccruedNet(BigDecimal value) {
        this.chargeAccruedNet = value;
    }

    /**
     * Gets the value of the chargeTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeTaxAmount() {
        return chargeTaxAmount;
    }

    /**
     * Sets the value of the chargeTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeTaxAmount(BigDecimal value) {
        this.chargeTaxAmount = value;
    }

    /**
     * Gets the value of the chargeTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeTaxRate() {
        return chargeTaxRate;
    }

    /**
     * Sets the value of the chargeTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeTaxRate(BigDecimal value) {
        this.chargeTaxRate = value;
    }

}
