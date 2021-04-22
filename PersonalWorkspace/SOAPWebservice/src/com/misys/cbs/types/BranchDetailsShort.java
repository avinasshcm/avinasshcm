
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for branchDetailsShort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="branchDetailsShort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="branchName" type="{http://www.misys.com/cbs/types}branchName"/>
 *         &lt;element name="bankName" type="{http://www.misys.com/cbs/types}bankName" minOccurs="0"/>
 *         &lt;element name="postZipCode" type="{http://www.misys.com/cbs/types}postCode" minOccurs="0"/>
 *         &lt;element name="branchCode" type="{http://www.misys.com/cbs/types}branchSortCode"/>
 *         &lt;element name="parentBranchCode" type="{http://www.misys.com/cbs/types}branchSortCode"/>
 *         &lt;element name="parentBranchName" type="{http://www.misys.com/cbs/types}branchName"/>
 *         &lt;element name="imdCode" type="{http://www.misys.com/cbs/types}imdCode" minOccurs="0"/>
 *         &lt;element name="isoCountryCode" type="{http://www.misys.com/cbs/types}isoCountryCode" minOccurs="0"/>
 *         &lt;element name="hostBranchCode" type="{http://www.misys.com/cbs/types}hostBranchCode" minOccurs="0"/>
 *         &lt;element name="select" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "branchDetailsShort", propOrder = {
    "branchName",
    "bankName",
    "postZipCode",
    "branchCode",
    "parentBranchCode",
    "parentBranchName",
    "imdCode",
    "isoCountryCode",
    "hostBranchCode",
    "select",
    "userExtension",
    "hostExtension"
})
public class BranchDetailsShort {

    @XmlElement(required = true)
    protected String branchName;
    protected String bankName;
    protected String postZipCode;
    @XmlElement(required = true)
    protected String branchCode;
    @XmlElement(required = true)
    protected String parentBranchCode;
    @XmlElement(required = true)
    protected String parentBranchName;
    protected String imdCode;
    protected String isoCountryCode;
    protected String hostBranchCode;
    @XmlElement(defaultValue = "false")
    protected boolean select;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the postZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostZipCode() {
        return postZipCode;
    }

    /**
     * Sets the value of the postZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostZipCode(String value) {
        this.postZipCode = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the parentBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentBranchCode() {
        return parentBranchCode;
    }

    /**
     * Sets the value of the parentBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentBranchCode(String value) {
        this.parentBranchCode = value;
    }

    /**
     * Gets the value of the parentBranchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentBranchName() {
        return parentBranchName;
    }

    /**
     * Sets the value of the parentBranchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentBranchName(String value) {
        this.parentBranchName = value;
    }

    /**
     * Gets the value of the imdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImdCode() {
        return imdCode;
    }

    /**
     * Sets the value of the imdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImdCode(String value) {
        this.imdCode = value;
    }

    /**
     * Gets the value of the isoCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCountryCode() {
        return isoCountryCode;
    }

    /**
     * Sets the value of the isoCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCountryCode(String value) {
        this.isoCountryCode = value;
    }

    /**
     * Gets the value of the hostBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostBranchCode() {
        return hostBranchCode;
    }

    /**
     * Sets the value of the hostBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostBranchCode(String value) {
        this.hostBranchCode = value;
    }

    /**
     * Gets the value of the select property.
     * 
     */
    public boolean isSelect() {
        return select;
    }

    /**
     * Sets the value of the select property.
     * 
     */
    public void setSelect(boolean value) {
        this.select = value;
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
