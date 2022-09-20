package tests;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Restauured_writing_response {
	
	@Test
	public void Post_API_Response_in_external_file() throws IOException {
		
		//Creating JSON Object
		// IMPORT IT FROM ORG.JSON
	
		JSONObject jobject=new JSONObject();
		jobject.put("name", "Aniket");
		
		
		jobject.put("job", "Junior Test Engineer");
		jobject.put("id", "1234");
		jobject.put("createdAt", "2022-09-14T11:37:17.500Z");
		
		
		Response response= given()
				.header("Content-Type",ContentType.JSON)
				.body(jobject.toMap()) 
				.post("https://reqres.in/api/users");

				 response.prettyPrint();
				 
				 // Writing response in external file
			
				 Files.write(Paths.get(System.getProperty("user.dir")+"/response.json"), response.asByteArray());
				 
					};		

}
