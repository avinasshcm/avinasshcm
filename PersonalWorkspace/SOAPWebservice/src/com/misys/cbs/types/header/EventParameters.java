
package com.misys.cbs.types.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventParameterValue" type="{http://www.misys.com/cbs/types/header}eventParameterValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventParameters", propOrder = {
    "eventParameterValue"
})
public class EventParameters {

    protected String eventParameterValue;

    /**
     * Gets the value of the eventParameterValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventParameterValue() {
        return eventParameterValue;
    }

    /**
     * Sets the value of the eventParameterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventParameterValue(String value) {
        this.eventParameterValue = value;
    }

}
