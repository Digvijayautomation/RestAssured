package pojo;



public class Employee_POJO {
	
	
	private int id;
	private String name;
	private String job;
	private String createdAt;
	
	
	//Getters methods
	
		public int getId() {
			return id;
		}



		public String getName() {
			return name;
		}



		public String getJob() {
			return job;
		}



		public String getCreatedAt() {
			return createdAt;
		}



	
	// Constructor
	public Employee_POJO(int id,String name, String job, String createdAt)
	{
		
		this.id=id;
		this.name=name;
		this.job=job;
		this.createdAt=createdAt;
		
	}
	
	

}
