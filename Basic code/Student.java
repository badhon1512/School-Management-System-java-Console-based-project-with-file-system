public class Student extends Person
{
	
	
	private String admissionDate;
	
	public Student()
	{
	}
	
	public Student(String name,String id,int age,String phoneNo,String email,String occupation,String admissionDate)
	{
		super( name,id,age,phoneNo, email,occupation); 
		this.admissionDate=admissionDate;
		
	}
	
	
	public void setAdmissionDate(String admissionDate)
		{
			this.admissionDate=admissionDate;
		}
		
	public String getAdmissionDate()
		{
			return this.admissionDate;
		}
		
		
		
		
		
		public String ShowInformation(){
			
			super.allInfo+=super.getId()+"\n";
			super.allInfo+=super.getName()+"\n";
			
			super.allInfo+=super.getAge()+"\n";
			super.allInfo+=super.getPhoneNo()+"\n";
			super.allInfo+=super.getEmail()+"\n";
			super.allInfo+=super.getOccupation()+"\n";
			super.allInfo+=getAdmissionDate()+"\n";
			
		
			return super.allInfo;
		}
	
	
	
		
		

}
	
	


