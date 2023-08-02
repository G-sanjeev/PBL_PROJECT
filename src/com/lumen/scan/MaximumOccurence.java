package com.lumen.scan;

import java.util.Scanner;

public class MaximumOccurence {

	public static void main(String[] args) {
		String sentence;
		System.out.println("enter the sentence");
		Scanner scanner = new Scanner(System.in);
		sentence = scanner.nextLine();
		String words[] = sentence.split(" ");
		String [] resWord;
		String reword;
		int count=1;
		for(int i=0;i<=words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])&& words[i]!="-1") {
					words[j]="-1";
					count++;
				}
			}
			if(count>1 && words[i]!="-1") {
				System.out.println(words[i]+" "+count);
				words[i]="-1";
				
			}
			count =1;
		}
		
	}

}
