
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txnTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="txnTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="debitTxnCode" type="{http://www.misys.com/cbs/types}hostTransactionType" minOccurs="0"/>
 *         &lt;element name="creditTxnCode" type="{http://www.misys.com/cbs/types}hostTransactionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txnTypes", propOrder = {
    "debitTxnCode",
    "creditTxnCode"
})
public class TxnTypes {

    protected String debitTxnCode;
    protected String creditTxnCode;

    /**
     * Gets the value of the debitTxnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitTxnCode() {
        return debitTxnCode;
    }

    /**
     * Sets the value of the debitTxnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitTxnCode(String value) {
        this.debitTxnCode = value;
    }

    /**
     * Gets the value of the creditTxnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditTxnCode() {
        return creditTxnCode;
    }

    /**
     * Sets the value of the creditTxnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditTxnCode(String value) {
        this.creditTxnCode = value;
    }

}
