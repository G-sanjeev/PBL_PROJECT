package com.userapp.service;

import java.util.Scanner;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidateService implements IValidationService {

	@Override
	public boolean validetePassword(String password) throws TooShortException, TooLongException {
		if(password.length()<6) {
			throw new TooShortException("Password is Too Short");
		}
		else if (password.length()>15) {
			throw new TooLongException("Password is Too Long");
		}
		else {
			return true;
		}
	}

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		String []usernames = {"Ram","Sham","Mohan"};
		for(String name:usernames) {
			if(name.equals(username)) {
				return true;
			}
		}
		 throw new  NameExistsException("Name not exists");
	}

	

}
