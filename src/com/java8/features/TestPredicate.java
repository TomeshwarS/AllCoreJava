package com.java8.features;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {

		Predicate<Integer> predicate = a -> {
			return a == 10 ? true : false;

		};

		boolean b1 = predicate.test(10);
		
		 System.out.println(b1);

	}
}
