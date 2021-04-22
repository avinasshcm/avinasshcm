
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for acctAccruedInterest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctAccruedInterest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crIntAccruedGross" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="crIntAccruedNet" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="crIntTaxAccrued" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="creditIntRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="crIntTaxRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="crIntAdjustment" type="{http://www.misys.com/cbs/types}amountEdited"/>
 *         &lt;element name="nextCrIntCapDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="drIntAccruedGross" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="drIntAccruedNet" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="drIntTaxAccrued" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="debitIntRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="drIntTaxRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="drIntAdjustment" type="{http://www.misys.com/cbs/types}amountEdited"/>
 *         &lt;element name="nextDrIntCapDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acctAccruedInterest", propOrder = {
    "crIntAccruedGross",
    "crIntAccruedNet",
    "crIntTaxAccrued",
    "creditIntRate",
    "crIntTaxRate",
    "crIntAdjustment",
    "nextCrIntCapDate",
    "drIntAccruedGross",
    "drIntAccruedNet",
    "drIntTaxAccrued",
    "debitIntRate",
    "drIntTaxRate",
    "drIntAdjustment",
    "nextDrIntCapDate"
})
public class AcctAccruedInterest {

    protected BigDecimal crIntAccruedGross;
    protected BigDecimal crIntAccruedNet;
    protected BigDecimal crIntTaxAccrued;
    protected BigDecimal creditIntRate;
    protected BigDecimal crIntTaxRate;
    @XmlElement(required = true)
    protected BigDecimal crIntAdjustment;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextCrIntCapDate;
    protected BigDecimal drIntAccruedGross;
    protected BigDecimal drIntAccruedNet;
    protected BigDecimal drIntTaxAccrued;
    protected BigDecimal debitIntRate;
    protected BigDecimal drIntTaxRate;
    @XmlElement(required = true)
    protected BigDecimal drIntAdjustment;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextDrIntCapDate;

    /**
     * Gets the value of the crIntAccruedGross property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrIntAccruedGross() {
        return crIntAccruedGross;
    }

    /**
     * Sets the value of the crIntAccruedGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCrIntAccruedGross(BigDecimal value) {
        this.crIntAccruedGross = value;
    }

    /**
     * Gets the value of the crIntAccruedNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrIntAccruedNet() {
        return crIntAccruedNet;
    }

    /**
     * Sets the value of the crIntAccruedNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCrIntAccruedNet(BigDecimal value) {
        this.crIntAccruedNet = value;
    }

    /**
     * Gets the value of the crIntTaxAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrIntTaxAccrued() {
        return crIntTaxAccrued;
    }

    /**
     * Sets the value of the crIntTaxAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCrIntTaxAccrued(BigDecimal value) {
        this.crIntTaxAccrued = value;
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDrIntAccruedGross() {
        return drIntAccruedGross;
    }

    /**
     * Sets the value of the drIntAccruedGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDrIntAccruedGross(BigDecimal value) {
        this.drIntAccruedGross = value;
    }

    /**
     * Gets the value of the drIntAccruedNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDrIntAccruedNet() {
        return drIntAccruedNet;
    }

    /**
     * Sets the value of the drIntAccruedNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDrIntAccruedNet(BigDecimal value) {
        this.drIntAccruedNet = value;
    }

    /**
     * Gets the value of the drIntTaxAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDrIntTaxAccrued() {
        return drIntTaxAccrued;
    }

    /**
     * Sets the value of the drIntTaxAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDrIntTaxAccrued(BigDecimal value) {
        this.drIntTaxAccrued = value;
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
