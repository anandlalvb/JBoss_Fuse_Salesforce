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
 * Salesforce DTO for SObject LoginGeo
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("LoginGeo")
public class LoginGeo extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // LoginTime
    private java.time.ZonedDateTime LoginTime;

    @JsonProperty("LoginTime")
    public java.time.ZonedDateTime getLoginTime() {
        return this.LoginTime;
    }

    @JsonProperty("LoginTime")
    public void setLoginTime(java.time.ZonedDateTime LoginTime) {
        this.LoginTime = LoginTime;
    }

    // CountryIso
    private String CountryIso;

    @JsonProperty("CountryIso")
    public String getCountryIso() {
        return this.CountryIso;
    }

    @JsonProperty("CountryIso")
    public void setCountryIso(String CountryIso) {
        this.CountryIso = CountryIso;
    }

    // Country
    private String Country;

    @JsonProperty("Country")
    public String getCountry() {
        return this.Country;
    }

    @JsonProperty("Country")
    public void setCountry(String Country) {
        this.Country = Country;
    }

    // Latitude
    private Double Latitude;

    @JsonProperty("Latitude")
    public Double getLatitude() {
        return this.Latitude;
    }

    @JsonProperty("Latitude")
    public void setLatitude(Double Latitude) {
        this.Latitude = Latitude;
    }

    // Longitude
    private Double Longitude;

    @JsonProperty("Longitude")
    public Double getLongitude() {
        return this.Longitude;
    }

    @JsonProperty("Longitude")
    public void setLongitude(Double Longitude) {
        this.Longitude = Longitude;
    }

    // City
    private String City;

    @JsonProperty("City")
    public String getCity() {
        return this.City;
    }

    @JsonProperty("City")
    public void setCity(String City) {
        this.City = City;
    }

    // PostalCode
    private String PostalCode;

    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return this.PostalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    // Subdivision
    private String Subdivision;

    @JsonProperty("Subdivision")
    public String getSubdivision() {
        return this.Subdivision;
    }

    @JsonProperty("Subdivision")
    public void setSubdivision(String Subdivision) {
        this.Subdivision = Subdivision;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Login Geo Data ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("LoginTime", "Login Time", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("CountryIso", "Country Code", "string", "xsd:string", 3, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("Country", "Country", "string", "xsd:string", 200, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("Latitude", "Latitude", "double", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("Longitude", "Longitude", "double", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("City", "City", "string", "xsd:string", 200, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("PostalCode", "PostalCode", "string", "xsd:string", 20, false, true, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("Subdivision", "Subdivision", "string", "xsd:string", 200, false, true, false, false, false, false, false);
        fields1.add(sObjectField15);

        description.setLabelPlural("Login Geo Data");
        description.setLabel("Login Geo Data");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/LoginGeo/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/LoginGeo");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/LoginGeo/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("LoginGeo");

        return description;
    }
}