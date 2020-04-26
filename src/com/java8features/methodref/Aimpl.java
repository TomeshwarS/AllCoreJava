package com.java8features.methodref;

public class Aimpl {

	public int addMethodImplInstance(int a, int b) {

		return a + b;
	}
	
	public static int addMethodImplStatic(int a, int b) {

		return a + b;
	}

	public static void main(String[] args) {

		I1 iii = (aaa, bbb) -> aaa + bbb;

		int result = iii.add(200, 100);

		System.out.println("result" + result);
		
		
		I1 aa=  Aimpl::addMethodImplStatic;
		int resultS = aa.add(2000, 1000);

		System.out.println("resultS" + resultS);
	
		I1 bb= new  Aimpl()::addMethodImplInstance;
		int resultD = bb.add(2000, 1000);

		System.out.println("resultD" + resultD);
		
		

	}
}
