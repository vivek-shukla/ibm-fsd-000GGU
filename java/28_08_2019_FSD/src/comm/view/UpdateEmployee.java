package comm.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.model.EmployeeModel;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet(name = "UpdateEmployeeView", urlPatterns = { "/updateEmp.view" })
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				updateEmployee(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		updateEmployee(request, response);
	}
	protected void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name,email,password,country;
		int eId;
		name = request.getParameter("name");
		email = request.getParameter("email");
		password = request.getParameter("password");
		country = request.getParameter("country");
		eId = Integer.parseInt(request.getParameter("eId"));
		PrintWriter writer = response.getWriter();
		writer.println("<!DOCTYPE html> <html> <head> <meta charset=\"ISO-8859-1\"> <title>Insert title here</title>");
		writer.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n" + 
				"");
		writer.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\r\n" + 
				"");
		writer.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n" + 
				"		</head>\r\n" + 
				"		<body>");
		writer.println("<form name=\"Employee\" id=\"form-1\" action=\"updateEmployee.do\" method=\"post\">\r\n" + 
				"	<label for=\"name\">Name:</label>\r\n" + 
				"	<input class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Enter Your Name\" required=\"true\" type=\"text\" value='"+name+"'/>\r\n" + 
				"	<label  for=\"password\">Password:</label>\r\n" + 
				"	<input class=\"form-control\" id=\"password\" name=\"password\" required=\"true\" type=\"password\" value='"+password+"'/>\r\n" + 
				"	<label for=\"email\">Email:</label>\r\n" + 
				"	<input class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"abc@ef.com\" type=\"email\" value='"+email+"'/>\r\n" + 
				"	<input class=\"form-control\" id=\"email\" name=\"eId\"  type=\"text\" value='"+eId+"' hidden=true readonly/>\r\n" + 
				"	<label for=\"country\">Country:</label>\r\n" + 
				"	<input class=\"form-control\" id=\"country\" name=\"country\" type=\"text\" list=\"India\"/>\r\n" + 
				"	<datalist class=\"form-control\" id=\"India\">\r\n" + 
				"		<option value=\"India\">India</option>\r\n" + 
				"		<option value=\"Spain\">Spain</option>\r\n" + 
				"		<option value=\"Tuvalu\">Tuvalu</option>\r\n" + 
				"	</datalist>\r\n" + 
				"	<input id=\"submit\" class=\"btn btn-primary\" name=\"submit\" type=\"submit\" value=\"Update Employee\"/>\r\n" + 
				"</form> ");
//		EmployeeModel emp = new EmployeeModel(name,password,email,country,eId);
//		request.setAttribute("Employe", emp);
//		RequestDispatcher  view=request.getRequestDispatcher("updateEmployee.do");
//		view.forward(request, response);
	}		
	

}
