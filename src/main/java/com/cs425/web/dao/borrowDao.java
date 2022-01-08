package com.cs425.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cs425.web.model.Copies;
import com.cs425.web.model.borrow;


public class borrowDao {
	
	    final String url = "jdbc:postgresql://localhost:5432/LibraryManagement";
		final String user = "postgres";
		final String password = "1234";//"<add your password>";

		public ArrayList<borrow> getBorrow(String D_ID) {
           
	        String mySQL = "SELECT * "
	        		+ "FROM borrow "
	        		+ "WHERE D_ID = ?";
	        
	        ArrayList<borrow> listBorrows = new ArrayList<>();

			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try (Connection conn = DriverManager.getConnection(url, user, password);
		 		    PreparedStatement pStmt = conn.prepareStatement(mySQL)){
		 			
		 		pStmt.setString(1, D_ID.trim());
		 		
	            ResultSet rs = pStmt.executeQuery();
	            
	            while (rs.next()) {
	            	/* Retrieves the value of the designated column in the current row 
	            	   of this ResultSet object as a String in the Java programming language.
	            	*/
	            	String D_ID2 = rs.getString("D_ID");
		            String Copy_ID = rs.getString("Copy_ID");
		            String M_ID = rs.getString("M_ID");
		            String reserve_date = rs.getString("reserve_date");
		            String return_date = rs.getString("return_date");
		            int load_period = rs.getInt("load_period");
		            String IsReturned = rs.getString("IsReturned");
		            borrow borrow1 = new borrow(D_ID2, Copy_ID,  M_ID, reserve_date, return_date, load_period, IsReturned);
		            listBorrows.add(borrow1);
	                
	            }
	       }catch (SQLException e) {
	    		 System.out.println(e.getMessage());
	       }
			
			return listBorrows;
		
		}
		
		
		public ArrayList<borrow> listAllBorrows() throws SQLException {
	    	ArrayList<borrow> listBorrows = new ArrayList<>();
	        String sql = "SELECT * FROM borrow";
	        try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try (Connection conn = DriverManager.getConnection(url, user, password);
		 		    PreparedStatement pStmt = conn.prepareStatement(sql)){
		 		 ResultSet rs = pStmt.executeQuery();
		        while (rs.next()) {
		            String D_ID = rs.getString("D_ID");
		            String Copy_ID = rs.getString("Copy_ID");
		            String M_ID = rs.getString("M_ID");
		            String reserve_date = rs.getString("reserve_date");
		            String return_date = rs.getString("return_date");
		            int load_period = rs.getInt("load_period");
		            String IsReturned = rs.getString("IsReturned");
		            borrow borrow1 = new borrow(D_ID, Copy_ID,  M_ID, reserve_date, return_date, load_period, IsReturned);
		            listBorrows.add(borrow1);
		        }
	        	return listBorrows;
			}
		
	    }	
		

		 public void addBorrows(String D_ID, String Copy_ID,  String M_ID, long reserve_date, long return_date,  int load_period,  String IsReturned ) throws SQLException {
		        String mySQL = "insert into borrow values (?, ?, ?, ?, ?, ? ,?)";
		        
			

				try {
					Class.forName("org.postgresql.Driver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try (Connection conn = DriverManager.getConnection(url, user, password);
			 		    PreparedStatement pStmt = conn.prepareStatement(mySQL)){
			 			
					pStmt.setString(1, D_ID.trim());
					pStmt.setString(2,Copy_ID.trim());
			 		pStmt.setString(3, M_ID.trim());
			 		pStmt.setLong(4, reserve_date);
			 		pStmt.setLong(5, return_date);
			 		pStmt.setInt(6, load_period);
			 		pStmt.setString(7, IsReturned.trim());
			 	    pStmt.executeUpdate();
		    }	
		 }
		
		
		 public void updateBorrows(String D_ID, String Copy_ID,  String M_ID, long reserve_date, long return_date,  int load_period,  String IsReturned ) throws SQLException {
		        String mySQL = "update borrow set reserve_date = ?, returm_date = ?,  loan_period = ?,  IsReturned  = ? "
		        		+ " where M_ID = ?, copy_ID = ? , D_ID = ?"; 
		        
			

				try {
					Class.forName("org.postgresql.Driver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try (Connection conn = DriverManager.getConnection(url, user, password);
			 		    PreparedStatement pStmt = conn.prepareStatement(mySQL)){
			 			
					
			 		pStmt.setLong(1, reserve_date);
			 		pStmt.setLong(2, return_date);
			 		pStmt.setInt(3, load_period);
			 		pStmt.setString(4, IsReturned.trim());
			 		pStmt.setString(5, D_ID.trim());
					pStmt.setString(6,Copy_ID.trim());
			 		pStmt.setString(7, M_ID.trim());
			 	    pStmt.executeUpdate();
		    }	
		 }
		
		 public void deleteBorrows(String Copy_ID,  String M_ID)  throws SQLException {
			 String mySQL = "delete from borrow whrer copy_ID = ?, M_ID = ?";
			 

				try {
					Class.forName("org.postgresql.Driver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try (Connection conn = DriverManager.getConnection(url, user, password);
			 		    PreparedStatement pStmt = conn.prepareStatement(mySQL)){
				pStmt.setString(1, Copy_ID.trim());
		 		pStmt.setString(2, M_ID.trim());
		 		pStmt.executeUpdate();
				}
			
				
				
		 }
		 
		
		
		
		
		
		
		
		
		
	}



