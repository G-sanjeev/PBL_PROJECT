package com.lumen.scan;

import java.util.Scanner;

public class OneDimensionalArray {

	public static void main(String[] args) {
		int [] arr =new int[5];
		System.out.println("enter the elements of array");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		int sum =0,avg=0;
		for(int i:arr) {
			sum+=i;
			avg= sum/arr.length;
			System.out.print(i+" "+"\n");}
		System.out.println("the sum is :"+sum);
		System.out.println("the avg is :"+avg);
		
		
	}

}
