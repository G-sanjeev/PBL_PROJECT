package com.lumen.scan;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter the three numbers:");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();
		z= scanner.nextInt();
		//ternary
		int result = (x>y && x>z)?x: ((y>z)?+y:z);
		System.out.println("the greater number is :"+result);
	}

}
