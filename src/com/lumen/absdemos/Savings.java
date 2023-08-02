package com.lumen.absdemos;

public class Savings extends Bank{

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		if(amount<=balance && amount!=0) {
			System.out.println("Savings money withdraw:"+amount);
			balance = balance - amount;
			System.out.println("the remained balance :"+balance);}
			else {
				System.out.println("Entered amount exceeded then actual balance");
			}
	}

	@Override
	void deposit(double amount) {
		if(amount>0)
		{System.out.println("Savings money deposit:"+amount);
		balance = balance+ amount;
		System.out.println("the remained balance"+balance);}
				else {
					System.out.println("deposit some money:");
				}
	}
	

}
