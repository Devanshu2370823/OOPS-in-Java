package com.cts.learning.challenge.constructors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer cu = new customer("Devanshu", 1000, "dev@gmail.com");
		System.out.println(cu.getName());
		System.out.println(cu.getCreditLimit());
		System.out.println(cu.getEmailAddress());
		
		customer se = new customer();
		System.out.println(se.getName());
		System.out.println(se.getCreditLimit());
		System.out.println(se.getEmailAddress());
	}

}
