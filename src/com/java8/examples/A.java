package com.java8.examples;

import java.io.FileWriter;
import java.util.Date;

public class A extends Thread {

	@Override
	public void run() {
		m1();
		m2();
	}

	 public A m1() {
		System.out.println("Inside the m1 " + Thread.currentThread().getName() + "Time " + new Date());

		return new A();
	}

	 public void m2() {
		System.out.println("Inside the m2 " + Thread.currentThread().getName() + "Time " + new Date());

	}

	public static void main1(String[] args) {
		A a = new A();

		String output = "";
		System.out.println("Exce start " + new Date());

		output = output + new Date();
		for (int i = 0; i < 10000; i++) {
			Thread t = new Thread(a);
			t.start();
		}
		
		output = output + new Date();
		writeData(output);


	}

	static public void writeData(String data) {
		try {
			FileWriter fw = new FileWriter("C://Users//Tomeshwar Shiwane//Music//FileData//test.txt");
			fw.write(data);
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Success...");
	}

	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
	}
}
