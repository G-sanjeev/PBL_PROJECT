package com.lumen.quest2;

public class BasicMain {

	public static void main(String[] args) {
		BasicCalculator basiccalculator = new Basic();
		basiccalculator.add(10, 20);
		basiccalculator.difference(20, 10);
		basiccalculator.product(2, 4);
		basiccalculator.divide(100,20);
		
		ScientificCalculator scientificCalculator = new Scientific();
		scientificCalculator.square(3);
		scientificCalculator.cube(4);
		
	}

}
