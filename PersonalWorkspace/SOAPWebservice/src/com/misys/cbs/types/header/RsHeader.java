
package com.misys.cbs.types.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rsHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rsHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.misys.com/cbs/types/header}version"/>
 *         &lt;element name="messageType" type="{http://www.misys.com/cbs/types/header}messageType" minOccurs="0"/>
 *         &lt;element name="origCtxtId" type="{http://www.misys.com/cbs/types/header}origCtxtId" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.misys.com/cbs/types/header}messageStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rsHeader", propOrder = {
    "version",
    "messageType",
    "origCtxtId",
    "status"
})
public class RsHeader {

    @XmlElement(required = true)
    protected String version;
    protected String messageType;
    protected String origCtxtId;
    @XmlElement(required = true)
    protected MessageStatus status;

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
     * Gets the value of the origCtxtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigCtxtId() {
        return origCtxtId;
    }

    /**
     * Sets the value of the origCtxtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigCtxtId(String value) {
        this.origCtxtId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatus }
     *     
     */
    public MessageStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatus }
     *     
     */
    public void setStatus(MessageStatus value) {
        this.status = value;
    }

}
