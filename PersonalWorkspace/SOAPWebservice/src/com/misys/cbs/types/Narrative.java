
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for narrative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="narrative">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reference" type="{http://www.misys.com/cbs/types}reference" minOccurs="0"/>
 *         &lt;element name="narrativeLine1" type="{http://www.misys.com/cbs/types}narrLineShort" minOccurs="0"/>
 *         &lt;element name="narrativeLine2" type="{http://www.misys.com/cbs/types}narrLineLong" minOccurs="0"/>
 *         &lt;element name="narrativeLine3" type="{http://www.misys.com/cbs/types}narrLineLong" minOccurs="0"/>
 *         &lt;element name="narrativeLine4" type="{http://www.misys.com/cbs/types}narrLineLong" minOccurs="0"/>
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
@XmlType(name = "narrative", propOrder = {
    "reference",
    "narrativeLine1",
    "narrativeLine2",
    "narrativeLine3",
    "narrativeLine4",
    "userExtension",
    "hostExtension"
})
public class Narrative {

    protected String reference;
    protected String narrativeLine1;
    protected String narrativeLine2;
    protected String narrativeLine3;
    protected String narrativeLine4;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the narrativeLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrativeLine1() {
        return narrativeLine1;
    }

    /**
     * Sets the value of the narrativeLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrativeLine1(String value) {
        this.narrativeLine1 = value;
    }

    /**
     * Gets the value of the narrativeLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrativeLine2() {
        return narrativeLine2;
    }

    /**
     * Sets the value of the narrativeLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrativeLine2(String value) {
        this.narrativeLine2 = value;
    }

    /**
     * Gets the value of the narrativeLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrativeLine3() {
        return narrativeLine3;
    }

    /**
     * Sets the value of the narrativeLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrativeLine3(String value) {
        this.narrativeLine3 = value;
    }

    /**
     * Gets the value of the narrativeLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrativeLine4() {
        return narrativeLine4;
    }

    /**
     * Sets the value of the narrativeLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrativeLine4(String value) {
        this.narrativeLine4 = value;
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
