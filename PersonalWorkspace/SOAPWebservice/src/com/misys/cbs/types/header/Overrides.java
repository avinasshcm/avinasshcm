
package com.misys.cbs.types.header;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.misys.cbs.types.AuthCodes;
import com.misys.cbs.types.EventCodes;


/**
 * <p>Java class for overrides complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overrides">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forcePost" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="authCodes" type="{http://www.misys.com/cbs/types}authCodes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eventCodes" type="{http://www.misys.com/cbs/types}eventCodes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastSupervisorId" type="{http://www.misys.com/cbs/types}userId" minOccurs="0"/>
 *         &lt;element name="authRequired" type="{http://www.misys.com/cbs/types}BOOLEAN"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overrides", propOrder = {
    "forcePost",
    "authCodes",
    "eventCodes",
    "lastSupervisorId",
    "authRequired"
})
public class Overrides {

    @XmlElement(defaultValue = "false")
    protected boolean forcePost;
    protected List<AuthCodes> authCodes;
    protected List<EventCodes> eventCodes;
    protected String lastSupervisorId;
    protected boolean authRequired;

    /**
     * Gets the value of the forcePost property.
     * 
     */
    public boolean isForcePost() {
        return forcePost;
    }

    /**
     * Sets the value of the forcePost property.
     * 
     */
    public void setForcePost(boolean value) {
        this.forcePost = value;
    }

    /**
     * Gets the value of the authCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthCodes }
     * 
     * 
     */
    public List<AuthCodes> getAuthCodes() {
        if (authCodes == null) {
            authCodes = new ArrayList<AuthCodes>();
        }
        return this.authCodes;
    }

    /**
     * Gets the value of the eventCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventCodes }
     * 
     * 
     */
    public List<EventCodes> getEventCodes() {
        if (eventCodes == null) {
            eventCodes = new ArrayList<EventCodes>();
        }
        return this.eventCodes;
    }

    /**
     * Gets the value of the lastSupervisorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSupervisorId() {
        return lastSupervisorId;
    }

    /**
     * Sets the value of the lastSupervisorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSupervisorId(String value) {
        this.lastSupervisorId = value;
    }

    /**
     * Gets the value of the authRequired property.
     * 
     */
    public boolean isAuthRequired() {
        return authRequired;
    }

    /**
     * Sets the value of the authRequired property.
     * 
     */
    public void setAuthRequired(boolean value) {
        this.authRequired = value;
    }

}
