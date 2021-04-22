
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listCustRelationshipDtl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listCustRelationshipDtl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custRelationshipDtl" type="{http://www.misys.com/cbs/types}custRelationshipDtl" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCustRelationshipDtl", propOrder = {
    "custRelationshipDtl"
})
public class ListCustRelationshipDtl {

    protected List<CustRelationshipDtl> custRelationshipDtl;

    /**
     * Gets the value of the custRelationshipDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custRelationshipDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustRelationshipDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustRelationshipDtl }
     * 
     * 
     */
    public List<CustRelationshipDtl> getCustRelationshipDtl() {
        if (custRelationshipDtl == null) {
            custRelationshipDtl = new ArrayList<CustRelationshipDtl>();
        }
        return this.custRelationshipDtl;
    }

}
