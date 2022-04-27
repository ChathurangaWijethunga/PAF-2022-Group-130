package com.billing.co;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BillingDBUtil {
	
	//for validate
	
	public static List<Billing> validate(String userid) {
		
		ArrayList<Billing> bil = new ArrayList<>();
		
	//create database connection	
		String url = "jdbc:mysql://localhost:3306/electro";
		String uname = "root";
		String pass = "root";
		
	//validate
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			Statement stmt = con.createStatement();
			String sql = "select * from billing where BillNumber='"+userid+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				String uid = rs.getString(1);
				String Bname = rs.getString(2);
				String Sdate =rs.getString(3);
				String Edate =rs.getString(4);
				int Anumber =rs.getInt(5);
				int Bnumber =rs.getInt(6);
				int Nounit =rs.getInt(7);
				float Biamount =rs.getFloat(8);
				
				Billing c = new Billing(uid,Bname,Sdate,Edate,Anumber,Bnumber,Nounit,Biamount);
				bil.add(c);
			}
		}
		
		catch (Exception e) {
    		e.printStackTrace();
		
		}
		
		
		return bil; 
		
	}

}
