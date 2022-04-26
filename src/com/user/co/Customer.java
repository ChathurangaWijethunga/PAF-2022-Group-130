package com.user.co;

import java.util.List;

public class Customer {

	   private String id;
	   private String name;
	   private String address;
	   private int    accountnumber;
	   private String NIC;
	   private String email;
	   private String type;
	   private String username;
	   private String password;
	
	   public Customer(String id, String name, String address, int accountNumber2, String nIC,String email, String type,
			String username, String password) {
		   	   
		this.id = id;
		this.name = name;
		this.address = address;
		this.accountnumber = accountNumber2;
		NIC = nIC;
		this.email = email;
		this.type = type;
		this.username = username;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public String getNIC() {
		return NIC;
	}
	public String getemail() {
		return email;
	}
	public String getType() {
		return type;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

		   
}
