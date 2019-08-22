package comm.FileIOstream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EncryptionMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub 
		String source,dest,eKey;
		System.out.println("Source file name");
		Scanner scanner = new Scanner(System.in);
		source = scanner.next();
		System.out.println("Dest file name");
		dest = scanner.next();
		eKey = scanner.next();
		FileEncryption ecryption = new FileEncryption();
		ecryption.encrypt(source, dest, Integer.parseInt(eKey));
		System.out.println("Display ");
		ecryption.viewFileContent(dest);
		
		
		

	}

}
