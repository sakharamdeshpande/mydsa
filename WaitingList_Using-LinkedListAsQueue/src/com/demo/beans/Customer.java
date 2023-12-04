package com.demo.beans;

public class Customer {
	
	private String customerName,customerPhone,customerEmail;
	private int customerId;
	
	public Customer(int customerId, String customerName, String customerEmail, String customerNumber) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerNumber;

	}

	public String getCustomerName() {
		return customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPhone=" + customerPhone + "]";
	}
	



	
	

}
