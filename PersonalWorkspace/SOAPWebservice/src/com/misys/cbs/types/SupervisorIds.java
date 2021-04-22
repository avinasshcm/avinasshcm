
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for supervisorIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supervisorIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supervisorId" type="{http://www.misys.com/cbs/types}eventCode"/>
 *         &lt;element name="lastSupervisor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supervisorIds", propOrder = {
    "supervisorId",
    "lastSupervisor"
})
public class SupervisorIds {

    @XmlElement(required = true)
    protected String supervisorId;
    protected boolean lastSupervisor;

    /**
     * Gets the value of the supervisorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorId() {
        return supervisorId;
    }

    /**
     * Sets the value of the supervisorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorId(String value) {
        this.supervisorId = value;
    }

    /**
     * Gets the value of the lastSupervisor property.
     * 
     */
    public boolean isLastSupervisor() {
        return lastSupervisor;
    }

    /**
     * Sets the value of the lastSupervisor property.
     * 
     */
    public void setLastSupervisor(boolean value) {
        this.lastSupervisor = value;
    }

}
