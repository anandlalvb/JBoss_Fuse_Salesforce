/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Status
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum LookedUpFromActivity_StatusEnum {

    // Completed
    COMPLETED("Completed"),
    // Deferred
    DEFERRED("Deferred"),
    // In Progress
    IN_PROGRESS("In Progress"),
    // Not Started
    NOT_STARTED("Not Started"),
    // Waiting on someone else
    WAITING_ON_SOMEONE_ELSE("Waiting on someone else");

    final String value;

    private LookedUpFromActivity_StatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LookedUpFromActivity_StatusEnum fromValue(String value) {
        for (LookedUpFromActivity_StatusEnum e : LookedUpFromActivity_StatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
