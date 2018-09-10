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
 * Salesforce DTO for SObject Task
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("Task")
public class Task extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

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
    private Task_StatusEnum Status;

    @JsonProperty("Status")
    public Task_StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(Task_StatusEnum Status) {
        this.Status = Status;
    }

    // Priority
    @XStreamConverter(PicklistEnumConverter.class)
    private Task_PriorityEnum Priority;

    @JsonProperty("Priority")
    public Task_PriorityEnum getPriority() {
        return this.Priority;
    }

    @JsonProperty("Priority")
    public void setPriority(Task_PriorityEnum Priority) {
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

    // IsArchived
    private Boolean IsArchived;

    @JsonProperty("IsArchived")
    public Boolean getIsArchived() {
        return this.IsArchived;
    }

    @JsonProperty("IsArchived")
    public void setIsArchived(Boolean IsArchived) {
        this.IsArchived = IsArchived;
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
    private Task_CallTypeEnum CallType;

    @JsonProperty("CallType")
    public Task_CallTypeEnum getCallType() {
        return this.CallType;
    }

    @JsonProperty("CallType")
    public void setCallType(Task_CallTypeEnum CallType) {
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

    // RecurrenceActivityId
    private String RecurrenceActivityId;

    @JsonProperty("RecurrenceActivityId")
    public String getRecurrenceActivityId() {
        return this.RecurrenceActivityId;
    }

    @JsonProperty("RecurrenceActivityId")
    public void setRecurrenceActivityId(String RecurrenceActivityId) {
        this.RecurrenceActivityId = RecurrenceActivityId;
    }

    // IsRecurrence
    private Boolean IsRecurrence;

    @JsonProperty("IsRecurrence")
    public Boolean getIsRecurrence() {
        return this.IsRecurrence;
    }

    @JsonProperty("IsRecurrence")
    public void setIsRecurrence(Boolean IsRecurrence) {
        this.IsRecurrence = IsRecurrence;
    }

    // RecurrenceStartDateOnly
    private java.time.LocalDate RecurrenceStartDateOnly;

    @JsonProperty("RecurrenceStartDateOnly")
    public java.time.LocalDate getRecurrenceStartDateOnly() {
        return this.RecurrenceStartDateOnly;
    }

    @JsonProperty("RecurrenceStartDateOnly")
    public void setRecurrenceStartDateOnly(java.time.LocalDate RecurrenceStartDateOnly) {
        this.RecurrenceStartDateOnly = RecurrenceStartDateOnly;
    }

    // RecurrenceEndDateOnly
    private java.time.LocalDate RecurrenceEndDateOnly;

    @JsonProperty("RecurrenceEndDateOnly")
    public java.time.LocalDate getRecurrenceEndDateOnly() {
        return this.RecurrenceEndDateOnly;
    }

    @JsonProperty("RecurrenceEndDateOnly")
    public void setRecurrenceEndDateOnly(java.time.LocalDate RecurrenceEndDateOnly) {
        this.RecurrenceEndDateOnly = RecurrenceEndDateOnly;
    }

    // RecurrenceTimeZoneSidKey
    @XStreamConverter(PicklistEnumConverter.class)
    private Task_RecurrenceTimeZoneSidKeyEnum RecurrenceTimeZoneSidKey;

    @JsonProperty("RecurrenceTimeZoneSidKey")
    public Task_RecurrenceTimeZoneSidKeyEnum getRecurrenceTimeZoneSidKey() {
        return this.RecurrenceTimeZoneSidKey;
    }

    @JsonProperty("RecurrenceTimeZoneSidKey")
    public void setRecurrenceTimeZoneSidKey(Task_RecurrenceTimeZoneSidKeyEnum RecurrenceTimeZoneSidKey) {
        this.RecurrenceTimeZoneSidKey = RecurrenceTimeZoneSidKey;
    }

    // RecurrenceType
    @XStreamConverter(PicklistEnumConverter.class)
    private Task_RecurrenceTypeEnum RecurrenceType;

    @JsonProperty("RecurrenceType")
    public Task_RecurrenceTypeEnum getRecurrenceType() {
        return this.RecurrenceType;
    }

    @JsonProperty("RecurrenceType")
    public void setRecurrenceType(Task_RecurrenceTypeEnum RecurrenceType) {
        this.RecurrenceType = RecurrenceType;
    }

    // RecurrenceInterval
    private Integer RecurrenceInterval;

    @JsonProperty("RecurrenceInterval")
    public Integer getRecurrenceInterval() {
        return this.RecurrenceInterval;
    }

    @JsonProperty("RecurrenceInterval")
    public void setRecurrenceInterval(Integer RecurrenceInterval) {
        this.RecurrenceInterval = RecurrenceInterval;
    }

    // RecurrenceDayOfWeekMask
    private Integer RecurrenceDayOfWeekMask;

    @JsonProperty("RecurrenceDayOfWeekMask")
    public Integer getRecurrenceDayOfWeekMask() {
        return this.RecurrenceDayOfWeekMask;
    }

    @JsonProperty("RecurrenceDayOfWeekMask")
    public void setRecurrenceDayOfWeekMask(Integer RecurrenceDayOfWeekMask) {
        this.RecurrenceDayOfWeekMask = RecurrenceDayOfWeekMask;
    }

    // RecurrenceDayOfMonth
    private Integer RecurrenceDayOfMonth;

    @JsonProperty("RecurrenceDayOfMonth")
    public Integer getRecurrenceDayOfMonth() {
        return this.RecurrenceDayOfMonth;
    }

    @JsonProperty("RecurrenceDayOfMonth")
    public void setRecurrenceDayOfMonth(Integer RecurrenceDayOfMonth) {
        this.RecurrenceDayOfMonth = RecurrenceDayOfMonth;
    }

    // RecurrenceInstance
    @XStreamConverter(PicklistEnumConverter.class)
    private Task_RecurrenceInstanceEnum RecurrenceInstance;

    @JsonProperty("RecurrenceInstance")
    public Task_RecurrenceInstanceEnum getRecurrenceInstance() {
        return this.RecurrenceInstance;
    }

    @JsonProperty("RecurrenceInstance")
    public void setRecurrenceInstance(Task_RecurrenceInstanceEnum RecurrenceInstance) {
        this.RecurrenceInstance = RecurrenceInstance;
    }

    // RecurrenceMonthOfYear
    @XStreamConverter(PicklistEnumConverter.class)
    private Task_RecurrenceMonthOfYearEnum RecurrenceMonthOfYear;

    @JsonProperty("RecurrenceMonthOfYear")
    public Task_RecurrenceMonthOfYearEnum getRecurrenceMonthOfYear() {
        return this.RecurrenceMonthOfYear;
    }

    @JsonProperty("RecurrenceMonthOfYear")
    public void setRecurrenceMonthOfYear(Task_RecurrenceMonthOfYearEnum RecurrenceMonthOfYear) {
        this.RecurrenceMonthOfYear = RecurrenceMonthOfYear;
    }

    // RecurrenceRegeneratedType
    @XStreamConverter(PicklistEnumConverter.class)
    private Task_RecurrenceRegeneratedTypeEnum RecurrenceRegeneratedType;

    @JsonProperty("RecurrenceRegeneratedType")
    public Task_RecurrenceRegeneratedTypeEnum getRecurrenceRegeneratedType() {
        return this.RecurrenceRegeneratedType;
    }

    @JsonProperty("RecurrenceRegeneratedType")
    public void setRecurrenceRegeneratedType(Task_RecurrenceRegeneratedTypeEnum RecurrenceRegeneratedType) {
        this.RecurrenceRegeneratedType = RecurrenceRegeneratedType;
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
        final SObjectField sObjectField2 = createField("WhoId", "Name ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("WhatId", "Related To ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("Subject", "Subject", "combobox", "xsd:string", 255, false, true, true, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("ActivityDate", "Due Date Only", "date", "xsd:date", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("Status", "Status", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("Priority", "Priority", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("IsHighPriority", "High Priority", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("OwnerId", "Assigned To ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("Description", "Description", "textarea", "xsd:string", 32000, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("AccountId", "Account ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("IsClosed", "Closed", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField17);
        final SObjectField sObjectField18 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField18);
        final SObjectField sObjectField19 = createField("IsArchived", "Archived", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField19);
        final SObjectField sObjectField20 = createField("CallDurationInSeconds", "Call Duration", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField20);
        final SObjectField sObjectField21 = createField("CallType", "Call Type", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField21);
        final SObjectField sObjectField22 = createField("CallDisposition", "Call Result", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField22);
        final SObjectField sObjectField23 = createField("CallObject", "Call Object Identifier", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField23);
        final SObjectField sObjectField24 = createField("ReminderDateTime", "Reminder Date/Time", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField24);
        final SObjectField sObjectField25 = createField("IsReminderSet", "Reminder Set", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField25);
        final SObjectField sObjectField26 = createField("RecurrenceActivityId", "Recurrence Activity ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField26);
        final SObjectField sObjectField27 = createField("IsRecurrence", "Create Recurring Series of Tasks", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField27);
        final SObjectField sObjectField28 = createField("RecurrenceStartDateOnly", "Recurrence Start", "date", "xsd:date", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField28);
        final SObjectField sObjectField29 = createField("RecurrenceEndDateOnly", "Recurrence End", "date", "xsd:date", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField29);
        final SObjectField sObjectField30 = createField("RecurrenceTimeZoneSidKey", "Recurrence Time Zone", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField30);
        final SObjectField sObjectField31 = createField("RecurrenceType", "Recurrence Type", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField31);
        final SObjectField sObjectField32 = createField("RecurrenceInterval", "Recurrence Interval", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField32);
        final SObjectField sObjectField33 = createField("RecurrenceDayOfWeekMask", "Recurrence Day of Week Mask", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField33);
        final SObjectField sObjectField34 = createField("RecurrenceDayOfMonth", "Recurrence Day of Month", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField34);
        final SObjectField sObjectField35 = createField("RecurrenceInstance", "Recurrence Instance", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField35);
        final SObjectField sObjectField36 = createField("RecurrenceMonthOfYear", "Recurrence Month of Year", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField36);
        final SObjectField sObjectField37 = createField("RecurrenceRegeneratedType", "Repeat This Task", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField37);

        description.setLabelPlural("Tasks");
        description.setLabel("Task");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/Task/describe");
        sObjectDescriptionUrls1.setLayouts("/services/data/v34.0/sobjects/Task/describe/layouts");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/Task");
        sObjectDescriptionUrls1.setQuickActions("/services/data/v34.0/sobjects/Task/quickActions");
        sObjectDescriptionUrls1.setUiEditTemplate("https://na57.salesforce.com/{ID}/e");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/Task/{ID}");
        sObjectDescriptionUrls1.setCompactLayouts("/services/data/v34.0/sobjects/Task/describe/compactLayouts");
        sObjectDescriptionUrls1.setUiNewRecord("https://na57.salesforce.com/00T/e");
        sObjectDescriptionUrls1.setUiDetailTemplate("https://na57.salesforce.com/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("Task");

        return description;
    }
}