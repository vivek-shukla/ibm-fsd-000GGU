package comm.employeeServices;
import java.sql.SQLException;
import java.util.List;
import comm.jdbc.EmployeeModel;

public interface EmployeeServiceInterface {
	
	public void inserstEmployee(EmployeeModel empObj) throws SQLException;
	public List<EmployeeModel> viewAllEmployee();
	public void deleteEmployee(int id);
	public void updateEmployee(int id, String fName,String lName,String email);

}
