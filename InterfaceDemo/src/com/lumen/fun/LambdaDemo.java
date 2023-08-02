package com.lumen.fun;

public class LambdaDemo {

	public static void main(String[] args) {
		// Anonymous function implementation
		Greeter greeter =(String username)->{
			System.out.println("hello"+username);
		};
		//calling anonymous function
		greeter.greetUser("Ramana");
		// Lambda expression: functional way 
		Greeter greeter1= username -> System.out.println("welcome"+username);
		greeter1.greetUser("Sanjeev");
	}

}
