
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherPmtDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherPmtDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remitterName" type="{http://www.misys.com/cbs/types}remitterName" minOccurs="0"/>
 *         &lt;element name="pmtPurpose" type="{http://www.misys.com/cbs/types}pmtPurpose" minOccurs="0"/>
 *         &lt;element name="secondHostId" type="{http://www.misys.com/cbs/types}hostTxnCode" minOccurs="0"/>
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
@XmlType(name = "otherPmtDetails", propOrder = {
    "remitterName",
    "pmtPurpose",
    "secondHostId",
    "userExtension",
    "hostExtension"
})
public class OtherPmtDetails {

    protected String remitterName;
    protected String pmtPurpose;
    protected String secondHostId;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the remitterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitterName() {
        return remitterName;
    }

    /**
     * Sets the value of the remitterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitterName(String value) {
        this.remitterName = value;
    }

    /**
     * Gets the value of the pmtPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtPurpose() {
        return pmtPurpose;
    }

    /**
     * Sets the value of the pmtPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtPurpose(String value) {
        this.pmtPurpose = value;
    }

    /**
     * Gets the value of the secondHostId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondHostId() {
        return secondHostId;
    }

    /**
     * Sets the value of the secondHostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondHostId(String value) {
        this.secondHostId = value;
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
