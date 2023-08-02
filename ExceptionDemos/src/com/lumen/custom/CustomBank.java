package com.lumen.custom;

public class CustomBank {
	double balance;

	public CustomBank(double balance) {
		super();
		this.balance = balance;
	}

	void withDraw(double amount) throws ExceedingLimitException,NegativeBalanceException{
		System.out.println("in withdraw method");
		if(balance-amount<=0) {
			throw new NegativeBalanceException("balance is negative");
		}
		// amount >1000 exceeding limit exception 
		if(amount>1000) {
			throw new ExceedingLimitException("Limit exceeded");
		}
		
		balance = balance-amount;
		System.out.println("Balance"+balance);
	}
}
