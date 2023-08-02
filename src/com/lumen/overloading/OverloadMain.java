package com.lumen.overloading;
import java.util.Scanner;
public class OverloadMain {

	public static void main(String[] args) {
		String choice;
		String name;
		String designation;
		Scanner sc = new Scanner(System.in);
		choice = sc.next();
		switch (choice) {
		case "Programmer": {
			
			System.out.println("enter programmer the name and designation");
			Scanner scanner = new Scanner(System.in);
			name =scanner.nextLine();
			designation = scanner.nextLine();
			Employee  programmer= new Employee(name,designation);
			System.out.println(programmer.name);
			System.out.println(programmer.designation);
			System.out.println(programmer.calcBonus(20000));
			break;
		}
		case "Manager":{
			System.out.println("enter manager the name and designation");
			Scanner scanner1 = new Scanner(System.in);
			name =scanner1.nextLine();
			designation = scanner1.nextLine();
			Employee  manager= new Employee(name,designation);
			System.out.println(manager.name);
			System.out.println(manager.designation);
			System.out.println(manager.calcBonus(20000,20000));
			break;
		}
		case "Director":{
			System.out.println("enter director the name and designation");
			Scanner scanner2 = new Scanner(System.in);
			name =scanner2.nextLine();
			designation = scanner2.nextLine();
			Employee  director= new Employee(name,designation);
			System.out.println(director.name);
			System.out.println(director.designation);
			System.out.println(director.calcBonus(20000,20000,20000));
			break;
		}
		
		default:
			System.out.println("enter proper designation");
		}
		
	}

}
