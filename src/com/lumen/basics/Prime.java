package com.lumen.basics;

public class Prime {

	public static void main(String[] args) {
		int num =3;
		boolean flag=false;
		if(num == 0 || num== 1) {
			System.out.println("Not prime");
		}
		else {
			if(num>2) {
				for(int i=2;i<=num/2;i++) {
					if(num%i ==0) {
						flag=true;
						break;
					}
					}
				if(flag) {
					System.out.println("Not prime");
					
				}
				else {
					System.out.println("prime");
				}
			}
		}
	}

}
