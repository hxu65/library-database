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
import com.cs425.web.dao.CopiesDao;
import com.cs425.web.model.Copies;

/**
 * Servlet implementation class bookManage
 */

@WebServlet(urlPatterns = "/CopiesManage/*")
public class CopiesManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doGet(request, response);
	    }
	 
    public CopiesManage() {
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
	        	   AddCopies(request, response);
	                break;
	            case "/search":
	            	 SearchCopies(request, response);
	                break;
	            case "/searchMID" :
	            	 searchCopiesbyDID(request, response);
	            case "/all": 
	                listCopies(request, response);
	                break;
	            }
        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
		
	}

	 private void AddCopies(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		   CopiesDao CD = new CopiesDao();
	    	String D_ID = request.getParameter("iID1");
			String Copy_ID = request.getParameter("iID2");
			String location = request.getParameter("iID3");
			String borrowed = request.getParameter("iID4");
			CD.addCopies(D_ID, Copy_ID, location, borrowed);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/copiesSearch.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	
	 

	 private void listCopies(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		    CopiesDao CD = new CopiesDao();
	  	    List< Copies> allCopies= CD.listAllCopies(); 
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/copies/results.jsp");
	        request.setAttribute("Copies", allCopies);
	        dispatcher.forward(request, response);
	    }
	

	
	 private void SearchCopies(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		   CopiesDao CD = new CopiesDao();
	    	String Copy_ID = request.getParameter("iID").toString();
		
	    	Copies target = CD.getCopies(Copy_ID);
	        request.setAttribute("Copy", target);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/copies/singleResults.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	 private void searchCopiesbyDID(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		    CopiesDao CD = new CopiesDao();
		    String D_ID = request.getParameter("iID1");
	  	    List< Copies> allCopies= CD.SearchCopybyD_ID(D_ID); 
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/copies/results.jsp");
	        request.setAttribute("Copies", allCopies);
	        dispatcher.forward(request, response);
	    }
	 

}
