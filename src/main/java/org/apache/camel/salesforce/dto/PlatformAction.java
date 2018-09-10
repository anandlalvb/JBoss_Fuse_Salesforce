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
 * Salesforce DTO for SObject PlatformAction
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("PlatformAction")
public class PlatformAction extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // ExternalId
    private String ExternalId;

    @JsonProperty("ExternalId")
    public String getExternalId() {
        return this.ExternalId;
    }

    @JsonProperty("ExternalId")
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    // Label
    private String Label;

    @JsonProperty("Label")
    public String getLabel() {
        return this.Label;
    }

    @JsonProperty("Label")
    public void setLabel(String Label) {
        this.Label = Label;
    }

    // Type
    @XStreamConverter(PicklistEnumConverter.class)
    private PlatformAction_TypeEnum Type;

    @JsonProperty("Type")
    public PlatformAction_TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(PlatformAction_TypeEnum Type) {
        this.Type = Type;
    }

    // Subtype
    private String Subtype;

    @JsonProperty("Subtype")
    public String getSubtype() {
        return this.Subtype;
    }

    @JsonProperty("Subtype")
    public void setSubtype(String Subtype) {
        this.Subtype = Subtype;
    }

    // ApiName
    private String ApiName;

    @JsonProperty("ApiName")
    public String getApiName() {
        return this.ApiName;
    }

    @JsonProperty("ApiName")
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    // ActionTargetUrl
    private String ActionTargetUrl;

    @JsonProperty("ActionTargetUrl")
    public String getActionTargetUrl() {
        return this.ActionTargetUrl;
    }

    @JsonProperty("ActionTargetUrl")
    public void setActionTargetUrl(String ActionTargetUrl) {
        this.ActionTargetUrl = ActionTargetUrl;
    }

    // ActionTargetType
    @XStreamConverter(PicklistEnumConverter.class)
    private PlatformAction_ActionTargetTypeEnum ActionTargetType;

    @JsonProperty("ActionTargetType")
    public PlatformAction_ActionTargetTypeEnum getActionTargetType() {
        return this.ActionTargetType;
    }

    @JsonProperty("ActionTargetType")
    public void setActionTargetType(PlatformAction_ActionTargetTypeEnum ActionTargetType) {
        this.ActionTargetType = ActionTargetType;
    }

    // ConfirmationMessage
    private String ConfirmationMessage;

    @JsonProperty("ConfirmationMessage")
    public String getConfirmationMessage() {
        return this.ConfirmationMessage;
    }

    @JsonProperty("ConfirmationMessage")
    public void setConfirmationMessage(String ConfirmationMessage) {
        this.ConfirmationMessage = ConfirmationMessage;
    }

    // GroupId
    private String GroupId;

    @JsonProperty("GroupId")
    public String getGroupId() {
        return this.GroupId;
    }

    @JsonProperty("GroupId")
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    // IsGroupDefault
    private Boolean IsGroupDefault;

    @JsonProperty("IsGroupDefault")
    public Boolean getIsGroupDefault() {
        return this.IsGroupDefault;
    }

    @JsonProperty("IsGroupDefault")
    public void setIsGroupDefault(Boolean IsGroupDefault) {
        this.IsGroupDefault = IsGroupDefault;
    }

    // Category
    @XStreamConverter(PicklistEnumConverter.class)
    private PlatformAction_CategoryEnum Category;

    @JsonProperty("Category")
    public PlatformAction_CategoryEnum getCategory() {
        return this.Category;
    }

    @JsonProperty("Category")
    public void setCategory(PlatformAction_CategoryEnum Category) {
        this.Category = Category;
    }

    // InvocationStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private PlatformAction_InvocationStatusEnum InvocationStatus;

    @JsonProperty("InvocationStatus")
    public PlatformAction_InvocationStatusEnum getInvocationStatus() {
        return this.InvocationStatus;
    }

    @JsonProperty("InvocationStatus")
    public void setInvocationStatus(PlatformAction_InvocationStatusEnum InvocationStatus) {
        this.InvocationStatus = InvocationStatus;
    }

    // InvokedByUserId
    private String InvokedByUserId;

    @JsonProperty("InvokedByUserId")
    public String getInvokedByUserId() {
        return this.InvokedByUserId;
    }

    @JsonProperty("InvokedByUserId")
    public void setInvokedByUserId(String InvokedByUserId) {
        this.InvokedByUserId = InvokedByUserId;
    }

    // SourceEntity
    private String SourceEntity;

    @JsonProperty("SourceEntity")
    public String getSourceEntity() {
        return this.SourceEntity;
    }

    @JsonProperty("SourceEntity")
    public void setSourceEntity(String SourceEntity) {
        this.SourceEntity = SourceEntity;
    }

    // ActionListContext
    @XStreamConverter(PicklistEnumConverter.class)
    private PlatformAction_ActionListContextEnum ActionListContext;

    @JsonProperty("ActionListContext")
    public PlatformAction_ActionListContextEnum getActionListContext() {
        return this.ActionListContext;
    }

    @JsonProperty("ActionListContext")
    public void setActionListContext(PlatformAction_ActionListContextEnum ActionListContext) {
        this.ActionListContext = ActionListContext;
    }

    // DeviceFormat
    @XStreamConverter(PicklistEnumConverter.class)
    private PlatformAction_DeviceFormatEnum DeviceFormat;

    @JsonProperty("DeviceFormat")
    public PlatformAction_DeviceFormatEnum getDeviceFormat() {
        return this.DeviceFormat;
    }

    @JsonProperty("DeviceFormat")
    public void setDeviceFormat(PlatformAction_DeviceFormatEnum DeviceFormat) {
        this.DeviceFormat = DeviceFormat;
    }

    // IconContentType
    private String IconContentType;

    @JsonProperty("IconContentType")
    public String getIconContentType() {
        return this.IconContentType;
    }

    @JsonProperty("IconContentType")
    public void setIconContentType(String IconContentType) {
        this.IconContentType = IconContentType;
    }

    // IconHeight
    private Integer IconHeight;

    @JsonProperty("IconHeight")
    public Integer getIconHeight() {
        return this.IconHeight;
    }

    @JsonProperty("IconHeight")
    public void setIconHeight(Integer IconHeight) {
        this.IconHeight = IconHeight;
    }

    // IconWidth
    private Integer IconWidth;

    @JsonProperty("IconWidth")
    public Integer getIconWidth() {
        return this.IconWidth;
    }

    @JsonProperty("IconWidth")
    public void setIconWidth(Integer IconWidth) {
        this.IconWidth = IconWidth;
    }

    // IconUrl
    private String IconUrl;

    @JsonProperty("IconUrl")
    public String getIconUrl() {
        return this.IconUrl;
    }

    @JsonProperty("IconUrl")
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    // IsMassAction
    private Boolean IsMassAction;

    @JsonProperty("IsMassAction")
    public Boolean getIsMassAction() {
        return this.IsMassAction;
    }

    @JsonProperty("IsMassAction")
    public void setIsMassAction(Boolean IsMassAction) {
        this.IsMassAction = IsMassAction;
    }

    // PrimaryColor
    private String PrimaryColor;

    @JsonProperty("PrimaryColor")
    public String getPrimaryColor() {
        return this.PrimaryColor;
    }

    @JsonProperty("PrimaryColor")
    public void setPrimaryColor(String PrimaryColor) {
        this.PrimaryColor = PrimaryColor;
    }

    // RelatedSourceEntity
    private String RelatedSourceEntity;

    @JsonProperty("RelatedSourceEntity")
    public String getRelatedSourceEntity() {
        return this.RelatedSourceEntity;
    }

    @JsonProperty("RelatedSourceEntity")
    public void setRelatedSourceEntity(String RelatedSourceEntity) {
        this.RelatedSourceEntity = RelatedSourceEntity;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Not used ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("ExternalId", "Platform Action ID", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("Label", "Label", "string", "xsd:string", 255, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("Type", "Type", "picklist", "xsd:string", 255, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("Subtype", "Subtype", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("ApiName", "API Name", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("ActionTargetUrl", "Action Target URL", "url", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("ActionTargetType", "Action Target Type", "picklist", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("ConfirmationMessage", "Confirmation Message", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("GroupId", "Group ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("IsGroupDefault", "Is Group Default", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("Category", "Category", "picklist", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("InvocationStatus", "Invocation Status", "picklist", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("InvokedByUserId", "User ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("SourceEntity", "Source Entity", "string", "xsd:string", 255, false, false, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("ActionListContext", "Action List Context", "picklist", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField17);
        final SObjectField sObjectField18 = createField("DeviceFormat", "Device Format", "picklist", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField18);
        final SObjectField sObjectField19 = createField("IconContentType", "Icon Content Type", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField19);
        final SObjectField sObjectField20 = createField("IconHeight", "Icon Height", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField20);
        final SObjectField sObjectField21 = createField("IconWidth", "Icon Width", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField21);
        final SObjectField sObjectField22 = createField("IconUrl", "Icon URL", "url", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField22);
        final SObjectField sObjectField23 = createField("IsMassAction", "Is Mass Action", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField23);
        final SObjectField sObjectField24 = createField("PrimaryColor", "Primary Color", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField24);
        final SObjectField sObjectField25 = createField("RelatedSourceEntity", "Related Source Entity", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField25);

        description.setLabelPlural("Platform Actions");
        description.setLabel("Platform Action");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/PlatformAction/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/PlatformAction");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/PlatformAction/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("PlatformAction");

        return description;
    }
}
