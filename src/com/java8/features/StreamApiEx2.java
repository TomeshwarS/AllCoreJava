package com.java8.features;

import java.util.stream.Stream;

public class StreamApiEx2 {

	public static void main(String[] args) {
		Integer[] ar = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		Stream<Integer> stream = Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9} );
		stream.forEach(p -> System.out.println(p));
		
		
	};
}
