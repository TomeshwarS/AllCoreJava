package com.thread.imp.examples.test;

public class TestJoinMethod1 extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			// System.out.println(i);

			System.out.println(Thread.currentThread().getName() + "    Value " + i);

		}
	}

	public static void main(String args[]) {
		TestJoinMethod1 t1 = new TestJoinMethod1();
		TestJoinMethod1 t2 = new TestJoinMethod1();
		TestJoinMethod1 t3 = new TestJoinMethod1();

		t1.setName("Amar");
		t2.setName("Akbar");
		t3.setName("Anthoni");

		t1.start();
		try {
			t1.join();

			t2.start();

			t2.join();
			t3.start();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}