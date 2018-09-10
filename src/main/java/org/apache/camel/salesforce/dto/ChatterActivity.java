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
 * Salesforce DTO for SObject ChatterActivity
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("ChatterActivity")
public class ChatterActivity extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    // PostCount
    private Integer PostCount;

    @JsonProperty("PostCount")
    public Integer getPostCount() {
        return this.PostCount;
    }

    @JsonProperty("PostCount")
    public void setPostCount(Integer PostCount) {
        this.PostCount = PostCount;
    }

    // CommentCount
    private Integer CommentCount;

    @JsonProperty("CommentCount")
    public Integer getCommentCount() {
        return this.CommentCount;
    }

    @JsonProperty("CommentCount")
    public void setCommentCount(Integer CommentCount) {
        this.CommentCount = CommentCount;
    }

    // CommentReceivedCount
    private Integer CommentReceivedCount;

    @JsonProperty("CommentReceivedCount")
    public Integer getCommentReceivedCount() {
        return this.CommentReceivedCount;
    }

    @JsonProperty("CommentReceivedCount")
    public void setCommentReceivedCount(Integer CommentReceivedCount) {
        this.CommentReceivedCount = CommentReceivedCount;
    }

    // LikeReceivedCount
    private Integer LikeReceivedCount;

    @JsonProperty("LikeReceivedCount")
    public Integer getLikeReceivedCount() {
        return this.LikeReceivedCount;
    }

    @JsonProperty("LikeReceivedCount")
    public void setLikeReceivedCount(Integer LikeReceivedCount) {
        this.LikeReceivedCount = LikeReceivedCount;
    }

    // InfluenceRawRank
    private Integer InfluenceRawRank;

    @JsonProperty("InfluenceRawRank")
    public Integer getInfluenceRawRank() {
        return this.InfluenceRawRank;
    }

    @JsonProperty("InfluenceRawRank")
    public void setInfluenceRawRank(Integer InfluenceRawRank) {
        this.InfluenceRawRank = InfluenceRawRank;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Chatter Activity ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("ParentId", "Parent ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("PostCount", "Post Count", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("CommentCount", "Comment Count", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("CommentReceivedCount", "Comment Received Count", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("LikeReceivedCount", "Like Received Count", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("InfluenceRawRank", "Influence Raw Rank", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);

        description.setLabelPlural("Chatter Activity");
        description.setLabel("Chatter Activity");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/ChatterActivity/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/ChatterActivity");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/ChatterActivity/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("ChatterActivity");

        return description;
    }
}