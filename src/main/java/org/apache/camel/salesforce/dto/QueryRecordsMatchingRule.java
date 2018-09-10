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
 * Salesforce QueryRecords DTO for type MatchingRule
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public class QueryRecordsMatchingRule extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<MatchingRule> records;

    public List<MatchingRule> getRecords() {
        return records;
    }

    public void setRecords(List<MatchingRule> records) {
        this.records = records;
    }
}