
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acctStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditNum" type="{http://www.misys.com/cbs/types}noOfItems"/>
 *         &lt;element name="debitNum" type="{http://www.misys.com/cbs/types}noOfItems"/>
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
@XmlType(name = "acctStatistics", propOrder = {
    "creditNum",
    "debitNum",
    "userExtension",
    "hostExtension"
})
public class AcctStatistics {

    protected int creditNum;
    protected int debitNum;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the creditNum property.
     * 
     */
    public int getCreditNum() {
        return creditNum;
    }

    /**
     * Sets the value of the creditNum property.
     * 
     */
    public void setCreditNum(int value) {
        this.creditNum = value;
    }

    /**
     * Gets the value of the debitNum property.
     * 
     */
    public int getDebitNum() {
        return debitNum;
    }

    /**
     * Sets the value of the debitNum property.
     * 
     */
    public void setDebitNum(int value) {
        this.debitNum = value;
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
