package com.DataDrivenTest_ParametarizeTest;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class Test03_AlternateWayToDoDataDriven {
	
	
	@DataProvider(name= "DynamicData")
	public Object[][] dataForPost () {
		
		return new Object [][] {
			
			{"Mohibul", "Islam", 1},
			{"lal", "Muhammad", 2}
		};
				
	
	}
	

	@Test(dataProvider = "DynamicData")
	public void test_Post_Own_Server (String firstName, String lastName, int subjectId) {
		
		JSONObject request = new JSONObject();
		
		request.put("firstName", firstName);
		request.put("lastName", lastName);
		request.put("subjectId", subjectId);
		
		  baseURI = "http://localhost:3333/";
		  given()
		  .header("content-type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).
			log().all();
		 
	}

}
