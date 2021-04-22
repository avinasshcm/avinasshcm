
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchAcctOpeningDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchAcctOpeningDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listSearchAcctOpening" type="{http://www.misys.com/cbs/types}listSearchAcctOpening" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchAcctOpeningDetails", propOrder = {
    "listSearchAcctOpening"
})
public class SearchAcctOpeningDetails {

    protected List<ListSearchAcctOpening> listSearchAcctOpening;

    /**
     * Gets the value of the listSearchAcctOpening property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listSearchAcctOpening property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListSearchAcctOpening().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListSearchAcctOpening }
     * 
     * 
     */
    public List<ListSearchAcctOpening> getListSearchAcctOpening() {
        if (listSearchAcctOpening == null) {
            listSearchAcctOpening = new ArrayList<ListSearchAcctOpening>();
        }
        return this.listSearchAcctOpening;
    }

}
