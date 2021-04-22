
package com.misys.cbs.msgs.v1r0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.misys.cbs.types.SwiftDetailsInput;
import com.misys.cbs.types.header.RqHeader;


/**
 * 
 * 				These are the attributes which form the CBS
 * 				Transaction Request message
 * 			
 * 
 * <p>Java class for readSwiftDetailsRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readSwiftDetailsRq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rqHeader" type="{http://www.misys.com/cbs/types/header}rqHeader"/>
 *         &lt;element name="swiftDetailsInput" type="{http://www.misys.com/cbs/types}swiftDetailsInput"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readSwiftDetailsRq", propOrder = {
    "rqHeader",
    "swiftDetailsInput"
})
public class ReadSwiftDetailsRq {

    @XmlElement(required = true)
    protected RqHeader rqHeader;
    @XmlElement(required = true)
    protected SwiftDetailsInput swiftDetailsInput;

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
     * Gets the value of the swiftDetailsInput property.
     * 
     * @return
     *     possible object is
     *     {@link SwiftDetailsInput }
     *     
     */
    public SwiftDetailsInput getSwiftDetailsInput() {
        return swiftDetailsInput;
    }

    /**
     * Sets the value of the swiftDetailsInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwiftDetailsInput }
     *     
     */
    public void setSwiftDetailsInput(SwiftDetailsInput value) {
        this.swiftDetailsInput = value;
    }

}
