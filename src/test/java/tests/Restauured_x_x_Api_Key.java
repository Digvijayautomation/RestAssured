package tests;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;

public class Restauured_x_x_Api_Key {
	
	@Test
	public void X_Api_Key() {
		
		Response response=given()
			.header("X-API-Key","PMAK-6332d7fe12acc80b987d0fcd-d192f3068295a736d7b764641891a4eddd")
			//For hidding the key on in respone log, we can make it blacklisted
			.config(RestAssuredConfig.config().logConfig(LogConfig.logConfig().blacklistHeader("X-API-Key")))
			.log()
			.all()
			.get("https://api.getpostman.com/collections");
		
		
		response.prettyPrint();
		
			
			
		
	}

}
