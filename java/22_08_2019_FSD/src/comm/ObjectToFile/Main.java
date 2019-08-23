package comm.ObjectToFile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
    
	  FileOutputStream out = new FileOutputStream("EmployeeObj.txt");
	  ObjectOutputStream writerObj = new ObjectOutputStream(out);
	  writerObj.writeObject(new Employee("10","Vivek","Vivek@gmail","28899"));
	  writerObj.writeObject(new Employee("10","Vivek","Vivek@gmail","28899"));
	  writerObj.writeObject(new Employee("45","Rebecca","Massil@gmail","899"));
	  writerObj.close();
	  FileInputStream in = new FileInputStream("EmployeeObj.txt");
	  ObjectInputStream reader = new ObjectInputStream(in);
	  Employee emp = (Employee)(reader.readObject());
	  System.out.println(emp.getAddresss()+" "+emp.getEmail());
	  emp = (Employee)(reader.readObject());
	  System.out.println(emp.getAddresss()+" "+emp.getEmail());
	  emp = (Employee)(reader.readObject());
	  System.out.println(emp.getAddresss()+" "+emp.getEmail());
	  
	  
	}

}
