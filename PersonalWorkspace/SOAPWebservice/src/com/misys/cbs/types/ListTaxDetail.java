
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listTaxDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listTaxDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.misys.com/cbs/types}taxDetails">
 *       &lt;sequence>
 *         &lt;element name="select" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listTaxDetail", propOrder = {
    "select"
})
public class ListTaxDetail
    extends TaxDetails
{

    @XmlElement(defaultValue = "false")
    protected boolean select;

    /**
     * Gets the value of the select property.
     * 
     */
    public boolean isSelect() {
        return select;
    }

    /**
     * Sets the value of the select property.
     * 
     */
    public void setSelect(boolean value) {
        this.select = value;
    }

}
