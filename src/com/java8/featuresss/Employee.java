package com.java8.featuresss;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {

	private Integer id;
	private String name;

	public Employee() {

	}

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		/*
		 * Employee e1 = new Employee(10, "Tomeshwar"); Employee e2 = new Employee(30,
		 * "Tomeshwar"); Employee e3 = new Employee(12, "Ganesh"); Employee e4 = new
		 * Employee(17, "Amar"); List<Employee> list = Stream.of(e1, e2, e3,
		 * e4).sorted((e11, e22) -> e11.getName().compareTo(e22.getName()))
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println(list);
		 * 
		 * List<Employee> list2 = Stream.of(e1, e2, e3, e4).distinct()
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println("List2 "+list2);
		 */

		List<String> listN = Arrays.asList("AA", "AA", "CC");

		listN.stream().distinct().forEach((p) -> {
			// System.out.println(p);
		});

		Set<String> listNN = listN.stream().collect(Collectors.toSet());

		// System.out.println(listNN);

		List<String> listNNN = listN.stream().filter((p) -> (p.startsWith("A"))).collect(Collectors.toList());
		// System.out.println(">>> " + listNNN);

		List<String> listNNNN = listN.stream().map((p) -> (p + "append my content")).collect(Collectors.toList());

		// System.out.println("Go "+listNNNN);

		List<Integer> listInt = Arrays.asList(10, 2, 45, 23, 89, 12);

		long value = listInt.stream().filter((k) -> k % 2 == 0).count();

		System.out.println(value);
		long value2 = listInt.stream().filter((k) -> k>35).count();
		System.out.println("value2  "+value2);
				
	}

}
