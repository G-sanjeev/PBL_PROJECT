package com.lumen.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("R2Z","farari",100000000);
		Vehicle vehicle2 = new Vehicle("R3Z","Bmw",200000000);
		Vehicle vehicle3 = new Vehicle("R4Z","Audi",700000000);
		Vehicle vehicle4 = new Vehicle("R5Z","Tata",100000);
		
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(vehicle1);
		vehicles.add(vehicle2);
		vehicles.add(vehicle3);
		vehicles.add(vehicle4);
		
//		for(Vehicle vehiclecall:vehicles)
//			System.out.println(vehiclecall);
		
		System.out.println("list of vehciles");
//		Comparable<Vehicle> comparator = new BrandSort();
		Collections.sort(vehicles,new BrandSort());
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		Collections.sort(vehicles,new ModelSort());
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		Collections.sort(vehicles,new PriceSort());
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		System.out.println();
		
		
			
			
			
	}

}
