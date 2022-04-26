package com.payment.co;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.co.DBConnect;

public class CustomerPaymentDBUtil {
	// retrieve customer details
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
	// retrieve bill details
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
	
	// retrieve last payment id for id generation 
	public static int getLastPaymentID() {
	
		String pidcount = "0";
		int pid = 0;
		String pidS = "0";
	
		// userid validate
		try {
			//db connection
			Connection con = DBConnect.getConnection();
			// get count of rows in payment table
			Statement stmt = con.createStatement();
			String sql = "select count(*) from payment";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				pidcount = rs.getString(1);
			}
			
			// get payment id
			String sql1 = "select PaymentID from payment where id='"+pidcount+"'";
			ResultSet rs1 = stmt.executeQuery(sql1);
			
			if(rs1.next()) {
				pidS = rs1.getString(1);
			}
			
			// convert string to int
			pid = Integer.parseInt(pidS.substring(1));
			
			} catch(Exception e) {
				e.printStackTrace();
			}
	
		return pid;
	
	}
	
	// insert payment details
	public static boolean insertPaymentDetails(int id, String payid, String userid, String name, int accountnum, String billAddress, String email, String phone, float totalpayable, float paidcash,
			float balance, String paidstatus, String billexpire) {
		
		boolean isSuccess = false;
		
		try {
			
			//db connection
			Connection con = DBConnect.getConnection();
			// get count of rows in payment table
			Statement stmt = con.createStatement();
			String sql = "insert into payment values('"+id+"','"+payid+"','"+userid+"','"+name+"','"+accountnum+"','"+billAddress+"','"+email+"','"+phone+"','"+totalpayable+"','"+paidcash+"','"+balance+"',"
					+ "'"+paidstatus+"','"+billexpire+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			
		}
		
		return isSuccess;
		
	}

}






















