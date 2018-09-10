/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist PurchaseType
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum DatacloudPurchaseUsage_PurchaseTypeEnum {

    // 0
    _0("0"),
    // 1
    _1("1"),
    // 2
    _2("2");

    final String value;

    private DatacloudPurchaseUsage_PurchaseTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DatacloudPurchaseUsage_PurchaseTypeEnum fromValue(String value) {
        for (DatacloudPurchaseUsage_PurchaseTypeEnum e : DatacloudPurchaseUsage_PurchaseTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}