package com.lumen.exten;

public class CalculatroMain {

	public static void main(String[] args) {
		Calculator calculator = new BasicCalculator();
		calculator.add(10, 20);
		calculator.product(10, 20);
		Scientific scientific = new ScientificCalculator();
		scientific.square(2);
		scientific.cube(2);
		scientific.add(100, 200);
		scientific.product(2, 4);
		scientific.difference(20, 10);
		
	}

}
