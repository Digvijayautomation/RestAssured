package pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//For using lombok we in eclipse first have to add its dependencies and then in .m2 folder we have to install it using executbale file
// Lombok will create the getter , setter and constructors  and so many other things automatically 
// we just have to add like @Getter @Setter @AllArgsConstructor at varibale level or at class level as per our need

@Getter
@Setter
@AllArgsConstructor
public class Employee_POJO_with_Lombok {
	

	private int id;
	private String name;
	private String job;
	private String createdAt;
	

}
