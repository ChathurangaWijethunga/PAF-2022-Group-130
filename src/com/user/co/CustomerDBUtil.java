package com.user.co;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.co.DBConnect;

public class CustomerDBUtil {

private static Connection con = null;
private static Statement stmt  = null;
private static ResultSet  rs =null;
	
	public static List<Customer> validate(String userName, String password){
	  
	ArrayList<Customer> cus = new ArrayList<>();
	
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from customer where Username='"+userName+"'and Password='"+password+"'";
	    rs = stmt.executeQuery(sql);
	    
		if(rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			int accountNumber = rs.getInt(4);
			String nic = rs.getString(5);
			String email = rs.getString(6);
			String type = rs.getString(7);
			String username = rs.getString(8);
			String passU = rs.getString(9);
			
			
			Customer c = new Customer(id,name,address,accountNumber,nic,email,type,username,passU);
			cus.add(c);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return cus;
		
	}
	
public static boolean insertcustomer(String name, String address, String accountnumber,String nic,String email,  String username, String passU, String password) {
    	
    	boolean isSuccess = false;
    	
    	 	
    	try {
    	
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into customer values (0,'"+name+"','"+address+"','"+accountnumber+"','"+nic+"','"+username+"','"+passU+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
  }
}