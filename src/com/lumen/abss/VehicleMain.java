package com.lumen.abss;

public class VehicleMain {

	public static void main(String[] args) {
		Bike bike =new Bike("Apache","Tvs",90000);
		bike.getMileage();
		bike.showType();
		bike.engineType();
		bike.printDetails();
		
		Car car = new Car("Mustang","Ford",7000000);
		car.getMileage();
		car.showType();
		
		String[]accs = car.showAccessories();
		for(String acc:accs)
			System.out.println(acc);
		
	}

}
