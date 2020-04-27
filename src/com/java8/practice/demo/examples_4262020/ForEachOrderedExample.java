package com.java8.practice.demo.examples_4262020;

import java.util.HashSet;
import java.util.Set;

public class ForEachOrderedExample {
	public static void main(String[] args) {
		Set<String> gamesList = new HashSet<String>();
		gamesList.add("c");
		gamesList.add("b");
		gamesList.add("a");
		System.out.println("------------Iterating by passing lambda expression---------------");
		gamesList.stream().forEachOrdered(games -> System.out.println(games));
		System.out.println("------------Iterating by passing method reference---------------");
		gamesList.stream().forEachOrdered(System.out::println);
	}
}