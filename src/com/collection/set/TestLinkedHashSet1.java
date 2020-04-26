package com.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet1 {
	public static void main(String[] args) {

		Set<String> sets = new LinkedHashSet<>();

// LinkedHashSet is Ordered 
		sets.add("xxx");
		sets.add("AA");
		sets.add("BB");
		sets.add("FF");
		sets.add("CC");
		sets.add("DD");
		sets.add("EE");
		sets.add("aaa");

		System.out.println(sets);

	}
}
