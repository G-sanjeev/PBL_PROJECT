package com.lumen.assignments;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String username[]= {"Sanjay","Ravi","Ram","Suresh","Rahul"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter name");
		String userName=scanner.next();
		boolean flag = false;
		for(String name: username) {
			if( userName ==name) {
				flag = true;
				break;
			}
			
			}
		if(flag) {
			System.out.println("Name is not unique");
		}
		else {
			
			System.out.println("you are registered");
		}
		scanner.close();
	}

}
