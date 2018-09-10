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
public enum ProcessInstance_StatusEnum {

    // Approved
    APPROVED("Approved"),
    // Fault
    FAULT("Fault"),
    // Held
    HELD("Held"),
    // NoResponse
    NORESPONSE("NoResponse"),
    // Pending
    PENDING("Pending"),
    // Reassigned
    REASSIGNED("Reassigned"),
    // Rejected
    REJECTED("Rejected"),
    // Removed
    REMOVED("Removed"),
    // Started
    STARTED("Started");

    final String value;

    private ProcessInstance_StatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ProcessInstance_StatusEnum fromValue(String value) {
        for (ProcessInstance_StatusEnum e : ProcessInstance_StatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}