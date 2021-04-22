
package com.misys.bankfusion.attributes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BFHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BFHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correlationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoAuthorize" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="applicationContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cachedBPMUsers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.misys.com/bankfusion/attributes}BFHeaderExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BFHeader", propOrder = {
    "correlationID",
    "zone",
    "autoAuthorize",
    "applicationContext",
    "cachedBPMUsers",
    "extension"
})
public class BFHeader {

    protected String correlationID;
    protected String zone;
    protected boolean autoAuthorize;
    protected String applicationContext;
    protected List<String> cachedBPMUsers;
    protected BFHeaderExtension extension;

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Gets the value of the autoAuthorize property.
     * 
     */
    public boolean isAutoAuthorize() {
        return autoAuthorize;
    }

    /**
     * Sets the value of the autoAuthorize property.
     * 
     */
    public void setAutoAuthorize(boolean value) {
        this.autoAuthorize = value;
    }

    /**
     * Gets the value of the applicationContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationContext() {
        return applicationContext;
    }

    /**
     * Sets the value of the applicationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationContext(String value) {
        this.applicationContext = value;
    }

    /**
     * Gets the value of the cachedBPMUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cachedBPMUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCachedBPMUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCachedBPMUsers() {
        if (cachedBPMUsers == null) {
            cachedBPMUsers = new ArrayList<String>();
        }
        return this.cachedBPMUsers;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link BFHeaderExtension }
     *     
     */
    public BFHeaderExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BFHeaderExtension }
     *     
     */
    public void setExtension(BFHeaderExtension value) {
        this.extension = value;
    }

}
