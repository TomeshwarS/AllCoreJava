package com.java.featuress;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, String> myFun = s1 -> s1.toLowerCase();

		System.out.println(myFun.apply("JAVA"));

		Predicate<String> myFun2 = s11 -> s11.equals("Ayyapaa");

		System.out.println(myFun2.test("GGGGGGG"));

		Consumer<String> con = (c1) -> System.out.println("c1" + c1);

		con   .accept("Go baby Go");

	}

}
