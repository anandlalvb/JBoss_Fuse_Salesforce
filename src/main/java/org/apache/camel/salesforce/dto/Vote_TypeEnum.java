/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Type
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Vote_TypeEnum {

    // 1
    _1("1"),
    // 2
    _2("2"),
    // 3
    _3("3"),
    // 4
    _4("4"),
    // 5
    _5("5"),
    // Down
    DOWN("Down"),
    // Up
    UP("Up");

    final String value;

    private Vote_TypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Vote_TypeEnum fromValue(String value) {
        for (Vote_TypeEnum e : Vote_TypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
