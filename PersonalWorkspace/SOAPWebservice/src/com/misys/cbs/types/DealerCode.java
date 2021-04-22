
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dealerCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dealerCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="3"/>
 *     &lt;enumeration value="MMD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dealerCode")
@XmlEnum
public enum DealerCode {

    MMD;

    public String value() {
        return name();
    }

    public static DealerCode fromValue(String v) {
        return valueOf(v);
    }

}
