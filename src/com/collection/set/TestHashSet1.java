package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet1 {
	public static void main(String[] args) {

		Set<String> sets = new HashSet<>();
		
// HashSet is Unordered 
		
		
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
