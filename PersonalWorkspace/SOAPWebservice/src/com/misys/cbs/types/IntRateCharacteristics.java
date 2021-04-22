
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for intRateCharacteristics.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="intRateCharacteristics">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="1"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="V"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "intRateCharacteristics")
@XmlEnum
public enum IntRateCharacteristics {

    D,
    F,
    V;

    public String value() {
        return name();
    }

    public static IntRateCharacteristics fromValue(String v) {
        return valueOf(v);
    }

}
