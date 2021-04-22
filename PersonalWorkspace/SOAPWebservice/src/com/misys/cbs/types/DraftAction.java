
package com.misys.cbs.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for draftAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="draftAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ISSD"/>
 *     &lt;enumeration value="CNCLLD"/>
 *     &lt;enumeration value="PAID"/>
 *     &lt;enumeration value="STPPD"/>
 *     &lt;enumeration value="RPRNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "draftAction")
@XmlEnum
public enum DraftAction {

    ISSD,
    CNCLLD,
    PAID,
    STPPD,
    RPRNT;

    public String value() {
        return name();
    }

    public static DraftAction fromValue(String v) {
        return valueOf(v);
    }

}
