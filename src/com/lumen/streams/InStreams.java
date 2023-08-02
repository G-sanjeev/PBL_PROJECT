package com.lumen.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InStreams {

	public static void main(String[] args) {
			List<String>courses = Arrays.asList("java","Angular","Node","Spring","css","React");
			
			
			// Method 1. using the iterator i.e terminal operation 
			Iterator<String> iterator= courses.stream() //converting the list to streams 
					.filter(str->str.length()>4)    // filtering the required data
					.skip(1)
					.iterator();// terminal operation
			while(iterator.hasNext()) {
				String cname = iterator.next();
				System.out.println(cname);
			}
			
			// method2. using the for each loop
			
			System.out.println("method 2");
			
			courses.stream()
							.filter(str->str.length()>4)
							.distinct()
							.limit(2)
							.forEach(str ->System.out.println(str));
			
			
			//older version .collect(Collectors.toList());
			
			// method 3. collect method
			
			List<Integer> ncourses = courses.stream()
					.sorted()
					.map(str->str.length())
					.filter(num->num>5)
					.collect(Collectors.toList());
			
			ncourses.forEach(num->System.out.println(num));
			
			System.out.println("the divisible by 2");
			List<Integer> result = courses.stream()
					.map(str->str.length())
					.filter(num->num%2 ==0 )
					.collect(Collectors.toList());
			
			result.forEach(num->System.out.println(num));
			
			
			
			
			//method references forEach(System.out::println);
			
	}

}
