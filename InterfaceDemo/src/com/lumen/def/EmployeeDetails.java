package com.lumen.def;

public class EmployeeDetails implements BonusCalculator,AllowanceCalculator{

	@Override
	public void calculate(int amount) {
System.out.println(amount*5);		
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
	System.out.println("welcome employee");}

	@Override
	public void policyType() {
System.out.println("policy of bonus and allowance is Employee");
		AllowanceCalculator.super.policyType();
		BonusCalculator.super.policyType();
	}
	

}
