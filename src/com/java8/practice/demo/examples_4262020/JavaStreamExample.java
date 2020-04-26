package com.java8.practice.demo.examples_4262020;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25f));
		productsList.add(new Product(2, "Dell Laptop", 30f));
		productsList.add(new Product(3, "Lenevo Laptop", 28f));
		productsList.add(new Product(4, "Sony Laptop", 28f));
		productsList.add(new Product(5, "Apple Laptop", 9f));
		List<Float> productPriceList2 = productsList.stream()
				.filter(p -> p.getPrice() > 10)
				.map(p -> p.price)
				.sorted((l1,l2) -> l1.compareTo(l2))
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList2);
	}
}