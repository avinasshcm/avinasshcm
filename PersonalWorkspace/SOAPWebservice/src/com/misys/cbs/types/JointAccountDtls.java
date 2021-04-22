
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jointAccountDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jointAccountDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isJoint" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="listCustRelationshipDtls" type="{http://www.misys.com/cbs/types}listCustRelationshipDtl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jointAccountDtls", propOrder = {
    "isJoint",
    "listCustRelationshipDtls"
})
public class JointAccountDtls {

    @XmlElement(defaultValue = "false")
    protected boolean isJoint;
    @XmlElement(required = true)
    protected ListCustRelationshipDtl listCustRelationshipDtls;

    /**
     * Gets the value of the isJoint property.
     * 
     */
    public boolean isIsJoint() {
        return isJoint;
    }

    /**
     * Sets the value of the isJoint property.
     * 
     */
    public void setIsJoint(boolean value) {
        this.isJoint = value;
    }

    /**
     * Gets the value of the listCustRelationshipDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ListCustRelationshipDtl }
     *     
     */
    public ListCustRelationshipDtl getListCustRelationshipDtls() {
        return listCustRelationshipDtls;
    }

    /**
     * Sets the value of the listCustRelationshipDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCustRelationshipDtl }
     *     
     */
    public void setListCustRelationshipDtls(ListCustRelationshipDtl value) {
        this.listCustRelationshipDtls = value;
    }

}
