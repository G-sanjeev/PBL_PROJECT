package com.lumen.training;

import java.util.Scanner;

public class ArrayScan {

	public static void main(String[] args) {
		int marks[]= new int[4];
		Scanner scanner = new Scanner(System.in);
		int sum =0;
		for(int mark= 0;mark<4;mark++) {
			System.out.println("enter the marks");
			marks[mark] = scanner.nextInt();
		}
		for(int mark=0;mark<4;mark++) {
			
			sum+=marks[mark];
		}
		System.out.println(sum);
		scanner.close();
	}

}
