package comm.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.employeeService.EmployeeService;
import comm.model.EmployeeModel;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet(
		urlPatterns = { "/addEmployee.do" }, 
		initParams = { 
				@WebInitParam(name = "country", value = "India,USA,Spain,France,Austria,Canada,New Zealand,Sudan,Greece,Belgium,Netherland")
		})
public class AddEmployee extends HttpServlet {
	private static int serialVersionUID = 2;
    private EmployeeService employeeServiceObj;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
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
			addEmployee(request, response);
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
			addEmployee(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void addEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
	    String name,password,country,email;
	    int eId;
	    name = request.getParameter("name");
	    password = request.getParameter("password");
	    country = request.getParameter("country");
	    email = request.getParameter("email");
	    eId = serialVersionUID++;
	    int result = employeeServiceObj.addEmployee(new EmployeeModel(name,password,email,country,eId));
	    if(result==0)
	    { 
	    	request.setAttribute("Failure", "Couldn't add employee");
			RequestDispatcher  view=request.getRequestDispatcher("success.view");
			view.forward(request, response);
	    	
	    }
	    else
	    {   System.out.println("Employee added");
	    	request.setAttribute("SUCCESS", "Employee added");
			RequestDispatcher  view=request.getRequestDispatcher("EmployeeIndex.html");
			view.forward(request, response);
	    } 
	}
}
