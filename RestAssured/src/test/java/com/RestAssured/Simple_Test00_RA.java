package com.RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;
//import io.restassured.RestAssured ;  
import static io.restassured.RestAssured .*;  

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

// when we use static key word and before semicolon put ".*", it will be imported statically and no longer need to the class name to instantiate, we can directly use the medhods of the class. 
import io.restassured.response.Response;

public class Simple_Test00_RA {

	@Test
	public void test01 () {
		//Response res = 	RestAssured.get("https://reqres.in/api/users?page=2"); 

		Response res = 	get("https://reqres.in/api/users?page=2"); 

		// using the get method from the restAssured class directly as of we imported this class statically.

		System.out.println(res.asString());
		System.out.println(res.getBody().asString());
		System.out.println(res.getStatusCode());

		System.out.println(res.getStatusLine());
		System.out.println(res.getHeader("content-type"));
		System.out.println(res.getTime());

		int statusCode = res.getStatusCode();

		Assert.assertEquals(statusCode, 200);


	}

	@Test
	void test02() {

		 given()
		 	.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
		.body("data.id[1]", equalTo(8));


	}

}
