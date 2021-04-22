
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clearingBranchDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clearingBranchDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankCode" type="{http://www.misys.com/cbs/types}bankCode"/>
 *         &lt;element name="branchCode" type="{http://www.misys.com/cbs/types}issuingBankBranchCode"/>
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="instrumentType" type="{http://www.misys.com/cbs/types}instrumentType" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.misys.com/cbs/types}isoCurrencyCode" minOccurs="0"/>
 *         &lt;element name="clearingDay" type="{http://www.misys.com/cbs/types}clearingDays" minOccurs="0"/>
 *         &lt;element name="settlementAccount" type="{http://www.misys.com/cbs/types}standardAccountId" minOccurs="0"/>
 *         &lt;element name="pseudonymId" type="{http://www.misys.com/cbs/types}pseudonymId" minOccurs="0"/>
 *         &lt;element name="clrCodeType" type="{http://www.misys.com/cbs/types}codeType" minOccurs="0"/>
 *         &lt;element name="clrCodeValue" type="{http://www.misys.com/cbs/types}codeValue" minOccurs="0"/>
 *         &lt;element name="userExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="hostExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="select" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clearingBranchDetails", propOrder = {
    "bankCode",
    "branchCode",
    "isDefault",
    "instrumentType",
    "currency",
    "clearingDay",
    "settlementAccount",
    "pseudonymId",
    "clrCodeType",
    "clrCodeValue",
    "userExtension",
    "hostExtension",
    "select"
})
public class ClearingBranchDetails {

    @XmlElement(required = true)
    protected String bankCode;
    @XmlElement(required = true)
    protected String branchCode;
    @XmlElement(defaultValue = "false")
    protected boolean isDefault;
    protected String instrumentType;
    protected String currency;
    protected Integer clearingDay;
    protected String settlementAccount;
    protected String pseudonymId;
    protected String clrCodeType;
    protected String clrCodeValue;
    protected Object userExtension;
    protected Object hostExtension;
    @XmlElement(defaultValue = "false")
    protected boolean select;

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
     * Gets the value of the isDefault property.
     * 
     */
    public boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     */
    public void setIsDefault(boolean value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the instrumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentType() {
        return instrumentType;
    }

    /**
     * Sets the value of the instrumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentType(String value) {
        this.instrumentType = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the clearingDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClearingDay() {
        return clearingDay;
    }

    /**
     * Sets the value of the clearingDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClearingDay(Integer value) {
        this.clearingDay = value;
    }

    /**
     * Gets the value of the settlementAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAccount() {
        return settlementAccount;
    }

    /**
     * Sets the value of the settlementAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAccount(String value) {
        this.settlementAccount = value;
    }

    /**
     * Gets the value of the pseudonymId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudonymId() {
        return pseudonymId;
    }

    /**
     * Sets the value of the pseudonymId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudonymId(String value) {
        this.pseudonymId = value;
    }

    /**
     * Gets the value of the clrCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrCodeType() {
        return clrCodeType;
    }

    /**
     * Sets the value of the clrCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrCodeType(String value) {
        this.clrCodeType = value;
    }

    /**
     * Gets the value of the clrCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrCodeValue() {
        return clrCodeValue;
    }

    /**
     * Sets the value of the clrCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrCodeValue(String value) {
        this.clrCodeValue = value;
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

}
