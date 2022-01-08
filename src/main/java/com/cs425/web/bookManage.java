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

import com.cs425.web.dao.BookDao;
import com.cs425.web.dao.borrowDao;
import com.cs425.web.model.Book;
import com.cs425.web.model.borrow;

/**
 * Servlet implementation class bookManage
 */

@WebServlet("/bookManage/*")
public class bookManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doGet(request, response);
	    }
	 
    public bookManage() {
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
	                AddBook(request, response);
	                break;
	            case "/delete":
	                deleteBook(request, response);
	                break;
	            case "/search":
	            	 SearchBook(request, response);
	                break;
	            case "/update":
	                updateBook(request, response);
	                break;
	            default:
	                listBook(request, response);
	                break;
	            }
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	 private void AddBook(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
	    	BookDao BD2 = new BookDao();
	    	String D_ID = request.getParameter("iID1").toString();
			String ISBN = request.getParameter("iID2").toString();
			String Title = request.getParameter("iID3").toString();
			long publish_data = Long.parseLong(request.getParameter("iID4"), 10);
		    BD2.addBook(D_ID, ISBN, Title, publish_data);
	        
	        RequestDispatcher dispatcher = request.getRequestDispatcher("DeleteSuccess.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	private void deleteBook(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
		String bookID = request.getParameter("iID").toString();
		BookDao bookD  =  new BookDao();
		try {
			Book book1 = bookD.DeleteBook(bookID);
		} catch (SQLException e) {

			e.printStackTrace();
		}
	
	  RequestDispatcher rd = request.getRequestDispatcher("DeleteSuccess.jsp");
	  rd.forward(request, response);
       
    }
	 

	 private void listBook(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
	    	BookDao od1  =  new BookDao();
	  	    List< Book>  ob1 = od1.listAllBooks();
	        request.setAttribute("listBook", ob1);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("DeleteSuccess.jsp");
	        dispatcher.forward(request, response);
	    }
	
	
	
	
	 private void SearchBook(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
	    	BookDao BD = new BookDao();
	    	String D_ID = request.getParameter("iID").toString();
		
		    Book target = BD.getBook(D_ID);
	        request.setAttribute("listBook", target);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("ManageBook.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	 private void updateBook(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
	    	BookDao BD = new BookDao();
	    	String D_ID = request.getParameter("iID1");
			String ISBN = request.getParameter("iID2");
			String Title = request.getParameter("iID3");
			long publish_data = Long.parseLong(request.getParameter("iID4"), 10);
			   BD.UpdateBook(D_ID, ISBN, Title, publish_data);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("ManageBook.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	 

}
