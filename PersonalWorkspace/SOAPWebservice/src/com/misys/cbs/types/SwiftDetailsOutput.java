
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for swiftDetailsOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="swiftDetailsOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="swiftMessageDetails" type="{http://www.misys.com/cbs/types}swiftMessageDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="swiftDetails" type="{http://www.misys.com/cbs/types}swiftDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dealReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recieverAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "swiftDetailsOutput", propOrder = {
    "swiftMessageDetails",
    "swiftDetails",
    "dealReference",
    "senderAddress",
    "recieverAddress",
    "messageDateTime",
    "userExtension",
    "hostExtension"
})
public class SwiftDetailsOutput {

    protected List<SwiftMessageDetails> swiftMessageDetails;
    protected List<SwiftDetails> swiftDetails;
    protected String dealReference;
    protected String senderAddress;
    protected String recieverAddress;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageDateTime;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the swiftMessageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swiftMessageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwiftMessageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwiftMessageDetails }
     * 
     * 
     */
    public List<SwiftMessageDetails> getSwiftMessageDetails() {
        if (swiftMessageDetails == null) {
            swiftMessageDetails = new ArrayList<SwiftMessageDetails>();
        }
        return this.swiftMessageDetails;
    }

    /**
     * Gets the value of the swiftDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swiftDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwiftDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwiftDetails }
     * 
     * 
     */
    public List<SwiftDetails> getSwiftDetails() {
        if (swiftDetails == null) {
            swiftDetails = new ArrayList<SwiftDetails>();
        }
        return this.swiftDetails;
    }

    /**
     * Gets the value of the dealReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealReference() {
        return dealReference;
    }

    /**
     * Sets the value of the dealReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealReference(String value) {
        this.dealReference = value;
    }

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddress(String value) {
        this.senderAddress = value;
    }

    /**
     * Gets the value of the recieverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieverAddress() {
        return recieverAddress;
    }

    /**
     * Sets the value of the recieverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieverAddress(String value) {
        this.recieverAddress = value;
    }

    /**
     * Gets the value of the messageDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageDateTime() {
        return messageDateTime;
    }

    /**
     * Sets the value of the messageDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageDateTime(XMLGregorianCalendar value) {
        this.messageDateTime = value;
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
