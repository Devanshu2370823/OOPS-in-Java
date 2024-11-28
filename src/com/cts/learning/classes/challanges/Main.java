package com.cts.learning.classes.challanges;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankAccount bA = new bankAccount(123456789L, 1234L, "Devanshu", "devanshu@gmail.com",9876543210L);
//		bankAccount bA = new bankAccount();
//		bA.setAccountBalance(5000);
		long balance = bA.getAccountBalance();
		System.out.println("Account Balance: " + balance);
		
		bA.setAccountNumber(123456789123L);
		long AccountNumber = bA.getAccountNumber();
		System.out.println("The account number is: "+ AccountNumber);
		
		bA.setCustomerName("Devanshu Jha");
		String customerName = bA.getCustomerName();
		System.out.println("Customer Name: " + customerName);
		
		bA.setCustomerEmail("devanshujha8305@gmail.com");
		String customerEmail = bA.getCustomerEmail();
		System.out.println("Customer Email: " + customerEmail);
		
		bA.setPhoneNumber(8305392961L);
		long customerPhone = bA.getPhoneNumber();
		System.out.println("Customer Mobile Number: "+ customerPhone);
		
		bA.DepositeFunds(500);
		
		bA.WithDrawFunds(53000);
	}

}
