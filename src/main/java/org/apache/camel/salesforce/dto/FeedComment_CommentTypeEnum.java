/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CommentType
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum FeedComment_CommentTypeEnum {

    // ContentComment
    CONTENTCOMMENT("ContentComment"),
    // TextComment
    TEXTCOMMENT("TextComment");

    final String value;

    private FeedComment_CommentTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static FeedComment_CommentTypeEnum fromValue(String value) {
        for (FeedComment_CommentTypeEnum e : FeedComment_CommentTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
