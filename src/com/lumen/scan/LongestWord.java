package com.lumen.scan;

import java.util.Arrays;
import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		String str;		
		System.out.println("enter the sentence:");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		String longword="";
		String[] word = str.split(" ");
		for(int i=0;i<word.length;i++) {
				if(word[i].length()>=longword.length())
					longword = word[i];
			}
		System.out.println("the longest word is :"+longword);
		}
	

}
