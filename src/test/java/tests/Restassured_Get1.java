package tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Restassured_Get1 {
	
	@Test
	public void Get_Api() {
		
	 given()
	.get("https://gorest.co.in/public/v2/posts")
	.then()
	.statusCode(200);// if status code is not 200 for this get request it will fail
		
	
	
	}

}
