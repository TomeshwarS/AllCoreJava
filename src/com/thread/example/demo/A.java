package com.thread.example.demo;

public class A extends Thread {

	@Override
	public void run() {

		m1();
		m2();
	}

	public void m1() {

		System.out.println("A -- m1 ");

	}

	synchronized public void m2() {

		System.out.println("A -- m2 ");

	}

	public static void main(String[] args) {
   System.out.println();
		A a = new A();

		Thread t1 = new Thread(a);
   System.out.println(t1.getPriority());
		t1.start();

		Thread t2 = new Thread(a);

		t2.start();

	}

}
