package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiEx3 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(new Integer[] { 6, 8, 2 });
		for (Integer integer : list) {
			System.out.println(integer);
		}
		Stream<Integer> stream = list.stream();
		stream.forEach(as -> {
			System.out.println("Go baby Go " + as);
		});
	};
};
