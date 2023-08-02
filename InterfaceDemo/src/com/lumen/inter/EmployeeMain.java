package com.lumen.inter;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee manager = new Manager("Ravi Kumar",108,20000);
		manager.printDetails();
		//manager 
//		Manager manager = (Manager)employee;
//		manager.vehicleInsurance();
//		manager.healthInsurance();
//		String []manshow=manager.showCourses();
//		for(String mang:manshow)
//			System.out.println("manager courses:"+mang);
//		manager.showTrips();
//		manager.calcBonus(2500);
		IInsurance insurance =manager;
		insurance.vehicleInsurance();
		insurance.healthInsurance();
		IEntertainment entertianment = (IEntertainment) manager;
		entertianment.showTrips();
		Manager mang=(Manager) manager;
		
		String []manshow=mang.showCourses();
		for(String man:manshow)
			System.out.println("manager courses:"+man);
		mang.showTrips();
		mang.calcBonus(2500);
		//developer
		Developer developer = new Developer("sanjeev",101,20000);
		developer.vehicleInsurance();
		developer.healthInsurance();
		developer.outdoor();
		developer.indoor();
		developer.showTrips();
	}

}
