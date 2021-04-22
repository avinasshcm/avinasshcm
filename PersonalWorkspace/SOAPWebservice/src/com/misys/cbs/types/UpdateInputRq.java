
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateInputRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateInputRq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="draftBankChqKeys" type="{http://www.misys.com/cbs/types}draftBankChqKeys"/>
 *         &lt;element name="draftDtlsAct" type="{http://www.misys.com/cbs/types}draftDtlsAct"/>
 *         &lt;element name="userExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="hostExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateInputRq", propOrder = {
    "draftBankChqKeys",
    "draftDtlsAct",
    "userExtension",
    "hostExtension"
})
public class UpdateInputRq {

    @XmlElement(required = true)
    protected DraftBankChqKeys draftBankChqKeys;
    @XmlElement(required = true)
    protected DraftDtlsAct draftDtlsAct;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the draftBankChqKeys property.
     * 
     * @return
     *     possible object is
     *     {@link DraftBankChqKeys }
     *     
     */
    public DraftBankChqKeys getDraftBankChqKeys() {
        return draftBankChqKeys;
    }

    /**
     * Sets the value of the draftBankChqKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link DraftBankChqKeys }
     *     
     */
    public void setDraftBankChqKeys(DraftBankChqKeys value) {
        this.draftBankChqKeys = value;
    }

    /**
     * Gets the value of the draftDtlsAct property.
     * 
     * @return
     *     possible object is
     *     {@link DraftDtlsAct }
     *     
     */
    public DraftDtlsAct getDraftDtlsAct() {
        return draftDtlsAct;
    }

    /**
     * Sets the value of the draftDtlsAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DraftDtlsAct }
     *     
     */
    public void setDraftDtlsAct(DraftDtlsAct value) {
        this.draftDtlsAct = value;
    }

    /**
     * Gets the value of the userExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUserExtension() {
        return userExtension;
    }

    /**
     * Sets the value of the userExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUserExtension(Object value) {
        this.userExtension = value;
    }

    /**
     * Gets the value of the hostExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHostExtension() {
        return hostExtension;
    }

    /**
     * Sets the value of the hostExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHostExtension(Object value) {
        this.hostExtension = value;
    }

}
