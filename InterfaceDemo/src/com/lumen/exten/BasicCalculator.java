package com.lumen.exten;

public class BasicCalculator implements Calculator {

	@Override
	public void add(int x, int y) {
System.out.println("addition of x and y "+(x+y));		
	}

	@Override
	public void product(int x, int y) {
System.out.println("multiplication:"+(x*y));		
	}

}
