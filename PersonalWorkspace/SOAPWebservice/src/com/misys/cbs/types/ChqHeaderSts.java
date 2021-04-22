
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chqHeaderSts.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chqHeaderSts">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HEADER"/>
 *     &lt;enumeration value="POSTED"/>
 *     &lt;enumeration value="REVERSED"/>
 *     &lt;maxLength value="20"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chqHeaderSts")
@XmlEnum
public enum ChqHeaderSts {

    HEADER,
    POSTED,
    REVERSED;

    public String value() {
        return name();
    }

    public static ChqHeaderSts fromValue(String v) {
        return valueOf(v);
    }

}
