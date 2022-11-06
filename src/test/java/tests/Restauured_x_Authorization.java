package tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class Restauured_x_Authorization {
	
	
	@Test
	public void Authorization() {
		
		Response response =given()
		.header("Authorization","Bearer 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")// This token is generated in github 
		
		.log()
		.all()
		.get("https://api.github.com/user/repos");
		
		
		response.prettyPrint();
		
		
		
	}

}
