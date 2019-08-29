package comm.league.addLeague;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.connection.ConnectionFactory;
import comm.league.model.LeagueModel;

/**
 * Servlet implementation class AddLeague
 */
@WebServlet("/addLeague.do")
public class AddLeague extends HttpServlet {
	private static int serialVersionUID = 91;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLeague() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			validate(request, response);
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
			validate(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void validate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		String title,sport;
		int year=0;
		List<String> errorList = new LinkedList<String>();
		title = request.getParameter("title");
		
		sport = request.getParameter("sport");
		if(sport.equals("Unknown"))
		{
			errorList.add("Please select the sport type");
		}
		try
		{
			year = Integer.parseInt(request.getParameter("year"));
		}
		catch(Exception e)
		{
			errorList.add("Year must be numeric");
		}
		
		
		if(errorList.isEmpty())
		{   Connection connectionObj = ConnectionFactory.getConnectionInstance();
			PreparedStatement pst = connectionObj.prepareStatement("insert into league(title,_year,sport,leagueId) values(?,?,?,?)");
			pst.setString(1, title);
			pst.setInt(2,year);
			pst.setString(3, sport);
			pst.setInt(4,serialVersionUID++ );
			pst.executeUpdate();
			request.setAttribute("SUCCESS", new LeagueModel(year,title,sport));
			RequestDispatcher  view=request.getRequestDispatcher("Success.jsp");
			view.forward(request, response);
		}
		else
		{  
			request.setAttribute("Error", errorList);
			RequestDispatcher  view=request.getRequestDispatcher("index.jsp");
			view.forward(request, response);	
		}
	}
	

}
