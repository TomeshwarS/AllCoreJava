package com.logical.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class App3 {

	public static void main(String[] args) {

		List<Integer> list = new CopyOnWriteArrayList<>();
		/// 4 6 5 3 3 1
		// 1,1,2,2,4,4,5,5,5

		
		  list.add(4); list.add(6); list.add(5); list.add(3); list.add(3); list.add(1);
		 
		
			/*
			 * list.add(1);
			 * 
			 * list.add(1);
			 * 
			 * list.add(2); list.add(2);
			 * 
			 * list.add(4); list.add(4);
			 * 
			 * list.add(5); list.add(5); list.add(5);
			 */
		Set<Integer> set = new HashSet<>(list);
		
		
		System.out.println("set size "+set.size());
		
		
		List<Integer> listWithoutDuplicate = new CopyOnWriteArrayList<>(set);
		int[] maxMin = new int[list.size()];
		for (int i = 0; i < listWithoutDuplicate.size(); i++) {
			int count1 = Collections.frequency(list, listWithoutDuplicate.get(i));
			int count2 = Collections.frequency(list, listWithoutDuplicate.get(i) + 1);
			int count3 = Collections.frequency(list, listWithoutDuplicate.get(i) - 1);
			list.remove(listWithoutDuplicate.get(i));

			maxMin[i] = count1 + count2 + count3;
		}
		
		for (int i = 0; i < maxMin.length; i++) {
		   System.out.println(maxMin[i]);	
		}
		
		
		Arrays.sort(maxMin);

		System.out.println(maxMin[maxMin.length - 1]);
	}

}
