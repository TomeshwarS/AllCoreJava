package com.inheritance.ex;

public class MyClass2 implements AutoCloseable {

	@Override
	public void close() throws Exception {

		System.out.println("Closing  the coonections  for MyClass2");
	}

}