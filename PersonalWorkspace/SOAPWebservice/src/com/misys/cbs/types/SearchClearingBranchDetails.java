
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchClearingBranchDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchClearingBranchDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clearingBranchDetails" type="{http://www.misys.com/cbs/types}clearingBranchDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchClearingBranchDetails", propOrder = {
    "clearingBranchDetails"
})
public class SearchClearingBranchDetails {

    protected List<ClearingBranchDetails> clearingBranchDetails;

    /**
     * Gets the value of the clearingBranchDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clearingBranchDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearingBranchDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearingBranchDetails }
     * 
     * 
     */
    public List<ClearingBranchDetails> getClearingBranchDetails() {
        if (clearingBranchDetails == null) {
            clearingBranchDetails = new ArrayList<ClearingBranchDetails>();
        }
        return this.clearingBranchDetails;
    }

}
