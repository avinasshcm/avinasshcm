
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mandateDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mandateDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modeOfOperation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listMandateDtls" type="{http://www.misys.com/cbs/types}listMandateDtls"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mandateDetails", propOrder = {
    "modeOfOperation",
    "listMandateDtls"
})
public class MandateDetails {

    @XmlElement(required = true)
    protected String modeOfOperation;
    @XmlElement(required = true)
    protected ListMandateDtls listMandateDtls;

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

    /**
     * Gets the value of the listMandateDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ListMandateDtls }
     *     
     */
    public ListMandateDtls getListMandateDtls() {
        return listMandateDtls;
    }

    /**
     * Sets the value of the listMandateDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListMandateDtls }
     *     
     */
    public void setListMandateDtls(ListMandateDtls value) {
        this.listMandateDtls = value;
    }

}
