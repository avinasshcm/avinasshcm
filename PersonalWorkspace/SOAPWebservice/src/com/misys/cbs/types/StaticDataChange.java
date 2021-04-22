
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for staticDataChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="staticDataChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionType" type="{http://www.misys.com/cbs/types}actionType" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.misys.com/cbs/types}businessKeyName" minOccurs="0"/>
 *         &lt;element name="attributeChange" type="{http://www.misys.com/cbs/types}attributeChange" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "staticDataChange", propOrder = {
    "actionType",
    "key",
    "attributeChange"
})
public class StaticDataChange {

    protected String actionType;
    protected String key;
    @XmlElement(required = true)
    protected List<AttributeChange> attributeChange;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the attributeChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeChange }
     * 
     * 
     */
    public List<AttributeChange> getAttributeChange() {
        if (attributeChange == null) {
            attributeChange = new ArrayList<AttributeChange>();
        }
        return this.attributeChange;
    }

}
