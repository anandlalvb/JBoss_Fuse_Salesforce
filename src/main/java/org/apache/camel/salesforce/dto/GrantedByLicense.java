/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import org.apache.camel.component.salesforce.api.dto.AbstractDescribedSObjectBase;
import org.apache.camel.component.salesforce.api.dto.ChildRelationShip;
import org.apache.camel.component.salesforce.api.dto.InfoUrls;
import org.apache.camel.component.salesforce.api.dto.NamedLayoutInfo;
import org.apache.camel.component.salesforce.api.dto.RecordTypeInfo;
import org.apache.camel.component.salesforce.api.dto.SObjectDescription;
import org.apache.camel.component.salesforce.api.dto.SObjectDescriptionUrls;
import org.apache.camel.component.salesforce.api.dto.SObjectField;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject GrantedByLicense
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("GrantedByLicense")
public class GrantedByLicense extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // PermissionSetLicenseId
    private String PermissionSetLicenseId;

    @JsonProperty("PermissionSetLicenseId")
    public String getPermissionSetLicenseId() {
        return this.PermissionSetLicenseId;
    }

    @JsonProperty("PermissionSetLicenseId")
    public void setPermissionSetLicenseId(String PermissionSetLicenseId) {
        this.PermissionSetLicenseId = PermissionSetLicenseId;
    }

    // CustomPermissionId
    private String CustomPermissionId;

    @JsonProperty("CustomPermissionId")
    public String getCustomPermissionId() {
        return this.CustomPermissionId;
    }

    @JsonProperty("CustomPermissionId")
    public void setCustomPermissionId(String CustomPermissionId) {
        this.CustomPermissionId = CustomPermissionId;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Setting Granted By License ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("PermissionSetLicenseId", "Permission Set License ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("CustomPermissionId", "Custom Permission ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);

        description.setLabelPlural("Settings Granted By Licenses");
        description.setLabel("Setting Granted By License");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/GrantedByLicense/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/GrantedByLicense");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/GrantedByLicense/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("GrantedByLicense");

        return description;
    }
}
