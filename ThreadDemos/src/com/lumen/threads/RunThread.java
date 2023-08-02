package com.lumen.threads;

class RunChild implements Runnable{
	Booking booking;
	int tickets;
	String counterName;
	public RunChild(String counterName,Booking booking,int tickets) {
		super();
		this.booking = booking;
		this.tickets = tickets;
		this.counterName = counterName;
		Thread thread = new Thread(this, counterName);
		thread.start();
	}


public void run() {
	System.out.println(counterName);
	synchronized(booking) {
		double amount = booking.bookTickets(counterName, tickets);
		System.out.println(amount);
	}
	// TODO Auto-generated method stub
//	String tname = Thread.currentThread().getName();
//
//	for (int i = 0; i < 5; i++) {
//		System.out.println(tname + " " + i);
//		try {
//			Thread.sleep(2000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
}
}
public class RunThread {
	public static void main(String[] args) {
		Booking booking = new Booking();
		RunChild child1 = new RunChild("Counter-1", booking, 10);
		
		RunChild child2 = new RunChild("Counter-2", booking, 100);
		RunChild child3 = new RunChild("Counter-3", booking, 200);
	}
}
