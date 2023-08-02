package com.lumen.abss;

public class Bike extends Vehicle{

	public Bike(String model, String brand, double price) {
		super(model, brand, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMileage() {
		System.out.println("the mileage is: 80km");
	}

	@Override
	void showType() {
		System.out.println("Nine Tale Bike ");
	}
	void engineType() {

	}

}
