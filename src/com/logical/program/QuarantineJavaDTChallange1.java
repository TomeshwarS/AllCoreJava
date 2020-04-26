package com.logical.program;

import java.math.BigInteger;
import java.util.Scanner;

public class QuarantineJavaDTChallange1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter for how many numbers, you will going to find the datatype : ");
		int times = in.nextInt();
		for (int i = 0; i < times; i++) {
			String input = in.next();
			try {
				// To check if any data loss while converting to long datatype
				// If the longValueExact() returns a greater number than the long max value,
				// then it throws an ArithmeticException
				// Method added in Java 1.8
				long number = new BigInteger(input).longValueExact();
				System.out.println(input + " can be fitted in:");
				if (number < Byte.MAX_VALUE && number > Byte.MIN_VALUE) {
					System.out.println("* byte");
				}
				if (number < Short.MAX_VALUE && number > Short.MIN_VALUE) {
					System.out.println("* short");
				}
				if (number < Integer.MAX_VALUE && number > Integer.MIN_VALUE) {
					System.out.println("* int");
				}
				if (number < Long.MAX_VALUE && number > Long.MIN_VALUE) {
					System.out.println("* long");
				}
			} catch (ArithmeticException | NumberFormatException e) {
				System.out.println(input + " can't be fitted anywhere");
			}
		}
	}

}