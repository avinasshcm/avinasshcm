
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inputAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inputAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputAccountId" type="{http://www.misys.com/cbs/types}inputAccountId"/>
 *         &lt;element name="accountFormatType" type="{http://www.misys.com/cbs/types}accountFormatType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputAccount", propOrder = {
    "inputAccountId",
    "accountFormatType"
})
public class InputAccount {

    @XmlElement(required = true)
    protected String inputAccountId;
    @XmlElement(required = true)
    protected AccountFormatType accountFormatType;

    /**
     * Gets the value of the inputAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputAccountId() {
        return inputAccountId;
    }

    /**
     * Sets the value of the inputAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputAccountId(String value) {
        this.inputAccountId = value;
    }

    /**
     * Gets the value of the accountFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountFormatType }
     *     
     */
    public AccountFormatType getAccountFormatType() {
        return accountFormatType;
    }

    /**
     * Sets the value of the accountFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountFormatType }
     *     
     */
    public void setAccountFormatType(AccountFormatType value) {
        this.accountFormatType = value;
    }

}
