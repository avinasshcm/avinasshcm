
package com.misys.cbs.msgs.v1r0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.misys.bankfusion.attributes.PagedQuery;
import com.misys.cbs.types.AcctMovementInput;
import com.misys.cbs.types.header.RqHeader;


/**
 * 
 * 				The following attributes are sent in the CBS list
 * 				account movement Request message
 * 			
 * 
 * <p>Java class for retrieveAcctMvmntRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveAcctMvmntRq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rqHeader" type="{http://www.misys.com/cbs/types/header}rqHeader"/>
 *         &lt;element name="pagedQuery" type="{http://www.misys.com/Bankfusion/Attributes}PagedQuery"/>
 *         &lt;element name="accountMovementInput" type="{http://www.misys.com/cbs/types}acctMovementInput"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveAcctMvmntRq", propOrder = {
    "rqHeader",
    "pagedQuery",
    "accountMovementInput"
})
public class RetrieveAcctMvmntRq {

    @XmlElement(required = true)
    protected RqHeader rqHeader;
    @XmlElement(required = true)
    protected PagedQuery pagedQuery;
    @XmlElement(required = true)
    protected AcctMovementInput accountMovementInput;

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
     * Gets the value of the accountMovementInput property.
     * 
     * @return
     *     possible object is
     *     {@link AcctMovementInput }
     *     
     */
    public AcctMovementInput getAccountMovementInput() {
        return accountMovementInput;
    }

    /**
     * Sets the value of the accountMovementInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctMovementInput }
     *     
     */
    public void setAccountMovementInput(AcctMovementInput value) {
        this.accountMovementInput = value;
    }

}
