package com.lumen.inter;

public	 class Manager extends Employee implements IEntertainment {

	public Manager(String name, int empId, double salary) {
		super(name, empId, salary);
	}

	@Override
	public void vehicleInsurance() {
		System.out.println(" vehicle insurance");
	}

	@Override
	public void healthInsurance() {
		System.out.println("health insurance");
	}

	@Override
	String[] showCourses() {
		String[] showcourses = { "Business Need", "Market strategy", "Team management" };
		return showcourses;
	}

	@Override
	public void showTrips() {
		System.out.println("Manager need trip");
	}

	void calcBonus(int amount) {
		System.out.println("I am your manager" + (salary + amount));
	}

}
