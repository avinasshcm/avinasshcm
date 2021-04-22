
package com.misys.cbs.msgs.v1r0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.misys.cbs.types.AcctTxntOutput;
import com.misys.cbs.types.header.RsHeader;


/**
 * 
 * 				These are the attributes which form the CBS Update
 * 				Transaction Response message
 * 			
 * 
 * <p>Java class for readAccountTxnRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readAccountTxnRs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsHeader" type="{http://www.misys.com/cbs/types/header}rsHeader"/>
 *         &lt;element name="txnDetails" type="{http://www.misys.com/cbs/types}acctTxntOutput"/>
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
@XmlType(name = "readAccountTxnRs", propOrder = {
    "rsHeader",
    "txnDetails",
    "userExtension",
    "hostExtension"
})
public class ReadAccountTxnRs {

    @XmlElement(required = true)
    protected RsHeader rsHeader;
    @XmlElement(required = true)
    protected AcctTxntOutput txnDetails;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the rsHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RsHeader }
     *     
     */
    public RsHeader getRsHeader() {
        return rsHeader;
    }

    /**
     * Sets the value of the rsHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsHeader }
     *     
     */
    public void setRsHeader(RsHeader value) {
        this.rsHeader = value;
    }

    /**
     * Gets the value of the txnDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTxntOutput }
     *     
     */
    public AcctTxntOutput getTxnDetails() {
        return txnDetails;
    }

    /**
     * Sets the value of the txnDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTxntOutput }
     *     
     */
    public void setTxnDetails(AcctTxntOutput value) {
        this.txnDetails = value;
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
