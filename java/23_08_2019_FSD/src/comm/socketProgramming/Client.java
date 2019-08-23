package comm.socketProgramming;

import java.io.IOException;
import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
         Socket client = null;
         int portOfServer = 4400;
         client = new Socket(InetAddress.getLocalHost(),portOfServer);
         OutputStream clientOutput = client.getOutputStream();
         PrintWriter writer = new PrintWriter(clientOutput);
         
         BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Hello Client \n Enter your message: ");
         
         String msg = stdIn.readLine();
         writer.println(msg);
         writer.close();
         client.close();
	}

}
