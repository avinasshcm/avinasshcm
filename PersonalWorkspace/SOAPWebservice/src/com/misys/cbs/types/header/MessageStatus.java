
package com.misys.cbs.types.header;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messageStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overallStatus" type="{http://www.misys.com/cbs/types/header}status"/>
 *         &lt;element name="codes" type="{http://www.misys.com/cbs/types/header}subCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subStatus" type="{http://www.misys.com/cbs/types}STRING" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageStatus", propOrder = {
    "overallStatus",
    "codes",
    "subStatus"
})
public class MessageStatus {

    @XmlElement(required = true)
    protected Status overallStatus;
    protected List<SubCode> codes;
    protected String subStatus;

    /**
     * Gets the value of the overallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getOverallStatus() {
        return overallStatus;
    }

    /**
     * Sets the value of the overallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setOverallStatus(Status value) {
        this.overallStatus = value;
    }

    /**
     * Gets the value of the codes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubCode }
     * 
     * 
     */
    public List<SubCode> getCodes() {
        if (codes == null) {
            codes = new ArrayList<SubCode>();
        }
        return this.codes;
    }

    /**
     * Gets the value of the subStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubStatus() {
        return subStatus;
    }

    /**
     * Sets the value of the subStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubStatus(String value) {
        this.subStatus = value;
    }

}
