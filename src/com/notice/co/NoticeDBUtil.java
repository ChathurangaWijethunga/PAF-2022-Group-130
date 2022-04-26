package com.notice.co;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.co.DBConnect;

public class NoticeDBUtil {

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static void main(String[] args) {
		

	}

	public static boolean insertNotice (String id, String userid, String name, String date, String time, String type, String notice) {
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "Insert into notices values (0,'"+userid+"','"+name+"','"+date+"','"+time+"','"+type+"','"+notice+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean updateNotice(String id, String userid, String name, String date, String time, String type, String notice) {
		boolean isSuccess = false;
		
	try
	{
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "update notices set User ID='"+userid+"', userName='"+name+"',Date='"+date+"',Time='"+time+"',Type='"+type+"', Notice='"+notice+"'"
				+ "where id='"+id+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		return isSuccess;
	}
	
	public static List<Notice> getNoiceDetails(String id) {
		
		int convertedID = Integer.parseInt(id);
		
		ArrayList<Notice> notices = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from notices where ID='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id1 = rs.getInt(1);
				String userID = rs.getString(2);
				String userName = rs.getString(3);
				String date = rs.getString(4);
				String time = rs.getString(5);
				String type = rs.getString(6);
				String notice = rs.getString(7);
				
				Notice n = new Notice(id1, userID, userName, date, time, type, notice);
				notices.add(n);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return notices;
	}
}
