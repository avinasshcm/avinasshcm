
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchBankDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchBankDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankCode" type="{http://www.misys.com/cbs/types}bankCode"/>
 *         &lt;element name="homeBankIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bankName" type="{http://www.misys.com/cbs/types}bankName"/>
 *         &lt;element name="imdCode" type="{http://www.misys.com/cbs/types}imdCode" minOccurs="0"/>
 *         &lt;element name="ibanFormat" type="{http://www.misys.com/cbs/types}ibanFormat" minOccurs="0"/>
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
@XmlType(name = "searchBankDetail", propOrder = {
    "bankCode",
    "homeBankIndicator",
    "bankName",
    "imdCode",
    "ibanFormat",
    "select",
    "userExtension",
    "hostExtension"
})
public class SearchBankDetail {

    @XmlElement(required = true)
    protected String bankCode;
    @XmlElement(defaultValue = "false")
    protected boolean homeBankIndicator;
    @XmlElement(required = true)
    protected String bankName;
    protected String imdCode;
    protected String ibanFormat;
    @XmlElement(defaultValue = "false")
    protected boolean select;
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
     * Gets the value of the homeBankIndicator property.
     * 
     */
    public boolean isHomeBankIndicator() {
        return homeBankIndicator;
    }

    /**
     * Sets the value of the homeBankIndicator property.
     * 
     */
    public void setHomeBankIndicator(boolean value) {
        this.homeBankIndicator = value;
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
     * Gets the value of the ibanFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbanFormat() {
        return ibanFormat;
    }

    /**
     * Sets the value of the ibanFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbanFormat(String value) {
        this.ibanFormat = value;
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
