
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Context complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Context">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phase" type="{http://www.misys.com/cbs/types}STRING"/>
 *         &lt;element name="status" type="{http://www.misys.com/cbs/types}STRING"/>
 *         &lt;element name="processInstanceID" type="{http://www.misys.com/cbs/types}STRING"/>
 *         &lt;element name="userID" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *         &lt;element name="ownersList" type="{http://www.misys.com/cbs/types}STRING" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context", propOrder = {
    "phase",
    "status",
    "processInstanceID",
    "userID",
    "ownersList"
})
public class Context {

    @XmlElement(required = true)
    protected String phase;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String processInstanceID;
    protected String userID;
    protected List<String> ownersList;

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhase(String value) {
        this.phase = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the processInstanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessInstanceID() {
        return processInstanceID;
    }

    /**
     * Sets the value of the processInstanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessInstanceID(String value) {
        this.processInstanceID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the ownersList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownersList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnersList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOwnersList() {
        if (ownersList == null) {
            ownersList = new ArrayList<String>();
        }
        return this.ownersList;
    }

}
