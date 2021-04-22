
package com.misys.cbs.types.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				for Common readRq.
 * 			
 * 
 * <p>Java class for rqHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rqHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.misys.com/cbs/types/header}version"/>
 *         &lt;element name="orig" type="{http://www.misys.com/cbs/types/header}orig"/>
 *         &lt;element name="messageType" type="{http://www.misys.com/cbs/types/header}messageType" minOccurs="0"/>
 *         &lt;element name="overrides" type="{http://www.misys.com/cbs/types/header}overrides" minOccurs="0"/>
 *         &lt;element name="transReference" type="{http://www.misys.com/cbs/types/header}transReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rqHeader", propOrder = {
    "version",
    "orig",
    "messageType",
    "overrides",
    "transReference"
})
public class RqHeader {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected Orig orig;
    protected String messageType;
    protected Overrides overrides;
    protected TransReference transReference;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the orig property.
     * 
     * @return
     *     possible object is
     *     {@link Orig }
     *     
     */
    public Orig getOrig() {
        return orig;
    }

    /**
     * Sets the value of the orig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orig }
     *     
     */
    public void setOrig(Orig value) {
        this.orig = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the overrides property.
     * 
     * @return
     *     possible object is
     *     {@link Overrides }
     *     
     */
    public Overrides getOverrides() {
        return overrides;
    }

    /**
     * Sets the value of the overrides property.
     * 
     * @param value
     *     allowed object is
     *     {@link Overrides }
     *     
     */
    public void setOverrides(Overrides value) {
        this.overrides = value;
    }

    /**
     * Gets the value of the transReference property.
     * 
     * @return
     *     possible object is
     *     {@link TransReference }
     *     
     */
    public TransReference getTransReference() {
        return transReference;
    }

    /**
     * Sets the value of the transReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransReference }
     *     
     */
    public void setTransReference(TransReference value) {
        this.transReference = value;
    }

}
