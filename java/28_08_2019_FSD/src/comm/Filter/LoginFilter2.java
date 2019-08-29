package comm.Filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import comm.employeeService.EmployeeService;

/**
 * Servlet Filter implementation class LoginFilter2
 */

@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, urlPatterns = { "/Login" })
public class LoginFilter2 implements Filter {
	private EmployeeService employeeServiceObj;
    /**
     * Default constructor. 
     */
    public LoginFilter2() {
    	employeeServiceObj = new EmployeeService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
       try {
		if(employeeServiceObj.matchPassword(request.getParameter("email"), request.getParameter("password")))
			// pass the request along the filter chain
		{	 request.setAttribute("em", "verified");
		     request.setAttribute("pass", "verified");
		     RequestDispatcher  view=request.getRequestDispatcher("Login.jsp");
			 view.forward(request, response);
		}
			
		else
		{   request.setAttribute("em", "verified");
			request.setAttribute("pass", "invalid");
			RequestDispatcher  view=request.getRequestDispatcher("Login.jsp");
			view.forward(request, response);
//			PrintWriter writer = response.getWriter();
//			writer.println("Password not match");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
