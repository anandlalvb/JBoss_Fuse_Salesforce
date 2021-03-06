/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SetupEntityType
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum SetupEntityAccess_SetupEntityTypeEnum {

    // ApexClass
    APEXCLASS("ApexClass"),
    // ApexPage
    APEXPAGE("ApexPage"),
    // ConnectedApplication
    CONNECTEDAPPLICATION("ConnectedApplication"),
    // CustomPermission
    CUSTOMPERMISSION("CustomPermission"),
    // ExternalDataSource
    EXTERNALDATASOURCE("ExternalDataSource"),
    // NamedCredential
    NAMEDCREDENTIAL("NamedCredential"),
    // TabSet
    TABSET("TabSet");

    final String value;

    private SetupEntityAccess_SetupEntityTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static SetupEntityAccess_SetupEntityTypeEnum fromValue(String value) {
        for (SetupEntityAccess_SetupEntityTypeEnum e : SetupEntityAccess_SetupEntityTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
