import java.util.Scanner;
public class Start{
	
	
	public static void main(String[] args)
	{
		FileReadWriteDemo file=new FileReadWriteDemo();
		
		String name, id,admissionDate,phoneNo, email,occupation;
	  int age,choice,personType;
		double salary;

		
		
		School cscr=new School();
		Scanner input=new Scanner(System.in);
		
		
		while(true)
		{
			
		
		System.out.println("What do you want to do?");
		System.out.println("Press 1 for add");
		System.out.println("Press 2 for delete");
		System.out.println("Press 3 for search");
		System.out.println("Press 4 for show  information");
		System.out.println("Press 5 for Exit");
		
		
		choice=input.nextInt();
		
		/*catch(Exception e)
			{
				System.out.println("Something wrong!!!!");
			}*/
		
		
		switch(choice)
		{
			
			case 1:
			System.out.println("Which type of person do you want to add?");
		
			System.out.println("Press 1 for Teacher: ");
			System.out.println("Press 2 for Student: ");
			personType=input.nextInt();
			
			
	
			
			
			
			if(personType==1)
				
			{
				try{
				System.out.println("Enter Name of Faculty: ");
				input.nextLine();
				name=input.nextLine();

				System.out.println("Enter id of Faculty: ");
				//input.nextLine();
				id=input.nextLine();
				input.nextLine();
				
				System.out.println("Enter age of Faculty: ");
				age=input.nextInt();
				
				System.out.println("Enter PhoneNo of Faculty:");
				input.nextLine();
				phoneNo=input.nextLine();
				//input.nextLine();
				
				System.out.println("Enter Email of Faculty: ");
			//	input.nextLine();
				email=input.nextLine();
				input.nextLine();
				
				System.out.println("Enter Occupation of Faculty: ");
				//input.nextLine();
				occupation=input.nextLine();
				input.nextLine();
				
				System.out.println("Enter Salary of Faculty: ");
				salary=input.nextDouble();
				
				
				cscr.add(new Teacher(name,id,age,phoneNo,email,occupation,salary));
				}
			catch(Exception E)
			{
				input.nextLine();
				System.out.println("Invalid");
			}

				
			}
				
				
				else if(personType==2)
					
				
			{
				try{
				System.out.println("Enter Name of Student: ");
				input.nextLine();
				name=input.nextLine();

				System.out.println("Enter id of Student: ");
				input.nextLine();
				id=input.nextLine();
				
				System.out.println("Enter age of Student: ");
				age=input.nextInt();
				
				System.out.println("Enter PhoneNo of Student:");
				input.nextLine();
				phoneNo=input.nextLine();
				
				System.out.println("Enter Email of Student: ");
				email=input.nextLine();
				input.nextLine();
				
				System.out.println("Enter Occupation of Student: ");
				occupation=input.nextLine();
				input.nextLine();
				
				System.out.println("Enter AdmissionDate of Student: ");
				
				admissionDate=input.nextLine();
				input.nextLine();
				
		
				
				
				
				cscr.add(new Student(name,id,age,phoneNo,email,occupation,admissionDate));
				}
			catch(Exception E)
			{
				input.nextLine();
				System.out.println("Invalid");
			}
			
			}
							
			break;
			
			
			case 4:
			file.readFromFile();
			
			break;
			
			
			
			
			
			case 2:
			
			
			
				try{
				System.out.println("Enter id : ");
				input.nextLine();
				id=input.nextLine();
			  file.deleteLine(id);
				}
				
			catch(Exception E)
			{
				input.nextLine();
				System.out.println("Invalid");
			
			}
			
			break;
			
			
			
			
			
			case 3:
			
			
			
			   try{
				System.out.println("Enter id ");
				input.nextLine();
				id=input.nextLine();
			//	System.out.println(id);
				
				file.search(id);
			//	System.out.println(id);
				}
			catch(Exception E)
			{
				input.nextLine();
				System.out.println("SOmething wrong !!!");
			}
			
			
			
		
			
			break;
			case 5:
			System.exit(0);
			break;
			
			}
		
			
		}
	}

	

	
	
		
	
}