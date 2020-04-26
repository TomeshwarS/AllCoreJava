package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet2 {

	// Till Java 7 LinkedList Generated.
	// Balance treee is generarted after java 8

	public static void main(String[] args) {

		Set<Employee> sets = new HashSet<>();

// HashSet is Unordered 
		Employee e1 = new Employee(1, "AA1", "BB4");
		Employee e2 = new Employee(1, "AA2", "BB6s");

		sets.add(e1);
		sets.add(e2);
		System.out.println(sets.size());

	}
}
