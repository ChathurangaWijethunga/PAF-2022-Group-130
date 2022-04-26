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
		UserID = userID;
		Name = name;
		StartDate = startDate;
		EndDate = endDate;
		AccountNumber = accountNumber;
		BillNumber = billNumber;
		NoofUnit = noofUnit;
		BillAmount = billAmount;
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
