package com.lumen.training;

public class Switchdemo {

	public static void main(String[] args) {
//		int x = 10;
//		int y = 20;

		String choice = "Saturday";

		switch (choice) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "friday": {
			System.out.println("Weekday");
			break;
		}
		case "Saturday":
		{
			System.out.println("Weekend");
			break;
		}
		case "Sunday": {
			System.out.println("Restday");
			break;
		}
		default: {
			System.out.println("Enter the valid day");
		}
		}
		

	}
}
