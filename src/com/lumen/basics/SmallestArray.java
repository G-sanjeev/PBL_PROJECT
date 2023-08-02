package com.lumen.basics;

import java.util.Arrays;

public class SmallestArray {

	public static void main(String[] args) {
		int smallerArray[] = {10,30,20,45,67,2,49};
//		int smallest = smallerArray[0];
//		for(int small:smallerArray) {
//			if(smallest>small) {
//				smallest = small;
//			}
//		}
//		System.out.println("the smallest element in array:"+smallest);
//		
		Arrays.sort(smallerArray);
		System.out.println("the smallest element in array is :"+smallerArray[0]);
	}

}
