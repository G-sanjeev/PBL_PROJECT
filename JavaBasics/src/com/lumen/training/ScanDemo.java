package com.lumen.training;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter details:");
		System.out.println("Enter Name:");
		String name = scanner.nextLine();
		System.out.println("Name "+name);
		System.out.println("Enter id:");
		int id = scanner.nextInt();
		System.out.println("Id"+id);
		scanner.nextLine();
		System.out.println("Enter city:");

		String city = scanner.nextLine();
		System.out.println("city"+city);
		System.out.println("Enter salary:");

		double salary = scanner.nextDouble();
		System.out.println("Salary"+salary);
		scanner.close();
	}

}
