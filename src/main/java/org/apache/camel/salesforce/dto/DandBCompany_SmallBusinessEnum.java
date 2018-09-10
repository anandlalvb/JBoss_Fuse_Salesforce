/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SmallBusiness
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum DandBCompany_SmallBusinessEnum {

    // N
    N("N"),
    // Y
    Y("Y");

    final String value;

    private DandBCompany_SmallBusinessEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DandBCompany_SmallBusinessEnum fromValue(String value) {
        for (DandBCompany_SmallBusinessEnum e : DandBCompany_SmallBusinessEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}