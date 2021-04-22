
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contextType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BRANCH"/>
 *     &lt;enumeration value="CURRENCY"/>
 *     &lt;enumeration value="ALTERNATE"/>
 *     &lt;enumeration value="CUSTOMER"/>
 *     &lt;enumeration value="PARTYTYPE"/>
 *     &lt;enumeration value="PARTYSUBTYPE"/>
 *     &lt;maxLength value="100"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contextType")
@XmlEnum
public enum ContextType {

    BRANCH,
    CURRENCY,
    ALTERNATE,
    CUSTOMER,
    PARTYTYPE,
    PARTYSUBTYPE;

    public String value() {
        return name();
    }

    public static ContextType fromValue(String v) {
        return valueOf(v);
    }

}
