package com.appname.excel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBBackDateMIFMUtil {
	
	public Boolean backDateMIFM(String type, String id, String date) throws Exception {
		Connection sconn = null;
		PreparedStatement spstmt = null;
		//ResultSet rs = null;
		String ssqlStr = null;
		int rs = 0;
		//int cntr = 0;
		//String result = "0";
		Boolean flag = false;
		try {
				try{
				sconn= DBUtil.getconnection("SIT");
				
				if (sconn!=null)
				{
					System.out.println("DB Connection is UP");
				}
				
				
				  if (type == "MI")
			                ssqlStr = "update MI_Table set FRS_PRD_END_DTE = ? where MON_INF_IDR = ?";
			      if (type == "FM")
			                ssqlStr = "update FM_Table set FRS_PRD_END_DTE = ? where FML_MON_IDR = ?";
			      
			     
				
				spstmt = sconn.prepareStatement(ssqlStr);
				spstmt.setString(1, date);
				spstmt.setString(2, id);
				 System.out.println("The query created is as " + ssqlStr);
				rs = spstmt.executeUpdate();

				}
			
			catch (Exception e){
				e.printStackTrace();
			}
				finally{
					
					try {
						if (rs == 0){
							System.out.println("Record Didn't Update for "+type+" with ID:"+id+" Please Check Query/Data Again");
						}
						else if (rs != 0) {
							flag = true;
							System.out.println(rs+" Number of Records updated for "+type);
							sconn.commit();
							System.out.println("Commited the Record Update");
							rs = 0;
							}
						if (spstmt != null) {
							spstmt.close();
							spstmt = null;
							System.out.println("Statement is Cleared . . ");
							}
						} catch (SQLException se) {
							se.printStackTrace();
					throw se;
							}
						}//Finally Ends here
				
				
		} catch (SQLException se) {
			se.printStackTrace();
			
			//throw new Exception();
			} 
		finally {
					if (rs == 0 && spstmt == null && sconn != null) {

						sconn.close();
						System.out.println("DB Connection Closed . . ");
								}
						}//Finally Ends here
		return flag;
	}

}
