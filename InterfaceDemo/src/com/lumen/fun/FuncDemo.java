package com.lumen.fun;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class FuncDemo {

	public static void main(String[] args) {
		
		Function<String,Integer> fun = (str)->str.length();
		System.out.println(fun.apply("sri"));
		
		Function<String, String> fun1 = (str)->str.toUpperCase();
		//call apply method
		System.out.println(fun1.apply("sri"));
		
		Function<String,String> fun2= (str) ->str.toLowerCase();
		System.out.println(fun2.apply("sri"));
		
		Function<Book,String> funr = (book)->book.getTitle()	;
		System.out.println(funr.apply(new Book("ninja ","ska","ram",20)));
		
		Function<String,Book> fun3 = (author)->{
			if(author.equals("Kathy")) {
				return new Book();
				
			}
			else {
				return null;
				
			}
		};
		System.out.println(fun3.apply("kathy"));
		
		Function<Integer, List<String>> fun4 =(num)->{
			if(num==2) {
				return Arrays.asList("java","angular");
				
			}
			if(num ==3) {
				return Arrays.asList("java","angular","node");
				
			}
			else
				return null;
		};
		System.out.println(fun4.apply(3));
		
		Predicate<String> pred1 =(str)->{
			if(str.length()>4)
				return true;
			else 
				return false;
		};
		System.out.println(pred1.test("hello"));
		BiPredicate<String, Integer> pred = (str,num)->{
			if(str.length()>num)
				return true;
			else return false;
		};
		System.out.println(pred.test("hello",3));
		
		
		
	}
	

}
