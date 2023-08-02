package com.lumen.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapHash {

	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"Java");
		hashMap.put(10,"Spring");
		hashMap.put(8,"Node");
		hashMap.put(null,"css");
		hashMap.put(3,"Angular");
		hashMap.put(5,"Html");
		hashMap.put(1,"react");
		hashMap.put(100,null);
		hashMap.put(100,null);
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(1));//pass key and get value
		System.out.println(hashMap.get(20));//returns null value
		System.out.println(hashMap.getOrDefault(20, "node"));//default value be printed
		System.out.println(hashMap.containsKey(1));// returns true or false
		
		
		// method 1 for accessing elements using for each loop
		Set<Integer>keys = hashMap.keySet();
		for(Integer key:keys) {
			System.out.println(key+" "+hashMap.get(key));
		}System.out.println();
		
		//method 2 using inner class entry
		
		Set<Entry <Integer,String>>map = hashMap.entrySet()	;
		for(Entry<Integer,String>entry:map) {
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
		System.out.println();
		
		// method 3 using map.entry 
		
		for(Map.Entry<Integer, String>entry: hashMap.entrySet()) {
			Integer key = entry.getKey()	;
			String value = entry.getValue();
			System.out.println(key+" "+value);
		}
	
	}

	

}
