
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountInfo" type="{http://www.misys.com/cbs/types}accountInfo"/>
 *         &lt;element name="additionalAccountDetails" type="{http://www.misys.com/cbs/types}accountAdditionalDetails" minOccurs="0"/>
 *         &lt;element name="creditInterestDtls" type="{http://www.misys.com/cbs/types}creditIntDtls" minOccurs="0"/>
 *         &lt;element name="debitInterestDtls" type="{http://www.misys.com/cbs/types}debitIntDtls" minOccurs="0"/>
 *         &lt;element name="unusedOdIntDtls" type="{http://www.misys.com/cbs/types}debitIntDtls" minOccurs="0"/>
 *         &lt;element name="statementDetails" type="{http://www.misys.com/cbs/types}statementDetails" minOccurs="0"/>
 *         &lt;element name="noticePenaltyDtls" type="{http://www.misys.com/cbs/types}depositPenaltyDtls" minOccurs="0"/>
 *         &lt;element name="limitDetails" type="{http://www.misys.com/cbs/types}limitDetails" minOccurs="0"/>
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
@XmlType(name = "accountDetails", propOrder = {
    "accountInfo",
    "additionalAccountDetails",
    "creditInterestDtls",
    "debitInterestDtls",
    "unusedOdIntDtls",
    "statementDetails",
    "noticePenaltyDtls",
    "limitDetails",
    "userExtension",
    "hostExtension"
})
public class AccountDetails {

    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    protected AccountAdditionalDetails additionalAccountDetails;
    protected CreditIntDtls creditInterestDtls;
    protected DebitIntDtls debitInterestDtls;
    protected DebitIntDtls unusedOdIntDtls;
    protected StatementDetails statementDetails;
    protected DepositPenaltyDtls noticePenaltyDtls;
    protected LimitDetails limitDetails;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfo }
     *     
     */
    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfo }
     *     
     */
    public void setAccountInfo(AccountInfo value) {
        this.accountInfo = value;
    }

    /**
     * Gets the value of the additionalAccountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountAdditionalDetails }
     *     
     */
    public AccountAdditionalDetails getAdditionalAccountDetails() {
        return additionalAccountDetails;
    }

    /**
     * Sets the value of the additionalAccountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountAdditionalDetails }
     *     
     */
    public void setAdditionalAccountDetails(AccountAdditionalDetails value) {
        this.additionalAccountDetails = value;
    }

    /**
     * Gets the value of the creditInterestDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CreditIntDtls }
     *     
     */
    public CreditIntDtls getCreditInterestDtls() {
        return creditInterestDtls;
    }

    /**
     * Sets the value of the creditInterestDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditIntDtls }
     *     
     */
    public void setCreditInterestDtls(CreditIntDtls value) {
        this.creditInterestDtls = value;
    }

    /**
     * Gets the value of the debitInterestDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DebitIntDtls }
     *     
     */
    public DebitIntDtls getDebitInterestDtls() {
        return debitInterestDtls;
    }

    /**
     * Sets the value of the debitInterestDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitIntDtls }
     *     
     */
    public void setDebitInterestDtls(DebitIntDtls value) {
        this.debitInterestDtls = value;
    }

    /**
     * Gets the value of the unusedOdIntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DebitIntDtls }
     *     
     */
    public DebitIntDtls getUnusedOdIntDtls() {
        return unusedOdIntDtls;
    }

    /**
     * Sets the value of the unusedOdIntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitIntDtls }
     *     
     */
    public void setUnusedOdIntDtls(DebitIntDtls value) {
        this.unusedOdIntDtls = value;
    }

    /**
     * Gets the value of the statementDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StatementDetails }
     *     
     */
    public StatementDetails getStatementDetails() {
        return statementDetails;
    }

    /**
     * Sets the value of the statementDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementDetails }
     *     
     */
    public void setStatementDetails(StatementDetails value) {
        this.statementDetails = value;
    }

    /**
     * Gets the value of the noticePenaltyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DepositPenaltyDtls }
     *     
     */
    public DepositPenaltyDtls getNoticePenaltyDtls() {
        return noticePenaltyDtls;
    }

    /**
     * Sets the value of the noticePenaltyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositPenaltyDtls }
     *     
     */
    public void setNoticePenaltyDtls(DepositPenaltyDtls value) {
        this.noticePenaltyDtls = value;
    }

    /**
     * Gets the value of the limitDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LimitDetails }
     *     
     */
    public LimitDetails getLimitDetails() {
        return limitDetails;
    }

    /**
     * Sets the value of the limitDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitDetails }
     *     
     */
    public void setLimitDetails(LimitDetails value) {
        this.limitDetails = value;
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
