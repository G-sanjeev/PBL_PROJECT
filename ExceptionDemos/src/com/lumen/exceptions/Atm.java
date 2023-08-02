package com.lumen.exceptions;

public class Atm {

	public static void main(String[] args) {
		Bank bank = new Bank(2000);
		try {
			bank.withDraw(1500);
			System.out.println("amount withdrawn");
		}
		catch(Exception e) {
			System.out.println("try again");
			System.out.println(e.getMessage());
		}
	}

}
