package com.lumen.streams;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class CreateStream {

	public static void main(String[] args) {
		String[] names = new String[] {"Ram","john","sri","david","mathew","kevin"};
		// create a stream from an array
		//method 1
		Stream.of(names).forEach(str->System.out.println(str));
		//method 2
		System.out.println("method 2");
		Arrays.stream(names).forEach(name->System.out.println(name));
		
		//the number is divisible by 2
		
		int[] nums = {10,340,40,38,50};
		int sum = Arrays.stream(nums,1,4)
				.filter(num->num%2 ==0)
				.sum();
		System.out.println(sum);
		
		
		// IntStream 
		//Primitives Streams
		
		//method references 
		
		int[] nums1 = {10,30,40,20,50,22,34};
		int sumoutput = Arrays.stream(nums1,1,5)
				.filter(num->num%2 ==0)
				.sum();
		System.out.println(sumoutput);
		
		// converting into string and then into integer and printin gthe square root of the numbers
		
		IntStream stream = Arrays.stream(nums1,1,5);
		double sumresult = stream.mapToObj(num -> String.valueOf(num))
									.mapToDouble(str->Double.parseDouble(str))
									.sum();
		System.out.println(sumresult);
		
		
	}

}
