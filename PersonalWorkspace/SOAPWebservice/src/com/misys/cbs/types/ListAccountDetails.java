
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listAccountDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listAccountDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="select" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accountInfo" type="{http://www.misys.com/cbs/types}accountInfo"/>
 *         &lt;element name="accStatus" type="{http://www.misys.com/cbs/types}acctStatus"/>
 *         &lt;element name="relationshipManager" type="{http://www.misys.com/cbs/types}userId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listAccountDetails", propOrder = {
    "select",
    "accountInfo",
    "accStatus",
    "relationshipManager"
})
public class ListAccountDetails {

    @XmlElement(defaultValue = "false")
    protected boolean select;
    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    @XmlElement(required = true)
    protected String accStatus;
    protected String relationshipManager;

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
     * Gets the value of the accStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccStatus() {
        return accStatus;
    }

    /**
     * Sets the value of the accStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccStatus(String value) {
        this.accStatus = value;
    }

    /**
     * Gets the value of the relationshipManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipManager() {
        return relationshipManager;
    }

    /**
     * Sets the value of the relationshipManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipManager(String value) {
        this.relationshipManager = value;
    }

}
