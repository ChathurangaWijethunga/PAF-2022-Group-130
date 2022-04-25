package com.user.co;

import java.util.List;

public class Customer {

	   private String id;
	   private String name;
	   private String address;
	   private String accountnumber;
	   private String NIC;
	   private String type;
	   private String username;
	   private String password;
	
	   public Customer(String id, String name, String address, String accountnumber, String nIC, String type,
			String username, String password) {
		   	   
		this.id = id;
		this.name = name;
		this.address = address;
		this.accountnumber = accountnumber;
		NIC = nIC;
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

	public String getAccountnumber() {
		return accountnumber;
	}

	public String getNIC() {
		return NIC;
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
