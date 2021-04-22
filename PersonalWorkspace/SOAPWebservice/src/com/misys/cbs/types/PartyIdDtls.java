
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyIdDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyIdDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyIdDtl" type="{http://www.misys.com/cbs/types}partyIdDtl" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyIdDtls", propOrder = {
    "partyIdDtl"
})
public class PartyIdDtls {

    protected List<PartyIdDtl> partyIdDtl;

    /**
     * Gets the value of the partyIdDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyIdDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyIdDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdDtl }
     * 
     * 
     */
    public List<PartyIdDtl> getPartyIdDtl() {
        if (partyIdDtl == null) {
            partyIdDtl = new ArrayList<PartyIdDtl>();
        }
        return this.partyIdDtl;
    }

}
