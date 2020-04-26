package com.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.collection.sorting.Employee;

public class TestHashMap2 {

	public static void main(String[] args) {

		Map<Employee, Integer> map = new LinkedHashMap<>();

		Employee e1 = new Employee(1, "AA8", "BB4");
		Employee e2 = new Employee(1, "AA3", "BB6s");

		map.put(e1, 10);
		map.put(e2, 20);

		System.out.println(map.size());
	}

}
