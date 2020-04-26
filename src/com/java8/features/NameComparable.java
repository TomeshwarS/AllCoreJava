package com.java8.features;

import java.util.Comparator;

public class NameComparable implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o2.getFname().compareTo(o1.getFname());
	}

}
