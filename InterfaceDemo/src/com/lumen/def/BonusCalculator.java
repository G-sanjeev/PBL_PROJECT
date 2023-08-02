package com.lumen.def;

public interface BonusCalculator {

	void calculate(int amount);
	default void greet() {
		System.out.println("have a good day");
	}
	default void policyType() {
		System.out.println("the policy type of bonus calculator");
	}
	static void call() {
		System.out.println("calling for lunch");
	}
}
