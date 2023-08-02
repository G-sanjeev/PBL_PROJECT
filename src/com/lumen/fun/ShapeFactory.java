package com.lumen.fun;

public class ShapeFactory {
	void printArea(Shape shape, double x, double y) {
		System.out.println("printing Area");
		double res = shape.calcArea(x, y);
		System.out.println("the area of rectangle:" + res);
		System.out.println("displaying...");
	}

}
