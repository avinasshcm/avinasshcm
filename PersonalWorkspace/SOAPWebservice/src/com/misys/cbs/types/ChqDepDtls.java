
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chqDepDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chqDepDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issuingBankCode" type="{http://www.misys.com/cbs/types}issuingBankCode" minOccurs="0"/>
 *         &lt;element name="issuingBankName" type="{http://www.misys.com/cbs/types}issuingBankName" minOccurs="0"/>
 *         &lt;element name="issuingBranch" type="{http://www.misys.com/cbs/types}issuingBranch" minOccurs="0"/>
 *         &lt;element name="chqType" type="{http://www.misys.com/cbs/types}instrumentType"/>
 *         &lt;element name="chqNum" type="{http://www.misys.com/cbs/types}chqNum"/>
 *         &lt;element name="clgDays" type="{http://www.misys.com/cbs/types}clearingDays" minOccurs="0"/>
 *         &lt;element name="chqAmount" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="accountId" type="{http://www.misys.com/cbs/types}accountKeys"/>
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
@XmlType(name = "chqDepDtls", propOrder = {
    "issuingBankCode",
    "issuingBankName",
    "issuingBranch",
    "chqType",
    "chqNum",
    "clgDays",
    "chqAmount",
    "accountId",
    "userExtension",
    "hostExtension"
})
public class ChqDepDtls {

    protected String issuingBankCode;
    protected String issuingBankName;
    protected IssuingBranch issuingBranch;
    @XmlElement(required = true)
    protected String chqType;
    @XmlElement(required = true)
    protected String chqNum;
    protected Integer clgDays;
    @XmlElement(required = true)
    protected Currency chqAmount;
    @XmlElement(required = true)
    protected AccountKeys accountId;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the issuingBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBankCode() {
        return issuingBankCode;
    }

    /**
     * Sets the value of the issuingBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBankCode(String value) {
        this.issuingBankCode = value;
    }

    /**
     * Gets the value of the issuingBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBankName() {
        return issuingBankName;
    }

    /**
     * Sets the value of the issuingBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBankName(String value) {
        this.issuingBankName = value;
    }

    /**
     * Gets the value of the issuingBranch property.
     * 
     * @return
     *     possible object is
     *     {@link IssuingBranch }
     *     
     */
    public IssuingBranch getIssuingBranch() {
        return issuingBranch;
    }

    /**
     * Sets the value of the issuingBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuingBranch }
     *     
     */
    public void setIssuingBranch(IssuingBranch value) {
        this.issuingBranch = value;
    }

    /**
     * Gets the value of the chqType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChqType() {
        return chqType;
    }

    /**
     * Sets the value of the chqType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChqType(String value) {
        this.chqType = value;
    }

    /**
     * Gets the value of the chqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChqNum() {
        return chqNum;
    }

    /**
     * Sets the value of the chqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChqNum(String value) {
        this.chqNum = value;
    }

    /**
     * Gets the value of the clgDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClgDays() {
        return clgDays;
    }

    /**
     * Sets the value of the clgDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClgDays(Integer value) {
        this.clgDays = value;
    }

    /**
     * Gets the value of the chqAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getChqAmount() {
        return chqAmount;
    }

    /**
     * Sets the value of the chqAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setChqAmount(Currency value) {
        this.chqAmount = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setAccountId(AccountKeys value) {
        this.accountId = value;
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
