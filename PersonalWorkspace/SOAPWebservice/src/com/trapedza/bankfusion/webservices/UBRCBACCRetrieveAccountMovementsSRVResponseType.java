
package com.trapedza.bankfusion.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.misys.bf.attributes.ErrorResponse;
import com.misys.cbs.msgs.v1r0.RetrieveAcctMvmntRs;


/**
 * <p>Java class for UB_R_CB_ACC_RetrieveAccountMovements_SRVResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UB_R_CB_ACC_RetrieveAccountMovements_SRVResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retrieveAcctMvmntRs" type="{http://www.misys.com/cbs/msgs/v1r0}retrieveAcctMvmntRs"/>
 *         &lt;element name="ErrorResponse" type="{http://www.misys.com/bf/attributes}ErrorResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UB_R_CB_ACC_RetrieveAccountMovements_SRVResponseType", propOrder = {
    "retrieveAcctMvmntRs",
    "errorResponse"
})
public class UBRCBACCRetrieveAccountMovementsSRVResponseType {

    @XmlElement(required = true)
    protected RetrieveAcctMvmntRs retrieveAcctMvmntRs;
    @XmlElement(name = "ErrorResponse", required = true)
    protected ErrorResponse errorResponse;

    /**
     * Gets the value of the retrieveAcctMvmntRs property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveAcctMvmntRs }
     *     
     */
    public RetrieveAcctMvmntRs getRetrieveAcctMvmntRs() {
        return retrieveAcctMvmntRs;
    }

    /**
     * Sets the value of the retrieveAcctMvmntRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveAcctMvmntRs }
     *     
     */
    public void setRetrieveAcctMvmntRs(RetrieveAcctMvmntRs value) {
        this.retrieveAcctMvmntRs = value;
    }

    /**
     * Gets the value of the errorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponse }
     *     
     */
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    /**
     * Sets the value of the errorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponse }
     *     
     */
    public void setErrorResponse(ErrorResponse value) {
        this.errorResponse = value;
    }

}
