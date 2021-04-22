
package com.misys.cbs.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for week complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="week">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayNumber" type="{http://www.misys.com/cbs/types}NUMBER" minOccurs="0"/>
 *         &lt;element name="dayName" type="{http://www.misys.com/cbs/types}dayName" minOccurs="0"/>
 *         &lt;element name="dayDate" type="{http://www.misys.com/cbs/types}DATE" minOccurs="0"/>
 *         &lt;element name="workingDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "week", propOrder = {
    "dayNumber",
    "dayName",
    "dayDate",
    "workingDay"
})
public class Week {

    protected BigInteger dayNumber;
    protected Boolean dayName;
    protected XMLGregorianCalendar dayDate;
    protected Boolean workingDay;

    /**
     * Gets the value of the dayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayNumber() {
        return dayNumber;
    }

    /**
     * Sets the value of the dayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayNumber(BigInteger value) {
        this.dayNumber = value;
    }

    /**
     * Gets the value of the dayName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayName() {
        return dayName;
    }

    /**
     * Sets the value of the dayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayName(Boolean value) {
        this.dayName = value;
    }

    /**
     * Gets the value of the dayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDayDate() {
        return dayDate;
    }

    /**
     * Sets the value of the dayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDayDate(XMLGregorianCalendar value) {
        this.dayDate = value;
    }

    /**
     * Gets the value of the workingDay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkingDay() {
        return workingDay;
    }

    /**
     * Sets the value of the workingDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkingDay(Boolean value) {
        this.workingDay = value;
    }

}
