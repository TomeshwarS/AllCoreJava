package com;

import java.util.Arrays;
import java.util.Scanner;

public class ChallangeDay4 {
	
	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Size of an Array : ");
		
		int sizeOfArray = scanner.nextInt();
		
		System.out.println("Enter array element : ");
		
		int[] array= new int[sizeOfArray];
		
		for (int i=0;i<sizeOfArray;i++) {
			array[i] = scanner.nextInt();
		}
		
		Arrays.stream(array).sorted();
		
		int maxElementCount =0;
		for (int i=0;i<array.length;i++) {
			int elementCount = 0;
			for (int j=i+1;j<array.length;j++) {	
				if (Math.abs(array[i]-array[j]) <= 1) {
					++elementCount;
				}
			}
			
			if (elementCount > maxElementCount) {
				maxElementCount = elementCount+1;
			}
		}
		
		System.out.println(maxElementCount);
		
		scanner.close();

	}
	
}
