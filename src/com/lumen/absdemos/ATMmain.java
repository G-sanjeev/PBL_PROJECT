package com.lumen.absdemos;

import java.util.Scanner;

public class ATMmain {

	public static void main(String[] args) {
		System.out.println("enter the account type:");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		if (choice == "Savings") {
			System.out.println("enter to deposit or withdraw:");
			String choice1 = scanner.next();
			Bank savings = new Savings(1000);
			switch (choice1) {
			case "withdraw": {
				int money = scanner.nextInt();
				savings.withdraw(money);
				break;
			}
			case "deposit": {
				int money = scanner.nextInt();
				savings.deposit(money);
				break;
			}

			default:
				System.out.println("enter valid choice");
				break;
			}
		} else{
			System.out.println("enter to deposit or withdraw:");
			String choice1 = scanner.next();
			Bank current= new Current(10000);
			switch (choice1) {
			case "withdraw": {
				int money = scanner.nextInt();
				current.withdraw(money);
				break;
			}
			case "deposit": {
				int money = scanner.nextInt();
				current.deposit(money);
				break;
			}
			default:
				System.out.println("enter valid choice");
				break;
			}

		}
	

	}

}
