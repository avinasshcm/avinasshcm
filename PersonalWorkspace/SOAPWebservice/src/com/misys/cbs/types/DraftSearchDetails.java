
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for draftSearchDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="draftSearchDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="draftSearchDetail" type="{http://www.misys.com/cbs/types}draftSearchDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "draftSearchDetails", propOrder = {
    "draftSearchDetail"
})
public class DraftSearchDetails {

    protected List<DraftSearchDetail> draftSearchDetail;

    /**
     * Gets the value of the draftSearchDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the draftSearchDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDraftSearchDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DraftSearchDetail }
     * 
     * 
     */
    public List<DraftSearchDetail> getDraftSearchDetail() {
        if (draftSearchDetail == null) {
            draftSearchDetail = new ArrayList<DraftSearchDetail>();
        }
        return this.draftSearchDetail;
    }

}
