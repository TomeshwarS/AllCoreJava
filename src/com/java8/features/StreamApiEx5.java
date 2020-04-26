package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEx5 {

	public static void main(String[] args) {

		List<Integer> oks = Arrays.asList(1, 1,1,1,4, 6, 7, 8, 90);
		List<Integer> o1 = oks.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(o1) ;

		List<Integer> o2 = oks.stream()

				.map(i -> i * 2).collect(Collectors.toList());
		System.out.println(o2);

		List<Integer> o3 = oks.stream()

				.distinct()
				.collect(Collectors.toList());
		System.out.println(o3);

	}
}
