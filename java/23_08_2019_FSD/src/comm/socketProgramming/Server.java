package comm.socketProgramming;

import java.io.IOException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {   
	public static void main(String[] args) throws IOException
	{
		ServerSocket server = null;
		Socket client; 
		int portNumber = 4400;
		String messageFromClient;
		
		
		server = new ServerSocket(portNumber);
		
		System.out.println("Server" + server + "is running at "+ portNumber);
		
		
		
			System.out.println("Waiting for client to send request....");
			client = server.accept();
			InputStream inputFromClient = client.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputFromClient));
			messageFromClient = reader.readLine();
			System.out.println("Hello Client your message is \n "+ messageFromClient );
			
			server.close();
			client.close();
			
			
			
		
		
	}
	
	
	

}
