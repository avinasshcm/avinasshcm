
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exRtCat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="exRtCat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="20"/>
 *     &lt;enumeration value="SPOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "exRtCat")
@XmlEnum
public enum ExRtCat {

    SPOT;

    public String value() {
        return name();
    }

    public static ExRtCat fromValue(String v) {
        return valueOf(v);
    }

}
