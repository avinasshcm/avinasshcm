
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authCodes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventCode" type="{http://www.misys.com/cbs/types}eventCode"/>
 *         &lt;element name="supervisorIds" type="{http://www.misys.com/cbs/types}userId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authCodes", propOrder = {
    "eventCode",
    "supervisorIds"
})
public class AuthCodes {

    @XmlElement(required = true)
    protected String eventCode;
    protected List<String> supervisorIds;

    /**
     * Gets the value of the eventCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCode() {
        return eventCode;
    }

    /**
     * Sets the value of the eventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCode(String value) {
        this.eventCode = value;
    }

    /**
     * Gets the value of the supervisorIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supervisorIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupervisorIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupervisorIds() {
        if (supervisorIds == null) {
            supervisorIds = new ArrayList<String>();
        }
        return this.supervisorIds;
    }

}
