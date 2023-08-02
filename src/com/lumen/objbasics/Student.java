package com.lumen.objbasics;

public class Student {
	String name;
	int departmentId;
	public Student(String name, int department) {
		super();
		this.name = name;
		this.departmentId = department;
	}
	void printDetails() {
		System.out.println("the student name:"+name);
		System.out.println("the department is :"+departmentId);
	}
	String getGrades(int...marks) {
		String res;
		int sum=0,avg=0;
		
		for(int grade: marks) {
			sum+=grade;}
		avg=sum/marks.length;
					if(avg<=100 && avg>=90) {
				res = "Grade A";
			}
			else if(avg<90 && avg>=80) {
				res= "Grade B";
			}
			else if (avg<80 && avg>=70) {
				res ="Grade C";
			}
			else if (avg<70 && avg>=60) {
				res ="Grade D";
			}
			else if (avg<60 && avg>=50) {
				res ="Grade E";
			}
			else {
				res = "Fail";
			}
			return ("res: "+res+", sum:"+sum+",avg: "+avg);
	}

}
