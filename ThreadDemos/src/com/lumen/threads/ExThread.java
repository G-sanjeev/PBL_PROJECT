package com.lumen.threads;

class Child extends Thread {

	public Child(String name,int priority) {
		super(name);
		this.setPriority(priority);
		System.out.println(this);
		this.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String tname = Thread.currentThread().getName();

		for (int i = 0; i < 5; i++) {
			System.out.println(tname + " " + i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

public class ExThread {

	public static void main(String[] args) {
//		Thread child = new Child();
//		child.setName("Poppy");
//		child.setPriority(Thread.MAX_PRIORITY);
//		Thread child1 = new Child();
//		child1.setName("sanjeev");
//		child1.setPriority(Thread.MIN_PRIORITY + 2);
//
//		Thread child3 = new Child();
//		child3.setName("ki");
//		child3.setPriority(Thread.NORM_PRIORITY + 3);
		
		
//		child.start();
//		child1.start();
//		child3.start();
		
		Thread child1 = new Child("A", Thread.MAX_PRIORITY);
		Thread child2 = new Child("B", Thread.MIN_PRIORITY);
		Thread child3 = new Child("C", Thread.NORM_PRIORITY);
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
