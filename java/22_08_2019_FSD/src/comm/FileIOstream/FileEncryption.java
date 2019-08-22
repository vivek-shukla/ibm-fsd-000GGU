package comm.FileIOstream;

import java.io.*;

public class FileEncryption { 
	void encrypt(String source,String dest,int shiftSize) throws IOException
	{
		BufferedReader reader;
		BufferedWriter writer;
		
		try {
			reader = new BufferedReader(new FileReader(source));
			writer = new BufferedWriter(new FileWriter(dest));
			String line;
			char c;
			int data;
			while((line = reader.readLine())!=null)
			{   int count = 0;
				for(int i=0; i<line.length();i++ )
				{    c = line.charAt(i);
				  data=(int)line.charAt(i)+shiftSize;
					if(c=='a' || c=='A' || c=='E' || c=='e' || c=='i' || c=='I' || c=='O' || c=='o' || c=='U' || c=='u'  )
				     {   
						count++;
					 } 
				   writer.write(data);
				}
				writer.write(count+"\n");
			}
			reader.close();
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void viewFileContent(String fileName) throws IOException
	{
		BufferedReader reader;
		 reader = new BufferedReader(new FileReader(fileName));
		 String line;
		 while((line=reader.readLine())!=null)
		 {
			 System.out.println(line);
		 }
		 reader.close();
	}
	

}
