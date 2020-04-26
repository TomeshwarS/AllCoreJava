package com.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingEx {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "a", "DD");
		Employee e2 = new Employee(1, "x", "RR");
		Employee e3 = new Employee(1, "b", "ZZ");

		List<Employee> list = new ArrayList<>();

		list.add(e1);
		list.add(e2);
		list.add(e3);

		Comparator<Employee> cmp = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getFname().compareTo(o2.getFname());
			}
		};
		Collections.sort(list, cmp);
		System.out.println(list.toString());
		Collections.sort(list, new NameComparable());
   
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}
}
