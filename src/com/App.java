
package com;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class App {

	public static void mainA(String[] args) {

		System.out.println(new App().CountVovels("AEIO"));

	}

	public Map<Character, Integer> CountVovels(String name) {

		char[] chr = new char[] { 'A', 'E', 'I', 'U' };

		Map<Character, Integer> map = new LinkedHashMap<>();

//  Adding into map
		for (int i = 0; i < chr.length; i++) {

			int count = calCountFor(chr[i], name);

			map.put(chr[i], count);

		}
		return map;
	}

	// calculates count for each char
	private int calCountFor(char c, String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {

			if (c == name.charAt(i)) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(30);
		System.out.println(list.contains(109));

		boolean bb = isElePresent(10, list);
		System.out.println("BB" + bb);
	}

	private static boolean isElePresent(int i, List<Integer> list) {

	boolean  count=	list.stream().anyMatch(p -> i==2);
		
	
		return count;
	}
}