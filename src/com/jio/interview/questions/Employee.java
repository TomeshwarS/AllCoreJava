package com.jio.interview.questions;

import java.util.RandomAccess;

import com.jio.interview.questions.Employee;

public final class Employee {
	static final String pancardNumber;
	
	static{
		pancardNumber="Enter your pan no such as FLUPS1393N";
		
	}


	public String getPancardNumber() {
		return pancardNumber;
	}

	
	public static void main(String[] args) {
		
	// 	RandomAccess
		
		
		
		System.out.println(new Employee().getPancardNumber());
		
	}
}