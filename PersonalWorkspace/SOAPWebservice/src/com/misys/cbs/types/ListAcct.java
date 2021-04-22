
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listAcct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listAcct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listAccountDtls" type="{http://www.misys.com/cbs/types}listAccountDtls" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listAcct", propOrder = {
    "listAccountDtls"
})
public class ListAcct {

    protected List<ListAccountDtls> listAccountDtls;

    /**
     * Gets the value of the listAccountDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listAccountDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListAccountDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListAccountDtls }
     * 
     * 
     */
    public List<ListAccountDtls> getListAccountDtls() {
        if (listAccountDtls == null) {
            listAccountDtls = new ArrayList<ListAccountDtls>();
        }
        return this.listAccountDtls;
    }

}
