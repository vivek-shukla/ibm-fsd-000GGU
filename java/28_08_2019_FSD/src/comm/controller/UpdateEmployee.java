package comm.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.employeeService.EmployeeService;
import comm.model.EmployeeModel;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/updateEmployee.do")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EmployeeService employeeServiceObj;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
        super();
        employeeServiceObj = new EmployeeService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			updateEmployee(request, response);
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
			updateEmployee(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		String name,email,password,country;
		int eId;
		name = request.getParameter("name");
		email = request.getParameter("email");
		password = request.getParameter("password");
		country = request.getParameter("country");
		eId = Integer.parseInt(request.getParameter("eId"));
		EmployeeModel emp = new EmployeeModel(name,password,email,country,eId);
		employeeServiceObj.updateEmployee(emp);
		
		
		RequestDispatcher  view=request.getRequestDispatcher("viewEmployees.do");
		view.forward(request, response);
			
	}

}
