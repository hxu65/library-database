package com.cs425.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cs425.web.dao.DocumentsDao;
import com.cs425.web.model.Documents;

/**
 * Servlet implementation class bookManage
 */

@WebServlet(urlPatterns = "/DocumentControl/*")
public class DocumentControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doGet(request, response);
	    }
	 
    public DocumentControl() {
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
	                AddDocument(request, response);
	                break;
	            case "/delete":
	                deleteDocument(request, response);
	                break;
	            case "/search":
	            	 SearchDocument(request, response);
	                break;
	            case "/update":
	                updateDocument(request, response);
	                break;
	            case "/all": 
	                listDocument(request, response);
	                break;
	            }
        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
		
	}

	 private void AddDocument(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		 DocumentsDao DD = new DocumentsDao();
	    	String D_ID = request.getParameter("iID1");
			String location = request.getParameter("iID2");
			String type = request.getParameter("iID3");
			String category = request.getParameter("iID4");
			DD. InsertDocument(D_ID, location, type, category);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("DeleteSuccess.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	private void deleteDocument(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
		String docuemtnID = request.getParameter("iID").toString();
		 DocumentsDao DD = new DocumentsDao();
		try {
			DD.deleteDocuments(docuemtnID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	  RequestDispatcher rd = request.getRequestDispatcher("DeleteSuccess.jsp");
	  rd.forward(request, response);   
    }
	 

	 private void listDocument(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		    DocumentsDao DD = new DocumentsDao();
	  	    List< Documents> allDocu= DD.listAllDocuments();
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/documents/results.jsp");
	        request.setAttribute("listDocuments", allDocu);
	        dispatcher.forward(request, response);
	    }
	
	
	
	
	 private void SearchDocument(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		    DocumentsDao DD = new DocumentsDao();
	    	String D_ID = request.getParameter("iID");
		
	    	Documents target = DD.getDocuments(D_ID);
	        request.setAttribute("listDocument", target);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/documents/singleResult.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	 private void updateDocument(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		    DocumentsDao DD = new DocumentsDao();
	    	String D_ID = request.getParameter("iID1").toString();
			String location = request.getParameter("iID2").toString();
			String type = request.getParameter("iID3").toString();
			String category = request.getParameter("iID4").toString();
			DD.UpdateDocuments(D_ID, location, type,category);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("ManageBook.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	 

}
