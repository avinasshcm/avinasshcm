
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addrLong complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addrLong">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.misys.com/cbs/types}address"/>
 *         &lt;element name="addrLine5" type="{http://www.misys.com/cbs/types}addrLineShort" minOccurs="0"/>
 *         &lt;element name="addrLine6" type="{http://www.misys.com/cbs/types}addrLineShort" minOccurs="0"/>
 *         &lt;element name="addrLine7" type="{http://www.misys.com/cbs/types}addrLineShort" minOccurs="0"/>
 *         &lt;element name="addrLine8" type="{http://www.misys.com/cbs/types}addrLineShort" minOccurs="0"/>
 *         &lt;element name="hostExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="userExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addrLong", propOrder = {
    "address",
    "addrLine5",
    "addrLine6",
    "addrLine7",
    "addrLine8",
    "hostExtension",
    "userExtension"
})
public class AddrLong {

    @XmlElement(required = true)
    protected Address address;
    protected String addrLine5;
    protected String addrLine6;
    protected String addrLine7;
    protected String addrLine8;
    protected Object hostExtension;
    protected Object userExtension;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the addrLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine5() {
        return addrLine5;
    }

    /**
     * Sets the value of the addrLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine5(String value) {
        this.addrLine5 = value;
    }

    /**
     * Gets the value of the addrLine6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine6() {
        return addrLine6;
    }

    /**
     * Sets the value of the addrLine6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine6(String value) {
        this.addrLine6 = value;
    }

    /**
     * Gets the value of the addrLine7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine7() {
        return addrLine7;
    }

    /**
     * Sets the value of the addrLine7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine7(String value) {
        this.addrLine7 = value;
    }

    /**
     * Gets the value of the addrLine8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine8() {
        return addrLine8;
    }

    /**
     * Sets the value of the addrLine8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine8(String value) {
        this.addrLine8 = value;
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

}
