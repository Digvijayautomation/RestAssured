package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


// For using lombok in eclipse first have to add its dependencies and then in .m2/Lombok/ folder we have to install it by clicking executbale file
// Lombok will create the getter , setter and constructors and so many other things automatically 
// we just have to add like @Getter @Setter @AllArgsConstructor at varibale level or at class level as per our need


// Below are lonbok annotations

@Getter //Lombok will create the getter , setter methods  and constructors using this anotationsand so many other things automatically 
@Setter
@AllArgsConstructor

//Below are Jackson annotations

@JsonInclude(value=JsonInclude.Include.NON_EMPTY) // Using this annotation it will send only non empty values in request body
@JsonPropertyOrder(alphabetic = true) // Using this annotation response will come in alpabetically order
@JsonIgnoreProperties(value="createdAt") // if we want to igonre some field we can thosw into this


public class Employee_POJO_with_Lombok {
	
	private int id;
	private String name;
	private String job;
	private String createdAt;
	

}
