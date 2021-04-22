
package com.misys.cbs.msgs.v1r0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.misys.cbs.types.AcctTxntInput;
import com.misys.cbs.types.header.RqHeader;


/**
 * 
 * 				These are the attributes which form the CBS
 * 				Transaction Request message
 * 			
 * 
 * <p>Java class for readAccountTxnRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readAccountTxnRq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rqHeader" type="{http://www.misys.com/cbs/types/header}rqHeader"/>
 *         &lt;element name="acctTxntInput" type="{http://www.misys.com/cbs/types}acctTxntInput"/>
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
@XmlType(name = "readAccountTxnRq", propOrder = {
    "rqHeader",
    "acctTxntInput",
    "userExtension",
    "hostExtension"
})
public class ReadAccountTxnRq {

    @XmlElement(required = true)
    protected RqHeader rqHeader;
    @XmlElement(required = true)
    protected AcctTxntInput acctTxntInput;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the rqHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RqHeader }
     *     
     */
    public RqHeader getRqHeader() {
        return rqHeader;
    }

    /**
     * Sets the value of the rqHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RqHeader }
     *     
     */
    public void setRqHeader(RqHeader value) {
        this.rqHeader = value;
    }

    /**
     * Gets the value of the acctTxntInput property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTxntInput }
     *     
     */
    public AcctTxntInput getAcctTxntInput() {
        return acctTxntInput;
    }

    /**
     * Sets the value of the acctTxntInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTxntInput }
     *     
     */
    public void setAcctTxntInput(AcctTxntInput value) {
        this.acctTxntInput = value;
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
