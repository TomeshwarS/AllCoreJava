package com.java8.featuresss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AA {

	public static void main(String[] args) {

		List<User> users = Arrays.asList(new User("C", 30), new User("D", 40), new User("A", 10), new User("B", 20),
				new User("E", 50));

		List<User> usersSorted = users.stream().sorted((u1, u2) -> u2.getAge().compareTo(u1.getAge()))
				.collect(Collectors.toList());

		usersSorted.forEach(uk -> {

			System.out.println(uk.getAge());

		});

	};

}
