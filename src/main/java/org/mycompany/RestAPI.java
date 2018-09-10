package org.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.salesforce.dto.QueryRecordsAccount;
import org.apache.camel.salesforce.dto.QueryRecordsOpportunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
class RestApi extends RouteBuilder {

	@Autowired
	private Environment env;

//	@Value("${camel.component.servlet.mapping.context-path}")
	private String contextPath="/api/*";

	@Override
	public void configure() {
		restConfiguration().component("servlet").bindingMode(RestBindingMode.json)
				.dataFormatProperty("prettyPrint", "true").enableCORS(true).port(env.getProperty("server.port", "8081"))
				.contextPath(contextPath.substring(0, contextPath.length() - 2))
				// turn on swagger api-doc
				.apiContextPath("/api-doc").apiProperty("api.title", "User API").apiProperty("api.version", "1.0.0");

//        rest("/opportunity").description("Returns Opportunities")
//            .get("/").description("The list of all the books")
//                .route().routeId("simple-route").from("direct:getList")
//                .endRest();
//            .get("order/{id}").description("Details of an order by id")
//                .route().routeId("order-api")
//                .bean(Database.class, "findOrder(${header.id})");
		
		rest("/opportunitiestest").get("/").to("salesforce:query?sObjectQuery=SELECT id,name from Opportunity&sObjectClass=" + QueryRecordsOpportunity.class.getName());
		
		
		rest("/accounts")
	        .get("/").route().transform().simple("").to("direct:getAccounts").setBody().simple("${body.records}").endRest()
	
	        .get("/{id}").route().transform().simple("${headers['id']}").to("direct:getAccount").endRest()
		
			.post("/").to("direct:createAccount")

			.put("/{id}").route().setHeader("sObjectId").simple("${headers['id']}").to("direct:updateAccount").endRest()

			.delete("/{id}").route().transform().simple("${headers['id']}").to("direct:deleteAccount").endRest();
		
		
        // Camel routes for integrating with Salesforce
        from("direct:createAccount").routeId("createAccount")
                .to("salesforce:createSObject?SObjectName=Account");

        from("direct:updateAccount").routeId("updateAccount")
        		.to("salesforce:updateSObject?SObjectName=Account");

		from("direct:getAccount").routeId("getAccount")
		        .to("salesforce:getSObject?SObjectName=Account&sObjectFields=Id,Name,TickerSymbol,Type,Active__c,AccountNumber,AnnualRevenue");
		
		from("direct:deleteAccount").routeId("deleteAccount")
		        .to("salesforce:deleteSObject?SObjectName=Account");
		
		from("direct:getAccounts").routeId("getAccounts")
		        .to("salesforce:query?sObjectQuery=SELECT Id,Name,TickerSymbol,Type,Active__c,AccountNumber,AnnualRevenue from Account&sObjectClass=" + QueryRecordsAccount.class.getName());
		
        
		rest("/say")
	    .get("/hello/{name}").route().transform().simple("Hello ${header.name}");

		
	}
}
