/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist PotentialLiability__c
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Case_PotentialLiabilityEnum {

    // No
    NO("No"),
    // Yes
    YES("Yes");

    final String value;

    private Case_PotentialLiabilityEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Case_PotentialLiabilityEnum fromValue(String value) {
        for (Case_PotentialLiabilityEnum e : Case_PotentialLiabilityEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
