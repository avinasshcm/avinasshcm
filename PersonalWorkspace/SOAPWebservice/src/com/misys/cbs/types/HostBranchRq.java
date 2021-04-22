
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hostBranchRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hostBranchRq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hostBranchCode" type="{http://www.misys.com/cbs/types}hostBranchCode"/>
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
@XmlType(name = "hostBranchRq", propOrder = {
    "hostBranchCode",
    "userExtension",
    "hostExtension"
})
public class HostBranchRq {

    @XmlElement(required = true)
    protected String hostBranchCode;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the hostBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostBranchCode() {
        return hostBranchCode;
    }

    /**
     * Sets the value of the hostBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostBranchCode(String value) {
        this.hostBranchCode = value;
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
