package com.lumen.basics;

public class FibonnaciSeries {

	public static void main(String[] args) {
		int fibo=10;
		int a=0;
		int b =1;
		int c=0;
//		System.out.print(a+" "+b+" ");
		for(int i=0;i<fibo;i++) {
			System.out.print(a+" ");
			c = a+b;
			a = b;
			b = c;
		}
	}

}
