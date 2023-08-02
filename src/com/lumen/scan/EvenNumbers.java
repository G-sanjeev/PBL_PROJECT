package com.lumen.scan;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		int num;
		System.out.println("enter the number");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
