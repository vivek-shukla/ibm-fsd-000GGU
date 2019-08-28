package employee.viewAllEmployee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.employeeServices.EmployeeServiceClass;
import comm.jdbc.EmployeeModel;

/**
 * Servlet implementation class ViewEmployees
 */
@WebServlet("/viewEmps.view")
public class ViewEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEmployees() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try 
		{
			viewAllEmps(request, response);
		}
		catch(SQLException sqE)
		{
			sqE.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try 
		{
			viewAllEmps(request, response);
		}
		catch(SQLException sqE)
		{
			sqE.printStackTrace();
		}
	}
	protected void viewAllEmps(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		EmployeeServiceClass employeeServiceObj = new EmployeeServiceClass();
		List<EmployeeModel> empList = new ArrayList<EmployeeModel>();
		empList = employeeServiceObj.viewAllEmployee();
		response.setContentType("text/html");
		String table="<table> <th>Id </th> <th>First Name </th> <th>Last Name</th> <th>Email</th> </table>";
	    for(EmployeeModel emp:empList)
	    {
	    	table = table + "<tr> <td> " + emp.getId() + "</td> <td>"+ emp.getFirstName() + "</td> <td>"+ emp.getLastName() + "</td> <td>"+ emp.getEmail() + "</td> </tr>";
	    }
	    PrintWriter writer = response.getWriter();
	    writer.println(table);	
	}

}
