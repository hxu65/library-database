package com.cs425.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cs425.web.dao.MembersDao;  
import com.cs425.web.model.Members;
import com.cs425.web.model.Librarians;
import com.cs425.web.dao.LibrariansDao;;
/**
 * Servlet implementation class bookManage
 */

@WebServlet(urlPatterns = "/memberManage/*")
public class memberManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doGet(request, response);
	    }
	 
    public memberManage() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String action = request.getRequestURI(); 
		  action = action.substring(action.lastIndexOf("/")).toLowerCase();
		 
		  
	        try {
	            switch (action) {
	           
	           case "/insert":
	        	   AddMember(request, response);
	                break;
	            case "/search":
	            	 SearchMember(request, response);
	                break;
	            case "/all": 
	                listMember(request, response);
	                break;
	            }
        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
		
	}

	 private void AddMember(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		   MembersDao MD = new MembersDao();
	    	String mID = request.getParameter("iID1");
			String email = request.getParameter("iID2");
			String name = request.getParameter("iID3");
			String password = request.getParameter("iID4");
			MD.addMembers(mID, email, name, password);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/memberLogin.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	 

	 private void listMember(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		    MembersDao MD = new MembersDao();
		    
	  	    List< Members> allMem= MD.listAllMembers();
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/documentsResults.jsp");
	        request.setAttribute("listMemebrs", allMem);
	        dispatcher.forward(request, response);
	    }
	
	
	
	
	 private void SearchMember(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		 MembersDao MD = new MembersDao();
	    	String M_ID = request.getParameter("iID").toString();
		
	    	Members target = MD.getMembers(M_ID);
	        request.setAttribute("Member", target);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("ManageBook.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	
	 

}
