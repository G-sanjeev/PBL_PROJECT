package com.lumen.custom;

public class CustomMain {

	public static void main(String[] args) {
		try {
			CustomBank custbank = new CustomBank(10000);
			custbank.withDraw(2000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
