
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listTaxDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listTaxDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listTaxDetail" type="{http://www.misys.com/cbs/types}listTaxDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listTaxDetails", propOrder = {
    "listTaxDetail"
})
public class ListTaxDetails {

    protected List<ListTaxDetail> listTaxDetail;

    /**
     * Gets the value of the listTaxDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listTaxDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListTaxDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListTaxDetail }
     * 
     * 
     */
    public List<ListTaxDetail> getListTaxDetail() {
        if (listTaxDetail == null) {
            listTaxDetail = new ArrayList<ListTaxDetail>();
        }
        return this.listTaxDetail;
    }

}
