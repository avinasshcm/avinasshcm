
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for udfDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="udfDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boExtentionDtls1" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="boExtentionDtls2" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "udfDetails", propOrder = {
    "boExtentionDtls1",
    "boExtentionDtls2"
})
public class UdfDetails {

    @XmlElement(required = true)
    protected Object boExtentionDtls1;
    @XmlElement(required = true)
    protected Object boExtentionDtls2;

    /**
     * Gets the value of the boExtentionDtls1 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBoExtentionDtls1() {
        return boExtentionDtls1;
    }

    /**
     * Sets the value of the boExtentionDtls1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBoExtentionDtls1(Object value) {
        this.boExtentionDtls1 = value;
    }

    /**
     * Gets the value of the boExtentionDtls2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBoExtentionDtls2() {
        return boExtentionDtls2;
    }

    /**
     * Sets the value of the boExtentionDtls2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBoExtentionDtls2(Object value) {
        this.boExtentionDtls2 = value;
    }

}
