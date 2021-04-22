
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listAccountDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listAccountDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="select" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="acctInfo" type="{http://www.misys.com/cbs/types}acctInfo"/>
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
@XmlType(name = "listAccountDtls", propOrder = {
    "select",
    "acctInfo",
    "accStatus",
    "relationshipManager"
})
public class ListAccountDtls {

    @XmlElement(defaultValue = "false")
    protected boolean select;
    @XmlElement(required = true)
    protected AcctInfo acctInfo;
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
     * Gets the value of the acctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AcctInfo }
     *     
     */
    public AcctInfo getAcctInfo() {
        return acctInfo;
    }

    /**
     * Sets the value of the acctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctInfo }
     *     
     */
    public void setAcctInfo(AcctInfo value) {
        this.acctInfo = value;
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
