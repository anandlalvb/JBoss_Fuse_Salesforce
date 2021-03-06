/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist PeriodLabel
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Period_PeriodLabelEnum {

    ; // empty picklist!

    final String value;

    private Period_PeriodLabelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Period_PeriodLabelEnum fromValue(String value) {
        for (Period_PeriodLabelEnum e : Period_PeriodLabelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
