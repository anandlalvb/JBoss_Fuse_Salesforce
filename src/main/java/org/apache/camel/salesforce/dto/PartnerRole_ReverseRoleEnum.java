/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ReverseRole
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum PartnerRole_ReverseRoleEnum {

    // Advertiser
    ADVERTISER("Advertiser"),
    // Agency
    AGENCY("Agency"),
    // Broker
    BROKER("Broker"),
    // Consultant
    CONSULTANT("Consultant"),
    // Contractor
    CONTRACTOR("Contractor"),
    // Dealer
    DEALER("Dealer"),
    // Developer
    DEVELOPER("Developer"),
    // Distributor
    DISTRIBUTOR("Distributor"),
    // Institution
    INSTITUTION("Institution"),
    // Lender
    LENDER("Lender"),
    // Supplier
    SUPPLIER("Supplier"),
    // System Integrator
    SYSTEM_INTEGRATOR("System Integrator"),
    // VAR/Reseller
    VAR_RESELLER("VAR/Reseller");

    final String value;

    private PartnerRole_ReverseRoleEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PartnerRole_ReverseRoleEnum fromValue(String value) {
        for (PartnerRole_ReverseRoleEnum e : PartnerRole_ReverseRoleEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
