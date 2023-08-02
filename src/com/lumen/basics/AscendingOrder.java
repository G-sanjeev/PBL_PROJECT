package com.lumen.basics;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] arr= {10,44,23,53,85};
		Arrays.sort(arr);
		int temp,n=arr.length;
		//desending
//		for(int i=0;i<n/2;i++) {
//			temp=arr[i];
//			arr[i]=arr[n-i-1];
//			arr[n-i-1]=temp;
//		}
		for(int each:arr)
			System.out.print(each+" ");
	}

}
