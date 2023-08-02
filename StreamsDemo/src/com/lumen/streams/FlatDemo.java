package com.lumen.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatDemo {

	public static void main(String[] args) {
		String[] names = { "ram", "sham", "raghu" };
		Arrays.stream(names).forEach(System.out::println);
		String[][] courses = new String[][] { { "java", "c++" }, { "python", ".net" } };
		Stream<String[]> streamTwo = Arrays.stream(courses);

		// calling using flat map

		Stream<String> streamone = streamTwo.flatMap(onarr -> Arrays.stream(onarr));

//		streamone.forEach(System.out::println);
		// using string to int using map : to get the length
		streamone.mapToInt(String::length).forEach(System.out::println);

		Arrays.stream(courses).flatMap(oneArr -> Arrays.stream(oneArr)).map(String::toUpperCase)
				.forEach(System.out::println);
	}

}
