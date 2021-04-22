
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pseudonymType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pseudonymType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="NS"/>
 *     &lt;enumeration value="CG"/>
 *     &lt;enumeration value="TX"/>
 *     &lt;enumeration value="VS"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="OC"/>
 *     &lt;enumeration value="TC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pseudonymType")
@XmlEnum
public enum PseudonymType {

    GL,
    NS,
    CG,
    TX,
    VS,
    BC,
    OC,
    TC;

    public String value() {
        return name();
    }

    public static PseudonymType fromValue(String v) {
        return valueOf(v);
    }

}
