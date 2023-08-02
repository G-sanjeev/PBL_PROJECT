package com.lumen.inter;

public class Developer extends Employee implements IEntertainment,IGamer{

	public Developer(String name, int empId, double salary) {
		super(name, empId, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vehicleInsurance() {
System.out.println("developer vechicel insurance");		
	}

	@Override
	public void healthInsurance() {
System.out.println("developer health insurance");		
	}

	@Override
	public void outdoor() {
System.out.println("developer outdoor game");		
	}

	@Override
	public void indoor() {
System.out.println("developer indoor game");		
	}

	@Override
	public void showTrips() {
System.out.println("developer need trips");		
	}

	@Override
	String[] showCourses() {
String []showcourse = {"Java","Html","js","Mysql"};
		return showcourse;
	}
	void showProjects() {
		System.out.println("My project ");
	}

}
