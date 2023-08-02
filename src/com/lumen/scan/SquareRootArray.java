package com.lumen.scan;

import java.util.Scanner;

public class SquareRootArray {

	public static void main(String[] args) {
		int [] arr =new int[5];
		System.out.println("enter the elements of array");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		int [] newarr = new int[5];
		for(int i=0;i<arr.length;i++) {
			
			newarr[i]= (int) Math.pow(arr[i], 2);
		}
		for(int j:newarr)
			System.out.print(j+" ");
		}

}
