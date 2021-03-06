/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Category
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum PlatformAction_CategoryEnum {

    // Overflow
    OVERFLOW("Overflow"),
    // Primary
    PRIMARY("Primary");

    final String value;

    private PlatformAction_CategoryEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PlatformAction_CategoryEnum fromValue(String value) {
        for (PlatformAction_CategoryEnum e : PlatformAction_CategoryEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
