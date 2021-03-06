package com.checkmarx.plugin.common.sdk;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleType.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScheduleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Now"/&gt;
 *     &lt;enumeration value="Weekly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "ScheduleType")
@XmlEnum
public enum ScheduleType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Now")
    NOW("Now"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly");
    private final String value;

    ScheduleType(String v) {
        value = v;
    }

    public static ScheduleType fromValue(String v) {
        for (ScheduleType c : ScheduleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
