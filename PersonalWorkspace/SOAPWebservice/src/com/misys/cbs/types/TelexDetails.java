
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for telexDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telexDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telex" type="{http://www.misys.com/cbs/types}contactNumber" minOccurs="0"/>
 *         &lt;element name="answerback" type="{http://www.misys.com/cbs/types}answerBack" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telexDetails", propOrder = {
    "telex",
    "answerback"
})
public class TelexDetails {

    protected String telex;
    protected String answerback;

    /**
     * Gets the value of the telex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelex() {
        return telex;
    }

    /**
     * Sets the value of the telex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelex(String value) {
        this.telex = value;
    }

    /**
     * Gets the value of the answerback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerback() {
        return answerback;
    }

    /**
     * Sets the value of the answerback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerback(String value) {
        this.answerback = value;
    }

}
