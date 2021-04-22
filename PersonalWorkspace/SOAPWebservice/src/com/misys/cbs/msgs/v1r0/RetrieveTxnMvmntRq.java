
package com.misys.cbs.msgs.v1r0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.misys.bankfusion.attributes.PagedQuery;
import com.misys.cbs.types.TxnMvmntInput;
import com.misys.cbs.types.header.RqHeader;


/**
 * 
 * 				These are the attributes which form the CBS
 * 				Transaction Request message
 * 			
 * 
 * <p>Java class for retrieveTxnMvmntRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveTxnMvmntRq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rqHeader" type="{http://www.misys.com/cbs/types/header}rqHeader"/>
 *         &lt;element name="pagedQuery" type="{http://www.misys.com/Bankfusion/Attributes}PagedQuery"/>
 *         &lt;element name="txnMovementInput" type="{http://www.misys.com/cbs/types}txnMvmntInput"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveTxnMvmntRq", propOrder = {
    "rqHeader",
    "pagedQuery",
    "txnMovementInput"
})
public class RetrieveTxnMvmntRq {

    @XmlElement(required = true)
    protected RqHeader rqHeader;
    @XmlElement(required = true)
    protected PagedQuery pagedQuery;
    @XmlElement(required = true)
    protected TxnMvmntInput txnMovementInput;

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
     * Gets the value of the pagedQuery property.
     * 
     * @return
     *     possible object is
     *     {@link PagedQuery }
     *     
     */
    public PagedQuery getPagedQuery() {
        return pagedQuery;
    }

    /**
     * Sets the value of the pagedQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedQuery }
     *     
     */
    public void setPagedQuery(PagedQuery value) {
        this.pagedQuery = value;
    }

    /**
     * Gets the value of the txnMovementInput property.
     * 
     * @return
     *     possible object is
     *     {@link TxnMvmntInput }
     *     
     */
    public TxnMvmntInput getTxnMovementInput() {
        return txnMovementInput;
    }

    /**
     * Sets the value of the txnMovementInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnMvmntInput }
     *     
     */
    public void setTxnMovementInput(TxnMvmntInput value) {
        this.txnMovementInput = value;
    }

}
