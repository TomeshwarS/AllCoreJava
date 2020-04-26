package com.java.featuress;

@FunctionalInterface
public interface MyFunction<T, R> {

	R apply(T t);

	public static void main(String[] args) {

		MyFunction<String, Boolean> fun = new MyFunction<String, Boolean>() {

			@Override
			public Boolean apply(String t) {
				return t.equals("ayyapa");
			}

		};
		Boolean b = fun.apply("ayyapa1");
		System.out.println(b);

		MyFunction<String, Boolean> funI = (s) -> 
			 s.equals("ayyapa");
			 
			 System.out.println(funI.apply("ayyapa1"));
			 
	}

}
