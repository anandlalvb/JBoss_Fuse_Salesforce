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
 * Salesforce DTO for SObject ActivityHistory
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("ActivityHistory")
public class ActivityHistory extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // AccountId
    private String AccountId;

    @JsonProperty("AccountId")
    public String getAccountId() {
        return this.AccountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    // WhoId
    private String WhoId;

    @JsonProperty("WhoId")
    public String getWhoId() {
        return this.WhoId;
    }

    @JsonProperty("WhoId")
    public void setWhoId(String WhoId) {
        this.WhoId = WhoId;
    }

    // WhatId
    private String WhatId;

    @JsonProperty("WhatId")
    public String getWhatId() {
        return this.WhatId;
    }

    @JsonProperty("WhatId")
    public void setWhatId(String WhatId) {
        this.WhatId = WhatId;
    }

    // Subject
    private String Subject;

    @JsonProperty("Subject")
    public String getSubject() {
        return this.Subject;
    }

    @JsonProperty("Subject")
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    // IsTask
    private Boolean IsTask;

    @JsonProperty("IsTask")
    public Boolean getIsTask() {
        return this.IsTask;
    }

    @JsonProperty("IsTask")
    public void setIsTask(Boolean IsTask) {
        this.IsTask = IsTask;
    }

    // ActivityDate
    private java.time.LocalDate ActivityDate;

    @JsonProperty("ActivityDate")
    public java.time.LocalDate getActivityDate() {
        return this.ActivityDate;
    }

    @JsonProperty("ActivityDate")
    public void setActivityDate(java.time.LocalDate ActivityDate) {
        this.ActivityDate = ActivityDate;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private ActivityHistory_StatusEnum Status;

    @JsonProperty("Status")
    public ActivityHistory_StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(ActivityHistory_StatusEnum Status) {
        this.Status = Status;
    }

    // Priority
    @XStreamConverter(PicklistEnumConverter.class)
    private ActivityHistory_PriorityEnum Priority;

    @JsonProperty("Priority")
    public ActivityHistory_PriorityEnum getPriority() {
        return this.Priority;
    }

    @JsonProperty("Priority")
    public void setPriority(ActivityHistory_PriorityEnum Priority) {
        this.Priority = Priority;
    }

    // IsHighPriority
    private Boolean IsHighPriority;

    @JsonProperty("IsHighPriority")
    public Boolean getIsHighPriority() {
        return this.IsHighPriority;
    }

    @JsonProperty("IsHighPriority")
    public void setIsHighPriority(Boolean IsHighPriority) {
        this.IsHighPriority = IsHighPriority;
    }

    // ActivityType
    @XStreamConverter(PicklistEnumConverter.class)
    private ActivityHistory_ActivityTypeEnum ActivityType;

    @JsonProperty("ActivityType")
    public ActivityHistory_ActivityTypeEnum getActivityType() {
        return this.ActivityType;
    }

    @JsonProperty("ActivityType")
    public void setActivityType(ActivityHistory_ActivityTypeEnum ActivityType) {
        this.ActivityType = ActivityType;
    }

    // IsClosed
    private Boolean IsClosed;

    @JsonProperty("IsClosed")
    public Boolean getIsClosed() {
        return this.IsClosed;
    }

    @JsonProperty("IsClosed")
    public void setIsClosed(Boolean IsClosed) {
        this.IsClosed = IsClosed;
    }

    // IsAllDayEvent
    private Boolean IsAllDayEvent;

    @JsonProperty("IsAllDayEvent")
    public Boolean getIsAllDayEvent() {
        return this.IsAllDayEvent;
    }

    @JsonProperty("IsAllDayEvent")
    public void setIsAllDayEvent(Boolean IsAllDayEvent) {
        this.IsAllDayEvent = IsAllDayEvent;
    }

    // IsVisibleInSelfService
    private Boolean IsVisibleInSelfService;

    @JsonProperty("IsVisibleInSelfService")
    public Boolean getIsVisibleInSelfService() {
        return this.IsVisibleInSelfService;
    }

    @JsonProperty("IsVisibleInSelfService")
    public void setIsVisibleInSelfService(Boolean IsVisibleInSelfService) {
        this.IsVisibleInSelfService = IsVisibleInSelfService;
    }

    // DurationInMinutes
    private Integer DurationInMinutes;

    @JsonProperty("DurationInMinutes")
    public Integer getDurationInMinutes() {
        return this.DurationInMinutes;
    }

    @JsonProperty("DurationInMinutes")
    public void setDurationInMinutes(Integer DurationInMinutes) {
        this.DurationInMinutes = DurationInMinutes;
    }

    // Location
    private String Location;

    @JsonProperty("Location")
    public String getLocation() {
        return this.Location;
    }

    @JsonProperty("Location")
    public void setLocation(String Location) {
        this.Location = Location;
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

    // CallDurationInSeconds
    private Integer CallDurationInSeconds;

    @JsonProperty("CallDurationInSeconds")
    public Integer getCallDurationInSeconds() {
        return this.CallDurationInSeconds;
    }

    @JsonProperty("CallDurationInSeconds")
    public void setCallDurationInSeconds(Integer CallDurationInSeconds) {
        this.CallDurationInSeconds = CallDurationInSeconds;
    }

    // CallType
    @XStreamConverter(PicklistEnumConverter.class)
    private ActivityHistory_CallTypeEnum CallType;

    @JsonProperty("CallType")
    public ActivityHistory_CallTypeEnum getCallType() {
        return this.CallType;
    }

    @JsonProperty("CallType")
    public void setCallType(ActivityHistory_CallTypeEnum CallType) {
        this.CallType = CallType;
    }

    // CallDisposition
    private String CallDisposition;

    @JsonProperty("CallDisposition")
    public String getCallDisposition() {
        return this.CallDisposition;
    }

    @JsonProperty("CallDisposition")
    public void setCallDisposition(String CallDisposition) {
        this.CallDisposition = CallDisposition;
    }

    // CallObject
    private String CallObject;

    @JsonProperty("CallObject")
    public String getCallObject() {
        return this.CallObject;
    }

    @JsonProperty("CallObject")
    public void setCallObject(String CallObject) {
        this.CallObject = CallObject;
    }

    // ReminderDateTime
    private java.time.ZonedDateTime ReminderDateTime;

    @JsonProperty("ReminderDateTime")
    public java.time.ZonedDateTime getReminderDateTime() {
        return this.ReminderDateTime;
    }

    @JsonProperty("ReminderDateTime")
    public void setReminderDateTime(java.time.ZonedDateTime ReminderDateTime) {
        this.ReminderDateTime = ReminderDateTime;
    }

    // IsReminderSet
    private Boolean IsReminderSet;

    @JsonProperty("IsReminderSet")
    public Boolean getIsReminderSet() {
        return this.IsReminderSet;
    }

    @JsonProperty("IsReminderSet")
    public void setIsReminderSet(Boolean IsReminderSet) {
        this.IsReminderSet = IsReminderSet;
    }

    // EndDateTime
    private java.time.ZonedDateTime EndDateTime;

    @JsonProperty("EndDateTime")
    public java.time.ZonedDateTime getEndDateTime() {
        return this.EndDateTime;
    }

    @JsonProperty("EndDateTime")
    public void setEndDateTime(java.time.ZonedDateTime EndDateTime) {
        this.EndDateTime = EndDateTime;
    }

    // StartDateTime
    private java.time.ZonedDateTime StartDateTime;

    @JsonProperty("StartDateTime")
    public java.time.ZonedDateTime getStartDateTime() {
        return this.StartDateTime;
    }

    @JsonProperty("StartDateTime")
    public void setStartDateTime(java.time.ZonedDateTime StartDateTime) {
        this.StartDateTime = StartDateTime;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Activity ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("AccountId", "Account ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("WhoId", "Name ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("WhatId", "Related To ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("Subject", "Subject", "combobox", "xsd:string", 80, false, true, true, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("IsTask", "Task", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("ActivityDate", "Date", "date", "xsd:date", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("OwnerId", "Assigned To ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("Status", "Status", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("Priority", "Priority", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("IsHighPriority", "High Priority", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("ActivityType", "Type", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("IsClosed", "Closed", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("IsAllDayEvent", "All-Day Event", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("IsVisibleInSelfService", "Public", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("DurationInMinutes", "Duration", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("Location", "Location", "string", "xsd:string", 80, false, true, false, false, false, false, false);
        fields1.add(sObjectField17);
        final SObjectField sObjectField18 = createField("Description", "Comments", "textarea", "xsd:string", 32000, false, true, false, false, false, false, false);
        fields1.add(sObjectField18);
        final SObjectField sObjectField19 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField19);
        final SObjectField sObjectField20 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField20);
        final SObjectField sObjectField21 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField21);
        final SObjectField sObjectField22 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField22);
        final SObjectField sObjectField23 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField23);
        final SObjectField sObjectField24 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField24);
        final SObjectField sObjectField25 = createField("CallDurationInSeconds", "Call Duration", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField25);
        final SObjectField sObjectField26 = createField("CallType", "Call Type", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField26);
        final SObjectField sObjectField27 = createField("CallDisposition", "Call Result", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField27);
        final SObjectField sObjectField28 = createField("CallObject", "Call Object Identifier", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField28);
        final SObjectField sObjectField29 = createField("ReminderDateTime", "Reminder Date/Time", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField29);
        final SObjectField sObjectField30 = createField("IsReminderSet", "Reminder Set", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField30);
        final SObjectField sObjectField31 = createField("EndDateTime", "End", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField31);
        final SObjectField sObjectField32 = createField("StartDateTime", "Start", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField32);

        description.setLabelPlural("Activity History");
        description.setLabel("Activity History");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/ActivityHistory/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/ActivityHistory");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/ActivityHistory/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("ActivityHistory");

        return description;
    }
}
