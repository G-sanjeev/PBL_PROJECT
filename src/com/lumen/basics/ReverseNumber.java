package com.lumen.basics;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 123;
		int rev = 0,sum=0;
		while(num!=0) {
			rev = num%10;
			sum = sum*10+rev;
			num = num/10;
		}
		System.out.println(sum);
		
	}

}
