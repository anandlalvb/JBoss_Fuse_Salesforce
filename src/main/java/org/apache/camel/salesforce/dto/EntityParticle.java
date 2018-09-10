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
 * Salesforce DTO for SObject EntityParticle
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("EntityParticle")
public class EntityParticle extends AbstractDescribedSObjectBase {

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

    // QualifiedApiName
    private String QualifiedApiName;

    @JsonProperty("QualifiedApiName")
    public String getQualifiedApiName() {
        return this.QualifiedApiName;
    }

    @JsonProperty("QualifiedApiName")
    public void setQualifiedApiName(String QualifiedApiName) {
        this.QualifiedApiName = QualifiedApiName;
    }

    // EntityDefinitionId
    private String EntityDefinitionId;

    @JsonProperty("EntityDefinitionId")
    public String getEntityDefinitionId() {
        return this.EntityDefinitionId;
    }

    @JsonProperty("EntityDefinitionId")
    public void setEntityDefinitionId(String EntityDefinitionId) {
        this.EntityDefinitionId = EntityDefinitionId;
    }

    // FieldDefinitionId
    private String FieldDefinitionId;

    @JsonProperty("FieldDefinitionId")
    public String getFieldDefinitionId() {
        return this.FieldDefinitionId;
    }

    @JsonProperty("FieldDefinitionId")
    public void setFieldDefinitionId(String FieldDefinitionId) {
        this.FieldDefinitionId = FieldDefinitionId;
    }

    // NamespacePrefix
    private String NamespacePrefix;

    @JsonProperty("NamespacePrefix")
    public String getNamespacePrefix() {
        return this.NamespacePrefix;
    }

    @JsonProperty("NamespacePrefix")
    public void setNamespacePrefix(String NamespacePrefix) {
        this.NamespacePrefix = NamespacePrefix;
    }

    // DeveloperName
    private String DeveloperName;

    @JsonProperty("DeveloperName")
    public String getDeveloperName() {
        return this.DeveloperName;
    }

    @JsonProperty("DeveloperName")
    public void setDeveloperName(String DeveloperName) {
        this.DeveloperName = DeveloperName;
    }

    // MasterLabel
    private String MasterLabel;

    @JsonProperty("MasterLabel")
    public String getMasterLabel() {
        return this.MasterLabel;
    }

    @JsonProperty("MasterLabel")
    public void setMasterLabel(String MasterLabel) {
        this.MasterLabel = MasterLabel;
    }

    // Label
    private String Label;

    @JsonProperty("Label")
    public String getLabel() {
        return this.Label;
    }

    @JsonProperty("Label")
    public void setLabel(String Label) {
        this.Label = Label;
    }

    // Length
    private Integer Length;

    @JsonProperty("Length")
    public Integer getLength() {
        return this.Length;
    }

    @JsonProperty("Length")
    public void setLength(Integer Length) {
        this.Length = Length;
    }

    // DataType
    private String DataType;

    @JsonProperty("DataType")
    public String getDataType() {
        return this.DataType;
    }

    @JsonProperty("DataType")
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    // ServiceDataTypeId
    private String ServiceDataTypeId;

    @JsonProperty("ServiceDataTypeId")
    public String getServiceDataTypeId() {
        return this.ServiceDataTypeId;
    }

    @JsonProperty("ServiceDataTypeId")
    public void setServiceDataTypeId(String ServiceDataTypeId) {
        this.ServiceDataTypeId = ServiceDataTypeId;
    }

    // ExtraTypeInfo
    private String ExtraTypeInfo;

    @JsonProperty("ExtraTypeInfo")
    public String getExtraTypeInfo() {
        return this.ExtraTypeInfo;
    }

    @JsonProperty("ExtraTypeInfo")
    public void setExtraTypeInfo(String ExtraTypeInfo) {
        this.ExtraTypeInfo = ExtraTypeInfo;
    }

    // IsCalculated
    private Boolean IsCalculated;

    @JsonProperty("IsCalculated")
    public Boolean getIsCalculated() {
        return this.IsCalculated;
    }

    @JsonProperty("IsCalculated")
    public void setIsCalculated(Boolean IsCalculated) {
        this.IsCalculated = IsCalculated;
    }

    // IsHighScaleNumber
    private Boolean IsHighScaleNumber;

    @JsonProperty("IsHighScaleNumber")
    public Boolean getIsHighScaleNumber() {
        return this.IsHighScaleNumber;
    }

    @JsonProperty("IsHighScaleNumber")
    public void setIsHighScaleNumber(Boolean IsHighScaleNumber) {
        this.IsHighScaleNumber = IsHighScaleNumber;
    }

    // IsHtmlFormatted
    private Boolean IsHtmlFormatted;

    @JsonProperty("IsHtmlFormatted")
    public Boolean getIsHtmlFormatted() {
        return this.IsHtmlFormatted;
    }

    @JsonProperty("IsHtmlFormatted")
    public void setIsHtmlFormatted(Boolean IsHtmlFormatted) {
        this.IsHtmlFormatted = IsHtmlFormatted;
    }

    // IsNameField
    private Boolean IsNameField;

    @JsonProperty("IsNameField")
    public Boolean getIsNameField() {
        return this.IsNameField;
    }

    @JsonProperty("IsNameField")
    public void setIsNameField(Boolean IsNameField) {
        this.IsNameField = IsNameField;
    }

    // IsNillable
    private Boolean IsNillable;

    @JsonProperty("IsNillable")
    public Boolean getIsNillable() {
        return this.IsNillable;
    }

    @JsonProperty("IsNillable")
    public void setIsNillable(Boolean IsNillable) {
        this.IsNillable = IsNillable;
    }

