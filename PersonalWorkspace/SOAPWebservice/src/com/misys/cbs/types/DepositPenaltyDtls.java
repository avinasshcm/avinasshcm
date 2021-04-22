
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for depositPenaltyDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="depositPenaltyDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="isPegged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="interestRateId1" type="{http://www.misys.com/cbs/types}interestRateCode" minOccurs="0"/>
 *         &lt;element name="interestRateId2" type="{http://www.misys.com/cbs/types}interestRateCode" minOccurs="0"/>
 *         &lt;element name="margin" type="{http://www.misys.com/cbs/types}interestRateMargin" minOccurs="0"/>
 *         &lt;element name="penaltyInterestRate" type="{http://www.misys.com/cbs/types}interestRate" minOccurs="0"/>
 *         &lt;element name="penaltyAmount" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="userExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="hostExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "depositPenaltyDtls", propOrder = {
    "actualRate",
    "isPegged",
    "interestRateId1",
    "interestRateId2",
    "margin",
    "penaltyInterestRate",
    "penaltyAmount",
    "userExtension",
    "hostExtension"
})
public class DepositPenaltyDtls {

    protected BigDecimal actualRate;
    protected Boolean isPegged;
    protected String interestRateId1;
    protected String interestRateId2;
    protected BigDecimal margin;
    protected BigDecimal penaltyInterestRate;
    protected Currency penaltyAmount;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the actualRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualRate() {
        return actualRate;
    }

    /**
     * Sets the value of the actualRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualRate(BigDecimal value) {
        this.actualRate = value;
    }

    /**
     * Gets the value of the isPegged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPegged() {
        return isPegged;
    }

    /**
     * Sets the value of the isPegged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPegged(Boolean value) {
        this.isPegged = value;
    }

    /**
     * Gets the value of the interestRateId1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRateId1() {
        return interestRateId1;
    }

    /**
     * Sets the value of the interestRateId1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRateId1(String value) {
        this.interestRateId1 = value;
    }

    /**
     * Gets the value of the interestRateId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRateId2() {
        return interestRateId2;
    }

    /**
     * Sets the value of the interestRateId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRateId2(String value) {
        this.interestRateId2 = value;
    }

    /**
     * Gets the value of the margin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMargin() {
        return margin;
    }

    /**
     * Sets the value of the margin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMargin(BigDecimal value) {
        this.margin = value;
    }

    /**
     * Gets the value of the penaltyInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenaltyInterestRate() {
        return penaltyInterestRate;
    }

    /**
     * Sets the value of the penaltyInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenaltyInterestRate(BigDecimal value) {
        this.penaltyInterestRate = value;
    }

    /**
     * Gets the value of the penaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getPenaltyAmount() {
        return penaltyAmount;
    }

    /**
     * Sets the value of the penaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setPenaltyAmount(Currency value) {
        this.penaltyAmount = value;
    }

    /**
     * Gets the value of the userExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUserExtension() {
        return userExtension;
    }

    /**
     * Sets the value of the userExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUserExtension(Object value) {
        this.userExtension = value;
    }

    /**
     * Gets the value of the hostExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHostExtension() {
        return hostExtension;
    }

    /**
     * Sets the value of the hostExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHostExtension(Object value) {
        this.hostExtension = value;
    }

}
