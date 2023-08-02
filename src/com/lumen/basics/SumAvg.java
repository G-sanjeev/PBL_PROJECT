package com.lumen.basics;

public class SumAvg {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,50};
		int sum=0;
		int avg=0;
		for(int arr:array) {
			sum+=arr;
		}
		avg = sum/array.length;
		System.out.println("the sum value:"+sum);
		System.out.println("the average:"+avg);
	}

}
