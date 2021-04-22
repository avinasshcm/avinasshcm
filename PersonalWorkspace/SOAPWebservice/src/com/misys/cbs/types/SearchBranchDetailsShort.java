
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchBranchDetailsShort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchBranchDetailsShort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="branchDetailsShort" type="{http://www.misys.com/cbs/types}branchDetailsShort" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchBranchDetailsShort", propOrder = {
    "branchDetailsShort"
})
public class SearchBranchDetailsShort {

    protected List<BranchDetailsShort> branchDetailsShort;

    /**
     * Gets the value of the branchDetailsShort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchDetailsShort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchDetailsShort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchDetailsShort }
     * 
     * 
     */
    public List<BranchDetailsShort> getBranchDetailsShort() {
        if (branchDetailsShort == null) {
            branchDetailsShort = new ArrayList<BranchDetailsShort>();
        }
        return this.branchDetailsShort;
    }

}
