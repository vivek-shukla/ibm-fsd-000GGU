package comm.employeeService;

import java.sql.SQLException;
import java.util.List;

import comm.employeeDao.EmployeeDao;
import comm.model.EmployeeModel;

public class EmployeeService {
   
	private EmployeeDao daoObject;

	public EmployeeService() {
		super();
		daoObject = new EmployeeDao();
	}
	public int addEmployee(EmployeeModel emp) throws SQLException
	{
		
			return daoObject.addEmployee(emp);
		
	}
	public List<EmployeeModel> viewEmployees() throws SQLException
	{
		return daoObject.viewEmployees();
	}
	public void deleteEmployee(int eId) throws SQLException
	{
		daoObject.deleteEmployee(eId);
	}
	public void updateEmployee(EmployeeModel emp) throws SQLException
	{
		daoObject.updateEmployee(emp);
	}
	public boolean findEmail(String email) throws SQLException
	{
		return daoObject.findEmail(email);
	}
	public boolean matchPassword(String email,String Password) throws SQLException
	{
		return daoObject.matchPassword(email, Password);
	}
	
	
}
