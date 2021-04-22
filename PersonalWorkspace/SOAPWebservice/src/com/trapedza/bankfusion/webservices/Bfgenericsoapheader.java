
package com.trapedza.bankfusion.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.misys.bankfusion.attributes.BFHeader;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://webservices.bankfusion.trapedza.com}authentication" minOccurs="0"/>
 *         &lt;element name="BFHeader" type="{http://www.misys.com/bankfusion/attributes}BFHeader"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authentication",
    "bfHeader"
})
@XmlRootElement(name = "bfgenericsoapheader")
public class Bfgenericsoapheader {

    protected Authentication authentication;
    @XmlElement(name = "BFHeader", required = true)
    protected BFHeader bfHeader;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuthentication(Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the bfHeader property.
     * 
     * @return
     *     possible object is
     *     {@link BFHeader }
     *     
     */
    public BFHeader getBFHeader() {
        return bfHeader;
    }

    /**
     * Sets the value of the bfHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link BFHeader }
     *     
     */
    public void setBFHeader(BFHeader value) {
        this.bfHeader = value;
    }

}
