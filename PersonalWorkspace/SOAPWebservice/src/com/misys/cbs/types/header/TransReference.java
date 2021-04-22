
package com.misys.cbs.types.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uIdTransReference" type="{http://www.misys.com/cbs/types}STRING"/>
 *         &lt;element name="subTransReference" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *         &lt;element name="transRepairLoc" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transReference", propOrder = {
    "uIdTransReference",
    "subTransReference",
    "transRepairLoc"
})
public class TransReference {

    @XmlElement(required = true)
    protected String uIdTransReference;
    protected String subTransReference;
    protected String transRepairLoc;

    /**
     * Gets the value of the uIdTransReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIdTransReference() {
        return uIdTransReference;
    }

    /**
     * Sets the value of the uIdTransReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIdTransReference(String value) {
        this.uIdTransReference = value;
    }

    /**
     * Gets the value of the subTransReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTransReference() {
        return subTransReference;
    }

    /**
     * Sets the value of the subTransReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTransReference(String value) {
        this.subTransReference = value;
    }

    /**
     * Gets the value of the transRepairLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransRepairLoc() {
        return transRepairLoc;
    }

    /**
     * Sets the value of the transRepairLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransRepairLoc(String value) {
        this.transRepairLoc = value;
    }

}
