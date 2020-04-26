package com.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
	private Integer id;
	private String fname;
	private String lname;

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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}

	public Employee() {
	}

	public Employee(Integer id, String fname, String lname) {

		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}

}
