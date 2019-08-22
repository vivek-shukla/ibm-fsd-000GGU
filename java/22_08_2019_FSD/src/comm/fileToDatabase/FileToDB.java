package comm.fileToDatabase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Pattern;

import comm.employeeServices.EmployeeServiceClass;
import comm.jdbc.EmployeeModel;

public class FileToDB {
  
 private EmployeeServiceClass employeeServiceObj;
  
  public void sendDataToFile() throws SQLException, IOException
  {   int id;
      String fName,lName,email;
	  employeeServiceObj = new EmployeeServiceClass();
	  FileReader in = new FileReader(new File("Employee.txt"));
	  BufferedReader reader = new BufferedReader(in);
	  String line;
	  while((line=reader.readLine())!=null)
	  {
		  String array[] = line.split(Pattern.quote(" "),4);
		  id = Integer.parseInt(array[0]);
		  fName = array[1];
		  lName=array[2];
		  email=array[3];
		  employeeServiceObj.inserstEmployee(new EmployeeModel(id,fName,lName,email));
		  
	  }
  }
  public void saveDataToFile(String fileName) throws SQLException, IOException
  {   employeeServiceObj = new EmployeeServiceClass();
	  List<EmployeeModel> empList = employeeServiceObj.viewAllEmployee();
	  FileWriter out = new FileWriter(new File(fileName));
	  PrintWriter writer = new PrintWriter(out);
	  for(EmployeeModel emp:empList)
	  {
		  String line = emp.getId()+" "+emp.getFirstName()+" "+emp.getLastName()+" "+emp.getEmail();
		  System.out.println(line);
		  writer.println(line);
	  }
	  out.close();
  }
  public static void main(String[] args) throws SQLException, IOException
  {
	  FileToDB f2dObj = new FileToDB();
//	  f2dObj.sendDataToFile();
	  f2dObj.saveDataToFile("OutputFromDB.txt");
  }
  
}
