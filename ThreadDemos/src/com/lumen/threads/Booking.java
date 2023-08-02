package com.lumen.threads;

public class Booking {
//	public double bookTickets(String name,int noOfTickets) {
//		double costPerTicket =200;
//		System.out.println("Booked for"+name);
//		double totalPrice = costPerTicket*noOfTickets;
//		System.out.println("total:"+ totalPrice);
//		return totalPrice;
//	}
	public double bookTickets(String name,int noOfTickets) {
		double costPerTicket=200;
		System.out.println("Booked for"+name);
		double totalPrice = costPerTicket*noOfTickets;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
e.printStackTrace();		}
		System.out.println("total:"+ totalPrice);
		return totalPrice;
	}

}
