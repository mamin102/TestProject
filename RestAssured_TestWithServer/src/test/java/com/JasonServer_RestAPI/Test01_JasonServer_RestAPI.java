package com.JasonServer_RestAPI;

import static org.testng.annotations.Test .*;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured .*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test01_JasonServer_RestAPI {
	
	
	@Test
	public void test_Get_Own_Server () {
		  baseURI = "http://localhost:3333/";
		  given()
		  	.param("job", "Student")
		  		.get("/users").
		  		then()
		  		.statusCode(200).
		  		log().all();
		  
	}
//	@Test
	public void test_Post_Own_Server () {
		
		JSONObject request = new JSONObject();
		
		request.put("firstName", "Bethi");
		request.put("lastName", "Mostafa");
		request.put("subjectId", "1");
		
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
	//@Test
public void test_Patch_Own_Server () {
		
		JSONObject request = new JSONObject();
		
		
		request.put("lastName", "Akter");
		
		  baseURI = "http://localhost:3333/";
		  given()
		  .header("content-type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString()).
		when().
			patch("/users/4").
		then().
			statusCode(200).
			log().all();
		  

	}
//	@Test
public void test_Put_Own_Server () {
		
		JSONObject request = new JSONObject();
		
		request.put("firstName", "Jasmin");
		request.put("lastName", "sultana");
		request.put("subjectId", "1");
		
		  baseURI = "http://localhost:3333/";
		  given()
		  .header("content-type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString()).
		when().
			put("/users/4").
		then().
			statusCode(200).
			log().all();
		  

	}


// @Test
public void test_Delete_Own_Server () {
	
	
	  baseURI = "http://localhost:3333/";
	 
	when().
		delete("/users/4").
	then().
		statusCode(200);	  

}

}
