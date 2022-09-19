package tests;


import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssured_Post1 {
	//1st Approach
	// Passing JSON Body as String
	// This is easy to copy paste
	
	@Test
	public void Post_Api() {
		
		System.out.println("Passing JSON Body As String");

	Response response=given()
			.header("Content-Type",ContentType.JSON)
			.body("{\r\n"
					+ "    \"name\": \"Digvijay\",\r\n"
					+ "    \"job\": \"leader\"\r\n"
					+ "}")
			
			.post("https://reqres.in/api/users");

	response.prettyPrint();
	}


	//2nd Approach
	// Passing JSON Body from External File
	// Use this when data is static
	// We can not log the data from external file to console(it will only show file location on console)
	@Test
	public void Post_Api1() {
		
		System.out.println("Passing JSON Body from External File");
		
		
		         Response response= given()
				.header("Content-Type",ContentType.JSON)
				.body(new File(System.getProperty("user.dir")+"/body.json"))
<<<<<<< HEAD
=======
				
>>>>>>> 45169f70df19d27df53aee43b03cb2771323585d
				.post("https://reqres.in/api/users");

				 response.prettyPrint();

					};
					
					
		//3rd Approach			
		// Read request body from from External File and converting it into string	
		//We can also change the parameters in request body dynamically(If Required)
					
		@Test			
		public void Post_Api2() throws IOException {
						
			System.out.println("Read request body from from External File and converting it into string");
						
			//Fetching the data from external file in byte
		byte[] bytes=	Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"/body.json"));
		
		// Converting byte into string and storing into "external_file_data" variable
		String external_file_data=new String(bytes);
		
		//We can also change the parameters in request body dynamically(If Required)
		// We can pass dynamic data using "Java Faker"
		String external_file_data_updated= external_file_data.replace("SURAJ", new Faker().name().firstName());// this will update suraj with random firstname
			
			
						 Response response= given()
								.header("Content-Type",ContentType.JSON)
								.body(external_file_data_updated)
								
								.post("https://reqres.in/api/users");

								 response.prettyPrint();

									};
									
									
	
									
		//4th Approach	
		// Pass request body as Hashmap or List
		// If the data having {} use hashmap
		// If data having[] use List
		// one issue is there that hashmap can create data as objects or string but we need data in json, so we have to add jakson databind depenceny
		//Serialisers hashmapobject data >>byte stream>>json //for this we have to add jakson databind depenceny it will do seralization automatically
		// Serialization means converting your language specfic object to required object like java to json
		// its verbose and not suitbale to large data							
		
		@Test
		public void Post_Api3() {
			
			System.out.println("Passing data as Hashmp data");
			
			//Creating hashmap data
			
			// Using <String , Object> Because key is always string but value can be anything
			Map<String, Object> hashmapobject=new HashMap<String, Object>();
			hashmapobject.put("name", "Aniket");
			hashmapobject.put("job", "Junior Test Engineer");
			hashmapobject.put("id", "1234");
			hashmapobject.put("createdAt", "2022-09-14T11:37:17.500Z");
			
			Response response= given()
					.header("Content-Type",ContentType.JSON)
					.body(hashmapobject) // because of jakson dependency will it will convert this hashmapobject data in json format which will understood by restauured
					
					.post("https://reqres.in/api/users");

					 response.prettyPrint();

						};
			
		
									

						
		//5th Approach		
		//Pass request body as JSON OBEJCT
		// Have to add dependdency for JSON Maven
		//Advantage is no need to add datatype
									
						@Test
						public void Post_Api4() {
							
							System.out.println("Passing Request data as JSON OBJECT");
							
							//Creating JSON Object
							// IMPORT IT FROM ORG.JSON
							
							JSONObject jobject=new JSONObject();
							jobject.put("name", "Aniket");
							//jobject.accumulate("name", "Anisddsket"); if you want to add multiple values you can use accumulate
							
							jobject.put("job", "Junior Test Engineer");
							jobject.put("id", "1234");
							jobject.put("createdAt", "2022-09-14T11:37:17.500Z");
							
							
							Response response= given()
									.header("Content-Type",ContentType.JSON)
									//body(jobject.toString())// have to convert it into string or we can do like below
									.body(jobject.toMap()) // it will convert it to map and for map so jakson will serialze like he did for Post_Api3
									
									.post("https://reqres.in/api/users");

									 response.prettyPrint();

										};		
					
					

}
