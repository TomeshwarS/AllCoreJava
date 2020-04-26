package com.inheritance.ex;

public class MyClass implements AutoCloseable {

	@Override
	public void close() throws Exception {

		System.out.println("Closing  the coonections ");
	}

	public void processData() {

		System.out.println("Inside th process Data ...");

	}

	public static void main(String[] args) throws CloneNotSupportedException {

		try (MyClass mc = new MyClass(); MyClass2 mc2 = new MyClass2()) {

		} catch (Exception e) {
		}

	}
}
