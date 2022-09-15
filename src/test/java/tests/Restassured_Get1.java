package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Restassured_Get1 {
	
	@Test
	public void Get_Api() {
		
	given()
	.get("https://gorest.co.in/public/v2/posts")
	.then()
	.statusCode(200);// if status code is not 200 for this get request it will fail
		
	}

}
