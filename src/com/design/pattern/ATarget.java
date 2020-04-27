package com.design.pattern;

public class ATarget extends Thread {

	@Override
	public void run() {

		m1();
	}

	static synchronized public void m1() {

			System.out.println("start Exce A --  m1 " + Thread.currentThread().getName());

			try {
				Thread.sleep(1000 * 10);
			} catch (Exception e) {
			}

			System.out.println("End  Exce A --  m1 " + Thread.currentThread().getName());
	}

	public void m2() {
		System.out.println("A --  m2 " + Thread.currentThread().getName());

		try {
			Thread.sleep(1000 * 10);
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {

		ATarget at = new ATarget();
		at.setName("Raja");
		at.start();
		
		ATarget at1 = new ATarget();
		at1.setName("Rani");
		at1.start();

	}
}
