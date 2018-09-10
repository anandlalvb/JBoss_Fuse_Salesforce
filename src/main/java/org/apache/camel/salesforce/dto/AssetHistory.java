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
 * Salesforce DTO for SObject AssetHistory
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("AssetHistory")
public class AssetHistory extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // AssetId
    private String AssetId;

    @JsonProperty("AssetId")
    public String getAssetId() {
        return this.AssetId;
    }

    @JsonProperty("AssetId")
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    // Field
    @XStreamConverter(PicklistEnumConverter.class)
    private AssetHistory_FieldEnum Field;

    @JsonProperty("Field")
    public AssetHistory_FieldEnum getField() {
        return this.Field;
    }

    @JsonProperty("Field")
    public void setField(AssetHistory_FieldEnum Field) {
        this.Field = Field;
    }

    // OldValue
    private String OldValue;

    @JsonProperty("OldValue")
    public String getOldValue() {
        return this.OldValue;
    }

    @JsonProperty("OldValue")
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    // NewValue
    private String NewValue;

    @JsonProperty("NewValue")
    public String getNewValue() {
        return this.NewValue;
    }

    @JsonProperty("NewValue")
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Asset History ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("AssetId", "Asset ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("Field", "Changed Field", "picklist", "xsd:string", 255, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("OldValue", "Old Value", "anyType", "xsd:anyType", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("NewValue", "New Value", "anyType", "xsd:anyType", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);

        description.setLabelPlural("Asset History");
        description.setLabel("Asset History");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/AssetHistory/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/AssetHistory");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/AssetHistory/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("AssetHistory");

        return description;
    }
}
