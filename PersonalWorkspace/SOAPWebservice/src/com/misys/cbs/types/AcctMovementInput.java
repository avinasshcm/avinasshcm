
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for acctMovementInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctMovementInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountFormatType" type="{http://www.misys.com/cbs/types}accountFormatType"/>
 *         &lt;element name="accountId" type="{http://www.misys.com/cbs/types}inputAccountId" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="narrativeContent" type="{http://www.misys.com/cbs/types}narrLineLong" minOccurs="0"/>
 *         &lt;element name="sinceStatementDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="miniStatement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="noOffMovements" type="{http://www.misys.com/cbs/types}noOfItems" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.misys.com/cbs/types}channelId" minOccurs="0"/>
 *         &lt;element name="transactionRef" type="{http://www.misys.com/cbs/types}hostTxnRef" minOccurs="0"/>
 *         &lt;element name="futureMvmntOnly" type="{http://www.misys.com/cbs/types}BOOLEAN"/>
 *         &lt;element name="txnRefOther" type="{http://www.misys.com/cbs/types}txnRefOther" minOccurs="0"/>
 *         &lt;element name="txnDataType" type="{http://www.misys.com/cbs/types}txnDataType" minOccurs="0"/>
 *         &lt;element name="lastMvmntOnly" type="{http://www.misys.com/cbs/types}BOOLEAN" minOccurs="0"/>
 *         &lt;element name="descendingSortOrder" type="{http://www.misys.com/cbs/types}BOOLEAN" minOccurs="0"/>
 *         &lt;element name="finTxnsOnly" type="{http://www.misys.com/cbs/types}BOOLEAN" minOccurs="0"/>
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
@XmlType(name = "acctMovementInput", propOrder = {
    "accountFormatType",
    "accountId",
    "startDate",
    "endDate",
    "narrativeContent",
    "sinceStatementDate",
    "miniStatement",
    "noOffMovements",
    "channel",
    "transactionRef",
    "futureMvmntOnly",
    "txnRefOther",
    "txnDataType",
    "lastMvmntOnly",
    "descendingSortOrder",
    "finTxnsOnly",
    "userExtension",
    "hostExtension"
})
public class AcctMovementInput {

    @XmlElement(required = true)
    protected AccountFormatType accountFormatType;
    protected String accountId;
    protected XMLGregorianCalendar startDate;
    protected XMLGregorianCalendar endDate;
    protected String narrativeContent;
    protected boolean sinceStatementDate;
    protected boolean miniStatement;
    protected Integer noOffMovements;
    protected String channel;
    protected String transactionRef;
    protected boolean futureMvmntOnly;
    protected String txnRefOther;
    protected String txnDataType;
    @XmlElement(defaultValue = "false")
    protected Boolean lastMvmntOnly;
    @XmlElement(defaultValue = "false")
    protected Boolean descendingSortOrder;
    @XmlElement(defaultValue = "false")
    protected Boolean finTxnsOnly;
    protected Object userExtension;
    protected Object hostExtension;

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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the narrativeContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrativeContent() {
        return narrativeContent;
    }

    /**
     * Sets the value of the narrativeContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrativeContent(String value) {
        this.narrativeContent = value;
    }

    /**
     * Gets the value of the sinceStatementDate property.
     * 
     */
    public boolean isSinceStatementDate() {
        return sinceStatementDate;
    }

    /**
     * Sets the value of the sinceStatementDate property.
     * 
     */
    public void setSinceStatementDate(boolean value) {
        this.sinceStatementDate = value;
    }

    /**
     * Gets the value of the miniStatement property.
     * 
     */
    public boolean isMiniStatement() {
        return miniStatement;
    }

    /**
     * Sets the value of the miniStatement property.
     * 
     */
    public void setMiniStatement(boolean value) {
        this.miniStatement = value;
    }

    /**
     * Gets the value of the noOffMovements property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOffMovements() {
        return noOffMovements;
    }

    /**
     * Sets the value of the noOffMovements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOffMovements(Integer value) {
        this.noOffMovements = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
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
     * Gets the value of the futureMvmntOnly property.
     * 
     */
    public boolean isFutureMvmntOnly() {
        return futureMvmntOnly;
    }

    /**
     * Sets the value of the futureMvmntOnly property.
     * 
     */
    public void setFutureMvmntOnly(boolean value) {
        this.futureMvmntOnly = value;
    }

    /**
     * Gets the value of the txnRefOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnRefOther() {
        return txnRefOther;
    }

    /**
     * Sets the value of the txnRefOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnRefOther(String value) {
        this.txnRefOther = value;
    }

    /**
     * Gets the value of the txnDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnDataType() {
        return txnDataType;
    }

    /**
     * Sets the value of the txnDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDataType(String value) {
        this.txnDataType = value;
    }

    /**
     * Gets the value of the lastMvmntOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastMvmntOnly() {
        return lastMvmntOnly;
    }

    /**
     * Sets the value of the lastMvmntOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastMvmntOnly(Boolean value) {
        this.lastMvmntOnly = value;
    }

    /**
     * Gets the value of the descendingSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescendingSortOrder() {
        return descendingSortOrder;
    }

    /**
     * Sets the value of the descendingSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescendingSortOrder(Boolean value) {
        this.descendingSortOrder = value;
    }

    /**
     * Gets the value of the finTxnsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinTxnsOnly() {
        return finTxnsOnly;
    }

    /**
     * Sets the value of the finTxnsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinTxnsOnly(Boolean value) {
        this.finTxnsOnly = value;
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
