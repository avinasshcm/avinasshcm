
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountAuditDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountAuditDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditLimit" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="limitType" type="{http://www.misys.com/cbs/types}limitTypeCode" minOccurs="0"/>
 *         &lt;element name="isJoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inputUser" type="{http://www.misys.com/cbs/types}userId" minOccurs="0"/>
 *         &lt;element name="authoriser" type="{http://www.misys.com/cbs/types}userId" minOccurs="0"/>
 *         &lt;element name="acctStatus" type="{http://www.misys.com/cbs/types}acctStatus" minOccurs="0"/>
 *         &lt;element name="acctStatistics" type="{http://www.misys.com/cbs/types}acctStatistics" minOccurs="0"/>
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
@XmlType(name = "accountAuditDtls", propOrder = {
    "creditLimit",
    "limitType",
    "isJoint",
    "inputUser",
    "authoriser",
    "acctStatus",
    "acctStatistics",
    "userExtension",
    "hostExtension"
})
public class AccountAuditDtls {

    protected BigDecimal creditLimit;
    protected String limitType;
    protected Boolean isJoint;
    protected String inputUser;
    protected String authoriser;
    protected String acctStatus;
    protected AcctStatistics acctStatistics;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLimit(BigDecimal value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitType(String value) {
        this.limitType = value;
    }

    /**
     * Gets the value of the isJoint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsJoint() {
        return isJoint;
    }

    /**
     * Sets the value of the isJoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsJoint(Boolean value) {
        this.isJoint = value;
    }

    /**
     * Gets the value of the inputUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputUser() {
        return inputUser;
    }

    /**
     * Sets the value of the inputUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputUser(String value) {
        this.inputUser = value;
    }

    /**
     * Gets the value of the authoriser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthoriser() {
        return authoriser;
    }

    /**
     * Sets the value of the authoriser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthoriser(String value) {
        this.authoriser = value;
    }

    /**
     * Gets the value of the acctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctStatus() {
        return acctStatus;
    }

    /**
     * Sets the value of the acctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctStatus(String value) {
        this.acctStatus = value;
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
