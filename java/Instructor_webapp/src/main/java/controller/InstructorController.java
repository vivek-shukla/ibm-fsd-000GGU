package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.InstructorDaoClass;
import Entity.Instructor;
import Entity.InstructorDetail;

/**
 * Servlet implementation class InstructorController
 */
public class InstructorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InstructorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = request.getSession();
		 
		Instructor instructor = (Instructor)sess.getAttribute("Instructor");
		InstructorDetail instructorDetail;
		String youtubeChannel = (String)request.getParameter("youtubeChannel");
		String hobby = (String)request.getParameter("hobby");
		instructorDetail = new InstructorDetail(youtubeChannel,hobby);
		instructor.setInstructorDetail(instructorDetail);
		InstructorDaoClass instructorDaoObj = new InstructorDaoClass();
		instructorDaoObj.createInstructor(instructor);
		System.out.println("Response created!!!");
		
	}

}
