
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calendarToUseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calendarToUseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calendarType" type="{http://www.misys.com/cbs/types}calendarType"/>
 *         &lt;element name="currency" type="{http://www.misys.com/cbs/types}isoCurrencyCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calendarToUseType", propOrder = {
    "calendarType",
    "currency"
})
public class CalendarToUseType {

    @XmlElement(required = true)
    protected String calendarType;
    protected String currency;

    /**
     * Gets the value of the calendarType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarType() {
        return calendarType;
    }

    /**
     * Sets the value of the calendarType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarType(String value) {
        this.calendarType = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
