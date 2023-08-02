package com.lumen.training;

public class TwoDim {

	public static void main(String[] args) {
		int marks[][] = new int[3][2];
		marks[0][0] = 100;
		marks[0][1] = 200;
		marks[1][0] = 300;
		marks[1][1] = 400;
		marks[2][0] = 500;
		marks[2][1] = 600;
		
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<2;j++) {
//				System.out.println(marks[i][j]);
//			}
//		}
		int sum =0;
		for (int one[]:marks)
			for(int num:one) {
				sum+=num;
				System.out.println(num);}
		System.out.println(sum);

	}

}
