package com.lumen.inter;

public abstract class Employee implements IInsurance{
	String name;
	int empId;
	double salary;
	public Employee(String name, int empId, double salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	void printDetails() {
		System.out.println("name:"+name);
		System.out.println("name:"+empId);
		System.out.println("name:"+salary);
		
	}
	abstract String[] showCourses();
}
