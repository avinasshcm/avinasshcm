
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listMandateDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listMandateDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountMandateDtls" type="{http://www.misys.com/cbs/types}accountMandateDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listMandateDetails", propOrder = {
    "accountMandateDtls"
})
public class ListMandateDetails {

    protected List<AccountMandateDetails> accountMandateDtls;

    /**
     * Gets the value of the accountMandateDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountMandateDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountMandateDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountMandateDetails }
     * 
     * 
     */
    public List<AccountMandateDetails> getAccountMandateDtls() {
        if (accountMandateDtls == null) {
            accountMandateDtls = new ArrayList<AccountMandateDetails>();
        }
        return this.accountMandateDtls;
    }

}
