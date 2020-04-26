package com.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet2 {
	public static void main(String[] args) {

		Set<Employee> sets = new LinkedHashSet<>();

// LinkedHashSet is Ordered 
		Employee e1 = new Employee(1, "AA1", "BB4");
		Employee e2 = new Employee(1, "AA2", "BB6s");
		sets.add(e1);
		sets.add(e2);
		System.out.println(sets.size());

	}
}
