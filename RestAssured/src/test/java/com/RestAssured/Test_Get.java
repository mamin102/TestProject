package com.RestAssured;

import org.testng.annotations.Test; 
import static io.restassured.RestAssured .*;
import static org.hamcrest.Matchers.*;


public class Test_Get {


	@Test
	public void test_01_get() {

			given()
		.header("Content-Type", "application/json")
		.param("Connection", "keep-alive")
		.get("https://reqres.in/api/users?page=2")
			.then()
		.statusCode(200)
		.body("data.id[3]", equalTo(10))
		.body("data.first_name", hasItems("Michael", "Lindsay"))
		.log().all();

	}




}
