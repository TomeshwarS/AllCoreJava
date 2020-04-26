package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet1 {
	public static void main(String[] args) {

		Set<String> sets = new TreeSet<>();

// LinkedHashSet is Sorted 

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
