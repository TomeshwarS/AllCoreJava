package com.thread.imp.examples.test;

public class JavaYieldExp extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++)
			System.out.println(Thread.currentThread().getName() + " in control");
	}
  
	public static void main(String[] args) {
		JavaYieldExp t1 = new JavaYieldExp();
		JavaYieldExp t2 = new JavaYieldExp();
		// this will call run() method

		t1.setName("Tomeshwar - T1 ");
		t2.setName("Tomeshwar - T2 ");
		t1.start();
		t2.start();
		for (int i = 0; i < 3; i++) {

			System.out.println("Excecuting start for  " + Thread.currentThread().getName());
			// Control passes to child thread
			t1.yield();

			try {
				Thread.sleep(1000 * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Excecution Ends at  "+Thread.currentThread().getName());
		}
	}
}