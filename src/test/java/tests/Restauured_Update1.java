package tests;
import static io.restassured.RestAssured.given;
import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;




public class Restauured_Update1 {
	
	@Test
	public void update_api() {
		
 //Constrcting the request data using JSONOBJECT
		JSONObject jobject=new JSONObject();
		jobject.put("name", "Digvijay");
		jobject.put("job", "Junior Test Engineer");
	
		
		
		Response response= given()
				.header("Content-Type",ContentType.JSON)
				.body(jobject.toMap()) // it will convert it to map and for map so jaCkson will serialze 
				
				.put("https://reqres.in/api/users/2");

				 response.prettyPrint();
		
	}

}
