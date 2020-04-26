package com.java.featuress;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
public interface MyInterface {

	public Integer addTwoNo(Integer i1, Integer i2);
	


	public default Integer mul(Integer i1, Integer i2) {

		return i1 * i2;
	}

	public default Integer div(Integer i1, Integer i2) {

		return i2 / i1;
	}

	public static Integer addArray(Integer[] ar) {

		return Arrays.asList(ar).stream().collect(Collectors.summingInt(Integer::new));
	}
	

	public static Integer addList(List<Integer> list) {

		return list.stream().collect(Collectors.summingInt(Integer::new));
	}

}
