package com.lumen.basics;

import java.util.Arrays;

public class GreaterArray {

	public static void main(String[] args) {
		int  greaterArray[]= {10,30,60,35,26,25,78,98,67,98};
//		int greatest= greaterArray[0];
//		for(int great:greaterArray) {
//			if(greatest<great) {
//				greatest = great;
//			}
//			
//		}
//		System.out.println("the greatest number is :"+greatest);
//	}
	Arrays.sort(greaterArray);
	System.out.println("the smallest element in array is :"+greaterArray[greaterArray.length-1]);
	}
}
