package com.java8.practice.demo.examples_4262020;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {

	private Integer id;
	private String fname;
	private String lname;
	private Integer salary;

	public Employee() {

		System.out.println("Employee Constructor ");
	}

	public Employee(Integer id, String fname, String lname, Integer salary) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		Employee employee1 = new Employee(1, "Tomeshwar", "Shiwane", 100);
		Employee employee2 = new Employee(2, "Krishna", "Shiwane", 200);
		Employee employee3 = new Employee(3, "Amar", "patil", 300);
		Employee employee4 = new Employee(4, "Surendra", "bavistale", 800);

List<Employee> listEmp=Arrays.asList(employee1,employee2,employee3,employee4)	;

List<Integer> salaryList=listEmp.stream().map(k-> k.getSalary()*2).collect(Collectors.toList());

 System.out.println(salaryList);
 
Boolean b= listEmp.stream().anyMatch(p -> p.getSalary() == 800);
 System.out.println("is 800 Present in the List "+b);
 
 
 boolean b111= listEmp.stream().allMatch((pp)-> pp.getFname().equals("Tomeshwar"));
	System.out.println("b111"+b111);	
		
		
Boolean anyWhereTomeshwarExists=	listEmp.stream().findAny().equals("Tomeshwar");
		
   System.out.println("anyWhereTomeshwarExists"+anyWhereTomeshwarExists);

	
	
	
	}
}
