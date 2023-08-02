package com.lumen.fun;

public class Funmain {

	public static void main(String[] args) {
		ShapeFactory shapefactory = new ShapeFactory();
		shapefactory.printArea((double x,double y)->{return (x*y);}, 10, 20);
		shapefactory.printArea((double x,double y)->{return (0.5*x*y);}, 1, 2);

		
	}

}
