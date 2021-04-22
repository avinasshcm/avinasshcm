
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chqHeaderDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chqHeaderDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chqHeaderDtls" type="{http://www.misys.com/cbs/types}chqHeaderDtls"/>
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
@XmlType(name = "chqHeaderDetails", propOrder = {
    "chqHeaderDtls",
    "userExtension",
    "hostExtension"
})
public class ChqHeaderDetails {

    @XmlElement(required = true)
    protected ChqHeaderDtls chqHeaderDtls;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the chqHeaderDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ChqHeaderDtls }
     *     
     */
    public ChqHeaderDtls getChqHeaderDtls() {
        return chqHeaderDtls;
    }

    /**
     * Sets the value of the chqHeaderDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChqHeaderDtls }
     *     
     */
    public void setChqHeaderDtls(ChqHeaderDtls value) {
        this.chqHeaderDtls = value;
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
