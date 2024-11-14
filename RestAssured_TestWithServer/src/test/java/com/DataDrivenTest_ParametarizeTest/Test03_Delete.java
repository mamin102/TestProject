package com.DataDrivenTest_ParametarizeTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;
import  org.testng.annotations.Test;


import org.testng.annotations.DataProvider;


public class Test03_Delete {
	
	@DataProvider(name = "deleteData")
	public Object[] dataForDelete() {
		
		return new Object [] {
			6
		};
	}
	
	
	@Test(dataProvider= "deleteData")
	public void test_Delete_Own_Server (int usersId) {
		
		
		  baseURI = "http://localhost:3333/";
		 
		when().
			delete("/users/" + usersId).
		then().
			statusCode(200);	  

	}

}
