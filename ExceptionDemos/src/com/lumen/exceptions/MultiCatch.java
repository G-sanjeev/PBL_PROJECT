package com.lumen.exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			System.out.println("welcome");
			String value = args[0];
			System.out.println("value:" + value);
			int num = Integer.parseInt(value);
			System.out.println("Number:" + num);
			int result = 100 / num;
			System.out.println(result);
			int[] nums = null;
			System.out.println(nums[0]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("Please enter value");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("completed");

	}

}
