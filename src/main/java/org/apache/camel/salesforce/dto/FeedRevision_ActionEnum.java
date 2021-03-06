/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Action
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum FeedRevision_ActionEnum {

    // Changed
    CHANGED("Changed");

    final String value;

    private FeedRevision_ActionEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static FeedRevision_ActionEnum fromValue(String value) {
        for (FeedRevision_ActionEnum e : FeedRevision_ActionEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
