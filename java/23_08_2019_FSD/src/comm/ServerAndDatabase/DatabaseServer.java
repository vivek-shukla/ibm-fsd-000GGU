package comm.ServerAndDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.regex.Pattern;

import comm.employeeServices.EmployeeServiceClass;
import comm.jdbc.EmployeeModel;

public class DatabaseServer {

	public static void main(String[] args) throws IOException, NumberFormatException, SQLException {
		// TODO Auto-generated method stub 
		ServerSocket server = null;
		Socket client; 
		int portNumber = 2240;
		String objectFromClient;
		EmployeeServiceClass empService = new EmployeeServiceClass();
		String id,fName,lName,email;
		
		
		server = new ServerSocket(portNumber);
		
		System.out.println("Server" + server + "is running at "+ portNumber);
		
		  
		
			System.out.println("Waiting for client to send request....");
			client = server.accept();
			InputStream inputFromClient = client.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputFromClient));
			boolean t = true;
			String str = reader.readLine();
			String l = str;
	        while(t)
	        {
	        	

//						while(str!=null)
//						{   
        					
							String arrayEmp[] = l.split(Pattern.quote(" "));
							if(arrayEmp.length<3)
							{
								System.out.println(empService.findEmployee(Integer.parseInt(arrayEmp[0])));
							}
							else
							{
								id = arrayEmp[0];
								fName = arrayEmp[1];
								lName = arrayEmp[2];
								email = arrayEmp[3]; 
								empService.inserstEmployee(new EmployeeModel(Integer.parseInt(id),fName,lName,email));
								System.out.println("The Object Inserted \n "+ l );
							}
							
//							str = reader.readLine();
//							
//								
//						}
//						if(str.equals("bye"))
//						{
//							server.close();
//							client.close();	
//						}
	}

	}
}
