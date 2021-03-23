public class School{
	
	
	
	FileReadWriteDemo file=new FileReadWriteDemo();
	
	public School()
	{
	}
	
	public void add(Person p)
	{
		try{
		
			file.writeInFile(p);
		
			System.out.println("Added Successfully.");
			
		}
		catch(Exception e)
		{
			System.out.println("Added not Successfully.");
		}			
		
		
	}
	
	public void ShowAllInformation()
	{
		try{
		file.readFromFile();
		}
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}	
			
		
	}
	
	
	public void remove(String id)
	{
		try{
		for(int i=0;i<count;i++)
		{
			
			if(person[i]!=null && person[i].getId().equals(id))
			{
				person[i]=null;
				
				System.out.println("Delete Successfully");
			}
				
		}
		}
		
		catch(Exception e)
		{
			System.out.println("Delete Not Successful");
		}	
		
	}
	
	
	
		
		
		
	}
	
	
	

