package com.java8.practice.demo.examples_4262020;

import java.util.Arrays;
import java.util.List;

public class ListExamples {
	
	
	public static void main(String[] args) {
		
   List<String>list= Arrays.asList("AA","BB","CC","DD");
   
   //  list.forEach((s) -> System.out.println(s));
   
   list.forEach(System.out::println);
   
   
 
	}

}
