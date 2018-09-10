/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Type
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum OrderItemFeed_TypeEnum {

    // ActivityEvent
    ACTIVITYEVENT("ActivityEvent"),
    // AdvancedTextPost
    ADVANCEDTEXTPOST("AdvancedTextPost"),
    // AnnouncementPost
    ANNOUNCEMENTPOST("AnnouncementPost"),
    // ApprovalPost
    APPROVALPOST("ApprovalPost"),
    // AttachArticleEvent
    ATTACHARTICLEEVENT("AttachArticleEvent"),
    // BasicTemplateFeedItem
    BASICTEMPLATEFEEDITEM("BasicTemplateFeedItem"),
    // CallLogPost
    CALLLOGPOST("CallLogPost"),
    // CanvasPost
    CANVASPOST("CanvasPost"),
    // CaseCommentPost
    CASECOMMENTPOST("CaseCommentPost"),
    // ChangeStatusPost
    CHANGESTATUSPOST("ChangeStatusPost"),
    // ChatTranscriptPost
    CHATTRANSCRIPTPOST("ChatTranscriptPost"),
    // CollaborationGroupCreated
    COLLABORATIONGROUPCREATED("CollaborationGroupCreated"),
    // CollaborationGroupUnarchived
    COLLABORATIONGROUPUNARCHIVED("CollaborationGroupUnarchived"),
    // ContentPost
    CONTENTPOST("ContentPost"),
    // CreateRecordEvent
    CREATERECORDEVENT("CreateRecordEvent"),
    // DashboardComponentSnapshot
    DASHBOARDCOMPONENTSNAPSHOT("DashboardComponentSnapshot"),
    // EmailMessageEvent
    EMAILMESSAGEEVENT("EmailMessageEvent"),
    // FacebookPost
    FACEBOOKPOST("FacebookPost"),
    // LinkPost
    LINKPOST("LinkPost"),
    // MilestoneEvent
    MILESTONEEVENT("MilestoneEvent"),
    // PollPost
    POLLPOST("PollPost"),
    // ProfileSkillPost
    PROFILESKILLPOST("ProfileSkillPost"),
    // QuestionPost
    QUESTIONPOST("QuestionPost"),
    // ReplyPost
    REPLYPOST("ReplyPost"),
    // RypplePost
    RYPPLEPOST("RypplePost"),
    // SocialPost
    SOCIALPOST("SocialPost"),
    // TextPost
    TEXTPOST("TextPost"),
    // TrackedChange
    TRACKEDCHANGE("TrackedChange"),
    // UserStatus
    USERSTATUS("UserStatus");

    final String value;

    private OrderItemFeed_TypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OrderItemFeed_TypeEnum fromValue(String value) {
        for (OrderItemFeed_TypeEnum e : OrderItemFeed_TypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
