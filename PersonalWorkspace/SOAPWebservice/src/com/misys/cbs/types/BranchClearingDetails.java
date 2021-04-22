
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for branchClearingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="branchClearingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otherBranchDetails" type="{http://www.misys.com/cbs/types}otherBranchDetails"/>
 *         &lt;element name="clearingDetails" type="{http://www.misys.com/cbs/types}clearingDetails" minOccurs="0"/>
 *         &lt;element name="codeDetails" type="{http://www.misys.com/cbs/types}codeDetails" minOccurs="0"/>
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
@XmlType(name = "branchClearingDetails", propOrder = {
    "otherBranchDetails",
    "clearingDetails",
    "codeDetails",
    "userExtension",
    "hostExtension"
})
public class BranchClearingDetails {

    @XmlElement(required = true)
    protected OtherBranchDetails otherBranchDetails;
    protected ClearingDetails clearingDetails;
    protected CodeDetails codeDetails;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the otherBranchDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OtherBranchDetails }
     *     
     */
    public OtherBranchDetails getOtherBranchDetails() {
        return otherBranchDetails;
    }

    /**
     * Sets the value of the otherBranchDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherBranchDetails }
     *     
     */
    public void setOtherBranchDetails(OtherBranchDetails value) {
        this.otherBranchDetails = value;
    }

    /**
     * Gets the value of the clearingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingDetails }
     *     
     */
    public ClearingDetails getClearingDetails() {
        return clearingDetails;
    }

    /**
     * Sets the value of the clearingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingDetails }
     *     
     */
    public void setClearingDetails(ClearingDetails value) {
        this.clearingDetails = value;
    }

    /**
     * Gets the value of the codeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDetails }
     *     
     */
    public CodeDetails getCodeDetails() {
        return codeDetails;
    }

    /**
     * Sets the value of the codeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDetails }
     *     
     */
    public void setCodeDetails(CodeDetails value) {
        this.codeDetails = value;
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
