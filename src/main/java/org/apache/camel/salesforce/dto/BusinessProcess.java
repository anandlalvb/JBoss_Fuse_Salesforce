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
 * Salesforce DTO for SObject BusinessProcess
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("BusinessProcess")
public class BusinessProcess extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

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

    // TableEnumOrId
    @XStreamConverter(PicklistEnumConverter.class)
    private BusinessProcess_TableEnumOrIdEnum TableEnumOrId;

    @JsonProperty("TableEnumOrId")
    public BusinessProcess_TableEnumOrIdEnum getTableEnumOrId() {
        return this.TableEnumOrId;
    }

    @JsonProperty("TableEnumOrId")
    public void setTableEnumOrId(BusinessProcess_TableEnumOrIdEnum TableEnumOrId) {
        this.TableEnumOrId = TableEnumOrId;
    }

    // IsActive
    private Boolean IsActive;

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return this.IsActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Business Process ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("Name", "Name", "string", "xsd:string", 80, false, false, true, false, false, false, true);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("NamespacePrefix", "Namespace Prefix", "string", "xsd:string", 15, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("Description", "Description", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("TableEnumOrId", "Entity Enumeration Or ID", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("IsActive", "Active", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField11);

        description.setLabelPlural("Business Process");
        description.setLabel("Business Process");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/BusinessProcess/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/BusinessProcess");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/BusinessProcess/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("BusinessProcess");

        return description;
    }
}
