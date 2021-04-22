
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dayInWeek.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dayInWeek">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MON"/>
 *     &lt;enumeration value="TUE"/>
 *     &lt;enumeration value="WED"/>
 *     &lt;enumeration value="THU"/>
 *     &lt;enumeration value="FRI"/>
 *     &lt;enumeration value="SAT"/>
 *     &lt;enumeration value="SUN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dayInWeek")
@XmlEnum
public enum DayInWeek {

    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT,
    SUN;

    public String value() {
        return name();
    }

    public static DayInWeek fromValue(String v) {
        return valueOf(v);
    }

}
