package com.lumen.fun;

public class LamDemo {

	public static void main(String[] args) {
		//implementation of the checker 
		Checker checker = (String username,String city)->{
			if(username.equals("sanjeev")&& city.equals("hyd")) {
				return true;}
			return false;
			};
			System.out.println(checker.checkName("sanjeev", "hyd"));
		}
		
	}

