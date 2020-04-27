package com.java8.practice.demo.examples_4262020;

public interface IArithmatic {

	public int sum(int a, int b);

	public int mul(int a, int b);

	
	public default int sub(int a, int b) {
		return a-b;
	}
}
