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
 * Salesforce DTO for SObject OpportunityPartner
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("OpportunityPartner")
public class OpportunityPartner extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // OpportunityId
    private String OpportunityId;

    @JsonProperty("OpportunityId")
    public String getOpportunityId() {
        return this.OpportunityId;
    }

    @JsonProperty("OpportunityId")
    public void setOpportunityId(String OpportunityId) {
        this.OpportunityId = OpportunityId;
    }

    // AccountToId
    private String AccountToId;

    @JsonProperty("AccountToId")
    public String getAccountToId() {
        return this.AccountToId;
    }

    @JsonProperty("AccountToId")
    public void setAccountToId(String AccountToId) {
        this.AccountToId = AccountToId;
    }

    // Role
    @XStreamConverter(PicklistEnumConverter.class)
    private OpportunityPartner_RoleEnum Role;

    @JsonProperty("Role")
    public OpportunityPartner_RoleEnum getRole() {
        return this.Role;
    }

    @JsonProperty("Role")
    public void setRole(OpportunityPartner_RoleEnum Role) {
        this.Role = Role;
    }

    // IsPrimary
    private Boolean IsPrimary;

    @JsonProperty("IsPrimary")
    public Boolean getIsPrimary() {
        return this.IsPrimary;
    }

    @JsonProperty("IsPrimary")
    public void setIsPrimary(Boolean IsPrimary) {
        this.IsPrimary = IsPrimary;
    }

    // ReversePartnerId
    private String ReversePartnerId;

    @JsonProperty("ReversePartnerId")
    public String getReversePartnerId() {
        return this.ReversePartnerId;
    }

    @JsonProperty("ReversePartnerId")
    public void setReversePartnerId(String ReversePartnerId) {
        this.ReversePartnerId = ReversePartnerId;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Opportunity Partner ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("OpportunityId", "Opportunity ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("AccountToId", "Account ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("Role", "Role", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("IsPrimary", "Primary", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("ReversePartnerId", "Reverse Partner ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);

        description.setLabelPlural("Opportunity Partner");
        description.setLabel("Opportunity Partner");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/OpportunityPartner/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/OpportunityPartner");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/OpportunityPartner/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("OpportunityPartner");

        return description;
    }
}
