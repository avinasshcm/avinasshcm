
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listAccounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listAccounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listAccountDetails" type="{http://www.misys.com/cbs/types}listAccountDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listAccounts", propOrder = {
    "listAccountDetails"
})
public class ListAccounts {

    protected List<ListAccountDetails> listAccountDetails;

    /**
     * Gets the value of the listAccountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listAccountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListAccountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListAccountDetails }
     * 
     * 
     */
    public List<ListAccountDetails> getListAccountDetails() {
        if (listAccountDetails == null) {
            listAccountDetails = new ArrayList<ListAccountDetails>();
        }
        return this.listAccountDetails;
    }

}
