package com.lumen.assignments;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String usernames[] = {"Ram","Sri","Sanjay","Reddy"};
		System.out.println("enter the name:");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		boolean flag = false;
		for(String name:usernames) {
			if(userName.equals(userName)) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("Login succesfully");
		}
		else {
			System.out.println("invalid login");
		}
		scanner.close();
		
	}
	

}
