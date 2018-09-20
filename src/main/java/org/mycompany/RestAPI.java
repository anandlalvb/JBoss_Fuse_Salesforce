package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.salesforce.dto.Opportunity;
import org.apache.camel.salesforce.dto.QueryRecordsAccount;
import org.apache.camel.salesforce.dto.QueryRecordsOpportunity;
import org.mycompany.model.UserPojo;
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
		restConfiguration().component("servlet").bindingMode(RestBindingMode.off)
				.dataFormatProperty("prettyPrint", "true").enableCORS(true).port(env.getProperty("server.port", "8080"))
				.contextPath(contextPath.substring(0, contextPath.length() - 2))
				.host("localhost")
				// turn on swagger api-doc
				.apiContextPath("/api-doc").apiProperty("api.title", "User API").apiProperty("api.version", "1.0.0");

//        rest("/opportunity").description("Returns Opportunities")
//            .get("/").description("The list of all the books")
//                .route().routeId("simple-route").from("direct:getList")
//                .endRest();
//            .get("order/{id}").description("Details of an order by id")
//                .route().routeId("order-api")
//                .bean(Database.class, "findOrder(${header.id})");
		
		
		
		rest("/accounts").description("Accounts API").produces("application/json")
	       
			.get("/").description("Get Accounts").route().transform().simple("").to("direct:getAccounts").setBody().simple("${body.records}").endRest()
	
	        .get("/{id}").description("Get an Account").route().transform().simple("${headers['id']}").to("direct:getAccount").endRest()
		
			.post("/").description("Create and Account").to("direct:createAccount")

			.put("/{id}").description("Update an Account").route().setHeader("sObjectId").simple("${headers['id']}").to("direct:updateAccount").endRest()

			.delete("/{id}").description("Delete an Account").route().transform().simple("${headers['id']}").to("direct:deleteAccount").endRest();
		
		
        // Camel routes for integrating with Salesforce
        from("direct:createAccount").routeId("createAccount").log("Create New Account ${body}").setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                .to("salesforce:createSObject?SObjectName=Account");

        from("direct:updateAccount").routeId("updateAccount").log("Update Account ${body}").setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
        		.to("salesforce:updateSObject?SObjectName=Account").log("Update Account ${body}");

		from("direct:getAccount").routeId("getAccount").log("Get Account ${body}").setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
		        .to("salesforce:getSObject?SObjectName=Account&sObjectFields=Id,Name,TickerSymbol,Type,Active__c,AccountNumber,AnnualRevenue").log("Get Account ${body}");
		
		from("direct:deleteAccount").routeId("deleteAccount").log("Delete Account ${body}").setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
		        .to("salesforce:deleteSObject?SObjectName=Account").log("Delete Account ${body}");
		
		from("direct:getAccounts").routeId("getAccounts").setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
		        .to("salesforce:query?sObjectQuery=SELECT Id,Name,TickerSymbol,Type,Active__c,AccountNumber,AnnualRevenue from Account&sObjectClass=" + QueryRecordsAccount.class.getName());
		
        
		rest("/say")
	    .get("/hello/{name}").route().transform().simple("Hello ${header.name}");
		
		// Define the service with REST DSL
		/*rest("/users/")
		    .post("lives").type(UserPojo.class).outType(CountryPojo.class)
		        .route()
		            .choice()
		                .when().simple("${body.id} < 100")
		                    .bean(new UserErrorService(), "idTooLowError")
		                .otherwise()
		                    .bean(new UserService(), "livesWhere");*/
		
        
        // this user REST service is json only
        rest("/user").description("User rest service")
            .consumes("application/json").produces("application/json")

            .get("/list").description("List User").outTypeList(UserPojo.class)
            .to("bean:userService?method=listUsers")

            .put("/update").description("Update User").type(UserPojo.class).outType(UserPojo.class)
            .to("bean:userService?method=updateUser")

        
        	.get("/findAll").description("Find all users").outTypeList(UserPojo.class)
        	.responseMessage().code(200).message("All users").endResponseMessage()
        	.to("bean:userService?method=listUsers");

        rest("/opportunity")
        	.get("/list").to("salesforce:query?sObjectQuery=SELECT id,name from Opportunity&sObjectClass=" + QueryRecordsOpportunity.class.getName())
        	
        	.put("/upsert").type(Opportunity.class).outType(Opportunity.class).to("direct:createNewOpportunity");

        //to("salesforce:query?sObjectQuery=SELECT id,name from Opportunity&sObjectClass=" + QueryRecordsOpportunity.class.getName());
        

        from("direct:createNewOpportunity")
        	.log("Create New Opportunity ${body}")
        	.routeId("createOpportunity")
        	.process(exchange ->{
        		exchange.getIn().getBody(Opportunity.class);
        		Opportunity opportunity = new Opportunity();
        		opportunity.setName("Test 111");
        		exchange.getIn().setBody(opportunity);
        	}
        	)
    		.to("salesforce:createSObject").bean(Opportunity.class);//?SObjectName="+Opportunity.class.getName());

	}
}
