package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth{
	String [] localities = {"Hyderabad","Patancheru","medak"};

	@Override
	public boolean checkEligibility(int age, String locality, int voterId) throws InValidVoterException {
		try {
			if(checkAge(age) && checkLocality(locality) && checkVoterId(voterId)) {
				return true;
						}
		} catch (UnderAgeException e) {
		System.out.println(e.getMessage());
		}
		catch (LocalityNotFoundException e1) {
			System.out.println(e1.getMessage());
		}catch(NoVoterIDException e2) {
			System.out.println(e2.getMessage());
			
		}
		return false;
	}
	//create all the methods 
	private boolean checkAge(int age)throws UnderAgeException {
		if(age<=18) {
			throw new UnderAgeException("under age");
		}
		return true;
	}
	private boolean checkLocality(String Locality) throws LocalityNotFoundException{
		boolean check = true;
		for(String locality:localities) {
			if(locality.equals(Locality)) {
				check = false;
				
			}
		}
		if(check) {
			throw new LocalityNotFoundException("Locality not found");
		}
		return true;
		
	}
	private boolean checkVoterId(int Validity)throws NoVoterIDException {
		if(Validity<1000 || Validity>9999) {
			throw new NoVoterIDException("Voter Id does not exists");
		}
		return true;
	}
	
}
