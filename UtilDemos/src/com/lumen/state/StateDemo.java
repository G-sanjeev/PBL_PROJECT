package com.lumen.state;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class StateDemo {

	public static void main(String[] args) {
		
//		Map<String,List<String>> states = new HashMap<>(("karnataka",Arrays.asList("belgum","bangaloru","hubli","Mysore")),
//				("TamilNadu",Arrays.asList("chennai","Ambattur","srisailam")),
//				("Andhra",Arrays.asList("vishakapatnam","vijaywada","kurnool'")));
		Map<String,List<String>> states = new HashMap<>();
		states.put("karnataka",Arrays.asList("belgum","bangaloru","hubli","Mysore"));
		states.put("TamilNadu",Arrays.asList("chennai","Ambattur","srisailam"));
		states.put("Andhra",Arrays.asList("vishakapatnam","vijaywada","kurnool'"));
//		
//		for(Map.Entry<Integer, String>entry: states) {
//			Integer key = entry.getKey()	;
//			String value = entry.getValue();
//			System.out.println(key+" "+value);
//		}
		Set<String> keys = states.keySet();
		for(String key:keys)
			System.out.println("the State"+key+" "+"the cites:"+states.get(key));
		
	}

}
