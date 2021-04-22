
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listMandateDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listMandateDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mandateDtls" type="{http://www.misys.com/cbs/types}mandateDtls" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listMandateDtls", propOrder = {
    "mandateDtls"
})
public class ListMandateDtls {

    protected List<MandateDtls> mandateDtls;

    /**
     * Gets the value of the mandateDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mandateDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMandateDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MandateDtls }
     * 
     * 
     */
    public List<MandateDtls> getMandateDtls() {
        if (mandateDtls == null) {
            mandateDtls = new ArrayList<MandateDtls>();
        }
        return this.mandateDtls;
    }

}
