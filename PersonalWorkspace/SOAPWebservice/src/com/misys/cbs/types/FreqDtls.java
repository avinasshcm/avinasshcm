
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freqDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freqDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequencyCode" type="{http://www.misys.com/cbs/types}frequency" minOccurs="0"/>
 *         &lt;element name="frequencyNum" type="{http://www.misys.com/cbs/types}frequencyNumber" minOccurs="0"/>
 *         &lt;element name="extensionDetails" type="{http://www.misys.com/cbs/types}extensionDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freqDtls", propOrder = {
    "frequencyCode",
    "frequencyNum",
    "extensionDetails"
})
public class FreqDtls {

    protected String frequencyCode;
    protected Integer frequencyNum;
    @XmlElement(required = true)
    protected ExtensionDetails extensionDetails;

    /**
     * Gets the value of the frequencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyCode() {
        return frequencyCode;
    }

    /**
     * Sets the value of the frequencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyCode(String value) {
        this.frequencyCode = value;
    }

    /**
     * Gets the value of the frequencyNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequencyNum() {
        return frequencyNum;
    }

    /**
     * Sets the value of the frequencyNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequencyNum(Integer value) {
        this.frequencyNum = value;
    }

    /**
     * Gets the value of the extensionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDetails }
     *     
     */
    public ExtensionDetails getExtensionDetails() {
        return extensionDetails;
    }

    /**
     * Sets the value of the extensionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDetails }
     *     
     */
    public void setExtensionDetails(ExtensionDetails value) {
        this.extensionDetails = value;
    }

}
