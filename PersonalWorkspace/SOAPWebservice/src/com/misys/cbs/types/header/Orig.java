
package com.misys.cbs.types.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channelId" type="{http://www.misys.com/cbs/types}channelId"/>
 *         &lt;element name="appId" type="{http://www.misys.com/cbs/types/header}appId"/>
 *         &lt;element name="appVer" type="{http://www.misys.com/cbs/types/header}version"/>
 *         &lt;element name="origLocale" type="{http://www.misys.com/cbs/types}origLocale" minOccurs="0"/>
 *         &lt;element name="origId" type="{http://www.misys.com/cbs/types/header}origId" minOccurs="0"/>
 *         &lt;element name="origBranchCode" type="{http://www.misys.com/cbs/types}branchCode" minOccurs="0"/>
 *         &lt;element name="origCtxtId" type="{http://www.misys.com/cbs/types/header}origCtxtId" minOccurs="0"/>
 *         &lt;element name="zoneId" type="{http://www.misys.com/cbs/types}zoneId" minOccurs="0"/>
 *         &lt;element name="offlineMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orig", propOrder = {
    "channelId",
    "appId",
    "appVer",
    "origLocale",
    "origId",
    "origBranchCode",
    "origCtxtId",
    "zoneId",
    "offlineMode"
})
public class Orig {

    @XmlElement(required = true)
    protected String channelId;
    @XmlElement(required = true)
    protected String appId;
    @XmlElement(required = true)
    protected String appVer;
    protected String origLocale;
    protected String origId;
    protected String origBranchCode;
    protected String origCtxtId;
    protected String zoneId;
    @XmlElement(defaultValue = "false")
    protected Boolean offlineMode;

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Gets the value of the appVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppVer() {
        return appVer;
    }

    /**
     * Sets the value of the appVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppVer(String value) {
        this.appVer = value;
    }

    /**
     * Gets the value of the origLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigLocale() {
        return origLocale;
    }

    /**
     * Sets the value of the origLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigLocale(String value) {
        this.origLocale = value;
    }

    /**
     * Gets the value of the origId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigId() {
        return origId;
    }

    /**
     * Sets the value of the origId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigId(String value) {
        this.origId = value;
    }

    /**
     * Gets the value of the origBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigBranchCode() {
        return origBranchCode;
    }

    /**
     * Sets the value of the origBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigBranchCode(String value) {
        this.origBranchCode = value;
    }

    /**
     * Gets the value of the origCtxtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigCtxtId() {
        return origCtxtId;
    }

    /**
     * Sets the value of the origCtxtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigCtxtId(String value) {
        this.origCtxtId = value;
    }

    /**
     * Gets the value of the zoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * Sets the value of the zoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneId(String value) {
        this.zoneId = value;
    }

    /**
     * Gets the value of the offlineMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfflineMode() {
        return offlineMode;
    }

    /**
     * Sets the value of the offlineMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfflineMode(Boolean value) {
        this.offlineMode = value;
    }

}
