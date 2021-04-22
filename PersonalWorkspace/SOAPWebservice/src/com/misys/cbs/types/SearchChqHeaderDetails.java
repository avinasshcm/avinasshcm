
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchChqHeaderDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchChqHeaderDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchChqHeaderDetail" type="{http://www.misys.com/cbs/types}searchChqHeaderDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchChqHeaderDetails", propOrder = {
    "searchChqHeaderDetail"
})
public class SearchChqHeaderDetails {

    protected List<SearchChqHeaderDetail> searchChqHeaderDetail;

    /**
     * Gets the value of the searchChqHeaderDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchChqHeaderDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchChqHeaderDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchChqHeaderDetail }
     * 
     * 
     */
    public List<SearchChqHeaderDetail> getSearchChqHeaderDetail() {
        if (searchChqHeaderDetail == null) {
            searchChqHeaderDetail = new ArrayList<SearchChqHeaderDetail>();
        }
        return this.searchChqHeaderDetail;
    }

}
