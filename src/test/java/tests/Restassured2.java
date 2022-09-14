package tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Restassured2 {
	

	@Test
	public void Get_Api_With_Response() {
		
		// Storing the response by Creating response obejct 
	 Response response=given()
	.get("https://gorest.co.in/public/v2/users");
	 
	 
	 
	 
	 response.prettyPrint(); //it will print the response body
	 System.out.println("Status Code Is "+response.statusCode()); //Printing Status Code
	 System.out.println("Response Time Is "+response.getTime()); // Printing Response Time
	
	}

}
