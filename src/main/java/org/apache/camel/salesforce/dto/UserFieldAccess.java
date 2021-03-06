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
 * Salesforce DTO for SObject UserFieldAccess
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("UserFieldAccess")
public class UserFieldAccess extends AbstractDescribedSObjectBase {

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

    // UserId
    private String UserId;

    @JsonProperty("UserId")
    public String getUserId() {
        return this.UserId;
    }

    @JsonProperty("UserId")
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    // IsUpdatable
    private Boolean IsUpdatable;

    @JsonProperty("IsUpdatable")
    public Boolean getIsUpdatable() {
        return this.IsUpdatable;
    }

    @JsonProperty("IsUpdatable")
    public void setIsUpdatable(Boolean IsUpdatable) {
        this.IsUpdatable = IsUpdatable;
    }

    // IsCreatable
    private Boolean IsCreatable;

    @JsonProperty("IsCreatable")
    public Boolean getIsCreatable() {
        return this.IsCreatable;
    }

    @JsonProperty("IsCreatable")
    public void setIsCreatable(Boolean IsCreatable) {
        this.IsCreatable = IsCreatable;
    }

    // IsAccessible
    private Boolean IsAccessible;

    @JsonProperty("IsAccessible")
    public Boolean getIsAccessible() {
        return this.IsAccessible;
    }

    @JsonProperty("IsAccessible")
    public void setIsAccessible(Boolean IsAccessible) {
        this.IsAccessible = IsAccessible;
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


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "User Field Access ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("DurableId", "Durable ID", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("UserId", "User ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("IsUpdatable", "Is Updatable", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("IsCreatable", "Is Creatable", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("IsAccessible", "Is Accessible", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("EntityDefinitionId", "Entity Definition ID", "string", "xsd:string", 150, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("FieldDefinitionId", "Field Definition ID", "string", "xsd:string", 150, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);

        description.setLabelPlural("User Field Access");
        description.setLabel("User Field Access");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/UserFieldAccess/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/UserFieldAccess");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/UserFieldAccess/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("UserFieldAccess");

        return description;
    }
}
