package com.java8features.constructorref;

public class Sample {

	public Sample() {

		System.out.println("Sample Constructor Default ....");
	}

	public Sample(int a) {

		System.out.println("Sample Constructor Parameterised ...." + a);
	}

	public static void main(String[] args) {
		
		/*
		 * I1 aaa= ()-> new Sample(1000);
		 * 
		 * Sample sample = aaa.getSampleObj();
		 * 
		 * System.out.println(sample);
		 */
		
		I1  bbb= Sample::new;
		
		System.out.println(bbb);
		bbb.getSampleObj(10);
		
		

	}

}
