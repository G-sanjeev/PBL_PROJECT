package com.lumen.exceptions;

public class Bank {
	double balance;
	
	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	void withDraw(double amount){
		try {
			System.out.println("in bank");		
		if(amount>1000) 
			throw new ArithmeticException("Exceeding limit");
		balance-=amount;
		System.out.println("Balance"+balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("close");
		}
		System.out.println("completed");}}
