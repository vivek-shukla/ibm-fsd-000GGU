package comm.employeeServices;
import comm.dataAccessObject.EmployeeDao;
import comm.dataAccessObject.employeeDaoInterface;
import comm.jdbc.EmployeeModel;
import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceClass implements EmployeeServiceInterface {
    private employeeDaoInterface daoObject;
    
	public EmployeeServiceClass() throws SQLException {
		super();
		daoObject = new EmployeeDao();
	}

	@Override
	public void inserstEmployee(EmployeeModel empObj) throws SQLException {
		daoObject.inserstEmployee(empObj);
	}

	@Override
	public List<EmployeeModel> viewAllEmployee() {
		// TODO Auto-generated method stub
		return daoObject.viewAllEmployee();
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub 
		daoObject.deleteEmployee(id);

	}
	public void updateEmployee(int id, String fName,String lName,String email)
	{
		daoObject.updateEmployee(id, fName, lName, email);
	}

}
