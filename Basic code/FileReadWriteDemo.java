import java.lang.*;
import java.io.*;

public class FileReadWriteDemo
{
	private File file;				//to create a File
	private FileWriter writer;		//to write in a file
	private FileReader reader;		//to read from a file
	private BufferedReader bfr;	
	String[] words=null;
	String s;	//to read file content
	
	
	public void writeInFile(Person p)
	{
		/*
			creating a file and writing in it genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
		try
		{
			file = new File("History.txt");	
		//	System.out.println("Line create");	//Declaring a file named named History.txt for creating.
			file.createNewFile();					//If the file does not exists, creates and opens the file. else, just opens the file
			writer = new FileWriter(file, true);	//creating the writer object to write in the file.
			writer.write(p.ShowInformation()+"\r"+"\n"+"**"+"\r"+"\n");	
		//	write.write();		//writing a string s in the file. the "\r" and "\n" 
			writer.flush();							//After writing, we need to flush to indicate that we 
			writer.close();							//After flushing, we need to close the file to save our 
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readFromFile()
	{
		/*
			reading from a file genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
		
		try
		{
			file = new File("History.txt");	
			reader = new FileReader(file);			//creating the reader object to read from a file.
			bfr = new BufferedReader(reader);		//creating the BufferedReader object using the reader object to read the file content.
			String text="", temp;					//declaring two string variables to read the file content and storing them.
			
			while((temp=bfr.readLine())!=null)		//reading one line from the file, storing it in the variable temp and checking whether it is null or not. It will be null at the end of reading from the file.
			{
				text=text+temp+"\n"+"\r";			//storing the temp string in text by concating it with text and "\n" and "\r" is used to go to a newline.
			}
			
			System.out.print(text);   				//printing the whole string in console.
			reader.close();							//closing the file.
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}






	public void search(String id)
	{try
		{
			file = new File("History.txt");	
			reader = new FileReader(file);			//creating the reader object to read from a file.
			bfr = new BufferedReader(reader);		//creating the BufferedReader object using the reader object to read the file content.
			String text="", temp;	
			boolean find=false;
				boolean breaak=false;				//declaring two string variables to read the file content and storing them.
			
			while((temp=bfr.readLine())!=null)		//reading one line from the file, storing it in the variable temp and checking whether it is null or not. It will be null at the end of reading from the file.
			{
				
				if(find)
				{
					System.out.println(temp);
				}
				if(breaak)
				break;
				words=temp.split(" ");
				for(String word : words )
				{
					if(word.equals(id))
					 find=true;
					if(word.equals("**"))
					find=false;
				}
				
			//	text=text+temp+"\n"+"\r";			//storing the temp string in text by concating it with text and "\n" and "\r" is used to go to a newline.
			}
			
			//System.out.print(text);   				//printing the whole string in console.
			reader.close();							//closing the file.
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}



		public  void deleteLine(String id)
    {
			
			boolean find=false;
			boolean stop=false;
        try
        {
                BufferedReader file = new BufferedReader(new FileReader("History.txt"));
                String line;
                String input = "";
                while ((line = file.readLine()) != null) 
                {
									//System.out.println("Line deleted.");
                    //System.out.println(line);
                    words=line.split(" ");
				for(String word : words )
				{
					if(word.equals(id))
					{
						find=true;
						System.out.println("deleted Successfully");
					}
					 
					if(word.equals("**")&&find)
					{

						stop=true;
					}
				
				}
			//	if(stop)
				
										if(find&&!stop)
										{
										//	System.out.println("Line deleted.");
											continue;
                        //
										}
										
										
                    input += line + '\n';
                }
                FileOutputStream File = new FileOutputStream("History.txt");
                File.write(input.getBytes());
                file.close();
                File.close();
        }
        catch (Exception e)
        {
                System.out.println("Problem reading file.");
        }
    }
	}



	
	
	







