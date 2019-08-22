package comm.FileIOstream;
import java.io.*;
public class FileIOchaeStream { 
	   
		public static void main(String[] args) throws IOException
		{
			FileReader in = new FileReader(new File("InputFile.txt"));
			FileWriter out = new FileWriter(new File("OutputFile.txt"));
			int c;
			try {
				while((c=in.read())!=-1)
				{
					System.out.println((char)c);
					out.write(c);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File handling");
			in.close();
			out.close();
		}


}
