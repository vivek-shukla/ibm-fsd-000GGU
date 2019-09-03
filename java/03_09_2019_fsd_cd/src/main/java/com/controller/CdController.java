package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.SessionFactoryDao;
import com.Entity.CDEntity;

/**
 * Servlet implementation class CdController
 */
public class CdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CdController() {
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
		SessionFactoryDao sessionFactoryDaoObj = new SessionFactoryDao();
		String title = (String)request.getParameter("title");
		  String Artist = (String)request.getParameter("Artist");
		  String purchase_date = (String)request.getParameter("purchase_date");
		  Double cost = Double.parseDouble((String)request.getParameter("cost"));
		  CDEntity cdObj = new CDEntity(title,Artist,purchase_date,cost);
		  HttpSession session = request.getSession();
		  session.setAttribute("obj", cdObj);
		if(request.getParameter("cd_type").equals("CD"))
			{  
			 sessionFactoryDaoObj.insertCD(cdObj);
			  PrintWriter writer = response.getWriter();
			  writer.print("Inserted Cd");
			  RequestDispatcher  view=request.getRequestDispatcher("Internation.jsp");
			  view.include(request, response); 
			  
			
		}
		else if(request.getParameter("cd_type").equals("Internation"))
		{   
			RequestDispatcher  view=request.getRequestDispatcher("Internation.jsp");
			view.forward(request, response); 
		}
		else
		{
			RequestDispatcher  view=request.getRequestDispatcher("Regional.jsp");
			view.forward(request, response);
		}
		
		
	}

}
