package comm.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.model.EmployeeModel;

/**
 * Servlet implementation class ViewEmployee
 */
@WebServlet("/viewEmployees.view")
public class ViewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		showEmployees(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		showEmployees(request, response);
	}
	
	protected void showEmployees(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
         PrintWriter writer = response.getWriter();
		
		@SuppressWarnings("unchecked")
		List<EmployeeModel> empList =(ArrayList<EmployeeModel>)request.getAttribute("SUCCESS");
		writer.println("<!DOCTYPE html> <html> <head> <meta charset=\"ISO-8859-1\"> <title>Insert title here</title>");
		writer.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n" + 
				"");
		writer.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\r\n" + 
				"");
		writer.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n" + 
				"		</head>\r\n" + 
				"		<body>");
		writer.println("<table class=\"table\">\r\n" + 
				"		  <thead class=\"thead-dark\">\r\n" + 
				"		    <tr>\r\n" + 
				"		      <th scope=\"col\">Name</th>\r\n" + 
				"		      <th scope=\"col\">Email</th>\r\n" + 
				"		      <th scope=\"col\">Country</th>\r\n" + 
				"		      <th scope=\"col\">Employee Id</th>\r\n" + 
				"		    </tr>\r\n" + 
				"		  </thead>\r\n" + 
				"		  <tbody>");
	
    
		for(EmployeeModel emp:empList)
        {   
			writer.println("<tr>\r\n" + 
					"      <td>"+emp.getName()+"</th>\r\n" + 
					"      <td>"+emp.getEmail()+"</th>\r\n" + 
					"      <td>"+emp.getCountry()+"</td>\r\n" + 
					"      <td>"+emp.geteId()+"@fat</td>\r\n" + 
					"      <td><a href='deleteEmp.do?eId="+emp.geteId()+"'>Delete</a></td>\r\n" +
					"      <td><a href='updateEmp.view?eId="+emp.geteId()+"&name="+emp.getName()+"&email="+emp.getEmail()+"&password="+emp.getPassword()+"&country="+emp.getCountry()+"'>Update</a></td>\r\n" + 
					"    </tr>");
        }
		 writer.println("</tbody>\r\n" + 
		 		"			</table>");
		    
		       
	}
	
	

}
