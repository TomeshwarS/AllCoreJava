package com.inheritance.ex;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class B extends A {

	@Override
	public void m1() throws IOException {

		System.out.println("BBB-m1 ");
	}

	public static void main11(String[] args) throws Throwable {

		int out = 0;

		Integer[] ar = { 1, 2, 3, 4, 5, 6, 7, 7, 9, 10 };

		Set<Integer> sets = new HashSet<>();

		for (Integer intAr : ar) {
			sets.add(intAr);
		}

		for (Integer integer : sets) {

			int count = getCount(integer, ar);
			if (count >= 2) {
				out = integer;
			}

		}

		System.out.println("out" + out);

	}

	private static int getCount(Integer integer, Integer[] ar) {

		int count = 0;
		for (Integer integer2 : ar) {

			if (integer2 == integer) {
				count++;
			}

		}

		return count;

	}

	public static void main(String[] args) {

		Integer[] ar = { 1, 1, 3, 4, 5, 6, 7, 7, 9, 10 };

		for (int i = 0; i < ar.length; i++) {

			if (i > 1) {
				if (ar[i] == ar[i - 1]) {
					System.out.println("Got the Ans " + ar[i]);
				}
			}

		}

	}
}
