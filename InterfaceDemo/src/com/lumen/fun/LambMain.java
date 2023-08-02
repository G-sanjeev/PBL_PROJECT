package com.lumen.fun;

public class LambMain {

	public static void main(String[] args) {
		// Method one
		Processor processor = new Processor();
//		NewCalculator  adder = new Adder();
//		processor.processData(adder, 10, 20);
//		
//		processor.processData(new Adder(), 10, 20);
//		
//		//Anonymous implementation
//		
//		processor.processData(new NewCalculator() {
//			
//			@Override
//			public void calculate(int x, int y) {
//				System.out.println("sum:"+(x+y));
//			}
//		}, 15, 15);
		// lambda
		processor.processData((int x, int y) -> {
			System.out.println(x + y);
		}, 90, 80);
		processor.processData((int x, int y) -> System.out.println("the sum is :" + (x + y)), 90, 80);

	}

}
