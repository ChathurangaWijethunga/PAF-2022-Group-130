package com.payment.co;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.co.DBConnect;

public class CustomerPaymentDBUtil {
	public static List<PaymentCustomer> getCustomerDetails(String UserID) {
		
		ArrayList<PaymentCustomer> PayCus = new ArrayList<>();
		
		// userid validate
		try {
			//db connection
			Connection con = DBConnect.getConnection();
			
			Statement stmt = con.createStatement();
			String sql = "select * from customer where UserID='"+UserID+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				int accNumber = rs.getInt(4);
				String nic = rs.getString(5);
				String email = rs.getString(6);
				String phone = rs.getString(7);
				String type = rs.getString(8);
				String uname = rs.getString(9);
				String pass = rs.getString(10);
				
				PaymentCustomer pc = new PaymentCustomer(uid, name, address, accNumber, nic, email, phone, type, uname, pass);
				PayCus.add(pc);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return PayCus;
		
	}
	
public static List<CustomerBill> getCustomerBillDetails(String UserID) {
		
		ArrayList<CustomerBill> CusBill = new ArrayList<>();
		
		// userid validate
		try {
			//db connection
			Connection con = DBConnect.getConnection();
			
			Statement stmt = con.createStatement();
			String sql = "select * from billing where UserID='"+UserID+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String sDate = rs.getString(3);
				String eDate = rs.getString(4);
				int accNumber = rs.getInt(5);
				int bNumber = rs.getInt(6);
				int units = rs.getInt(7);
				double totalP = rs.getDouble(8);
				
				CustomerBill pb = new CustomerBill(uid, name, sDate, eDate, accNumber, bNumber, units, totalP);
				CusBill.add(pb);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return CusBill;
		
	}
}
