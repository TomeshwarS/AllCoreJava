package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExamples {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 5, 4, 6, 20, 30, 60);

		List<Integer> list2 = list.stream().map(ii -> ii * 2).collect(Collectors.toList());

		List<Integer> list3 = list.stream().filter(ii -> ii % 2 == 0).collect(Collectors.toList());

		System.out.println(list);

		System.out.println(list2);

		System.out.println(list3);
		
		List<Integer> list4 = Arrays.asList(10, 5, 4, 6, 20, 30, 60);
		
		
		
		List<Integer> list5= list4.stream().distinct().collect(Collectors.toList());
		
		
		
		
		
		
		
		
		
		

	}
}
