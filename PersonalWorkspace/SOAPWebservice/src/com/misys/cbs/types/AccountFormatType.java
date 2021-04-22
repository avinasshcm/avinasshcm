
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="accountFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="EX"/>
 *     &lt;enumeration value="IB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "accountFormatType")
@XmlEnum
public enum AccountFormatType {

    ST,
    EX,
    IB;

    public String value() {
        return name();
    }

    public static AccountFormatType fromValue(String v) {
        return valueOf(v);
    }

}
