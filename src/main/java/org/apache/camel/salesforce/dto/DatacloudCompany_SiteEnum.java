/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Site
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum DatacloudCompany_SiteEnum {

    // Branch
    BRANCH("Branch"),
    // Headquarters
    HEADQUARTERS("Headquarters"),
    // Single Location
    SINGLE_LOCATION("Single Location");

    final String value;

    private DatacloudCompany_SiteEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DatacloudCompany_SiteEnum fromValue(String value) {
        for (DatacloudCompany_SiteEnum e : DatacloudCompany_SiteEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
