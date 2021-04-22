
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alternativeAcctId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alternativeAcctId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctIdOther" type="{http://www.misys.com/cbs/types}inputAccountId"/>
 *         &lt;element name="acctFormatTypeOther" type="{http://www.misys.com/cbs/types}accountFormatType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alternativeAcctId", propOrder = {
    "acctIdOther",
    "acctFormatTypeOther"
})
public class AlternativeAcctId {

    @XmlElement(required = true)
    protected String acctIdOther;
    @XmlElement(required = true)
    protected AccountFormatType acctFormatTypeOther;

    /**
     * Gets the value of the acctIdOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctIdOther() {
        return acctIdOther;
    }

    /**
     * Sets the value of the acctIdOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctIdOther(String value) {
        this.acctIdOther = value;
    }

    /**
     * Gets the value of the acctFormatTypeOther property.
     * 
     * @return
     *     possible object is
     *     {@link AccountFormatType }
     *     
     */
    public AccountFormatType getAcctFormatTypeOther() {
        return acctFormatTypeOther;
    }

    /**
     * Sets the value of the acctFormatTypeOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountFormatType }
     *     
     */
    public void setAcctFormatTypeOther(AccountFormatType value) {
        this.acctFormatTypeOther = value;
    }

}
