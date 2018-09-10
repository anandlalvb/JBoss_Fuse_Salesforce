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
 * Salesforce DTO for SObject OpportunityShare
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("OpportunityShare")
public class OpportunityShare extends AbstractDescribedSObjectBase {

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

    // UserOrGroupId
    private String UserOrGroupId;

    @JsonProperty("UserOrGroupId")
    public String getUserOrGroupId() {
        return this.UserOrGroupId;
    }

    @JsonProperty("UserOrGroupId")
    public void setUserOrGroupId(String UserOrGroupId) {
        this.UserOrGroupId = UserOrGroupId;
    }

    // OpportunityAccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private OpportunityShare_OpportunityAccessLevelEnum OpportunityAccessLevel;

    @JsonProperty("OpportunityAccessLevel")
    public OpportunityShare_OpportunityAccessLevelEnum getOpportunityAccessLevel() {
        return this.OpportunityAccessLevel;
    }

    @JsonProperty("OpportunityAccessLevel")
    public void setOpportunityAccessLevel(OpportunityShare_OpportunityAccessLevelEnum OpportunityAccessLevel) {
        this.OpportunityAccessLevel = OpportunityAccessLevel;
    }

    // RowCause
    @XStreamConverter(PicklistEnumConverter.class)
    private OpportunityShare_RowCauseEnum RowCause;

    @JsonProperty("RowCause")
    public OpportunityShare_RowCauseEnum getRowCause() {
        return this.RowCause;
    }

    @JsonProperty("RowCause")
    public void setRowCause(OpportunityShare_RowCauseEnum RowCause) {
        this.RowCause = RowCause;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Opportunity Share ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("OpportunityId", "Opportunity ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("UserOrGroupId", "User/Group ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("OpportunityAccessLevel", "Opportunity Access", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("RowCause", "Row Cause", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);

        description.setLabelPlural("Opportunity Share");
        description.setLabel("Opportunity Share");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/OpportunityShare/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/OpportunityShare");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/OpportunityShare/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("OpportunityShare");

        return description;
    }
}
