/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Priority
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum OpenActivity_PriorityEnum {

    // High
    HIGH("High"),
    // Low
    LOW("Low"),
    // Normal
    NORMAL("Normal");

    final String value;

    private OpenActivity_PriorityEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OpenActivity_PriorityEnum fromValue(String value) {
        for (OpenActivity_PriorityEnum e : OpenActivity_PriorityEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
