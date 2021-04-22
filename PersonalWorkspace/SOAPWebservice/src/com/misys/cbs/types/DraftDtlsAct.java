
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for draftDtlsAct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="draftDtlsAct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="depositBranch" type="{http://www.misys.com/cbs/types}branchCode" minOccurs="0"/>
 *         &lt;element name="depositDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="draftStatus" type="{http://www.misys.com/cbs/types}draftAction"/>
 *         &lt;element name="draftStatusReason" type="{http://www.misys.com/cbs/types}descriptionMedium" minOccurs="0"/>
 *         &lt;element name="stopDraftBranch" type="{http://www.misys.com/cbs/types}branchCode" minOccurs="0"/>
 *         &lt;element name="stopDraftReason" type="{http://www.misys.com/cbs/types}descriptionMedium" minOccurs="0"/>
 *         &lt;element name="cancelDraftBranch" type="{http://www.misys.com/cbs/types}branchCode" minOccurs="0"/>
 *         &lt;element name="cancelDraftReason" type="{http://www.misys.com/cbs/types}descriptionMedium" minOccurs="0"/>
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
@XmlType(name = "draftDtlsAct", propOrder = {
    "depositBranch",
    "depositDate",
    "draftStatus",
    "draftStatusReason",
    "stopDraftBranch",
    "stopDraftReason",
    "cancelDraftBranch",
    "cancelDraftReason",
    "userExtension",
    "hostExtension"
})
public class DraftDtlsAct {

    protected String depositBranch;
    @XmlElement(defaultValue = "1970-01-01T01:00:00.000")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depositDate;
    @XmlElement(required = true)
    protected DraftAction draftStatus;
    protected String draftStatusReason;
    protected String stopDraftBranch;
    protected String stopDraftReason;
    protected String cancelDraftBranch;
    protected String cancelDraftReason;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the depositBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositBranch() {
        return depositBranch;
    }

    /**
     * Sets the value of the depositBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositBranch(String value) {
        this.depositBranch = value;
    }

    /**
     * Gets the value of the depositDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositDate() {
        return depositDate;
    }

    /**
     * Sets the value of the depositDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositDate(XMLGregorianCalendar value) {
        this.depositDate = value;
    }

    /**
     * Gets the value of the draftStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DraftAction }
     *     
     */
    public DraftAction getDraftStatus() {
        return draftStatus;
    }

    /**
     * Sets the value of the draftStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DraftAction }
     *     
     */
    public void setDraftStatus(DraftAction value) {
        this.draftStatus = value;
    }

    /**
     * Gets the value of the draftStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraftStatusReason() {
        return draftStatusReason;
    }

    /**
     * Sets the value of the draftStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraftStatusReason(String value) {
        this.draftStatusReason = value;
    }

    /**
     * Gets the value of the stopDraftBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopDraftBranch() {
        return stopDraftBranch;
    }

    /**
     * Sets the value of the stopDraftBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopDraftBranch(String value) {
        this.stopDraftBranch = value;
    }

    /**
     * Gets the value of the stopDraftReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopDraftReason() {
        return stopDraftReason;
    }

    /**
     * Sets the value of the stopDraftReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopDraftReason(String value) {
        this.stopDraftReason = value;
    }

    /**
     * Gets the value of the cancelDraftBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDraftBranch() {
        return cancelDraftBranch;
    }

    /**
     * Sets the value of the cancelDraftBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDraftBranch(String value) {
        this.cancelDraftBranch = value;
    }

    /**
     * Gets the value of the cancelDraftReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDraftReason() {
        return cancelDraftReason;
    }

    /**
     * Sets the value of the cancelDraftReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDraftReason(String value) {
        this.cancelDraftReason = value;
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
