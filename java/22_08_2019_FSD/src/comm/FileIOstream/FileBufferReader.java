package comm.FileIOstream;

import java.io.*;
import java.nio.Buffer;

public class FileBufferReader {
     public static void main(String[] args) throws IOException
     {
    	 FileReader in = new FileReader(new File("InputFile.txt"));
    	FileWriter out = new FileWriter(new File("OutputFile.txt")); 
    	BufferedReader inputStream = new BufferedReader(in);
    	PrintWriter outputStream = new PrintWriter(out);
    	String l;
    	while((l=inputStream.readLine()) != null)
    	{
    		System.out.println(l);
    		outputStream.println(l);
    	}
    	
    	in.close();
    	out.close();
    	
     }
	
	
}
