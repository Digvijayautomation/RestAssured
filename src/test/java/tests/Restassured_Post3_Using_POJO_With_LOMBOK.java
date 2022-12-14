package tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.Employee_POJO;

public class Restassured_Post3_Using_POJO_With_LOMBOK {
	
	

	@Test
	public void pojotest() {
	
			System.out.println("Passing JSON Body Using POJO With Lombok");
			
			
			// Creating object of Employee_POJO Class and passing it as body
			// datatypes for the data we are passing passing in this emp object is already fixed in pojo class
			Employee_POJO emp=	new Employee_POJO(20,"Digvijay","QA Lead","15-09-2022");
			
			
			         Response response= given()
					.header("Content-Type",ContentType.JSON)
					.body(emp)

					.post("https://reqres.in/api/users");

					 response.prettyPrint();

						};
		

}
