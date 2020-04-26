package com.java8.features;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {

		Function<Integer, Integer> fn = a -> {

			return a * a;

		};

		System.out.println(fn.apply(109));

	}

}
