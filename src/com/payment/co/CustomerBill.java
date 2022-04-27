package com.payment.co;

public class CustomerBill {
	
	private String UserID;
	private String Name;
	private String StartDate;
	private String EndDate;
	private int AccountNumber;
	private int BillNumber;
	private int NoofUnit;
	private double BillAmount;
	
	public CustomerBill(String userID, String name, String startDate, String endDate, int accountNumber, int billNumber,
			int noofUnit, double billAmount) {
		super();
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

	public double getBillAmount() {
		return BillAmount;
	}

}
