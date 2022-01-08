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
import com.cs425.web.dao.borrowDao;
import com.cs425.web.model.borrow;

/**
 * Servlet implementation class bookManage
 */

@WebServlet("/borrowManage/*")
public class borrowManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doGet(request, response);
	    }
	 
    public borrowManage() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String action = request.getRequestURI(); 
		  action = action.substring(action.lastIndexOf("/")).toLowerCase();
		  System.out.println(action);
	        try {
	            switch (action) {
	           
	            case "/insert":
	                AddBorrows(request, response);
	                break;
	            case "/delete":
	                deleteBorrows(request, response);
	                break;
	            case "/search":
	            	 SearchBorrowsByDocument(request, response);
	                break;
	            case "/update":
	                updateBorrows(request, response);
	                break;
	            case "/all":
	                listBorrows(request, response);
	                break;
	            case "request":
	            	
	            }
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	 private void AddBorrows(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		  borrowDao BD = new borrowDao();
	    	String D_ID = request.getParameter("iID1");
			String Copy_ID = request.getParameter("iID2");
			String M_ID = request.getParameter("iID3");
			long reserve_date = Long.parseLong(request.getParameter("iID4"), 10);
			long return_date = Long.parseLong(request.getParameter("iID5"), 10);
			int load_period = Integer.parseInt(request.getParameter("iID6"));
			String IsReturned = request.getParameter("iID7").toString();
			BD.addBorrows(D_ID, Copy_ID, M_ID, reserve_date, return_date, load_period, IsReturned);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("borrowSearch.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	private void deleteBorrows(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
		String Copy_ID = request.getParameter("iID1");
		String M_ID = request.getParameter("iID2");
		borrowDao BD = new borrowDao();
	    BD.deleteBorrows(Copy_ID, M_ID);
	  RequestDispatcher rd = request.getRequestDispatcher("DeleteSuccess.jsp");
	  rd.forward(request, response);
       
    }
	 

	 private void listBorrows(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		 borrowDao BD = new borrowDao();
	  	    List< borrow> allBorrow= BD.listAllBorrows();
	        request.setAttribute("listDocuments", allBorrow);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("borrowSearch.jsp");
	        dispatcher.forward(request, response);
	    }
	
	
	
	
	 private void SearchBorrowsByDocument(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		 borrowDao BD = new borrowDao();
	    	String D_ID = request.getParameter("iID");
		
	    	List< borrow> allBorrow= BD.getBorrow(D_ID);
	        request.setAttribute("listDocuments", allBorrow);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("ManageBook.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	 private void updateBorrows(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		    borrowDao BD = new borrowDao();
		    String D_ID = request.getParameter("iID1");
			String Copy_ID = request.getParameter("iID2");
			String M_ID = request.getParameter("iID3");
			long reserve_date = Long.parseLong(request.getParameter("iID4"), 10);
			long return_date = Long.parseLong(request.getParameter("iID5"), 10);
			int load_period = Integer.parseInt(request.getParameter("iID6"));
			String IsReturned = request.getParameter("iID7").toString();
			BD.updateBorrows(D_ID, Copy_ID,  M_ID,reserve_date, return_date,load_period, IsReturned);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("ManageBook.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	 

}
