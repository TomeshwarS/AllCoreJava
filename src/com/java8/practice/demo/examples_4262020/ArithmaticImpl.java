package com.java8.practice.demo.examples_4262020;

public class ArithmaticImpl {
	
	public static void main(String[] args) {
		
		IArithmatic ii= new IArithmatic() {
			
			@Override
			public int sum(int a, int b) {
				return a+b;
			}
			
			@Override
			public int mul(int a, int b) {
				return a*b;
			}
		};
		
	}

}
