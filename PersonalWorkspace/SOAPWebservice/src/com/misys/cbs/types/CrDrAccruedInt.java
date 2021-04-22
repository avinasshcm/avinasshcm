
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for crDrAccruedInt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crDrAccruedInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crIntAccruedGross" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="crIntAccruedNet" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="crIntTaxAccrued" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="crintTax2Accrued" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="creditIntRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="crIntTaxRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="crIntTax2Rate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="crIntAdjustment" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="nextCrIntCapDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="drIntAccruedGross" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="drIntAccruedNet" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="drIntTaxAccrued" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="drIntTax2Accrued" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="debitIntRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="drIntTaxRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="drIntTax2Rate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="drIntAdjustment" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="nextDrIntCapDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crDrAccruedInt", propOrder = {
    "crIntAccruedGross",
    "crIntAccruedNet",
    "crIntTaxAccrued",
    "crintTax2Accrued",
    "creditIntRate",
    "crIntTaxRate",
    "crIntTax2Rate",
    "crIntAdjustment",
    "nextCrIntCapDate",
    "drIntAccruedGross",
    "drIntAccruedNet",
    "drIntTaxAccrued",
    "drIntTax2Accrued",
    "debitIntRate",
    "drIntTaxRate",
    "drIntTax2Rate",
    "drIntAdjustment",
    "nextDrIntCapDate"
})
public class CrDrAccruedInt {

    protected Currency crIntAccruedGross;
    protected Currency crIntAccruedNet;
    protected Currency crIntTaxAccrued;
    protected Currency crintTax2Accrued;
    protected BigDecimal creditIntRate;
    protected BigDecimal crIntTaxRate;
    protected BigDecimal crIntTax2Rate;
    protected BigDecimal crIntAdjustment;
    protected XMLGregorianCalendar nextCrIntCapDate;
    protected Currency drIntAccruedGross;
    protected Currency drIntAccruedNet;
    protected Currency drIntTaxAccrued;
    protected Currency drIntTax2Accrued;
    protected BigDecimal debitIntRate;
    protected BigDecimal drIntTaxRate;
    protected BigDecimal drIntTax2Rate;
    protected BigDecimal drIntAdjustment;
    protected XMLGregorianCalendar nextDrIntCapDate;

    /**
     * Gets the value of the crIntAccruedGross property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCrIntAccruedGross() {
        return crIntAccruedGross;
    }

    /**
     * Sets the value of the crIntAccruedGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCrIntAccruedGross(Currency value) {
        this.crIntAccruedGross = value;
    }

    /**
     * Gets the value of the crIntAccruedNet property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCrIntAccruedNet() {
        return crIntAccruedNet;
    }

    /**
     * Sets the value of the crIntAccruedNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCrIntAccruedNet(Currency value) {
        this.crIntAccruedNet = value;
    }

    /**
     * Gets the value of the crIntTaxAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCrIntTaxAccrued() {
        return crIntTaxAccrued;
    }

    /**
     * Sets the value of the crIntTaxAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCrIntTaxAccrued(Currency value) {
        this.crIntTaxAccrued = value;
    }

    /**
     * Gets the value of the crintTax2Accrued property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCrintTax2Accrued() {
        return crintTax2Accrued;
    }

    /**
     * Sets the value of the crintTax2Accrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCrintTax2Accrued(Currency value) {
        this.crintTax2Accrued = value;
    }

    /**
     * Gets the value of the creditIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditIntRate() {
        return creditIntRate;
    }

    /**
     * Sets the value of the creditIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditIntRate(BigDecimal value) {
        this.creditIntRate = value;
    }

    /**
     * Gets the value of the crIntTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrIntTaxRate() {
        return crIntTaxRate;
    }

    /**
     * Sets the value of the crIntTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCrIntTaxRate(BigDecimal value) {
        this.crIntTaxRate = value;
    }

    /**
     * Gets the value of the crIntTax2Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrIntTax2Rate() {
        return crIntTax2Rate;
    }

    /**
     * Sets the value of the crIntTax2Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCrIntTax2Rate(BigDecimal value) {
        this.crIntTax2Rate = value;
    }

    /**
     * Gets the value of the crIntAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrIntAdjustment() {
        return crIntAdjustment;
    }

    /**
     * Sets the value of the crIntAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCrIntAdjustment(BigDecimal value) {
        this.crIntAdjustment = value;
    }

    /**
     * Gets the value of the nextCrIntCapDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextCrIntCapDate() {
        return nextCrIntCapDate;
    }

    /**
     * Sets the value of the nextCrIntCapDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextCrIntCapDate(XMLGregorianCalendar value) {
        this.nextCrIntCapDate = value;
    }

    /**
     * Gets the value of the drIntAccruedGross property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getDrIntAccruedGross() {
        return drIntAccruedGross;
    }

    /**
     * Sets the value of the drIntAccruedGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setDrIntAccruedGross(Currency value) {
        this.drIntAccruedGross = value;
    }

    /**
     * Gets the value of the drIntAccruedNet property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getDrIntAccruedNet() {
        return drIntAccruedNet;
    }

    /**
     * Sets the value of the drIntAccruedNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setDrIntAccruedNet(Currency value) {
        this.drIntAccruedNet = value;
    }

    /**
     * Gets the value of the drIntTaxAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getDrIntTaxAccrued() {
        return drIntTaxAccrued;
    }

    /**
     * Sets the value of the drIntTaxAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setDrIntTaxAccrued(Currency value) {
        this.drIntTaxAccrued = value;
    }

    /**
     * Gets the value of the drIntTax2Accrued property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getDrIntTax2Accrued() {
        return drIntTax2Accrued;
    }

    /**
     * Sets the value of the drIntTax2Accrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setDrIntTax2Accrued(Currency value) {
        this.drIntTax2Accrued = value;
    }

    /**
     * Gets the value of the debitIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitIntRate() {
        return debitIntRate;
    }

    /**
     * Sets the value of the debitIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitIntRate(BigDecimal value) {
        this.debitIntRate = value;
    }

    /**
     * Gets the value of the drIntTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDrIntTaxRate() {
        return drIntTaxRate;
    }

    /**
     * Sets the value of the drIntTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDrIntTaxRate(BigDecimal value) {
        this.drIntTaxRate = value;
    }

    /**
     * Gets the value of the drIntTax2Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDrIntTax2Rate() {
        return drIntTax2Rate;
    }

    /**
     * Sets the value of the drIntTax2Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDrIntTax2Rate(BigDecimal value) {
        this.drIntTax2Rate = value;
    }

    /**
     * Gets the value of the drIntAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDrIntAdjustment() {
        return drIntAdjustment;
    }

    /**
     * Sets the value of the drIntAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDrIntAdjustment(BigDecimal value) {
        this.drIntAdjustment = value;
    }

    /**
     * Gets the value of the nextDrIntCapDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextDrIntCapDate() {
        return nextDrIntCapDate;
    }

    /**
     * Sets the value of the nextDrIntCapDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextDrIntCapDate(XMLGregorianCalendar value) {
        this.nextDrIntCapDate = value;
    }

}
