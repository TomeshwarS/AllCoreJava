package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
	private Integer id;
	private String fname;
	private String lname;

	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.fname.compareTo(o.fname);
	}

	public Employee() {
	}

	public Employee(Integer id, String fname, String lname) {

		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "ZZ", "DD");
		Employee e2 = new Employee(1, "CC", "RR");
		Employee e3 = new Employee(1, "AA", "ZZ");

		List<Employee> list = new ArrayList<>();

		list.add(e1);
		list.add(e2);
		list.add(e3);

		System.out.println("Before Sort" + list);

		Collections.sort(list);
		
		System.out.println("After Sort" + list);


	}

}
