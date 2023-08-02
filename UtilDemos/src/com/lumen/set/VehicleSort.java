package com.lumen.set;

import java.util.Comparator;

public class VehicleSort implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		return o1.getBrand().compareTo(o2.getBrand());
	}
	

//	public static void main(String[] args) {
//		List<Vehicle> vehicle = new Vehicle<>();
//		
//	}

}
