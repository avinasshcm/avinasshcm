
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currencyLongDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="currencyLongDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimumUnitsforCurrency" type="{http://www.misys.com/cbs/types}minimumUnitsforCurrency" minOccurs="0"/>
 *         &lt;element name="tolerancePercentage" type="{http://www.misys.com/cbs/types}tolerancePercentage"/>
 *         &lt;element name="yearDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="currencyScale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="touristCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="debitRoundingMethod" type="{http://www.misys.com/cbs/types}roundingIndicator" minOccurs="0"/>
 *         &lt;element name="creditRoundingMethod" type="{http://www.misys.com/cbs/types}roundingIndicator" minOccurs="0"/>
 *         &lt;element name="debitMultipleofConstant" type="{http://www.misys.com/cbs/types}multipleOfConstant" minOccurs="0"/>
 *         &lt;element name="creditMultipleofconstant" type="{http://www.misys.com/cbs/types}multipleOfConstant" minOccurs="0"/>
 *         &lt;element name="swiftCurrencyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="swiftAdviceDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="decimalTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "currencyLongDetails", propOrder = {
    "minimumUnitsforCurrency",
    "tolerancePercentage",
    "yearDays",
    "currencyScale",
    "touristCurrency",
    "debitRoundingMethod",
    "creditRoundingMethod",
    "debitMultipleofConstant",
    "creditMultipleofconstant",
    "swiftCurrencyIndicator",
    "swiftAdviceDays",
    "decimalTitle"
})
public class CurrencyLongDetails {

    protected BigDecimal minimumUnitsforCurrency;
    @XmlElement(required = true)
    protected BigDecimal tolerancePercentage;
    protected Integer yearDays;
    @XmlElement(defaultValue = "0")
    protected int currencyScale;
    @XmlElement(defaultValue = "false")
    protected boolean touristCurrency;
    protected RoundingIndicator debitRoundingMethod;
    protected RoundingIndicator creditRoundingMethod;
    protected Integer debitMultipleofConstant;
    protected Integer creditMultipleofconstant;
    @XmlElement(defaultValue = "false")
    protected boolean swiftCurrencyIndicator;
    @XmlElement(defaultValue = "0")
    protected Integer swiftAdviceDays;
    @XmlElement(defaultValue = " ")
    protected String decimalTitle;

    /**
     * Gets the value of the minimumUnitsforCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumUnitsforCurrency() {
        return minimumUnitsforCurrency;
    }

    /**
     * Sets the value of the minimumUnitsforCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumUnitsforCurrency(BigDecimal value) {
        this.minimumUnitsforCurrency = value;
    }

    /**
     * Gets the value of the tolerancePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTolerancePercentage() {
        return tolerancePercentage;
    }

    /**
     * Sets the value of the tolerancePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTolerancePercentage(BigDecimal value) {
        this.tolerancePercentage = value;
    }

    /**
     * Gets the value of the yearDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearDays() {
        return yearDays;
    }

    /**
     * Sets the value of the yearDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearDays(Integer value) {
        this.yearDays = value;
    }

    /**
     * Gets the value of the currencyScale property.
     * 
     */
    public int getCurrencyScale() {
        return currencyScale;
    }

    /**
     * Sets the value of the currencyScale property.
     * 
     */
    public void setCurrencyScale(int value) {
        this.currencyScale = value;
    }

    /**
     * Gets the value of the touristCurrency property.
     * 
     */
    public boolean isTouristCurrency() {
        return touristCurrency;
    }

    /**
     * Sets the value of the touristCurrency property.
     * 
     */
    public void setTouristCurrency(boolean value) {
        this.touristCurrency = value;
    }

    /**
     * Gets the value of the debitRoundingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingIndicator }
     *     
     */
    public RoundingIndicator getDebitRoundingMethod() {
        return debitRoundingMethod;
    }

    /**
     * Sets the value of the debitRoundingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingIndicator }
     *     
     */
    public void setDebitRoundingMethod(RoundingIndicator value) {
        this.debitRoundingMethod = value;
    }

    /**
     * Gets the value of the creditRoundingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingIndicator }
     *     
     */
    public RoundingIndicator getCreditRoundingMethod() {
        return creditRoundingMethod;
    }

    /**
     * Sets the value of the creditRoundingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingIndicator }
     *     
     */
    public void setCreditRoundingMethod(RoundingIndicator value) {
        this.creditRoundingMethod = value;
    }

    /**
     * Gets the value of the debitMultipleofConstant property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDebitMultipleofConstant() {
        return debitMultipleofConstant;
    }

    /**
     * Sets the value of the debitMultipleofConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDebitMultipleofConstant(Integer value) {
        this.debitMultipleofConstant = value;
    }

    /**
     * Gets the value of the creditMultipleofconstant property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditMultipleofconstant() {
        return creditMultipleofconstant;
    }

    /**
     * Sets the value of the creditMultipleofconstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditMultipleofconstant(Integer value) {
        this.creditMultipleofconstant = value;
    }

    /**
     * Gets the value of the swiftCurrencyIndicator property.
     * 
     */
    public boolean isSwiftCurrencyIndicator() {
        return swiftCurrencyIndicator;
    }

    /**
     * Sets the value of the swiftCurrencyIndicator property.
     * 
     */
    public void setSwiftCurrencyIndicator(boolean value) {
        this.swiftCurrencyIndicator = value;
    }

    /**
     * Gets the value of the swiftAdviceDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSwiftAdviceDays() {
        return swiftAdviceDays;
    }

    /**
     * Sets the value of the swiftAdviceDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSwiftAdviceDays(Integer value) {
        this.swiftAdviceDays = value;
    }

    /**
     * Gets the value of the decimalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalTitle() {
        return decimalTitle;
    }

    /**
     * Sets the value of the decimalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalTitle(String value) {
        this.decimalTitle = value;
    }

}
