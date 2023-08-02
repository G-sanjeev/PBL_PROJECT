package com.lumen.quest1;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator addition = (int x,int y)-> System.out.println("addition :"+(x+y));
		addition.calculate(10, 20);
		Calculator difference= (int x,int y)-> System.out.println("subtration :"+(x-y));
		difference.calculate(20, 10);
		Calculator multiplication = (int x,int y)-> System.out.println("multiplication :"+(x*y));
		multiplication.calculate(10, 20);
		Calculator division = (int x,int y)-> System.out.println("division :"+(y/x));
		division.calculate(10, 20);
		
	}

}
