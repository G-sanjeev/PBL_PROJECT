package com.lumen.basics;

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 496;
		int sum =0;
		for(int i=1;i<num;i++) {
			if(num%i == 0) {
				sum+=i;
				System.out.println(i);
			}
			}
		if(sum == num) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("not perfect number");
		}
		}

}
