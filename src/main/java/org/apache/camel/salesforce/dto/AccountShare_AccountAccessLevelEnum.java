/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist AccountAccessLevel
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum AccountShare_AccountAccessLevelEnum {

    // All
    ALL("All"),
    // Edit
    EDIT("Edit"),
    // Read
    READ("Read");

    final String value;

    private AccountShare_AccountAccessLevelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static AccountShare_AccountAccessLevelEnum fromValue(String value) {
        for (AccountShare_AccountAccessLevelEnum e : AccountShare_AccountAccessLevelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
