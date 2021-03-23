public class Teacher extends Person{

	
	private double salary;
	

	public Teacher()
	{
	}
	
	public Teacher(String name,String id,int age,String phoneNo,String email,String occupation,double salary)
	{
		super(name, id,age, phoneNo, email, occupation); 
		
		this.salary=salary;
		
		 
		
	}
	
		
		
	public void setSalary(double salary)
		{
			this.salary=salary;
		}
		
	public double getSalary()
		{
			return this.salary=salary;
		}
		
		
		
		
		public String ShowInformation(){
			
			super.allInfo+=super.getId()+"\n";
			super.allInfo+=super.getName()+"\n";
			
			super.allInfo+=super.getAge()+"\n";
			super.allInfo+=super.getPhoneNo()+"\n";
			super.allInfo+=super.getEmail()+"\n";
			super.allInfo+=super.getOccupation()+"\n";

		
			
			super.allInfo+=this.getSalary()+"\n";
			
			return super.allInfo;
		//	System.out.println("Faculty's workingHour:"+getWorkingHour());
		}
	
	

}
