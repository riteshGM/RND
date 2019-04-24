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
		/* connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system",
					"password");*/
		  
		 // jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(LOAD_BALANCE=OFF)(ADDRESS=(PROTOCOL=TCP)(HOST=cod-dev.barclays.intranet)(PORT=3521))(FAILOVER=off))(CONNECT_DATA=(SERVICE_NAME=dktsfgs2.barclays.co.uk)))""
		
		  
		  if (DBName == "ZeusAutomation") {
		  connection = DriverManager.getConnection(
			"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(LOAD_BALANCE=OFF)(ADDRESS=(PROTOCOL=TCP)(HOST=cod-dev.barclays.intranet)(PORT=3521))(FAILOVER=off))(CONNECT_DATA=(SERVICE_NAME=dktsfgd.barclays.co.uk)))", "bfg_user_dev",
			"bfg_user#99");
		  }
		  if (DBName == "SIT"){
			  connection = DriverManager.getConnection(
						"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(LOAD_BALANCE=OFF)(ADDRESS=(PROTOCOL=TCP)(HOST=yi6t.wload.barclays.co.uk)(PORT=4521))(FAILOVER=off))(CONNECT_DATA=(SERVICE_NAME=TPZEUSST.wload.barclays.co.uk)))", "Zeus_User",
						"zeus99");
		  }
		  
		  
		  
		  /*	connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(LOAD_BALANCE=OFF)(ADDRESS=(PROTOCOL=TCP)(HOST=cod-dev.barclays.intranet)(PORT=3521))(FAILOVER=off))(CONNECT_DATA=(SERVICE_NAME=dktsfgs2.barclays.co.uk)))", "bfg_user_sit2",
				"bfg_sit2");*/
// "cod-dev.barclays.intranet:3521:dktsfgd.barclays.co.uk"
	     
	     
	     
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

