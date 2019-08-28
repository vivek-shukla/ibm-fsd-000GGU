package comm.league.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.league.model.LeagueModel;

/**
 * Servlet implementation class ErrorMsg
 */
@WebServlet("/error.view")
public class ErrorMsg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorMsg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<String> errorList =(LinkedList<String>)request.getAttribute("Error");
		response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        for(String errorMsg:errorList)
        {
        	writer.println("<li style=\"color:red\">"+errorMsg+"</li>");
        }
        writer.println("<a href=\"http://localhost:8080/27_08_2019_FSD\">Go To Homepage</a>");
	}

}
