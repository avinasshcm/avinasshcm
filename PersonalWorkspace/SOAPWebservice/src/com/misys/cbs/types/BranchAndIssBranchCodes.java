
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for branchAndIssBranchCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="branchAndIssBranchCodes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="branchCode" type="{http://www.misys.com/cbs/types}issuingBankBranchCode"/>
 *         &lt;element name="branchSortCode" type="{http://www.misys.com/cbs/types}branchSortCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "branchAndIssBranchCodes", propOrder = {
    "branchCode",
    "branchSortCode"
})
@XmlSeeAlso({
    BranchAndIssBranchCodeDetails.class
})
public class BranchAndIssBranchCodes {

    @XmlElement(required = true)
    protected String branchCode;
    @XmlElement(required = true)
    protected String branchSortCode;

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the branchSortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchSortCode() {
        return branchSortCode;
    }

    /**
     * Sets the value of the branchSortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchSortCode(String value) {
        this.branchSortCode = value;
    }

}
