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
public enum Case_PriorityEnum {

    // High
    HIGH("High"),
    // Low
    LOW("Low"),
    // Medium
    MEDIUM("Medium");

    final String value;

    private Case_PriorityEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Case_PriorityEnum fromValue(String value) {
        for (Case_PriorityEnum e : Case_PriorityEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
