package com.cts.learning.challenge.constructors;

public class customer {
	private String name;
	private long creditLimit;
	private String emailAddress;
	public String getName() {
		return name;
	}
	public long getCreditLimit() {
		return creditLimit;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public customer(String name, long creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	
	public customer(String name, String emailAddress) {
		this(name, 1000, emailAddress);
	}
	
	public customer() {
		this("Nobody", "nobody@email.com");
	}
}
