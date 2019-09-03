package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.SessionFactoryDao;
import com.Entity.CDEntity;
import com.Entity.InternationCd;

/**
 * Servlet implementation class InternationalCDController
 */
public class InternationalCDController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InternationalCDController() {
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
		response.setContentType("text/html");
		SessionFactoryDao sessionFactoryDaoObj = new SessionFactoryDao();
		String language = request.getParameter("Language");
		String region = request.getParameter("Region");
		CDEntity cdObj = new InternationCd(language,region);
		HttpSession session = request.getSession();
		CDEntity tempObj= (CDEntity)session.getAttribute("obj");
		
		System.out.println(tempObj);
		cdObj.setTitle(tempObj.getTitle());
		cdObj.setArtist(tempObj.getArtist());
		cdObj.setCost(tempObj.getCost());
		cdObj.setPurchase_date(tempObj.getPurchase_date());
		sessionFactoryDaoObj.insertCD(cdObj);
		PrintWriter writer = response.getWriter();
		  writer.print("Inserted Internation Cd");
		  RequestDispatcher  view=request.getRequestDispatcher("index.jsp");
		  view.include(request, response); 
		
	}

}
