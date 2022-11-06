package tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;



public class Restauured_x_Basic_Auth {
	
	@Test
	public void Basic_Auth() {
		
Response response= given()
		     .auth()
		     .basic("postman", "password") // Basic auth will convert this username and password as authorization header in the form of "Basic (Base64 of username:password)" 
		     .log()								// You can see clearly see it in Postman
		     .all()
		     .get("https://postman-echo.com/basic-auth");


response.prettyPrint();
	}
	
	
	@Test
	public void Basic_Auth_Manual() {
		
Response response= given()          //  Base (Base64 of username:password)
			 .header("Authorization","Basic cG9zdG1hbjpwYXNzd29yZA==") // In above method this is done automatically
		     .log()								
		     .all()
		     .get("https://postman-echo.com/basic-auth");


response.prettyPrint();
	}
	
	

}
