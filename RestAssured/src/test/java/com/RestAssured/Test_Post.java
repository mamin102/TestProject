package com.RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers .*;

import java.util.HashMap;
import java.util.Map;


public class Test_Post {
	
	
	@Test
	public void test_01_Post() {
		
		//create a Json Body to post by 2 ways 
			//1> by creating a map through -  hasMap from java Library and convert it to a Json object 
		
		Map <String, Object> map = new HashMap<String, Object>();
		
		//to make it a json object we can "\"name\"" it will print json 
	//	map.put("\"name\"", "RifatAmin");
		
		//or get a Json library to pom.xml 
		map.put("name", "RifatAmin");

		map.put("Job", "GodFather");
	
	//	System.out.println(map);
		
			//2> by using Json libraries - Gson, json, Jackson, Json Simple from MV repository to Pom.xlm
	
		JSONObject request = new JSONObject (map);
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		
	//	directly creating the JsonObject through JsonSimple library
		
		
		
		JSONObject request2 = new JSONObject ();
		request2.put("name", "Mohammad");
		request2.put("job", "driver");
		
		
		System.out.println(request2);
		System.out.println(request2.toJSONString());
		
		given()
			.header("content-type", "application/json")
			.contentType(ContentType.JSON).accept(ContentType.JSON)
			.body(request2.toJSONString())
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201);
	}

}
