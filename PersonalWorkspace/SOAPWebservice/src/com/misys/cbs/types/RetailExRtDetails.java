
package com.misys.cbs.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for retailExRtDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retailExRtDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exRateCat" type="{http://www.misys.com/cbs/types}exRtCat"/>
 *         &lt;element name="fromCurrency" type="{http://www.misys.com/cbs/types}isoCurrencyCode"/>
 *         &lt;element name="toCurrency" type="{http://www.misys.com/cbs/types}isoCurrencyCode"/>
 *         &lt;element name="exchangeRateType" type="{http://www.misys.com/cbs/types}exchangeRateType"/>
 *         &lt;element name="multiplyOrDivide" type="{http://www.misys.com/cbs/types}multipyDivide"/>
 *         &lt;element name="exchangeRate" type="{http://www.misys.com/cbs/types}exchangeRate"/>
 *         &lt;element name="tolerancePercenatge" type="{http://www.misys.com/cbs/types}tolerancePercentage"/>
 *         &lt;element name="activeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="unit" type="{http://www.misys.com/cbs/types}NUMBER" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://www.misys.com/cbs/types}TIMESTAMP" minOccurs="0"/>
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
@XmlType(name = "retailExRtDetails", propOrder = {
    "exRateCat",
    "fromCurrency",
    "toCurrency",
    "exchangeRateType",
    "multiplyOrDivide",
    "exchangeRate",
    "tolerancePercenatge",
    "activeFlag",
    "unit",
    "dateTime",
    "userExtension",
    "hostExtension"
})
public class RetailExRtDetails {

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
    protected BigDecimal exchangeRate;
    @XmlElement(required = true)
    protected BigDecimal tolerancePercenatge;
    @XmlElement(defaultValue = "false")
    protected boolean activeFlag;
    protected BigInteger unit;
    protected XMLGregorianCalendar dateTime;
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
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the tolerancePercenatge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTolerancePercenatge() {
        return tolerancePercenatge;
    }

    /**
     * Sets the value of the tolerancePercenatge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTolerancePercenatge(BigDecimal value) {
        this.tolerancePercenatge = value;
    }

    /**
     * Gets the value of the activeFlag property.
     * 
     */
    public boolean isActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     */
    public void setActiveFlag(boolean value) {
        this.activeFlag = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnit(BigInteger value) {
        this.unit = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
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
