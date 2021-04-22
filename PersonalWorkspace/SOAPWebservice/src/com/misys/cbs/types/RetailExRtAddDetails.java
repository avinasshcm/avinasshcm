
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retailExRtAddDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retailExRtAddDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exRateCat" type="{http://www.misys.com/cbs/types}exRtCat"/>
 *         &lt;element name="fromCurrency" type="{http://www.misys.com/cbs/types}isoCurrencyCode"/>
 *         &lt;element name="toCurrency" type="{http://www.misys.com/cbs/types}isoCurrencyCode"/>
 *         &lt;element name="exchangeRateType" type="{http://www.misys.com/cbs/types}exchangeRateType"/>
 *         &lt;element name="multiplyOrDivide" type="{http://www.misys.com/cbs/types}multipyDivide"/>
 *         &lt;element name="rate" type="{http://www.misys.com/cbs/types}exchangeRate"/>
 *         &lt;element name="Tolerance" type="{http://www.misys.com/cbs/types}tolerancePercentage"/>
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
@XmlType(name = "retailExRtAddDetails", propOrder = {
    "exRateCat",
    "fromCurrency",
    "toCurrency",
    "exchangeRateType",
    "multiplyOrDivide",
    "rate",
    "tolerance",
    "userExtension",
    "hostExtension"
})
public class RetailExRtAddDetails {

    @XmlElement(required = true)
    protected ExRtCat exRateCat;
    @XmlElement(required = true)
    protected String fromCurrency;
    @XmlElement(required = true)
    protected String toCurrency;
    @XmlElement(required = true)
    protected String exchangeRateType;
    @XmlElement(required = true)
    protected MultipyDivide multiplyOrDivide;
    @XmlElement(required = true)
    protected BigDecimal rate;
    @XmlElement(name = "Tolerance", required = true)
    protected BigDecimal tolerance;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the exRateCat property.
     * 
     * @return
     *     possible object is
     *     {@link ExRtCat }
     *     
     */
    public ExRtCat getExRateCat() {
        return exRateCat;
    }

    /**
     * Sets the value of the exRateCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExRtCat }
     *     
     */
    public void setExRateCat(ExRtCat value) {
        this.exRateCat = value;
    }

    /**
     * Gets the value of the fromCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCurrency() {
        return fromCurrency;
    }

    /**
     * Sets the value of the fromCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCurrency(String value) {
        this.fromCurrency = value;
    }

    /**
     * Gets the value of the toCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCurrency() {
        return toCurrency;
    }

    /**
     * Sets the value of the toCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCurrency(String value) {
        this.toCurrency = value;
    }

    /**
     * Gets the value of the exchangeRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateType() {
        return exchangeRateType;
    }

    /**
     * Sets the value of the exchangeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateType(String value) {
        this.exchangeRateType = value;
    }

    /**
     * Gets the value of the multiplyOrDivide property.
     * 
     * @return
     *     possible object is
     *     {@link MultipyDivide }
     *     
     */
    public MultipyDivide getMultiplyOrDivide() {
        return multiplyOrDivide;
    }

    /**
     * Sets the value of the multiplyOrDivide property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipyDivide }
     *     
     */
    public void setMultiplyOrDivide(MultipyDivide value) {
        this.multiplyOrDivide = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the tolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTolerance() {
        return tolerance;
    }

    /**
     * Sets the value of the tolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTolerance(BigDecimal value) {
        this.tolerance = value;
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
