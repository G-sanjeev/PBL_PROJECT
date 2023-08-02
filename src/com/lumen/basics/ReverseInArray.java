package com.lumen.basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseInArray {
	public static void main(String[] args) {
	int []arr={10,20,30,40,50};
	int temp;
	int n = arr.length;
	for(int i=0;i<n/2;i++) {
		temp=arr[i];
		arr[i]=arr[n-i-1];
		arr[n-i-1] = temp;
		
	}
	for(int each:arr)
		System.out.print(each+" ");
	}
}
