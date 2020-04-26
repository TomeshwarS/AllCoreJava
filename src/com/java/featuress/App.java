package com.java.featuress;

public class App {

	public static void main(String[] args) {

		MyInterface mi = new MyInterface() {

			@Override
			public Integer addTwoNo(Integer i1, Integer i2) {
				return i1 + i2;
			}
		};
		  System.out.println("Annonymous >> "+mi.addTwoNo(100, 200));

		MyInterface mi2 =( i1, i2) ->{
		   return (i1 + i2);
		};
		
		System.out.println("lAMBDA>>" +mi2.addTwoNo(100, 200));

	}

}
