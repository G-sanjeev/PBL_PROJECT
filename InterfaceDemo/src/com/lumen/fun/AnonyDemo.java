package com.lumen.fun;

public class AnonyDemo {

	public static void main(String[] args) {
		Greeter greeter = new GreeterImpl();
		greeter.greetUser("Ramesh");
		
		// Anonymous - function implementation 
		// first user
		Greeter greetone = new Greeter() {

			@Override
			public void greetUser(String username) {
				System.out.println("have a good day greetone:"+username);
			}
			
		};
		//calling
		greetone.greetUser("Sanjeev");
		//second user
		
		Greeter greetsecond = new Greeter() {

			@Override
			public void greetUser(String username) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
	}

}
