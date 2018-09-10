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
 * Salesforce DTO for SObject RelationshipInfo
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("RelationshipInfo")
public class RelationshipInfo extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // DurableId
    private String DurableId;

    @JsonProperty("DurableId")
    public String getDurableId() {
        return this.DurableId;
    }

    @JsonProperty("DurableId")
    public void setDurableId(String DurableId) {
        this.DurableId = DurableId;
    }

    // ChildSobjectId
    private String ChildSobjectId;

    @JsonProperty("ChildSobjectId")
    public String getChildSobjectId() {
        return this.ChildSobjectId;
    }

    @JsonProperty("ChildSobjectId")
    public void setChildSobjectId(String ChildSobjectId) {
        this.ChildSobjectId = ChildSobjectId;
    }

    // FieldId
    private String FieldId;

    @JsonProperty("FieldId")
    public String getFieldId() {
        return this.FieldId;
    }

    @JsonProperty("FieldId")
    public void setFieldId(String FieldId) {
        this.FieldId = FieldId;
    }

    // IsCascadeDelete
    private Boolean IsCascadeDelete;

    @JsonProperty("IsCascadeDelete")
    public Boolean getIsCascadeDelete() {
        return this.IsCascadeDelete;
    }

    @JsonProperty("IsCascadeDelete")
    public void setIsCascadeDelete(Boolean IsCascadeDelete) {
        this.IsCascadeDelete = IsCascadeDelete;
    }

    // IsDeprecatedAndHidden
    private Boolean IsDeprecatedAndHidden;

    @JsonProperty("IsDeprecatedAndHidden")
    public Boolean getIsDeprecatedAndHidden() {
        return this.IsDeprecatedAndHidden;
    }

    @JsonProperty("IsDeprecatedAndHidden")
    public void setIsDeprecatedAndHidden(Boolean IsDeprecatedAndHidden) {
        this.IsDeprecatedAndHidden = IsDeprecatedAndHidden;
    }

    // IsRestrictedDelete
    private Boolean IsRestrictedDelete;

    @JsonProperty("IsRestrictedDelete")
    public Boolean getIsRestrictedDelete() {
        return this.IsRestrictedDelete;
    }

    @JsonProperty("IsRestrictedDelete")
    public void setIsRestrictedDelete(Boolean IsRestrictedDelete) {
        this.IsRestrictedDelete = IsRestrictedDelete;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Relationship Info ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("DurableId", "Relationship Info Durable ID", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("ChildSobjectId", "Entity Definition ID", "string", "xsd:string", 70, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("FieldId", "Field Definition ID", "string", "xsd:string", 70, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("IsCascadeDelete", "Is Cascade Delete?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("IsDeprecatedAndHidden", "Is Deprecated And Hidden?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("IsRestrictedDelete", "Is Restricted Delete?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);

        description.setLabelPlural("Relationships");
        description.setLabel("Relationship");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/RelationshipInfo/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/RelationshipInfo");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/RelationshipInfo/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("RelationshipInfo");

        return description;
    }
}