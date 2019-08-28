package comm.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.employeeService.EmployeeService;
import comm.model.EmployeeModel;

/**
 * Servlet implementation class ViewEmployees
 */
@WebServlet("/viewEmployees.do")
public class ViewEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeService employeeServiceObj;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEmployees() {
        super();
        // TODO Auto-generated constructor stub
        employeeServiceObj = new EmployeeService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			viewEmployees(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			viewEmployees(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void viewEmployees(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		List<EmployeeModel> empList = new ArrayList<EmployeeModel>();
		empList = employeeServiceObj.viewEmployees();
		if( !empList.isEmpty())
		{
			System.out.println("Employee List");
	    	request.setAttribute("SUCCESS", empList);
			RequestDispatcher  view=request.getRequestDispatcher("viewEmployees.view");
			view.forward(request, response);
		}
	}

}
