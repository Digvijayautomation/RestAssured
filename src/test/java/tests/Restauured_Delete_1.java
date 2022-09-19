package tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Restauured_Delete_1 {
	
	@Test
	public void delete_api() {
		
				
				
				Response response= given()
						.header("Content-Type",ContentType.JSON)
						.delete("https://reqres.in/api/users/2");

						 response.prettyPrint();
				
	}

}
