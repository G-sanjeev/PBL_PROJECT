package com.lumen.abss;

public abstract class Vehicle {
	String model;
	String brand;
	double price;
	
	public Vehicle(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	void printDetails() {
		System.out.println("the model:"+model);
		System.out.println("the brand:"+brand);
		System.out.println("the price:"+price);
	}
	
	abstract void getMileage();
	abstract void showType();

}
