package com.lumen.objbasics;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student("Raghu",1001);
		student1.printDetails();
		int [] marks = {90,56,78,95};
		System.out.println(student1.getGrades(marks));
		Student student2 = new Student("Sanjeev",1005);
		student2.printDetails();
		int [] marks1 = {90,95,88,95};
		System.out.println(student1.getGrades(marks1));
	}

}
