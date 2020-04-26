package com.java.featuress;

public interface MyConsumer<T> {

	public void accept(T t);

	public static void main(String[] args) {

		MyConsumer<String> myConsumer = new MyConsumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("You Entered ...." + t);
			}

		};

		myConsumer.accept("Thsisiss a");

		MyConsumer<String> myConsumer2 = KK ->

		System.out.println("tHIS IS TEST sTRING"+KK );
		
		myConsumer2.accept("Append  me ");

	}
}
