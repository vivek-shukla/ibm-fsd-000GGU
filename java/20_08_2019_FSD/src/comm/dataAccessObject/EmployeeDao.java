package comm.dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.jdbc.ConnectionFactory;
import comm.jdbc.EmployeeModel;

public class EmployeeDao implements employeeDaoInterface {
    
	private ConnectionFactory connectionInstance;
	private Connection connectionObj;
	private PreparedStatement pStatement;
	private Statement statement;
	private ResultSet resultSet;
	
	public EmployeeDao() throws SQLException {
		super();
		connectionInstance = ConnectionFactory.createObject();
		connectionObj = connectionInstance.getConnection();
	}

	@Override
	public void inserstEmployee(EmployeeModel emp)  { 
		try {
			pStatement = connectionObj.prepareStatement("insert into EmployeeJdbc values (?,?,?,?)");
			pStatement.setInt(1,emp.getId());
			pStatement.setString(2,emp.getFirstName());
			pStatement.setString(3,emp.getLastName());
			pStatement.setString(4,emp.getEmail());
			pStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

	@Override
	public List<EmployeeModel> viewAllEmployee() {
		List<EmployeeModel> empList = new ArrayList<EmployeeModel>();
		try {
			pStatement = connectionObj.prepareStatement(" select * from EmployeeJdbc "); // prepare p statement first
			//statement = connectionObj.createStatement();
			resultSet = pStatement.executeQuery();
			while(resultSet.next())
			{
				empList.add(new EmployeeModel( resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4) ));
			}
			return empList;
			
		} catch (SQLException e) { 
			System.err.println("Couldn't find element");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return empList;
	}

	@Override
	public void deleteEmployee(int id) { 
		try {
			pStatement = connectionObj.prepareStatement("delete from EmployeeJdbc where id = (?)");
			pStatement.setInt(1,id);
			pStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}
	public void updateEmployee(int id,String fName,String lName,String email)
	{
		try {
			pStatement = connectionObj.prepareStatement("update EmployeeJdbc set firstName=(?), lastName=(?), email=(?) where id = (?)");
			pStatement.setInt(4,id);
			pStatement.setString(1, fName);
			pStatement.setString(2, lName);
			pStatement.setString(3, email);
			pStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String findEmployee(int id) { 
		try {
			pStatement = connectionObj.prepareStatement("select * from EmployeeJdbc where id = (?)");
			pStatement.setInt(1,id);
			resultSet = pStatement.executeQuery();
			//System.err.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
			if(resultSet.next())
			{
			  return resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
		// TODO Auto-generated method stub
	}

}
