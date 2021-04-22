
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for charges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="charges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargeClassification" type="{http://www.misys.com/cbs/types}chargeClassification" minOccurs="0"/>
 *         &lt;element name="charge" type="{http://www.misys.com/cbs/types}charge"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "charges", propOrder = {
    "chargeClassification",
    "charge"
})
public class Charges {

    protected String chargeClassification;
    @XmlElement(required = true)
    protected Charge charge;

    /**
     * Gets the value of the chargeClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeClassification() {
        return chargeClassification;
    }

    /**
     * Sets the value of the chargeClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeClassification(String value) {
        this.chargeClassification = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link Charge }
     *     
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge }
     *     
     */
    public void setCharge(Charge value) {
        this.charge = value;
    }

}
