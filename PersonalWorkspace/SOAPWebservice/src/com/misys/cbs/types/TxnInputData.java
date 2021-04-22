
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txnInputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="txnInputData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tellerTxnReference" type="{http://www.misys.com/cbs/types}tellerTxnRef"/>
 *         &lt;element name="tellerTxnType" type="{http://www.misys.com/cbs/types}tellerTxnType"/>
 *         &lt;element name="hostTxnCode" type="{http://www.misys.com/cbs/types}hostTxnCode"/>
 *         &lt;element name="txnMode" type="{http://www.misys.com/cbs/types}transactionMode"/>
 *         &lt;element name="compensate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="postChargeSep" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="originalTxnRef" type="{http://www.misys.com/cbs/types}tellerTxnRef" minOccurs="0"/>
 *         &lt;element name="originalHostTxnRef" type="{http://www.misys.com/cbs/types}hostTxnRef" minOccurs="0"/>
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
@XmlType(name = "txnInputData", propOrder = {
    "tellerTxnReference",
    "tellerTxnType",
    "hostTxnCode",
    "txnMode",
    "compensate",
    "postChargeSep",
    "originalTxnRef",
    "originalHostTxnRef",
    "userExtension",
    "hostExtension"
})
public class TxnInputData {

    @XmlElement(required = true)
    protected String tellerTxnReference;
    @XmlElement(required = true)
    protected String tellerTxnType;
    @XmlElement(required = true)
    protected String hostTxnCode;
    @XmlElement(required = true)
    protected TransactionMode txnMode;
    protected boolean compensate;
    protected boolean postChargeSep;
    protected String originalTxnRef;
    protected String originalHostTxnRef;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the tellerTxnReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellerTxnReference() {
        return tellerTxnReference;
    }

    /**
     * Sets the value of the tellerTxnReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellerTxnReference(String value) {
        this.tellerTxnReference = value;
    }

    /**
     * Gets the value of the tellerTxnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellerTxnType() {
        return tellerTxnType;
    }

    /**
     * Sets the value of the tellerTxnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellerTxnType(String value) {
        this.tellerTxnType = value;
    }

    /**
     * Gets the value of the hostTxnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTxnCode() {
        return hostTxnCode;
    }

    /**
     * Sets the value of the hostTxnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTxnCode(String value) {
        this.hostTxnCode = value;
    }

    /**
     * Gets the value of the txnMode property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionMode }
     *     
     */
    public TransactionMode getTxnMode() {
        return txnMode;
    }

    /**
     * Sets the value of the txnMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionMode }
     *     
     */
    public void setTxnMode(TransactionMode value) {
        this.txnMode = value;
    }

    /**
     * Gets the value of the compensate property.
     * 
     */
    public boolean isCompensate() {
        return compensate;
    }

    /**
     * Sets the value of the compensate property.
     * 
     */
    public void setCompensate(boolean value) {
        this.compensate = value;
    }

    /**
     * Gets the value of the postChargeSep property.
     * 
     */
    public boolean isPostChargeSep() {
        return postChargeSep;
    }

    /**
     * Sets the value of the postChargeSep property.
     * 
     */
    public void setPostChargeSep(boolean value) {
        this.postChargeSep = value;
    }

    /**
     * Gets the value of the originalTxnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTxnRef() {
        return originalTxnRef;
    }

    /**
     * Sets the value of the originalTxnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTxnRef(String value) {
        this.originalTxnRef = value;
    }

    /**
     * Gets the value of the originalHostTxnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalHostTxnRef() {
        return originalHostTxnRef;
    }

    /**
     * Sets the value of the originalHostTxnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalHostTxnRef(String value) {
        this.originalHostTxnRef = value;
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
