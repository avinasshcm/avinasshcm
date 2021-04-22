
package com.misys.cbs.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for term complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="term">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="periodCode" type="{http://www.misys.com/cbs/types}periodCode"/>
 *         &lt;element name="periodNumber" type="{http://www.misys.com/cbs/types}periodNumber"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "term", propOrder = {
    "periodCode",
    "periodNumber"
})
public class Term {

    @XmlElement(required = true)
    protected String periodCode;
    @XmlElement(required = true)
    protected BigInteger periodNumber;

    /**
     * Gets the value of the periodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodCode() {
        return periodCode;
    }

    /**
     * Sets the value of the periodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodCode(String value) {
        this.periodCode = value;
    }

    /**
     * Gets the value of the periodNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeriodNumber() {
        return periodNumber;
    }

    /**
     * Sets the value of the periodNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeriodNumber(BigInteger value) {
        this.periodNumber = value;
    }

}
