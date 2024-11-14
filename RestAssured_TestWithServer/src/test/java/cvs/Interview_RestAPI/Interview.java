package cvs.Interview_RestAPI;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Interview {
	
	
	public void test_Get_Own_Server () {
		
		
		 baseURI = "http://localhost:3333/";
		  given()
		  	.param("job", "Student")
		  		.get("/users").
		  		then()
		  		.statusCode(200).
		  		log().all();
		  
	}

	}
	
