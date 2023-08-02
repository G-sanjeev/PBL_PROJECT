package com.lumen.basics;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int SecondSmallest[]= {10,34,56,21,78};
		Arrays.sort(SecondSmallest);
		System.out.println("the second smallest array:"+SecondSmallest[1]);
	}

}
