package com.DataDrivenTest_ParametarizeTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test04_DeleteByParameter {
	
	
	@Parameters("userId")
	@Test
	public void test_Delete_Own_Server (int usersId) {
		
		System.out.println("the value of the userId is : " + usersId);
		  baseURI = "http://localhost:3333/";
		 
		when().
			delete("/users/" + usersId).
		then().
			statusCode(200);	  

	}

}
