/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;
import javax.annotation.Generated;

/**
 * Salesforce QueryRecords DTO for type WebLink
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public class QueryRecordsWebLink extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<WebLink> records;

    public List<WebLink> getRecords() {
        return records;
    }

    public void setRecords(List<WebLink> records) {
        this.records = records;
    }
}
