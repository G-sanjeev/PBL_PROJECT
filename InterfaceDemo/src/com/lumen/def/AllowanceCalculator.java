package com.lumen.def;

public interface AllowanceCalculator {
	void calculate(int amount);
	default void greet() {
		System.out.println("have a good day");
	}
	default void policyType() {
		System.out.println("the policy type is allowance calc");
	}

}
