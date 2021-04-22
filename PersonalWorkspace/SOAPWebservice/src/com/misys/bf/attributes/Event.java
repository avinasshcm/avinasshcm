
package com.misys.bf.attributes;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubsystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isHandleable" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isCollectable" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MessageParameters" type="{http://www.misys.com/bf/attributes}EvtMsgParams" minOccurs="0"/>
 *         &lt;element name="UserConfigurable" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ModuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrontOfficeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {
    "severity",
    "eventID",
    "description",
    "eventMessage",
    "subsystemCode",
    "eventNumber",
    "isHandleable",
    "isCollectable",
    "messageParameters",
    "userConfigurable",
    "moduleId",
    "frontOfficeId"
})
public class Event {

    @XmlElement(name = "Severity")
    protected String severity;
    @XmlElement(name = "EventID")
    protected String eventID;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "EventMessage")
    protected String eventMessage;
    @XmlElement(name = "SubsystemCode")
    protected String subsystemCode;
    @XmlElement(name = "EventNumber")
    protected BigInteger eventNumber;
    protected BigInteger isHandleable;
    protected BigInteger isCollectable;
    @XmlElement(name = "MessageParameters")
    protected EvtMsgParams messageParameters;
    @XmlElement(name = "UserConfigurable")
    protected BigInteger userConfigurable;
    @XmlElement(name = "ModuleId")
    protected String moduleId;
    @XmlElement(name = "FrontOfficeId")
    protected String frontOfficeId;

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the eventMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventMessage() {
        return eventMessage;
    }

    /**
     * Sets the value of the eventMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventMessage(String value) {
        this.eventMessage = value;
    }

    /**
     * Gets the value of the subsystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsystemCode() {
        return subsystemCode;
    }

    /**
     * Sets the value of the subsystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsystemCode(String value) {
        this.subsystemCode = value;
    }

    /**
     * Gets the value of the eventNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventNumber() {
        return eventNumber;
    }

    /**
     * Sets the value of the eventNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventNumber(BigInteger value) {
        this.eventNumber = value;
    }

    /**
     * Gets the value of the isHandleable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsHandleable() {
        return isHandleable;
    }

    /**
     * Sets the value of the isHandleable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsHandleable(BigInteger value) {
        this.isHandleable = value;
    }

    /**
     * Gets the value of the isCollectable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsCollectable() {
        return isCollectable;
    }

    /**
     * Sets the value of the isCollectable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsCollectable(BigInteger value) {
        this.isCollectable = value;
    }

    /**
     * Gets the value of the messageParameters property.
     * 
     * @return
     *     possible object is
     *     {@link EvtMsgParams }
     *     
     */
    public EvtMsgParams getMessageParameters() {
        return messageParameters;
    }

    /**
     * Sets the value of the messageParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvtMsgParams }
     *     
     */
    public void setMessageParameters(EvtMsgParams value) {
        this.messageParameters = value;
    }

    /**
     * Gets the value of the userConfigurable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserConfigurable() {
        return userConfigurable;
    }

    /**
     * Sets the value of the userConfigurable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserConfigurable(BigInteger value) {
        this.userConfigurable = value;
    }

    /**
     * Gets the value of the moduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * Sets the value of the moduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleId(String value) {
        this.moduleId = value;
    }

    /**
     * Gets the value of the frontOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontOfficeId() {
        return frontOfficeId;
    }

    /**
     * Sets the value of the frontOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontOfficeId(String value) {
        this.frontOfficeId = value;
    }

}
