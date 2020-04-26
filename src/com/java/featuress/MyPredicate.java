package com.java.featuress;

public interface MyPredicate<T> {

	public boolean test(T t);

	public static void main(String[] args) {
		MyPredicate<String> myPredicate = new MyPredicate<String>() {

			@Override
			public boolean test(String t) {

				return t.equals("ayyappa");
			}
		};

		MyPredicate<String> myPredicate2 = (ss) -> {

			return ss.equals("ayyappa");

		};

		System.out.println(myPredicate.test("go"));
		System.out.println(myPredicate2.test("go"));

	}

}
