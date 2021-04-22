
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for benDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="benDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankCode" type="{http://www.misys.com/cbs/types}bankCode"/>
 *         &lt;element name="benAcctId" type="{http://www.misys.com/cbs/types}otherBankAcctId"/>
 *         &lt;element name="benName" type="{http://www.misys.com/cbs/types}beneficiaryName"/>
 *         &lt;element name="benBranch" type="{http://www.misys.com/cbs/types}issuingBankBranchCode"/>
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
@XmlType(name = "benDetails", propOrder = {
    "bankCode",
    "benAcctId",
    "benName",
    "benBranch",
    "userExtension",
    "hostExtension"
})
public class BenDetails {

    @XmlElement(required = true)
    protected String bankCode;
    @XmlElement(required = true)
    protected String benAcctId;
    @XmlElement(required = true)
    protected String benName;
    @XmlElement(required = true)
    protected String benBranch;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the benAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenAcctId() {
        return benAcctId;
    }

    /**
     * Sets the value of the benAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenAcctId(String value) {
        this.benAcctId = value;
    }

    /**
     * Gets the value of the benName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenName() {
        return benName;
    }

    /**
     * Sets the value of the benName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenName(String value) {
        this.benName = value;
    }

    /**
     * Gets the value of the benBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenBranch() {
        return benBranch;
    }

    /**
     * Sets the value of the benBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenBranch(String value) {
        this.benBranch = value;
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
