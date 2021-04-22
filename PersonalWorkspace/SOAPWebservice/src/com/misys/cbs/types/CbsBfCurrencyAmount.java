
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.misys.bankfusion.attributes.BFCurrencyAmount;


/**
 * <p>Java class for cbsBfCurrencyAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cbsBfCurrencyAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bfCurrencyAmount" type="{http://www.misys.com/bankfusion/attributes}BFCurrencyAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cbsBfCurrencyAmount", propOrder = {
    "bfCurrencyAmount"
})
public class CbsBfCurrencyAmount {

    protected BFCurrencyAmount bfCurrencyAmount;

    /**
     * Gets the value of the bfCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BFCurrencyAmount }
     *     
     */
    public BFCurrencyAmount getBfCurrencyAmount() {
        return bfCurrencyAmount;
    }

    /**
     * Sets the value of the bfCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BFCurrencyAmount }
     *     
     */
    public void setBfCurrencyAmount(BFCurrencyAmount value) {
        this.bfCurrencyAmount = value;
    }

}
