package com.logical.program;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day2ChallengeCommonSubString {

	public static void main(String[] args) {

		String s1 = "";
		String s2 = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String..");
		s1 = scanner.next();
		System.out.println("Enter second String..");
		s2 = scanner.next();
// Ensuring s2 length should be less than s1
		if (s2.length() > s1.length()) {
			String temp = s2;
			s2 = s1;
			s1 = temp;
		}    
		
		Set<String> output = new HashSet<>();

		// Creating Substrings to match.....
		for (int j = 1; j < s2.length(); j++) {

			String subString = "";
			for (int i = 0; i <= j; i++) {
				subString = subString + s2.charAt(i);
			}
			// Storing matched output .....
			if (s1.contains(subString))
				output.add(subString);
		}

	//  Printing Output 	
		if (output.size() == 0) {
			System.out.println("NO");
		} else {
			System.out.println(output);

		}

	}
}
