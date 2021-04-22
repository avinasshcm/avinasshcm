
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roundingIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="roundingIndicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="RD"/>
 *     &lt;enumeration value="RN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "roundingIndicator")
@XmlEnum
public enum RoundingIndicator {

    RU,
    RD,
    RN;

    public String value() {
        return name();
    }

    public static RoundingIndicator fromValue(String v) {
        return valueOf(v);
    }

}
