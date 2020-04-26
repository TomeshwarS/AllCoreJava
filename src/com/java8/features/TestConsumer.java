package com.java8.features;

import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {

		Consumer<Integer> consumer = (aa) -> {

			System.out.println(aa * aa);
		};

		consumer.accept(12);

	}

}
