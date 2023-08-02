package com.lumen.inherdemos;

public class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	void withdraw(double amount) {
		System.out.println("account withdraw");
		
	}
	void deposit(double amount) {
		System.out.println("account deposit");
	}
	double getBalance() {
		return balance;
	}
}
