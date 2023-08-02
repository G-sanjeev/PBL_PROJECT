package com.lumen.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// hashset prints all the values after null
//		Set<String> hashSet = new HashSet<>();
		// linkedhashset prints upto null only not after null
//		Set<String> hashSet = new LinkedHashSet<>();
		Set<String> hashSet = new TreeSet<>();
		//Navigable set 
		
//		NavigableSet<String> set = new TreeSet<>(Arrays.asList("apple"))
		hashSet.add("Apple");
		hashSet.add("orange");
		hashSet.add("banana");
		hashSet.add("kiwi");
		hashSet.add("100");
//		hashSet.add(null);
		hashSet.add("orange");
		System.out.println(hashSet);
		System.out.println(hashSet);
		for(String element:hashSet) {
			System.out.println(element);
		}
	}

}
