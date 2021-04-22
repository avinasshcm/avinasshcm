
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chqHeaderRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chqHeaderRq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://www.misys.com/cbs/types}accountKeys" minOccurs="0"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fromAmount" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="toAmount" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="isoCurrencyCode" type="{http://www.misys.com/cbs/types}isoCurrencyCode" minOccurs="0"/>
 *         &lt;element name="user" type="{http://www.misys.com/cbs/types}userId" minOccurs="0"/>
 *         &lt;element name="chqHeaderRefFilter" type="{http://www.misys.com/cbs/types}chqHeaderRefFilter" minOccurs="0"/>
 *         &lt;element name="chqHeaderSts" type="{http://www.misys.com/cbs/types}chqHeaderSts" minOccurs="0"/>
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
@XmlType(name = "chqHeaderRq", propOrder = {
    "account",
    "fromDate",
    "toDate",
    "fromAmount",
    "toAmount",
    "isoCurrencyCode",
    "user",
    "chqHeaderRefFilter",
    "chqHeaderSts",
    "userExtension",
    "hostExtension"
})
public class ChqHeaderRq {

    protected AccountKeys account;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    protected BigDecimal fromAmount;
    protected BigDecimal toAmount;
    protected String isoCurrencyCode;
    protected String user;
    protected String chqHeaderRefFilter;
    protected ChqHeaderSts chqHeaderSts;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountKeys }
     *     
     */
    public AccountKeys getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountKeys }
     *     
     */
    public void setAccount(AccountKeys value) {
        this.account = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the fromAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFromAmount() {
        return fromAmount;
    }

    /**
     * Sets the value of the fromAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFromAmount(BigDecimal value) {
        this.fromAmount = value;
    }

    /**
     * Gets the value of the toAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToAmount() {
        return toAmount;
    }

    /**
     * Sets the value of the toAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToAmount(BigDecimal value) {
        this.toAmount = value;
    }

    /**
     * Gets the value of the isoCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCurrencyCode() {
        return isoCurrencyCode;
    }

    /**
     * Sets the value of the isoCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCurrencyCode(String value) {
        this.isoCurrencyCode = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the chqHeaderRefFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChqHeaderRefFilter() {
        return chqHeaderRefFilter;
    }

    /**
     * Sets the value of the chqHeaderRefFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChqHeaderRefFilter(String value) {
        this.chqHeaderRefFilter = value;
    }

    /**
     * Gets the value of the chqHeaderSts property.
     * 
     * @return
     *     possible object is
     *     {@link ChqHeaderSts }
     *     
     */
    public ChqHeaderSts getChqHeaderSts() {
        return chqHeaderSts;
    }

    /**
     * Sets the value of the chqHeaderSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChqHeaderSts }
     *     
     */
    public void setChqHeaderSts(ChqHeaderSts value) {
        this.chqHeaderSts = value;
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
