
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeMainKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeMainKeys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tradeRef" type="{http://www.misys.com/cbs/types}hostTxnRef"/>
 *         &lt;element name="partyId" type="{http://www.misys.com/cbs/types}custId"/>
 *         &lt;element name="alternativePartyId" type="{http://www.misys.com/cbs/types}custId" minOccurs="0"/>
 *         &lt;element name="applicationName" type="{http://www.misys.com/cbs/types}applicationName" minOccurs="0"/>
 *         &lt;element name="applicationInstance" type="{http://www.misys.com/cbs/types}applicationInstance" minOccurs="0"/>
 *         &lt;element name="applicationUnit" type="{http://www.misys.com/cbs/types}applicationUnit" minOccurs="0"/>
 *         &lt;element name="productRef" type="{http://www.misys.com/cbs/types}descriptionMedium"/>
 *         &lt;element name="category" type="{http://www.misys.com/cbs/types}descriptionShort" minOccurs="0"/>
 *         &lt;element name="hostModule" type="{http://www.misys.com/cbs/types}descriptionShort" minOccurs="0"/>
 *         &lt;element name="instrumentDesc" type="{http://www.misys.com/cbs/types}descriptionMedium" minOccurs="0"/>
 *         &lt;element name="hostTxnCode" type="{http://www.misys.com/cbs/types}hostTxnCode" minOccurs="0"/>
 *         &lt;element name="tradeDirection" type="{http://www.misys.com/cbs/types}descriptionShort" minOccurs="0"/>
 *         &lt;element name="tradeStatus" type="{http://www.misys.com/cbs/types}descriptionShort" minOccurs="0"/>
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
@XmlType(name = "tradeMainKeys", propOrder = {
    "tradeRef",
    "partyId",
    "alternativePartyId",
    "applicationName",
    "applicationInstance",
    "applicationUnit",
    "productRef",
    "category",
    "hostModule",
    "instrumentDesc",
    "hostTxnCode",
    "tradeDirection",
    "tradeStatus",
    "userExtension",
    "hostExtension"
})
public class TradeMainKeys {

    @XmlElement(required = true)
    protected String tradeRef;
    @XmlElement(required = true)
    protected String partyId;
    protected String alternativePartyId;
    protected String applicationName;
    protected String applicationInstance;
    protected String applicationUnit;
    @XmlElement(required = true)
    protected String productRef;
    protected String category;
    protected String hostModule;
    protected String instrumentDesc;
    protected String hostTxnCode;
    protected String tradeDirection;
    protected String tradeStatus;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the tradeRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeRef() {
        return tradeRef;
    }

    /**
     * Sets the value of the tradeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeRef(String value) {
        this.tradeRef = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the alternativePartyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativePartyId() {
        return alternativePartyId;
    }

    /**
     * Sets the value of the alternativePartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativePartyId(String value) {
        this.alternativePartyId = value;
    }

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the applicationInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationInstance() {
        return applicationInstance;
    }

    /**
     * Sets the value of the applicationInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationInstance(String value) {
        this.applicationInstance = value;
    }

    /**
     * Gets the value of the applicationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationUnit() {
        return applicationUnit;
    }

    /**
     * Sets the value of the applicationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationUnit(String value) {
        this.applicationUnit = value;
    }

    /**
     * Gets the value of the productRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRef() {
        return productRef;
    }

    /**
     * Sets the value of the productRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRef(String value) {
        this.productRef = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the hostModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostModule() {
        return hostModule;
    }

    /**
     * Sets the value of the hostModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostModule(String value) {
        this.hostModule = value;
    }

    /**
     * Gets the value of the instrumentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentDesc() {
        return instrumentDesc;
    }

    /**
     * Sets the value of the instrumentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentDesc(String value) {
        this.instrumentDesc = value;
    }

    /**
     * Gets the value of the hostTxnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTxnCode() {
        return hostTxnCode;
    }

    /**
     * Sets the value of the hostTxnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTxnCode(String value) {
        this.hostTxnCode = value;
    }

    /**
     * Gets the value of the tradeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeDirection() {
        return tradeDirection;
    }

    /**
     * Sets the value of the tradeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeDirection(String value) {
        this.tradeDirection = value;
    }

    /**
     * Gets the value of the tradeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeStatus() {
        return tradeStatus;
    }

    /**
     * Sets the value of the tradeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeStatus(String value) {
        this.tradeStatus = value;
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
