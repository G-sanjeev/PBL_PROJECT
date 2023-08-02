package com.lumen.absdemos;

public class Current extends Bank {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		if (amount <= balance && amount != 0) {
			System.out.println("curent money withdrawn:" + amount);
			balance = balance - amount;
			System.out.println("the remained balance :" + balance);
		} else {
			System.out.println("Entered amount exceeded then actual balance");
		}
	}

	@Override
	void deposit(double amount) {
		if (amount > 0) {
			System.out.println("current money deposited:" + amount);
			balance = balance + amount;
			System.out.println("the remained balance" + balance);
		} else {
			System.out.println("deposit some money:");
		}
	}

}
