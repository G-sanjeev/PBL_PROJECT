package com.lumen.basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int number;
		int fact=1;
		System.out.println("enter the number:");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		if(number<0) {
			System.out.println("enter valid input");
			
		}
		else if(number==0 || number==1) {
			System.out.println("the factorial: 0");
		}
		else {
			for(int num=1;num<=number;num++) {
				fact*=num;
			}
			System.out.println("the factorial is"+fact);
		}
	}

}
