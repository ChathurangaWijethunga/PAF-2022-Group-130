package com.payment.co;

public class PaymentCustomer {
	private String UserID;
	private String Name;
	private String Address;
	private int AccountNumber;
	private String NIC;
	private String Email;
	private String Phone;
	private String Type;
	private String Username;
	private String Password;
	
	public PaymentCustomer(String userID, String name, String address, int accountNumber, String nIC, String email, String phone,
			String type, String username, String password) {
		UserID = userID;
		Name = name;
		Address = address;
		AccountNumber = accountNumber;
		NIC = nIC;
		Email = email;
		Phone = phone;
		Type = type;
		Username = username;
		Password = password;
	}

	public String getUserID() {
		return UserID;
	}

	public String getName() {
		return Name;
	}

	public String getAddress() {
		return Address;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public String getNIC() {
		return NIC;
	}

	public String getEmail() {
		return Email;
	}
	
	public String getPhone() {
		return Phone;
	}

	public String getType() {
		return Type;
	}

	public String getUsername() {
		return Username;
	}

	public String getPassword() {
		return Password;
	}
	
}
