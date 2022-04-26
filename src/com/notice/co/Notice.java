package com.notice.co;

import java.util.ArrayList;

public class Notice {
	private int id;
	private String userID;
	private String userName;
	private String date;
	private String time;
	private String type;
	private String notice;
	
	public Notice(int id, String userID, String userName, String date, String time, String type, String notice) {
		this.id = id;
		this.userID = userID;
		this.userName = userName;
		this.date = date;
		this.time = time;
		this.type = type;
		this.notice = notice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	
	
	

}
