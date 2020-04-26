package com.java8.features;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiEx4 {

		 public static void main(String[] args)
	     {
	        IntStream stream = "aa".chars();
	        stream.forEach(p -> System.out.println(p));
	         
	        //OR
	         
	        Stream<String> streamk = Stream.of("A$B$C".split("\\$"));
	       streamk.forEach(p -> System.out.println(p));
	     
	};
};
