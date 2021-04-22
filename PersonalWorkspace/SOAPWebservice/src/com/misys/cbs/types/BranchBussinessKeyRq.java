
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for branchBussinessKeyRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="branchBussinessKeyRq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessKeyColumnName" type="{http://www.misys.com/cbs/types}businessKeyColumnName"/>
 *         &lt;element name="branchBusinessKey" type="{http://www.misys.com/cbs/types}branchBusinessKey"/>
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
@XmlType(name = "branchBussinessKeyRq", propOrder = {
    "businessKeyColumnName",
    "branchBusinessKey",
    "userExtension",
    "hostExtension"
})
public class BranchBussinessKeyRq {

    @XmlElement(required = true)
    protected String businessKeyColumnName;
    @XmlElement(required = true)
    protected String branchBusinessKey;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the businessKeyColumnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessKeyColumnName() {
        return businessKeyColumnName;
    }

    /**
     * Sets the value of the businessKeyColumnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessKeyColumnName(String value) {
        this.businessKeyColumnName = value;
    }

    /**
     * Gets the value of the branchBusinessKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchBusinessKey() {
        return branchBusinessKey;
    }

    /**
     * Sets the value of the branchBusinessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchBusinessKey(String value) {
        this.branchBusinessKey = value;
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
