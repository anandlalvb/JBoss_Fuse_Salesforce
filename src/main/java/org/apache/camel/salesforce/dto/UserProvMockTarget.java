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
 * Salesforce DTO for SObject UserProvMockTarget
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("UserProvMockTarget")
public class UserProvMockTarget extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // ExternalUserId
    private String ExternalUserId;

    @JsonProperty("ExternalUserId")
    public String getExternalUserId() {
        return this.ExternalUserId;
    }

    @JsonProperty("ExternalUserId")
    public void setExternalUserId(String ExternalUserId) {
        this.ExternalUserId = ExternalUserId;
    }

    // ExternalUsername
    private String ExternalUsername;

    @JsonProperty("ExternalUsername")
    public String getExternalUsername() {
        return this.ExternalUsername;
    }

    @JsonProperty("ExternalUsername")
    public void setExternalUsername(String ExternalUsername) {
        this.ExternalUsername = ExternalUsername;
    }

    // ExternalEmail
    private String ExternalEmail;

    @JsonProperty("ExternalEmail")
    public String getExternalEmail() {
        return this.ExternalEmail;
    }

    @JsonProperty("ExternalEmail")
    public void setExternalEmail(String ExternalEmail) {
        this.ExternalEmail = ExternalEmail;
    }

    // ExternalFirstName
    private String ExternalFirstName;

    @JsonProperty("ExternalFirstName")
    public String getExternalFirstName() {
        return this.ExternalFirstName;
    }

    @JsonProperty("ExternalFirstName")
    public void setExternalFirstName(String ExternalFirstName) {
        this.ExternalFirstName = ExternalFirstName;
    }

    // ExternalLastName
    private String ExternalLastName;

    @JsonProperty("ExternalLastName")
    public String getExternalLastName() {
        return this.ExternalLastName;
    }

    @JsonProperty("ExternalLastName")
    public void setExternalLastName(String ExternalLastName) {
        this.ExternalLastName = ExternalLastName;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "UserProvMockTarget ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("Name", "Name", "string", "xsd:string", 255, false, false, true, false, false, false, true);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("ExternalUserId", "External User Id", "string", "xsd:string", 150, false, true, false, false, false, false, true);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("ExternalUsername", "External Username", "string", "xsd:string", 150, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("ExternalEmail", "External Email", "string", "xsd:string", 150, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("ExternalFirstName", "External First Name", "string", "xsd:string", 150, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("ExternalLastName", "External Last Name", "string", "xsd:string", 150, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);

        description.setLabelPlural("User Provisioning Mock Targets");
        description.setLabel("User Provisioning Mock Target");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/UserProvMockTarget/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/UserProvMockTarget");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/UserProvMockTarget/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("UserProvMockTarget");

        return description;
    }
}
