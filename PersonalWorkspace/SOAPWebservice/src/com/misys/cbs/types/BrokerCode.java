
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for brokerCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="brokerCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="4"/>
 *     &lt;enumeration value="GLD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "brokerCode")
@XmlEnum
public enum BrokerCode {

    GLD;

    public String value() {
        return name();
    }

    public static BrokerCode fromValue(String v) {
        return valueOf(v);
    }

}
