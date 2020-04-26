package com;

import java.util.HashSet;
import java.util.Set;

public class Hello {

	private Set<Character> getUniqueEle(String str) {
		Set<Character> sets = new HashSet<>();
		for (int k = 0; k < str.length(); k++) {
			sets.add(str.charAt(k));
		}

		return sets;
	}

	public String getCoutWiseCharacter(String pattern) {

		String out = "";
		Set<Character> sets = getUniqueEle(pattern);
		for (char charEle : sets) {

			int count = getCountFor(charEle, pattern);

			out = out + " " + charEle + " " + count;

			System.out.println(">>>>" + out);
		}

		return out;

	}

	private int getCountFor(char ele, String pattern) {

		int count = 0;

		for (int i = 0; i < pattern.length(); i++) {
			if (ele == pattern.charAt(i)) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(new Hello().getCoutWiseCharacter("abcsssssddddgggg"));
	}

}

//DB Normalizion 
// Rest   Conroller
// Request
// Sample Code
// Exception Handlin   
// 
//
//
//
//   

//
//