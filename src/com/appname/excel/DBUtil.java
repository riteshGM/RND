package com.appname.excel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	
	
	public static  Connection getconnection(String DBName){
		Connection connection = null;
		// ResultSet rs = null;
		 
	  try
	     {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  
		  if (DBName == "Automation") {
		  connection = DriverManager.getConnection(
			"jdbc:oracle:", "user",
			"pass");
		  }	     
	     
	     
	     } catch( SQLException se )
	     {
	      System.out.println( "SQL Exception:" +se) ;

	     } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	  return connection;
	}
	
	
	public static void closeConnection(Connection con){
		
		try{
			if(con != null){
			con.close();
			}	
		}catch(SQLException e ){
			
		}
		
	}
	
	public static void closeStatement(PreparedStatement stmt){
		
		try{
			if(stmt != null){
			stmt.close();
			}	
		}catch(SQLException e ){
			
		}
		
		
	}
	
	
	public static void closeResultset(ResultSet rs){
		try{
			if(rs != null){
			rs.close();
			}	
		}catch(SQLException e ){
			
		}
		
	}
	
	}

