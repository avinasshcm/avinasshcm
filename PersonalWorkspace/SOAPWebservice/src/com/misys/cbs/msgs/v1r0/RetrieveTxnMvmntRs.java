
package com.misys.cbs.msgs.v1r0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.misys.bankfusion.attributes.PagedQuery;
import com.misys.cbs.types.TxnMovementsList;
import com.misys.cbs.types.header.RsHeader;


/**
 * 
 * 				These are the attributes which form the CBS Update
 * 				Transaction Response message
 * 			
 * 
 * <p>Java class for retrieveTxnMvmntRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveTxnMvmntRs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsHeader" type="{http://www.misys.com/cbs/types/header}rsHeader"/>
 *         &lt;element name="pagingInfo" type="{http://www.misys.com/Bankfusion/Attributes}PagedQuery"/>
 *         &lt;element name="txnMovementsList" type="{http://www.misys.com/cbs/types}txnMovementsList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveTxnMvmntRs", propOrder = {
    "rsHeader",
    "pagingInfo",
    "txnMovementsList"
})
public class RetrieveTxnMvmntRs {

    @XmlElement(required = true)
    protected RsHeader rsHeader;
    @XmlElement(required = true)
    protected PagedQuery pagingInfo;
    @XmlElement(required = true)
    protected TxnMovementsList txnMovementsList;

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
     * Gets the value of the pagingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PagedQuery }
     *     
     */
    public PagedQuery getPagingInfo() {
        return pagingInfo;
    }

    /**
     * Sets the value of the pagingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedQuery }
     *     
     */
    public void setPagingInfo(PagedQuery value) {
        this.pagingInfo = value;
    }

    /**
     * Gets the value of the txnMovementsList property.
     * 
     * @return
     *     possible object is
     *     {@link TxnMovementsList }
     *     
     */
    public TxnMovementsList getTxnMovementsList() {
        return txnMovementsList;
    }

    /**
     * Sets the value of the txnMovementsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnMovementsList }
     *     
     */
    public void setTxnMovementsList(TxnMovementsList value) {
        this.txnMovementsList = value;
    }

}
