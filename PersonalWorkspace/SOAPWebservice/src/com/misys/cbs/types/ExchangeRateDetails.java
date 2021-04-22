
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exchangeRateDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exchangeRateDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exchangeRate" type="{http://www.misys.com/cbs/types}exchangeRate" minOccurs="0"/>
 *         &lt;element name="multiplyDivide" type="{http://www.misys.com/cbs/types}multipyDivide" minOccurs="0"/>
 *         &lt;element name="exchangeRateType" type="{http://www.misys.com/cbs/types}exchangeRateType" minOccurs="0"/>
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
@XmlType(name = "exchangeRateDetails", propOrder = {
    "exchangeRate",
    "multiplyDivide",
    "exchangeRateType",
    "userExtension",
    "hostExtension"
})
public class ExchangeRateDetails {

    protected BigDecimal exchangeRate;
    protected MultipyDivide multiplyDivide;
    protected String exchangeRateType;
    protected Object userExtension;
    protected Object hostExtension;

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
     * Gets the value of the multiplyDivide property.
     * 
     * @return
     *     possible object is
     *     {@link MultipyDivide }
     *     
     */
    public MultipyDivide getMultiplyDivide() {
        return multiplyDivide;
    }

    /**
     * Sets the value of the multiplyDivide property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipyDivide }
     *     
     */
    public void setMultiplyDivide(MultipyDivide value) {
        this.multiplyDivide = value;
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
