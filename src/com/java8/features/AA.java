package com.java8.features;

import java.util.Hashtable;

@FunctionalInterface
public interface AA {

	public void add(int a, int b);

	public default int mul(int a, int b) {

		return a * b;
	}

	public default int go(int a, int b) {

		return a * b;
	}

	public static int statM(int a, int b) {

		return a * b;
	}

	public static int ok(int a, int b) {

		return a * b;
	}

	public static void main(String[] args) {

		Hashtable<String, Integer> hs = new Hashtable();

		hs.put("BBBBBBBBBBBB", null);
		hs.put("AAA", 10);

		System.out.println(hs);
	}
}
