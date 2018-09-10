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
 * Salesforce DTO for SObject FeedTrackedChange
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("FeedTrackedChange")
public class FeedTrackedChange extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // FeedItemId
    private String FeedItemId;

    @JsonProperty("FeedItemId")
    public String getFeedItemId() {
        return this.FeedItemId;
    }

    @JsonProperty("FeedItemId")
    public void setFeedItemId(String FeedItemId) {
        this.FeedItemId = FeedItemId;
    }

    // FieldName
    private String FieldName;

    @JsonProperty("FieldName")
    public String getFieldName() {
        return this.FieldName;
    }

    @JsonProperty("FieldName")
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
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

        final SObjectField sObjectField1 = createField("Id", "Feed Tracked Change ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("FeedItemId", "Feed Item ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("FieldName", "Field", "string", "xsd:string", 120, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("OldValue", "Old Value", "anyType", "xsd:anyType", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("NewValue", "New Value", "anyType", "xsd:anyType", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField5);

        description.setLabelPlural("Feed Tracked Changes");
        description.setLabel("Feed Tracked Change");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/FeedTrackedChange/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/FeedTrackedChange");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/FeedTrackedChange/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("FeedTrackedChange");

        return description;
    }
}