
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acctCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctCharacteristics">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.misys.com/cbs/types}accountCharacteristics">
 *       &lt;sequence>
 *         &lt;element name="modeOfOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acctCharacteristics", propOrder = {
    "modeOfOperation"
})
public class AcctCharacteristics
    extends AccountCharacteristics
{

    protected String modeOfOperation;

    /**
     * Gets the value of the modeOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeOfOperation() {
        return modeOfOperation;
    }

    /**
     * Sets the value of the modeOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeOfOperation(String value) {
        this.modeOfOperation = value;
    }

}
