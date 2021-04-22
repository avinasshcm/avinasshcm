
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessKeyRq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessKeyName" type="{http://www.misys.com/cbs/types}businessKeyName"/>
 *         &lt;element name="businessKeyValue" type="{http://www.misys.com/cbs/types}businessKeyValue"/>
 *         &lt;element name="userExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="hostExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessKeyRq", propOrder = {
    "businessKeyName",
    "businessKeyValue",
    "userExtension",
    "hostExtension"
})
public class BusinessKeyRq {

    @XmlElement(required = true)
    protected String businessKeyName;
    @XmlElement(required = true)
    protected String businessKeyValue;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the businessKeyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessKeyName() {
        return businessKeyName;
    }

    /**
     * Sets the value of the businessKeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessKeyName(String value) {
        this.businessKeyName = value;
    }

    /**
     * Gets the value of the businessKeyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessKeyValue() {
        return businessKeyValue;
    }

    /**
     * Sets the value of the businessKeyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessKeyValue(String value) {
        this.businessKeyValue = value;
    }

    /**
     * Gets the value of the userExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUserExtension() {
        return userExtension;
    }

    /**
     * Sets the value of the userExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUserExtension(Object value) {
        this.userExtension = value;
    }

    /**
     * Gets the value of the hostExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHostExtension() {
        return hostExtension;
    }

    /**
     * Sets the value of the hostExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHostExtension(Object value) {
        this.hostExtension = value;
    }

}
