
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txnMovementsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="txnMovementsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="txnMvmntData" type="{http://www.misys.com/cbs/types}txnMvmntData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txnMovementsList", propOrder = {
    "txnMvmntData"
})
public class TxnMovementsList {

    protected List<TxnMvmntData> txnMvmntData;

    /**
     * Gets the value of the txnMvmntData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txnMvmntData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxnMvmntData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TxnMvmntData }
     * 
     * 
     */
    public List<TxnMvmntData> getTxnMvmntData() {
        if (txnMvmntData == null) {
            txnMvmntData = new ArrayList<TxnMvmntData>();
        }
        return this.txnMvmntData;
    }

}
