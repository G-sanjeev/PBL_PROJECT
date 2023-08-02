package com.voterapp.main;

import java.util.Scanner;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.service.ElectionBoothImpl;

public class VoterMain {

	public static void main(String[] args) throws InValidVoterException {
		System.out.println("enter the details of the user");
		System.out.println("enter the age");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt()	;
		System.out.println("enter the locality ");
		String location = scanner.next();
		System.out.println("enter the voder Id number");
		int voterId = scanner.nextInt();
		
		
		ElectionBoothImpl election = new ElectionBoothImpl();
		try {
			if(election.checkEligibility(age, location,voterId))
				System.out.println("you are elegible to vote");
		} catch(InValidVoterException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
