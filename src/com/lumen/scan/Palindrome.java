package com.lumen.scan;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String word;
		System.out.println("enter the string");
		Scanner scanner = new Scanner(System.in);
		word = scanner.nextLine();
		char ch[] = word.toCharArray();
		String rev="";
		for(int i =ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		if(word.equals(rev)) {
			System.out.println("palindrom");
			
		}
		else {
			System.out.println("not palindrom");
		}
	}

}
