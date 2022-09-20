package tests;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class Restassured_x_Assertions_Assertj {
	

	@Test
	public void assertions() {
		
		//Creating JSON Object for request data
		JSONObject jobject=new JSONObject();
		jobject.put("name", "Aniket");

		jobject.put("job", "Junior Test Engineer");
		jobject.put("id", "1234");
		jobject.put("createdAt", "2022-09-14T11:37:17.500Z");
		
		
		Response response= given()
				.header("Content-Type",ContentType.JSON)
				//body(jobject.toString())// have to convert it into string or we can do like below
				.body(jobject.toMap()) // it will convert it to map and for map so jakson will serialze like he did for Post_Api3

				.post("https://reqres.in/api/users");
		
		response.prettyPrint();

	
				// Assertions using assertj
				// for this we have to do static import for the import static org.assertj.core.api.Assertions.*;
					
				assertThat(response.getStatusCode())
				.as("Checking the Status code is valid or not") // we can provide description using as
				.isEqualTo(201);
				
				
			
		
	}

}
