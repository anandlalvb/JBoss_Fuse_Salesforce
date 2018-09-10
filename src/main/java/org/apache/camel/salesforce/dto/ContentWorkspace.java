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
 * Salesforce DTO for SObject ContentWorkspace
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("ContentWorkspace")
public class ContentWorkspace extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // TagModel
    @XStreamConverter(PicklistEnumConverter.class)
    private ContentWorkspace_TagModelEnum TagModel;

    @JsonProperty("TagModel")
    public ContentWorkspace_TagModelEnum getTagModel() {
        return this.TagModel;
    }

    @JsonProperty("TagModel")
    public void setTagModel(ContentWorkspace_TagModelEnum TagModel) {
        this.TagModel = TagModel;
    }

    // DefaultRecordTypeId
    private String DefaultRecordTypeId;

    @JsonProperty("DefaultRecordTypeId")
    public String getDefaultRecordTypeId() {
        return this.DefaultRecordTypeId;
    }

    @JsonProperty("DefaultRecordTypeId")
    public void setDefaultRecordTypeId(String DefaultRecordTypeId) {
        this.DefaultRecordTypeId = DefaultRecordTypeId;
    }

    // IsRestrictContentTypes
    private Boolean IsRestrictContentTypes;

    @JsonProperty("IsRestrictContentTypes")
    public Boolean getIsRestrictContentTypes() {
        return this.IsRestrictContentTypes;
    }

    @JsonProperty("IsRestrictContentTypes")
    public void setIsRestrictContentTypes(Boolean IsRestrictContentTypes) {
        this.IsRestrictContentTypes = IsRestrictContentTypes;
    }

    // IsRestrictLinkedContentTypes
    private Boolean IsRestrictLinkedContentTypes;

    @JsonProperty("IsRestrictLinkedContentTypes")
    public Boolean getIsRestrictLinkedContentTypes() {
        return this.IsRestrictLinkedContentTypes;
    }

    @JsonProperty("IsRestrictLinkedContentTypes")
    public void setIsRestrictLinkedContentTypes(Boolean IsRestrictLinkedContentTypes) {
        this.IsRestrictLinkedContentTypes = IsRestrictLinkedContentTypes;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Library ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("Name", "Name", "string", "xsd:string", 255, false, false, true, false, false, false, true);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("Description", "Description", "textarea", "xsd:string", 500, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("TagModel", "Tag Model", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("DefaultRecordTypeId", "Record Type ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("IsRestrictContentTypes", "Restrict Record Types", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("IsRestrictLinkedContentTypes", "Restrict Linked Record Types", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField12);

        description.setLabelPlural("Libraries");
        description.setLabel("Library");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/ContentWorkspace/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/ContentWorkspace");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/ContentWorkspace/{ID}");
        sObjectDescriptionUrls1.setCompactLayouts("/services/data/v34.0/sobjects/ContentWorkspace/describe/compactLayouts");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("ContentWorkspace");

        return description;
    }
}
