package com.DataDrivenTest_ParametarizeTest;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test02_DataDrivenTest {
	
	@DataProvider(name = "DataForPost")
	public Object[][] dataForPost() {
		
		
		Object [][] data = new Object [2][3];
		
		data [0][0] = "Ruhul";
		data [0][1] = "Amin";
		data [0][2] = 3;
		
		data [1][0] = "sihab";
		data [1][1] = "Amin";
		data [1][2] = 4;
		
		return data;
	}
	
	@Test(dataProvider = "DataForPost")
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
