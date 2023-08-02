package com.lumen.training;

public class OneDim {

	public static void main(String[] args) {
		int[] marks = new int[3];
//		System.out.println(marks.length);
//		System.out.println(marks[0]);

		marks[0] = 100;
		marks[1] = 200;
		marks[2] = 300;
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			sum += marks[i];

		}
//		System.out.println(sum);
		int sum1 = 0;
		for (int mark : marks)
			sum1 += mark;
		System.out.println("sum1:" + sum1);

	}

}
