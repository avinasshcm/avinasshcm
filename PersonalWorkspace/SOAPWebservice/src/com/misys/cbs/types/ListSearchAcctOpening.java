
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listSearchAcctOpening complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listSearchAcctOpening">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="select" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accountBasicDetails" type="{http://www.misys.com/cbs/types}accountBasicDetails"/>
 *         &lt;element name="accountBalances" type="{http://www.misys.com/cbs/types}acctBalances"/>
 *         &lt;element name="accountAuditDtls" type="{http://www.misys.com/cbs/types}accountAuditDtls"/>
 *         &lt;element name="acctStatistics" type="{http://www.misys.com/cbs/types}acctStatistics"/>
 *         &lt;element name="creditAmountTotal" type="{http://www.misys.com/cbs/types}amountEdited"/>
 *         &lt;element name="debitAmountTotal" type="{http://www.misys.com/cbs/types}amountEdited"/>
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
@XmlType(name = "listSearchAcctOpening", propOrder = {
    "select",
    "accountBasicDetails",
    "accountBalances",
    "accountAuditDtls",
    "acctStatistics",
    "creditAmountTotal",
    "debitAmountTotal",
    "userExtension",
    "hostExtension"
})
public class ListSearchAcctOpening {

    @XmlElement(defaultValue = "false")
    protected boolean select;
    @XmlElement(required = true)
    protected AccountBasicDetails accountBasicDetails;
    @XmlElement(required = true)
    protected AcctBalances accountBalances;
    @XmlElement(required = true)
    protected AccountAuditDtls accountAuditDtls;
    @XmlElement(required = true)
    protected AcctStatistics acctStatistics;
    @XmlElement(required = true)
    protected BigDecimal creditAmountTotal;
    @XmlElement(required = true)
    protected BigDecimal debitAmountTotal;
    protected Object userExtension;
    protected Object hostExtension;

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
     * Gets the value of the accountBasicDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountBasicDetails }
     *     
     */
    public AccountBasicDetails getAccountBasicDetails() {
        return accountBasicDetails;
    }

    /**
     * Sets the value of the accountBasicDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountBasicDetails }
     *     
     */
    public void setAccountBasicDetails(AccountBasicDetails value) {
        this.accountBasicDetails = value;
    }

    /**
     * Gets the value of the accountBalances property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalances }
     *     
     */
    public AcctBalances getAccountBalances() {
        return accountBalances;
    }

    /**
     * Sets the value of the accountBalances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalances }
     *     
     */
    public void setAccountBalances(AcctBalances value) {
        this.accountBalances = value;
    }

    /**
     * Gets the value of the accountAuditDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountAuditDtls }
     *     
     */
    public AccountAuditDtls getAccountAuditDtls() {
        return accountAuditDtls;
    }

    /**
     * Sets the value of the accountAuditDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountAuditDtls }
     *     
     */
    public void setAccountAuditDtls(AccountAuditDtls value) {
        this.accountAuditDtls = value;
    }

    /**
     * Gets the value of the acctStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatistics }
     *     
     */
    public AcctStatistics getAcctStatistics() {
        return acctStatistics;
    }

    /**
     * Sets the value of the acctStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatistics }
     *     
     */
    public void setAcctStatistics(AcctStatistics value) {
        this.acctStatistics = value;
    }

    /**
     * Gets the value of the creditAmountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditAmountTotal() {
        return creditAmountTotal;
    }

    /**
     * Sets the value of the creditAmountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditAmountTotal(BigDecimal value) {
        this.creditAmountTotal = value;
    }

    /**
     * Gets the value of the debitAmountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitAmountTotal() {
        return debitAmountTotal;
    }

    /**
     * Sets the value of the debitAmountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitAmountTotal(BigDecimal value) {
        this.debitAmountTotal = value;
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
