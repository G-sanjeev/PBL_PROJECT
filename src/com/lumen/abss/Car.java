package com.lumen.abss;

public class Car extends Vehicle {

	public Car(String model, String brand, double price) {
		super(model, brand, price);
	}

	@Override
	void getMileage() {
		// TODO Auto-generated method stub
		System.out.println("the mileage of car is 35");
	}

	@Override
	void showType() {
		System.out.println("the type is car");
	}
	String[] showAccessories() {
		String [] showCarAcc = {"Films","seat cover","rear camera","dash camera"};
	
			return showCarAcc;}
}
