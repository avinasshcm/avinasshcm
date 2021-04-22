
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherPartyClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherPartyClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="analysisCode" type="{http://www.misys.com/cbs/types}descriptionShort"/>
 *         &lt;element name="analysisValue" type="{http://www.misys.com/cbs/types}descriptionMedium"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherPartyClass", propOrder = {
    "analysisCode",
    "analysisValue"
})
public class OtherPartyClass {

    @XmlElement(required = true)
    protected String analysisCode;
    @XmlElement(required = true)
    protected String analysisValue;

    /**
     * Gets the value of the analysisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisCode() {
        return analysisCode;
    }

    /**
     * Sets the value of the analysisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisCode(String value) {
        this.analysisCode = value;
    }

    /**
     * Gets the value of the analysisValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisValue() {
        return analysisValue;
    }

    /**
     * Sets the value of the analysisValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisValue(String value) {
        this.analysisValue = value;
    }

}
