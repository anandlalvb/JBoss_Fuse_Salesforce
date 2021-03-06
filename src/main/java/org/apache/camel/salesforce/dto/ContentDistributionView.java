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
 * Salesforce DTO for SObject ContentDistributionView
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("ContentDistributionView")
public class ContentDistributionView extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // DistributionId
    private String DistributionId;

    @JsonProperty("DistributionId")
    public String getDistributionId() {
        return this.DistributionId;
    }

    @JsonProperty("DistributionId")
    public void setDistributionId(String DistributionId) {
        this.DistributionId = DistributionId;
    }

    // ParentViewId
    private String ParentViewId;

    @JsonProperty("ParentViewId")
    public String getParentViewId() {
        return this.ParentViewId;
    }

    @JsonProperty("ParentViewId")
    public void setParentViewId(String ParentViewId) {
        this.ParentViewId = ParentViewId;
    }

    // IsInternal
    private Boolean IsInternal;

    @JsonProperty("IsInternal")
    public Boolean getIsInternal() {
        return this.IsInternal;
    }

    @JsonProperty("IsInternal")
    public void setIsInternal(Boolean IsInternal) {
        this.IsInternal = IsInternal;
    }

    // IsDownload
    private Boolean IsDownload;

    @JsonProperty("IsDownload")
    public Boolean getIsDownload() {
        return this.IsDownload;
    }

    @JsonProperty("IsDownload")
    public void setIsDownload(Boolean IsDownload) {
        this.IsDownload = IsDownload;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Content Delivery View ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("DistributionId", "Content Delivery ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("ParentViewId", "Content Delivery View ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("CreatedDate", "View Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("IsInternal", "Internal View", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("IsDownload", "File Downloaded", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);

        description.setLabelPlural("Content Delivery Views");
        description.setLabel("Content Delivery View");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/ContentDistributionView/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/ContentDistributionView");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/ContentDistributionView/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("ContentDistributionView");

        return description;
    }
}
