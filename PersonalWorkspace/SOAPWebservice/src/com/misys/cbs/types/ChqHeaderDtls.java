
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chqHeaderDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chqHeaderDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chqHeaderRef" type="{http://www.misys.com/cbs/types}chqHeaderRef"/>
 *         &lt;element name="chqHeaderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="chqHeaderSts" type="{http://www.misys.com/cbs/types}chqHeaderSts"/>
 *         &lt;element name="tellerTxnRef" type="{http://www.misys.com/cbs/types}tellerTxnRef"/>
 *         &lt;element name="account" type="{http://www.misys.com/cbs/types}accountKeys"/>
 *         &lt;element name="chargeAmountDetails" type="{http://www.misys.com/cbs/types}currency" minOccurs="0"/>
 *         &lt;element name="totalChequesAmount" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="numberOfChq" type="{http://www.misys.com/cbs/types}chqQty"/>
 *         &lt;element name="creditAmountDetails" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="user" type="{http://www.misys.com/cbs/types}userId"/>
 *         &lt;element name="exchangeRateDetails" type="{http://www.misys.com/cbs/types}exchangeRateDetails" minOccurs="0"/>
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
@XmlType(name = "chqHeaderDtls", propOrder = {
    "chqHeaderRef",
    "chqHeaderDate",
    "chqHeaderSts",
    "tellerTxnRef",
    "account",
    "chargeAmountDetails",
    "totalChequesAmount",
    "numberOfChq",
    "creditAmountDetails",
    "user",
    "exchangeRateDetails",
    "userExtension",
    "hostExtension"
})
@XmlSeeAlso({
    SearchChqHeaderDetail.class
})
public class ChqHeaderDtls {

    @XmlElement(required = true)
    protected String chqHeaderRef;
    @XmlElement(required = true, defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar chqHeaderDate;
    @XmlElement(required = true)
    protected ChqHeaderSts chqHeaderSts;
    @XmlElement(required = true)
    protected String tellerTxnRef;
    @XmlElement(required = true)
    protected AccountKeys account;
    protected Currency chargeAmountDetails;
    @XmlElement(required = true)
    protected Currency totalChequesAmount;
    protected int numberOfChq;
    @XmlElement(required = true)
    protected Currency creditAmountDetails;
    @XmlElement(required = true)
    protected String user;
    protected ExchangeRateDetails exchangeRateDetails;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the chqHeaderRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChqHeaderRef() {
        return chqHeaderRef;
    }

    /**
     * Sets the value of the chqHeaderRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChqHeaderRef(String value) {
        this.chqHeaderRef = value;
    }

    /**
     * Gets the value of the chqHeaderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChqHeaderDate() {
        return chqHeaderDate;
    }

    /**
     * Sets the value of the chqHeaderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChqHeaderDate(XMLGregorianCalendar value) {
        this.chqHeaderDate = value;
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
     * Gets the value of the tellerTxnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellerTxnRef() {
        return tellerTxnRef;
    }

    /**
     * Sets the value of the tellerTxnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellerTxnRef(String value) {
        this.tellerTxnRef = value;
    }

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
     * Gets the value of the chargeAmountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getChargeAmountDetails() {
        return chargeAmountDetails;
    }

    /**
     * Sets the value of the chargeAmountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setChargeAmountDetails(Currency value) {
        this.chargeAmountDetails = value;
    }

    /**
     * Gets the value of the totalChequesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTotalChequesAmount() {
        return totalChequesAmount;
    }

    /**
     * Sets the value of the totalChequesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTotalChequesAmount(Currency value) {
        this.totalChequesAmount = value;
    }

    /**
     * Gets the value of the numberOfChq property.
     * 
     */
    public int getNumberOfChq() {
        return numberOfChq;
    }

    /**
     * Sets the value of the numberOfChq property.
     * 
     */
    public void setNumberOfChq(int value) {
        this.numberOfChq = value;
    }

    /**
     * Gets the value of the creditAmountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCreditAmountDetails() {
        return creditAmountDetails;
    }

    /**
     * Sets the value of the creditAmountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCreditAmountDetails(Currency value) {
        this.creditAmountDetails = value;
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
     * Gets the value of the exchangeRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateDetails }
     *     
     */
    public ExchangeRateDetails getExchangeRateDetails() {
        return exchangeRateDetails;
    }

    /**
     * Sets the value of the exchangeRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateDetails }
     *     
     */
    public void setExchangeRateDetails(ExchangeRateDetails value) {
        this.exchangeRateDetails = value;
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
