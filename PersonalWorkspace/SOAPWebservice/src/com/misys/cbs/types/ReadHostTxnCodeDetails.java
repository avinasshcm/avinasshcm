
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readHostTxnCodeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readHostTxnCodeDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hostTxnCode" type="{http://www.misys.com/cbs/types}hostTxnCode"/>
 *         &lt;element name="hostTxnCodeDescription" type="{http://www.misys.com/cbs/types}hostTxnCodeDescription"/>
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
@XmlType(name = "readHostTxnCodeDetails", propOrder = {
    "hostTxnCode",
    "hostTxnCodeDescription",
    "userExtension",
    "hostExtension"
})
public class ReadHostTxnCodeDetails {

    @XmlElement(required = true)
    protected String hostTxnCode;
    @XmlElement(required = true)
    protected String hostTxnCodeDescription;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the hostTxnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTxnCode() {
        return hostTxnCode;
    }

    /**
     * Sets the value of the hostTxnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTxnCode(String value) {
        this.hostTxnCode = value;
    }

    /**
     * Gets the value of the hostTxnCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTxnCodeDescription() {
        return hostTxnCodeDescription;
    }

    /**
     * Sets the value of the hostTxnCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTxnCodeDescription(String value) {
        this.hostTxnCodeDescription = value;
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
