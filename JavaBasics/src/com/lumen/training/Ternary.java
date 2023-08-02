package com.lumen.training;

public class Ternary {

	public static void main(String[] args) {
		int x = 101;
		int y= 200;
		int z = 200;
		String result = (x>y && x>z)?"x is greater": ((y>z)? "y is greater":"z is greater");
		
//		String result = x>100?"Hello":"welcome";
		System.out.println(result);
	}

}
