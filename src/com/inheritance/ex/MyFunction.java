package com.inheritance.ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
public interface MyFunction<T, R> {

	public abstract R apply(T t);

	public static void main(String[] args) {

		/*
		 * MyFunction<Integer,String> myFun=(s)-> "The sum is"+(s +10);
		 * 
		 * 
		 * System.out.println(myFun.apply(100));
		 */

		// Testing code for Function

		/*
		 * Function<String, String> fun = (sss) -> sss.toUpperCase();
		 * 
		 * System.out.println(fun.apply("thi sis s s ss  "));
		 * 
		 * List<Integer> list = Arrays.asList(10, 30, 50, 3, 5);
		 * 
		 * Stream<Integer> s = list.stream();
		 * 
		 * Function<Integer, Integer> fun2 = (iii) -> iii * 2; List<Integer> list22 =
		 * s.map(fun2).collect(Collectors.toList());
		 * 
		 * System.out.println(list22);
		 */

		Predicate<String> predic = p -> p.equals("TOmesh");

		System.out.println(predic.test("jcsacj"));

		List<Integer> list = Arrays.asList(10, 30, 50, 3, 5);
		Predicate<Integer> p = k -> k % 2 == 0;

		List<Integer> list2 = list.stream().filter(ff -> ff%2 ==0).collect(Collectors.toList());

		System.out.println("list2"+list2);
		
		
		
		

	}

}
