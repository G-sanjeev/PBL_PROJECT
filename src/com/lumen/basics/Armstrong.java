package com.lumen.basics;

public class Armstrong {

	public static void main(String[] args) {
		int amstrong =153;
		int temp = amstrong;
		int count =0;
		int res = 0;
		while(amstrong>0) {
			amstrong/=10;
			count++;
		}
		while(temp>0) {
			int r=temp%10;
			res = res+(int) Math.pow(r, count);
			temp = temp/10;
			}
		System.out.println(res);
	}

}
