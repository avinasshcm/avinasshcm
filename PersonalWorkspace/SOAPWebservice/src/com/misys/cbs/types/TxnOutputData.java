
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txnOutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="txnOutputData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hostTransactionRef" type="{http://www.misys.com/cbs/types}hostTxnRef"/>
 *         &lt;element name="isBatchValid" type="{http://www.misys.com/cbs/types}BOOLEAN" minOccurs="0"/>
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
@XmlType(name = "txnOutputData", propOrder = {
    "hostTransactionRef",
    "isBatchValid",
    "userExtension",
    "hostExtension"
})
public class TxnOutputData {

    @XmlElement(required = true)
    protected String hostTransactionRef;
    protected Boolean isBatchValid;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the hostTransactionRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTransactionRef() {
        return hostTransactionRef;
    }

    /**
     * Sets the value of the hostTransactionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTransactionRef(String value) {
        this.hostTransactionRef = value;
    }

    /**
     * Gets the value of the isBatchValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBatchValid() {
        return isBatchValid;
    }

    /**
     * Sets the value of the isBatchValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBatchValid(Boolean value) {
        this.isBatchValid = value;
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
