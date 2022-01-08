package com.cs425.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cs425.web.dao.MembersDao;
import com.cs425.web.model.Members;

/**
 * Servlet implementation class Oritation
 */

@WebServlet(urlPatterns = "/Oritation/*")
public class Oritation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Oritation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		// TODO Auto-generated method stub
   		  String action = request.getRequestURI(); 
   		  action = action.substring(action.lastIndexOf("/")).toLowerCase();
   		 
   		  
   	        try {
   	            switch (action) {
   	           
   	           case "/MemberHome":
   	        	    MemberHome(request, response);
   	                break;
   	            case "/LibraryHome":
   	                LibraryHome(request, response);
   	                break;
   	            case "/MemberSearch":
   	            	 MemberSearch(request, response);
   	                break;
   	            case "/LibrarySearch": 
   	            	LibrarySearch(request, response);
   	                break;
   	            }
           } catch (SQLException ex) {
   	            throw new ServletException(ex);
   	        }
   		
   	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	
	
	
	private void MemberHome(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("memberHome.jsp");
        dispatcher.forward(request, response);
    }
	
	private void LibraryHome(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
		response.sendRedirect("/login and Home/memberHome.jsp");
    }
	private void MemberSearch(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
		response.sendRedirect("/login and Home/memberHome.jsp");
    }
	private void LibrarySearch(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
		response.sendRedirect("/login and Home/memberHome.jsp");
    }
	
	
	
	

}