    // IsWorkflowFilterable
    private Boolean IsWorkflowFilterable;

    @JsonProperty("IsWorkflowFilterable")
    public Boolean getIsWorkflowFilterable() {
        return this.IsWorkflowFilterable;
    }

    @JsonProperty("IsWorkflowFilterable")
    public void setIsWorkflowFilterable(Boolean IsWorkflowFilterable) {
        this.IsWorkflowFilterable = IsWorkflowFilterable;
    }

    // IsCompactLayoutable
    private Boolean IsCompactLayoutable;

    @JsonProperty("IsCompactLayoutable")
    public Boolean getIsCompactLayoutable() {
        return this.IsCompactLayoutable;
    }

    @JsonProperty("IsCompactLayoutable")
    public void setIsCompactLayoutable(Boolean IsCompactLayoutable) {
        this.IsCompactLayoutable = IsCompactLayoutable;
    }

    // Precision
    private Integer Precision;

    @JsonProperty("Precision")
    public Integer getPrecision() {
        return this.Precision;
    }

    @JsonProperty("Precision")
    public void setPrecision(Integer Precision) {
        this.Precision = Precision;
    }

    // Scale
    private Integer Scale;

    @JsonProperty("Scale")
    public Integer getScale() {
        return this.Scale;
    }

    @JsonProperty("Scale")
    public void setScale(Integer Scale) {
        this.Scale = Scale;
    }

    // IsFieldHistoryTracked
    private Boolean IsFieldHistoryTracked;

    @JsonProperty("IsFieldHistoryTracked")
    public Boolean getIsFieldHistoryTracked() {
        return this.IsFieldHistoryTracked;
    }

    @JsonProperty("IsFieldHistoryTracked")
    public void setIsFieldHistoryTracked(Boolean IsFieldHistoryTracked) {
        this.IsFieldHistoryTracked = IsFieldHistoryTracked;
    }

    // IsApiFilterable
    private Boolean IsApiFilterable;

    @JsonProperty("IsApiFilterable")
    public Boolean getIsApiFilterable() {
        return this.IsApiFilterable;
    }

    @JsonProperty("IsApiFilterable")
    public void setIsApiFilterable(Boolean IsApiFilterable) {
        this.IsApiFilterable = IsApiFilterable;
    }

    // IsApiSortable
    private Boolean IsApiSortable;

    @JsonProperty("IsApiSortable")
    public Boolean getIsApiSortable() {
        return this.IsApiSortable;
    }

    @JsonProperty("IsApiSortable")
    public void setIsApiSortable(Boolean IsApiSortable) {
        this.IsApiSortable = IsApiSortable;
    }

    // IsApiGroupable
    private Boolean IsApiGroupable;

    @JsonProperty("IsApiGroupable")
    public Boolean getIsApiGroupable() {
        return this.IsApiGroupable;
    }

    @JsonProperty("IsApiGroupable")
    public void setIsApiGroupable(Boolean IsApiGroupable) {
        this.IsApiGroupable = IsApiGroupable;
    }

    // IsListVisible
    private Boolean IsListVisible;

    @JsonProperty("IsListVisible")
    public Boolean getIsListVisible() {
        return this.IsListVisible;
    }

    @JsonProperty("IsListVisible")
    public void setIsListVisible(Boolean IsListVisible) {
        this.IsListVisible = IsListVisible;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Entity Particle ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("DurableId", "Durable ID", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("QualifiedApiName", "Qualified API Name", "string", "xsd:string", 70, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("EntityDefinitionId", "Entity Definition ID", "string", "xsd:string", 70, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("FieldDefinitionId", "Field Definition ID", "string", "xsd:string", 70, false, true, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("NamespacePrefix", "Namespace Prefix", "string", "xsd:string", 15, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("DeveloperName", "Developer Name", "string", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("MasterLabel", "Master Label", "string", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("Label", "Label", "string", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("Length", "Length", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("DataType", "Data Type", "string", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("ServiceDataTypeId", "Data Type ID", "string", "xsd:string", 70, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("ExtraTypeInfo", "Extra Type Info", "string", "xsd:string", 150, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("IsCalculated", "Is Field calculated?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("IsHighScaleNumber", "Is Field a high scale number?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("IsHtmlFormatted", "Is Field a HTML formatted?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("IsNameField", "Is Field a Name field?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField17);
        final SObjectField sObjectField18 = createField("IsNillable", "Is Field a nillable?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField18);
        final SObjectField sObjectField19 = createField("IsWorkflowFilterable", "Is Workflow Filterable?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField19);
        final SObjectField sObjectField20 = createField("IsCompactLayoutable", "Is Compact Layout Enabled?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField20);
        final SObjectField sObjectField21 = createField("Precision", "Precision", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField21);
        final SObjectField sObjectField22 = createField("Scale", "Scale", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField22);
        final SObjectField sObjectField23 = createField("IsFieldHistoryTracked", "Is Field History Tracked", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField23);
        final SObjectField sObjectField24 = createField("IsApiFilterable", "Is Field Filterable?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField24);
        final SObjectField sObjectField25 = createField("IsApiSortable", "Is Field Sortable?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField25);
        final SObjectField sObjectField26 = createField("IsApiGroupable", "Is Field Groupable?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField26);
        final SObjectField sObjectField27 = createField("IsListVisible", "Is Field visible in Lists?", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField27);

        description.setLabelPlural("Entity Particles");
        description.setLabel("Entity Particle");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/EntityParticle/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/EntityParticle");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/EntityParticle/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("EntityParticle");

        return description;
    }
}
