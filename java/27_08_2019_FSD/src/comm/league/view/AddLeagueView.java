package comm.league.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddLeagueView
 */
@WebServlet(
		urlPatterns = { "/errorAddLeague.view" }, 
		initParams = { 
				@WebInitParam(name = "sportList", value = "Cricket,Football,Rugby,Basket Ball")
		})
public class AddLeagueView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddLeagueView() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		
		@SuppressWarnings("unchecked")
		List<String> errorList =(LinkedList<String>)request.getAttribute("Error");
		for(String errorMsg:errorList)
        {
        	writer.println("<li style=\"color:red\">"+errorMsg+"</li>");
        }
		    writer.println("<form action=\"addLeague.do\">"); 
		    writer.println("<label for=\"title\">league Title </label>");
		  
		    writer.println(" <input type=\"text\" name = \"title\" id=\"title\" placeholder=\"Enter League title\">\r\n" + 	"	");
	    	writer.println("<label for=\"year\">Enter Year </label>");   	    
		    writer.println("<input type=\"text\" name = \"year\" id=\"year\" placeholder=\"Enter year\">\r\n" + 	"		");    
		    writer.println(" <select name=\"sport\">");
		    writer.println("<option value=\"Unknown\">Select...</option>");
		    String sportList = getServletConfig().getInitParameter("sportList");
		    String arraySport[] = sportList.split(",");
		    for(String sport:arraySport)
		    {
		    	writer.println("<option value='"+sport+"'>"+sport+"</option>");
		    }
		    writer.println("</select><br/><input type='submit' value='add league'></form>");
		       
	}

}
