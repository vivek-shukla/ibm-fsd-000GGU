package comm.employeeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import comm.connection.ConnectionFactory;
import comm.model.EmployeeModel;

public class EmployeeDao {
   private Connection connectionObj;
	public EmployeeDao() {
		super();
		this.connectionObj = ConnectionFactory.getConnectionInstance();
	} 
	
	public int addEmployee(EmployeeModel emp) throws SQLException
	{
		PreparedStatement pst = connectionObj.prepareStatement("insert into employeeServlet(name,password,email,country,eId) values(?,?,?,?,?)");
		pst.setString(1, emp.getName());
		pst.setString(2,emp.getPassword());
		pst.setString(3, emp.getEmail());
		pst.setString(4, emp.getCountry());
		
		pst.setInt(5,emp.geteId());
		int result = pst.executeUpdate();
		return result;
		
	}
	public List<EmployeeModel> viewEmployees() throws SQLException
	{   List<EmployeeModel> empList = new ArrayList<EmployeeModel>();
		Statement st = connectionObj.createStatement();
		ResultSet rs;
		rs= st.executeQuery("select * from employeeServlet ");
		while(rs.next())
		{
			empList.add(new EmployeeModel(rs.getString(2),rs.getString(4),rs.getString(3),rs.getString(5),rs.getInt(6)));
		}
		return empList;
		
	}
	public void deleteEmployee(int eId) throws SQLException
	{
		PreparedStatement pst = connectionObj.prepareStatement("delete from employeeServlet where eId= (?)");
		pst.setInt(1,eId );
		pst.executeUpdate();
		
	}
	public void updateEmployee(EmployeeModel emp) throws SQLException
	{   PreparedStatement pst = connectionObj.prepareStatement("update employeeServlet set name=(?),password=(?),email=(?),country=(?) where eId= (?)");
		pst.setString(1, emp.getName());
		pst.setString(2, emp.getPassword());
		pst.setString(3, emp.getEmail());
		pst.setString(4, emp.getCountry());
		pst.setInt(5, emp.geteId());
		pst.executeUpdate();
	}
	
	public boolean findEmail(String email) throws SQLException
	{   
		Statement st = connectionObj.createStatement();
		ResultSet rs = st.executeQuery("select * from employeeServlet where email=\""+email+"\";");

		if(rs.next())
		{
			return true;
		}
		else
			return false;
		
	}
	public boolean matchPassword(String email,String password) throws SQLException
	{   
		Statement st = connectionObj.createStatement();
		ResultSet rs = st.executeQuery("select * from employeeServlet where email=\""+email+"\" and password=\""+password+"\";");

		if(rs.next())
		{
			return true;
		}
		else
			return false;
		
	}
	
   
}
