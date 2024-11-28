package com.cts.learning.classes.challanges;

public class bankAccount {
	private long accountNumber;
	private long accountBalance;
	private String customerName;
	private String customerEmail;
	private long phoneNumber;
	
	public bankAccount() {
		this(12345L, 2345L, "Dev", "dev@gmail.com", 23456789L);
		System.out.println("Empty constructor is called.");
	}
	
	public bankAccount(long accountNumber, long accountBalance, String customerName, String customerEmail, long phoneNumber) {
		System.out.println("Account constructor with parameters field has been executed.");
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.phoneNumber = phoneNumber;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void DepositeFunds(long depositeAmount) {
		this.accountBalance += depositeAmount;
		System.out.println("Deposite of " + depositeAmount + " made a new balance of " + this.accountBalance);
	}
	public void WithDrawFunds(long WithDrawalAmount) {
		if((this.accountBalance - WithDrawalAmount) < 0) {
			System.out.println("Insufficient Funds! you have only " + this.accountBalance + " in your account");
		}else {
			this.accountBalance -= WithDrawalAmount;
			System.out.println("Withdrawal amount of " + WithDrawalAmount + " Remaining balance: " + this.accountBalance);
		}
	}
}
