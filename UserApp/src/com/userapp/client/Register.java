package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.ValidateService;

public class Register {
	public static void main(String [] args) {
		System.out.println("enter the username");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();
		ValidateService validateservice = new ValidateService()	;
		try {
			validateservice.validateUsername(username);
			System.out.println("Welcome "+username);
		} catch (NameExistsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			String password = scanner.next();
			try{
				validateservice.validetePassword(password);
			System.out.println("Welcome "+username);
			}catch(TooShortException|TooLongException e1) {
				System.out.println(e1.getMessage());
			}
		}
	}    				

}
