
package com.trapedza.bankfusion.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.misys.cbs.msgs.v1r0.RetrieveAcctMvmntRq;


/**
 * <p>Java class for UB_R_CB_ACC_RetrieveAccountMovements_SRVRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UB_R_CB_ACC_RetrieveAccountMovements_SRVRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retrieveAcctMvmntRq" type="{http://www.misys.com/cbs/msgs/v1r0}retrieveAcctMvmntRq"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="UB_R_CB_ACC_RetrieveAccountMovements_SRVRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UB_R_CB_ACC_RetrieveAccountMovements_SRVRequestType", propOrder = {
    "retrieveAcctMvmntRq"
})
public class UBRCBACCRetrieveAccountMovementsSRVRequestType {

    @XmlElement(required = true)
    protected RetrieveAcctMvmntRq retrieveAcctMvmntRq;

    /**
     * Gets the value of the retrieveAcctMvmntRq property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveAcctMvmntRq }
     *     
     */
    public RetrieveAcctMvmntRq getRetrieveAcctMvmntRq() {
        return retrieveAcctMvmntRq;
    }

    /**
     * Sets the value of the retrieveAcctMvmntRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveAcctMvmntRq }
     *     
     */
    public void setRetrieveAcctMvmntRq(RetrieveAcctMvmntRq value) {
        this.retrieveAcctMvmntRq = value;
    }

}
