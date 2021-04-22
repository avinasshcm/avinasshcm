
package com.misys.cbs.msgs.v1r0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.misys.cbs.types.SwiftDetailsOutput;
import com.misys.cbs.types.header.RsHeader;


/**
 * 
 * 				These are the attributes which form the CBS Update
 * 				Transaction Response message
 * 			
 * 
 * <p>Java class for readSwiftDetailsRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readSwiftDetailsRs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsHeader" type="{http://www.misys.com/cbs/types/header}rsHeader"/>
 *         &lt;element name="swiftDetailsOutput" type="{http://www.misys.com/cbs/types}swiftDetailsOutput"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readSwiftDetailsRs", propOrder = {
    "rsHeader",
    "swiftDetailsOutput"
})
public class ReadSwiftDetailsRs {

    @XmlElement(required = true)
    protected RsHeader rsHeader;
    @XmlElement(required = true)
    protected SwiftDetailsOutput swiftDetailsOutput;

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
     * Gets the value of the swiftDetailsOutput property.
     * 
     * @return
     *     possible object is
     *     {@link SwiftDetailsOutput }
     *     
     */
    public SwiftDetailsOutput getSwiftDetailsOutput() {
        return swiftDetailsOutput;
    }

    /**
     * Sets the value of the swiftDetailsOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwiftDetailsOutput }
     *     
     */
    public void setSwiftDetailsOutput(SwiftDetailsOutput value) {
        this.swiftDetailsOutput = value;
    }

}
