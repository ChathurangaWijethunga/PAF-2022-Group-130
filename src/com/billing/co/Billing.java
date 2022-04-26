package com.billing.co;

public class Billing {

private String UserID;	 
private String Name;	
private String StartDate;
private String  EndDate;	
private int AccountNumber;	
private int BillNumber;	
private int NoofUnit;	
private float BillAmount;

public Billing(String userID, String name, String startDate, String endDate, int accountNumber, int billNumber,
		int noofUnit, float billAmount) {
	
	this.UserID = userID;
	this.Name = name;
	this.StartDate = startDate;
	this.EndDate = endDate;
	this.AccountNumber = accountNumber;
	this.BillNumber = billNumber;
	this.NoofUnit = noofUnit;
	this.BillAmount = billAmount;
}

public String getUserID() {
	return UserID;
}

public String getName() {
	return Name;
}

public String getStartDate() {
	return StartDate;
}

public String getEndDate() {
	return EndDate;
}

public int getAccountNumber() {
	return AccountNumber;
}

public int getBillNumber() {
	return BillNumber;
}

public int getNoofUnit() {
	return NoofUnit;
}

public float getBillAmount() {
	return BillAmount;
}

public void setUserID(String userID) {
	UserID = userID;
}

public void setName(String name) {
	Name = name;
}

public void setStartDate(String startDate) {
	StartDate = startDate;
}

public void setEndDate(String endDate) {
	EndDate = endDate;
}

public void setAccountNumber(int accountNumber) {
	AccountNumber = accountNumber;
}

public void setBillNumber(int billNumber) {
	BillNumber = billNumber;
}

public void setNoofUnit(int noofUnit) {
	NoofUnit = noofUnit;
}

public void setBillAmount(float billAmount) {
	BillAmount = billAmount;
}




}
