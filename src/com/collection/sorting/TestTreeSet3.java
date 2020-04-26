package com.collection.sorting;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet3 {
	public static void main(String[] args) {

		Set<Employee> sets = new TreeSet<>();
		Employee e1 = new Employee(1, "AA8", "BB4");
		Employee e2 = new Employee(1, "AA3", "BB6s");
		sets.add(e1);
		sets.add(e2);

		for (Employee employee : sets) {

			System.out.println(employee);
		}

// Exception in thread "main" java.lang.ClassCastException: com.collection.set.Employee cannot be cast to java.lang.Comparable
	}
}