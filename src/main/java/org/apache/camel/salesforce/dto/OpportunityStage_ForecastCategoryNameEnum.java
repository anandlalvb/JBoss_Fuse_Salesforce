/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ForecastCategoryName
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum OpportunityStage_ForecastCategoryNameEnum {

    // Best Case
    BEST_CASE("Best Case"),
    // Closed
    CLOSED("Closed"),
    // Commit
    COMMIT("Commit"),
    // Omitted
    OMITTED("Omitted"),
    // Pipeline
    PIPELINE("Pipeline");

    final String value;

    private OpportunityStage_ForecastCategoryNameEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OpportunityStage_ForecastCategoryNameEnum fromValue(String value) {
        for (OpportunityStage_ForecastCategoryNameEnum e : OpportunityStage_ForecastCategoryNameEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
