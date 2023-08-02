package com.lumen.scan;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String [] usernames = {"Ram","Rajesh","Raju","Sanjay","Suresh"};
		System.out.println("enter the names of usernames:");
		Scanner sc = new Scanner(System.in);
		String regname = sc.next();
		for(int i =0;i<usernames.length;i++) {
			if(regname == usernames[i]) {
				System.out.println("the Name is not unique");
				break;
			}
			else {
				System.out.println("You are registered");
				break;
				
			}
		}
				
	}

}
