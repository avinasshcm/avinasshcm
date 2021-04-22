
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for acctOverdueCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctOverdueCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OverdueChargeType" type="{http://www.misys.com/cbs/types}chargeType"/>
 *         &lt;element name="OverdueChargeDesc" type="{http://www.misys.com/cbs/types}descriptionLong"/>
 *         &lt;element name="chargeAmountGross" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="chargeAmountNet" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="chargeTaxAmount" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="chargeTaxRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="valueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acctOverdueCharge", propOrder = {
    "overdueChargeType",
    "overdueChargeDesc",
    "chargeAmountGross",
    "chargeAmountNet",
    "chargeTaxAmount",
    "chargeTaxRate",
    "valueDate"
})
public class AcctOverdueCharge {

    @XmlElement(name = "OverdueChargeType", required = true)
    protected String overdueChargeType;
    @XmlElement(name = "OverdueChargeDesc", required = true)
    protected String overdueChargeDesc;
    protected BigDecimal chargeAmountGross;
    protected BigDecimal chargeAmountNet;
    protected BigDecimal chargeTaxAmount;
    protected BigDecimal chargeTaxRate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valueDate;

    /**
     * Gets the value of the overdueChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueChargeType() {
        return overdueChargeType;
    }

    /**
     * Sets the value of the overdueChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueChargeType(String value) {
        this.overdueChargeType = value;
    }

    /**
     * Gets the value of the overdueChargeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueChargeDesc() {
        return overdueChargeDesc;
    }

    /**
     * Sets the value of the overdueChargeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueChargeDesc(String value) {
        this.overdueChargeDesc = value;
    }

    /**
     * Gets the value of the chargeAmountGross property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeAmountGross() {
        return chargeAmountGross;
    }

    /**
     * Sets the value of the chargeAmountGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeAmountGross(BigDecimal value) {
        this.chargeAmountGross = value;
    }

    /**
     * Gets the value of the chargeAmountNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeAmountNet() {
        return chargeAmountNet;
    }

    /**
     * Sets the value of the chargeAmountNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeAmountNet(BigDecimal value) {
        this.chargeAmountNet = value;
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

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

}
