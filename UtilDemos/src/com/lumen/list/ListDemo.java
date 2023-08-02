package com.lumen.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.add("java");
		list.add("100");
		list.add("100.8");
		list.add("spring");
		list.add("angular");
		list.add(1,"haven");
		System.out.println(list);
		list.set(2, "priya");
		System.out.println(list.size());
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name.toLowerCase());
		}
		Collections.sort(list);
		System.out.println(list);
		for(String name:list)
			System.out.println(name.toUpperCase());
		System.out.println(list.size());
		list.set(1, "lucky");
		list.add(2,"buddy");
		System.out.println(list.get(2));
		
		System.out.println("Reverse");
		ListIterator<String> listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			String name = listIterator.previous();
			System.out.println(name.toUpperCase());
		}
	}

}
