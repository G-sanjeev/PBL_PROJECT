package com.lumen.def;

public class AnonDemo {

	public static void main(String[] args) {
		// implementation of the anonymous class of Bonuscalculator
		BonusCalculator bonuscalculator = new BonusCalculator() {
			
			@Override
			public void calculate(int amount) {
				System.out.println("this is bonuscalculator using anonymous class"+(amount*5));
			}
		};
		bonuscalculator.calculate(5000);
	}

}
