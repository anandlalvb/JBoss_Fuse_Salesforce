/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Field
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Pricebook2History_FieldEnum {

    // Description
    DESCRIPTION("Description"),
    // IsActive
    ISACTIVE("IsActive"),
    // IsArchived
    ISARCHIVED("IsArchived"),
    // IsStandard
    ISSTANDARD("IsStandard"),
    // Name
    NAME("Name"),
    // created
    CREATED("created"),
    // feedEvent
    FEEDEVENT("feedEvent"),
    // locked
    LOCKED("locked"),
    // ownerAccepted
    OWNERACCEPTED("ownerAccepted"),
    // ownerAssignment
    OWNERASSIGNMENT("ownerAssignment"),
    // unlocked
    UNLOCKED("unlocked");

    final String value;

    private Pricebook2History_FieldEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Pricebook2History_FieldEnum fromValue(String value) {
        for (Pricebook2History_FieldEnum e : Pricebook2History_FieldEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
