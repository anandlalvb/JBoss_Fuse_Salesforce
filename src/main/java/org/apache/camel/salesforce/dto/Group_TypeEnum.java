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
public enum Group_TypeEnum {

    // AllCustomerPortal
    ALLCUSTOMERPORTAL("AllCustomerPortal"),
    // ChannelProgramGroup
    CHANNELPROGRAMGROUP("ChannelProgramGroup"),
    // CollaborationGroup
    COLLABORATIONGROUP("CollaborationGroup"),
    // Manager
    MANAGER("Manager"),
    // ManagerAndSubordinatesInternal
    MANAGERANDSUBORDINATESINTERNAL("ManagerAndSubordinatesInternal"),
    // Organization
    ORGANIZATION("Organization"),
    // PRMOrganization
    PRMORGANIZATION("PRMOrganization"),
    // Queue
    QUEUE("Queue"),
    // Regular
    REGULAR("Regular"),
    // Role
    ROLE("Role"),
    // RoleAndSubordinates
    ROLEANDSUBORDINATES("RoleAndSubordinates"),
    // RoleAndSubordinatesInternal
    ROLEANDSUBORDINATESINTERNAL("RoleAndSubordinatesInternal"),
    // Territory
    TERRITORY("Territory"),
    // TerritoryAndSubordinates
    TERRITORYANDSUBORDINATES("TerritoryAndSubordinates");

    final String value;

    private Group_TypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Group_TypeEnum fromValue(String value) {
        for (Group_TypeEnum e : Group_TypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
