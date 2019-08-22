package comm.FileIOstream;
import java.io.*;
public class FileIOStream {
   
	public static void main(String[] args) throws IOException
	{
		FileInputStream in = new FileInputStream(new File("InputFile.txt"));
		FileOutputStream out = new FileOutputStream(new File("OutputFile.txt"));
		int c;
		try {
			while((c=in.read())!=-1)
			{
				System.out.println(c);
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
