/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
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
 * Salesforce DTO for SObject UserProvAccount
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("UserProvAccount")
public class UserProvAccount extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // SalesforceUserId
    private String SalesforceUserId;

    @JsonProperty("SalesforceUserId")
    public String getSalesforceUserId() {
        return this.SalesforceUserId;
    }

    @JsonProperty("SalesforceUserId")
    public void setSalesforceUserId(String SalesforceUserId) {
        this.SalesforceUserId = SalesforceUserId;
    }

    // ConnectedAppId
    private String ConnectedAppId;

    @JsonProperty("ConnectedAppId")
    public String getConnectedAppId() {
        return this.ConnectedAppId;
    }

    @JsonProperty("ConnectedAppId")
    public void setConnectedAppId(String ConnectedAppId) {
        this.ConnectedAppId = ConnectedAppId;
    }

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

    // LinkState
    @XStreamConverter(PicklistEnumConverter.class)
    private UserProvAccount_LinkStateEnum LinkState;

    @JsonProperty("LinkState")
    public UserProvAccount_LinkStateEnum getLinkState() {
        return this.LinkState;
    }

    @JsonProperty("LinkState")
    public void setLinkState(UserProvAccount_LinkStateEnum LinkState) {
        this.LinkState = LinkState;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private UserProvAccount_StatusEnum Status;

    @JsonProperty("Status")
    public UserProvAccount_StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(UserProvAccount_StatusEnum Status) {
        this.Status = Status;
    }

    // DeletedDate
    private java.time.ZonedDateTime DeletedDate;

    @JsonProperty("DeletedDate")
    public java.time.ZonedDateTime getDeletedDate() {
        return this.DeletedDate;
    }

    @JsonProperty("DeletedDate")
    public void setDeletedDate(java.time.ZonedDateTime DeletedDate) {
        this.DeletedDate = DeletedDate;
    }

    // IsKnownLink
    private Boolean IsKnownLink;

    @JsonProperty("IsKnownLink")
    public Boolean getIsKnownLink() {
        return this.IsKnownLink;
    }

    @JsonProperty("IsKnownLink")
    public void setIsKnownLink(Boolean IsKnownLink) {
        this.IsKnownLink = IsKnownLink;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "User Provisioning Account ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
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
        final SObjectField sObjectField9 = createField("SalesforceUserId", "User ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("ConnectedAppId", "Connected App ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("ExternalUserId", "External User Id", "string", "xsd:string", 150, false, true, false, false, false, false, true);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("ExternalUsername", "External Username", "string", "xsd:string", 150, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("ExternalEmail", "External Email", "string", "xsd:string", 150, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("ExternalFirstName", "External First Name", "string", "xsd:string", 150, false, true, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("ExternalLastName", "External Last Name", "string", "xsd:string", 150, false, true, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("LinkState", "Link State", "picklist", "xsd:string", 255, false, false, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("Status", "Status", "picklist", "xsd:string", 255, false, false, false, false, false, false, false);
        fields1.add(sObjectField17);
        final SObjectField sObjectField18 = createField("DeletedDate", "Deleted Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField18);
        final SObjectField sObjectField19 = createField("IsKnownLink", "Manual Override", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField19);

        description.setLabelPlural("User Provisioning Accounts");
        description.setLabel("User Provisioning Account");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/UserProvAccount/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/UserProvAccount");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/UserProvAccount/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("UserProvAccount");

        return description;
    }
}
