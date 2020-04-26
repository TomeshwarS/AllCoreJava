package com.colon.operator;

public class App {

	static public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Tread");
		}
	}

	

	 public void m2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Tread- m2 ");
		}
	}

	public static void main(String[] args) {

		App app = new App();
		Runnable r = app::m2;
		


		System.out.println("Hello  ... This is a main  thread ");

	}

}
