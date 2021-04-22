
package com.misys.bf.attributes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ErrorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OVERALLSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Ack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MICROFLOWID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BFREQUESTORID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventCollection" type="{http://www.misys.com/bf/attributes}EvtCollection" minOccurs="0"/>
 *         &lt;element name="ApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Build" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorResponse", propOrder = {
    "overallstatus",
    "timestamp",
    "ack",
    "microflowid",
    "bfrequestorid",
    "eventCollection",
    "applicationID",
    "version",
    "build"
})
public class ErrorResponse {

    @XmlElement(name = "OVERALLSTATUS")
    protected String overallstatus;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "Ack")
    protected String ack;
    @XmlElement(name = "MICROFLOWID")
    protected String microflowid;
    @XmlElement(name = "BFREQUESTORID")
    protected String bfrequestorid;
    @XmlElement(name = "EventCollection")
    protected EvtCollection eventCollection;
    @XmlElement(name = "ApplicationID")
    protected String applicationID;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Build")
    protected String build;

    /**
     * Gets the value of the overallstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVERALLSTATUS() {
        return overallstatus;
    }

    /**
     * Sets the value of the overallstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVERALLSTATUS(String value) {
        this.overallstatus = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the ack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAck() {
        return ack;
    }

    /**
     * Sets the value of the ack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAck(String value) {
        this.ack = value;
    }

    /**
     * Gets the value of the microflowid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMICROFLOWID() {
        return microflowid;
    }

    /**
     * Sets the value of the microflowid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMICROFLOWID(String value) {
        this.microflowid = value;
    }

    /**
     * Gets the value of the bfrequestorid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBFREQUESTORID() {
        return bfrequestorid;
    }

    /**
     * Sets the value of the bfrequestorid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBFREQUESTORID(String value) {
        this.bfrequestorid = value;
    }

    /**
     * Gets the value of the eventCollection property.
     * 
     * @return
     *     possible object is
     *     {@link EvtCollection }
     *     
     */
    public EvtCollection getEventCollection() {
        return eventCollection;
    }

    /**
     * Sets the value of the eventCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvtCollection }
     *     
     */
    public void setEventCollection(EvtCollection value) {
        this.eventCollection = value;
    }

    /**
     * Gets the value of the applicationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationID() {
        return applicationID;
    }

    /**
     * Sets the value of the applicationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationID(String value) {
        this.applicationID = value;
    }

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
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuild(String value) {
        this.build = value;
    }

}
