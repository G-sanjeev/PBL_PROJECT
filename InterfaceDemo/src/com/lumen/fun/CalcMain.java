package com.lumen.fun;

public class CalcMain {
	public static void main(String [] args) {
		NewCalculator calculator = (int x,int y)->System.out.println("addition:"+(x+y));
		calculator.calculate(10,20);
		calculator = (int x,int y)->System.out.println("addition:"+(x-y));
		calculator.calculate(20, 10);
		calculator = (int x,int y)->System.out.println("addition:"+(x*y));
		calculator.calculate(2, 4);
		calculator = (int x,int y)->System.out.println("addition:"+(x/y));
		calculator.calculate(20,10);
		
		
		Printer printer = ()->{ return "printer interface";};
		System.out.println(printer.print());
		
		printer= ()->"welcome printer";
		System.out.println(printer.print());
		
		
	}
}
