import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import comm.jdbc.ConnectionFactory;

public class RS2XmlConfig {
   private ConnectionFactory connectionInstance;
   private Connection connectionObj;

	public RS2XmlConfig() throws SQLException {
		super();
		connectionInstance = ConnectionFactory.createObject();
		connectionObj = connectionInstance.getConnection();
	}
   
	public ResultSet fetchAllEmployees() throws SQLException
	{
		Statement st = connectionObj.createStatement();
		
		ResultSet rs = st.executeQuery("select id as _id,firstName as first_name,lastName as last_name, email from EmployeeJdbc");
		
		return rs;
	}
   
	
	
	
	
	
	public ResultSet fetchEmployeeAndDepartment() throws SQLException
	{
		Statement st = connectionObj.createStatement();
		
		ResultSet rs = st.executeQuery("select concat(firstName,' ',lastName) as Name, email , department_name,location from EmployeeJdbc,departmentJdbc");
		
		return rs;
	} 
   
}
