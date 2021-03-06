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
 * Salesforce DTO for SObject ApexLog
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("ApexLog")
public class ApexLog extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // LogUserId
    private String LogUserId;

    @JsonProperty("LogUserId")
    public String getLogUserId() {
        return this.LogUserId;
    }

    @JsonProperty("LogUserId")
    public void setLogUserId(String LogUserId) {
        this.LogUserId = LogUserId;
    }

    // LogLength
    private Integer LogLength;

    @JsonProperty("LogLength")
    public Integer getLogLength() {
        return this.LogLength;
    }

    @JsonProperty("LogLength")
    public void setLogLength(Integer LogLength) {
        this.LogLength = LogLength;
    }

    // Request
    private String Request;

    @JsonProperty("Request")
    public String getRequest() {
        return this.Request;
    }

    @JsonProperty("Request")
    public void setRequest(String Request) {
        this.Request = Request;
    }

    // Operation
    private String Operation;

    @JsonProperty("Operation")
    public String getOperation() {
        return this.Operation;
    }

    @JsonProperty("Operation")
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    // Application
    private String Application;

    @JsonProperty("Application")
    public String getApplication() {
        return this.Application;
    }

    @JsonProperty("Application")
    public void setApplication(String Application) {
        this.Application = Application;
    }

    // Status
    private String Status;

    @JsonProperty("Status")
    public String getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(String Status) {
        this.Status = Status;
    }

    // DurationMilliseconds
    private Integer DurationMilliseconds;

    @JsonProperty("DurationMilliseconds")
    public Integer getDurationMilliseconds() {
        return this.DurationMilliseconds;
    }

    @JsonProperty("DurationMilliseconds")
    public void setDurationMilliseconds(Integer DurationMilliseconds) {
        this.DurationMilliseconds = DurationMilliseconds;
    }

    // StartTime
    private java.time.ZonedDateTime StartTime;

    @JsonProperty("StartTime")
    public java.time.ZonedDateTime getStartTime() {
        return this.StartTime;
    }

    @JsonProperty("StartTime")
    public void setStartTime(java.time.ZonedDateTime StartTime) {
        this.StartTime = StartTime;
    }

    // Location
    @XStreamConverter(PicklistEnumConverter.class)
    private ApexLog_LocationEnum Location;

    @JsonProperty("Location")
    public ApexLog_LocationEnum getLocation() {
        return this.Location;
    }

    @JsonProperty("Location")
    public void setLocation(ApexLog_LocationEnum Location) {
        this.Location = Location;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Log ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("LogUserId", "Log User ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("LogLength", "Log Size (bytes)", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("LastModifiedDate", "Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("Request", "Request Type", "string", "xsd:string", 16, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("Operation", "Operation", "string", "xsd:string", 128, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("Application", "Application", "string", "xsd:string", 64, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("Status", "Status", "string", "xsd:string", 255, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("DurationMilliseconds", "Duration (ms)", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("StartTime", "Start Time", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("Location", "Location", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);

        description.setLabelPlural("Apex Debug Log");
        description.setLabel("Apex Debug Log");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/ApexLog/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/ApexLog");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/ApexLog/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("ApexLog");

        return description;
    }
}
