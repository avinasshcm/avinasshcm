
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entityDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entityDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityLinkType" type="{http://www.misys.com/cbs/types}entityLinkType" minOccurs="0"/>
 *         &lt;element name="entityLinkValue" type="{http://www.misys.com/cbs/types}entityLinkValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entityDetails", propOrder = {
    "entityLinkType",
    "entityLinkValue"
})
public class EntityDetails {

    protected String entityLinkType;
    protected String entityLinkValue;

    /**
     * Gets the value of the entityLinkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityLinkType() {
        return entityLinkType;
    }

    /**
     * Sets the value of the entityLinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityLinkType(String value) {
        this.entityLinkType = value;
    }

    /**
     * Gets the value of the entityLinkValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityLinkValue() {
        return entityLinkValue;
    }

    /**
     * Sets the value of the entityLinkValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityLinkValue(String value) {
        this.entityLinkValue = value;
    }

}
