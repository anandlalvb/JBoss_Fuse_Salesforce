/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OutOfBusiness
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum DatacloudDandBCompany_OutOfBusinessEnum {

    // N
    N("N"),
    // Y
    Y("Y");

    final String value;

    private DatacloudDandBCompany_OutOfBusinessEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DatacloudDandBCompany_OutOfBusinessEnum fromValue(String value) {
        for (DatacloudDandBCompany_OutOfBusinessEnum e : DatacloudDandBCompany_OutOfBusinessEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
