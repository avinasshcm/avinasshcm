
package com.trapedza.bankfusion.webservices.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loginResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loginResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorResponse" type="{http://security.webservices.bankfusion.trapedza.com}ErrorResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginResponseType", propOrder = {
    "_return",
    "errorResponse"
})
public class LoginResponseType {

    @XmlElement(name = "return")
    protected String _return;
    @XmlElement(name = "ErrorResponse")
    protected ErrorResponse errorResponse;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturn(String value) {
        this._return = value;
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
