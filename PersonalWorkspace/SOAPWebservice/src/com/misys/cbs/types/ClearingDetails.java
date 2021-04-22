
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clearingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clearingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instrumentType" type="{http://www.misys.com/cbs/types}instrumentType" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.misys.com/cbs/types}isoCurrencyCode" minOccurs="0"/>
 *         &lt;element name="clearingDays" type="{http://www.misys.com/cbs/types}clearingDays" minOccurs="0"/>
 *         &lt;element name="settlementAccount" type="{http://www.misys.com/cbs/types}standardAccountId" minOccurs="0"/>
 *         &lt;element name="pseudonymId" type="{http://www.misys.com/cbs/types}pseudonymId" minOccurs="0"/>
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "clearingDetails", propOrder = {
    "instrumentType",
    "currency",
    "clearingDays",
    "settlementAccount",
    "pseudonymId",
    "isDefault",
    "userExtension",
    "hostExtension"
})
public class ClearingDetails {

    protected String instrumentType;
    protected String currency;
    protected Integer clearingDays;
    protected String settlementAccount;
    protected String pseudonymId;
    @XmlElement(defaultValue = "false")
    protected boolean isDefault;
    protected Object userExtension;
    protected Object hostExtension;

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
     * Gets the value of the clearingDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClearingDays() {
        return clearingDays;
    }

    /**
     * Sets the value of the clearingDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClearingDays(Integer value) {
        this.clearingDays = value;
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
