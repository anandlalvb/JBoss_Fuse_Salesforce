/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Version
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum SamlSsoConfig_VersionEnum {

    // SAML1_1
    SAML1_1("SAML1_1"),
    // SAML2_0
    SAML2_0("SAML2_0");

    final String value;

    private SamlSsoConfig_VersionEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static SamlSsoConfig_VersionEnum fromValue(String value) {
        for (SamlSsoConfig_VersionEnum e : SamlSsoConfig_VersionEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}