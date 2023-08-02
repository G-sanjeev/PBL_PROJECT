package com.lumen.fun;

public class GreeterImpl implements Greeter {

	@Override
	public void greetUser(String username) {
		System.out.println("great day:"+username);
	}

}
