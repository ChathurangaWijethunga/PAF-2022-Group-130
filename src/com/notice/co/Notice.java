package com.notice.co;

public class Notice {
	private String userID;
	private String userName;
	private String date;
	private String time;
	private String type;
	
	public Notice(String userID, String userName, String date, String time, String type) {
		this.userID = userID;
		this.userName = userName;
		this.date = date;
		this.time = time;
		this.type = type;
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
	
	
	

}
