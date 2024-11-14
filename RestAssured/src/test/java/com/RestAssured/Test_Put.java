package com.RestAssured;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_Put {
	@Test
	public void test_01_put() {
		
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
			.put("https://reqres.in/api/users/2")
		.then()
			.statusCode(200).log().all();
	}

}
