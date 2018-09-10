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
 * Salesforce DTO for SObject FlowInterview
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("FlowInterview")
public class FlowInterview extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // CurrentElement
    private String CurrentElement;

    @JsonProperty("CurrentElement")
    public String getCurrentElement() {
        return this.CurrentElement;
    }

    @JsonProperty("CurrentElement")
    public void setCurrentElement(String CurrentElement) {
        this.CurrentElement = CurrentElement;
    }

    // InterviewLabel
    private String InterviewLabel;

    @JsonProperty("InterviewLabel")
    public String getInterviewLabel() {
        return this.InterviewLabel;
    }

    @JsonProperty("InterviewLabel")
    public void setInterviewLabel(String InterviewLabel) {
        this.InterviewLabel = InterviewLabel;
    }

    // PauseLabel
    private String PauseLabel;

    @JsonProperty("PauseLabel")
    public String getPauseLabel() {
        return this.PauseLabel;
    }

    @JsonProperty("PauseLabel")
    public void setPauseLabel(String PauseLabel) {
        this.PauseLabel = PauseLabel;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Flow Interview Id", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("OwnerId", "Owner ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("Name", "Name", "string", "xsd:string", 255, false, false, true, false, false, false, true);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("CurrentElement", "Current Element", "string", "xsd:string", 100, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("InterviewLabel", "Interview Label", "string", "xsd:string", 1000, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("PauseLabel", "Pause Reason", "string", "xsd:string", 1000, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);

        description.setLabelPlural("Flow Interviews");
        description.setLabel("Flow Interview");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/FlowInterview/describe");
        sObjectDescriptionUrls1.setLayouts("/services/data/v34.0/sobjects/FlowInterview/describe/layouts");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/FlowInterview");
        sObjectDescriptionUrls1.setUiEditTemplate("https://na57.salesforce.com/{ID}/e");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/FlowInterview/{ID}");
        sObjectDescriptionUrls1.setCompactLayouts("/services/data/v34.0/sobjects/FlowInterview/describe/compactLayouts");
        sObjectDescriptionUrls1.setUiNewRecord("https://na57.salesforce.com/0Fo/e");
        sObjectDescriptionUrls1.setUiDetailTemplate("https://na57.salesforce.com/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("FlowInterview");

        return description;
    }
}
