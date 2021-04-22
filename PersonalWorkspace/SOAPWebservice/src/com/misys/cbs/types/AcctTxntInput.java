
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for acctTxntInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctTxntInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountFormatType" type="{http://www.misys.com/cbs/types}accountFormatType"/>
 *         &lt;element name="accountId" type="{http://www.misys.com/cbs/types}inputAccountId"/>
 *         &lt;element name="transactionRef" type="{http://www.misys.com/cbs/types}hostTxnRef" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.misys.com/cbs/types}hostTxnCode" minOccurs="0"/>
 *         &lt;element name="txnSerialNum" type="{http://www.misys.com/cbs/types}hostTxnRef" minOccurs="0"/>
 *         &lt;element name="postingDate" type="{http://www.misys.com/cbs/types}TIMESTAMP" minOccurs="0"/>
 *         &lt;element name="valueDate" type="{http://www.misys.com/cbs/types}TIMESTAMP" minOccurs="0"/>
 *         &lt;element name="sequenceNum" type="{http://www.misys.com/cbs/types}sequenceNo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acctTxntInput", propOrder = {
    "accountFormatType",
    "accountId",
    "transactionRef",
    "transactionType",
    "txnSerialNum",
    "postingDate",
    "valueDate",
    "sequenceNum"
})
public class AcctTxntInput {

    @XmlElement(required = true)
    protected AccountFormatType accountFormatType;
    @XmlElement(required = true)
    protected String accountId;
    protected String transactionRef;
    protected String transactionType;
    protected String txnSerialNum;
    protected XMLGregorianCalendar postingDate;
    protected XMLGregorianCalendar valueDate;
    protected String sequenceNum;

    /**
     * Gets the value of the accountFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountFormatType }
     *     
     */
    public AccountFormatType getAccountFormatType() {
        return accountFormatType;
    }

    /**
     * Sets the value of the accountFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountFormatType }
     *     
     */
    public void setAccountFormatType(AccountFormatType value) {
        this.accountFormatType = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the transactionRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionRef() {
        return transactionRef;
    }

    /**
     * Sets the value of the transactionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionRef(String value) {
        this.transactionRef = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the txnSerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnSerialNum() {
        return txnSerialNum;
    }

    /**
     * Sets the value of the txnSerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnSerialNum(String value) {
        this.txnSerialNum = value;
    }

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingDate(XMLGregorianCalendar value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the sequenceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNum() {
        return sequenceNum;
    }

    /**
     * Sets the value of the sequenceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNum(String value) {
        this.sequenceNum = value;
    }

}
