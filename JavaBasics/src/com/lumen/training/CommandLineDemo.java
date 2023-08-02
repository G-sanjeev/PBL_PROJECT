package com.lumen.training;

public class CommandLineDemo {

	public static void main(String[] args) {
		String name = args[0];
		System.out.println(name);
		int studentId = Integer.parseInt(args[1]);
		System.out.println(studentId);
		String dept = args[2];
		System.out.println(dept);
	}

}
