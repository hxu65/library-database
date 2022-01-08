package com.cs425.web.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cs425.web.model.Author;


public class  AuthorDao { 
	final String url = "jdbc:postgresql://localhost:5432/LibraryManagement";
	final String user = "postgres";
	final String password = "1234";//"<add your password>";

public ArrayList<Author> getIDByAuthor(String Author) {
		
	ArrayList<Author> listAuthors = new ArrayList<>();
		
	String mySQL = "SELECT * FROM author_document "
    		+ "WHERE author like ?";
        
        

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(url, user, password);
	 		    PreparedStatement pStmt = conn.prepareStatement(mySQL)){
	 			Author = "%" + Author.trim() + "%";
	 			
	 		pStmt.setString(1, Author);
	 		
            ResultSet rs = pStmt.executeQuery();
            
            while (rs.next()) {
            	 String id = rs.getString("D_ID");
                 String location = rs.getString("author");
  
                 Author info = new Author(id, location);
                 listAuthors.add(info);
            }
       }catch (SQLException e) {
    		 System.out.println(e.getMessage());
       }
		
		return listAuthors;
	
	}


}

		
