package com.lumen.training;

public class Demo {

	public static void main(String[] args) {
//		System.out.println("Hello\t");
//		int x = 90;
//		int y = 90;
//		System.out.println("Sum "+(x+y)+"\n");
//		System.out.println("\' welcome to java\'");
//		
//		float num = 32.5f;
//		
//		byte a = 10;
//		int b = a*2;
//		
//		long num1 = a+b;
//		
//		System.out.println(num1);
//		
//		int num2 = (int)num1;
//		float amount = num2*num2;
//		double result = amount+10.8;
//		
//		float data = (float) result;
//		int c =(int) data;
//		System.out.println(c);
		
		int x =10;
		long y=x; //upcasting 
		Long a =y; // autoboxing
		
		int b =(int) y; //downcasiting
		
		// conver to object
		Object o = a; // this is of type long
		
		//trying to downcast will through classcast excepteion 
		Integer i = (Integer ) o;//exception

	}

}
