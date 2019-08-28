package comm.league.viewLeague;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.connection.ConnectionFactory;
import comm.league.model.LeagueModel;

/**
 * Servlet implementation class ViewLeague
 */
@WebServlet("/viewLeague.do")
public class ViewLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewLeague() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			showLeagues(request, response);
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
			showLeagues(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void showLeagues(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		Connection connectionObj = ConnectionFactory.getConnectionInstance();
		Statement st = connectionObj.createStatement();
		ResultSet rs=  st.executeQuery("select * from league");
		List<LeagueModel> listLeague = new ArrayList<LeagueModel>();
		while(rs.next())
		{
			listLeague.add(new LeagueModel(rs.getInt(3),rs.getString(2),rs.getString(4)));
		}
		String table = "<table> <tr>Title </tr> <tr>Year</tr> <tr>Sport</tr>";
		for(LeagueModel lm:listLeague)
		{
			table = table + "<tr> <td>"+ lm.getTitle() + "</td><td>"+ lm.getYear() +"</td><td>"+ lm.getSport() + "</tr>";
		}
		PrintWriter writer = response.getWriter();
		writer.println(table+"</table>");
	}

}
