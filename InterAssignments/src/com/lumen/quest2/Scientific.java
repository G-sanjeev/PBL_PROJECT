package com.lumen.quest2;

public class Scientific extends Basic implements ScientificCalculator {

	@Override
	public void square(int x) {
System.out.println("square:"+(x*x));		
	}

	@Override
	public void cube(int x) {
System.out.println("cube"+(x*x*x));		
	}

}
