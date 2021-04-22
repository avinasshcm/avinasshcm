
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for localEquivalentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="localEquivalentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equivCcyAmtDetails" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="lclCcyAmtDetails" type="{http://www.misys.com/cbs/types}currency"/>
 *         &lt;element name="lclExchRateDetails" type="{http://www.misys.com/cbs/types}exchangeRate"/>
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
@XmlType(name = "localEquivalentDetails", propOrder = {
    "equivCcyAmtDetails",
    "lclCcyAmtDetails",
    "lclExchRateDetails",
    "userExtension",
    "hostExtension"
})
public class LocalEquivalentDetails {

    @XmlElement(required = true)
    protected Currency equivCcyAmtDetails;
    @XmlElement(required = true)
    protected Currency lclCcyAmtDetails;
    @XmlElement(required = true)
    protected BigDecimal lclExchRateDetails;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the equivCcyAmtDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getEquivCcyAmtDetails() {
        return equivCcyAmtDetails;
    }

    /**
     * Sets the value of the equivCcyAmtDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setEquivCcyAmtDetails(Currency value) {
        this.equivCcyAmtDetails = value;
    }

    /**
     * Gets the value of the lclCcyAmtDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getLclCcyAmtDetails() {
        return lclCcyAmtDetails;
    }

    /**
     * Sets the value of the lclCcyAmtDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setLclCcyAmtDetails(Currency value) {
        this.lclCcyAmtDetails = value;
    }

    /**
     * Gets the value of the lclExchRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLclExchRateDetails() {
        return lclExchRateDetails;
    }

    /**
     * Sets the value of the lclExchRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLclExchRateDetails(BigDecimal value) {
        this.lclExchRateDetails = value;
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
