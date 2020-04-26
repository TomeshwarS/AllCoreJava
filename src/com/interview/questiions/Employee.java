package com.interview.questiions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Employee {

	/// Q ..

	final private Long id;
	final private String name;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public Employee(final Long id, final String name) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {

		/*
		 * Employee e1=new Employee(10, "");
		 */

		/*
		 * Map<String,Integer>map=new HashMap<>(); map.put("AA", 10); map.put("AA",
		 * 10000);
		 * 
		 * System.out.println(map);
		 */

		Map<Employee, Integer> map = new HashMap<>();

		Employee e1 = new Employee(10L, "AA");
		e1 = new Employee(100L, "AAAA");

		map.put(e1, 500);
		System.out.println(map);

		final List<String> list = new ArrayList<>();

		list.add("AA");
		list.add("BB");
		
		
		
		

	}

}
