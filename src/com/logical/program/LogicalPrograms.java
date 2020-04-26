package com.logical.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class LogicalPrograms {

	public static void main(String[] args) {

		List<Integer> list = new CopyOnWriteArrayList<>();

		/*
		 * list.add(4); list.add(6); list.add(5); list.add(3); list.add(3); list.add(1);
		 */

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
		
		
		list.add(6);
		list.add(1);
		list.add(8);
		list.add(2);
		list.add(9);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(4);
		list.add(7);
		
		
		Collections.sort(list);

		// Obtained unique Objects 
		Set<Integer> sets = new HashSet<>(list);

		List<List<Integer>> preOputput = new ArrayList<>();

		for (Integer ele : sets) {
			List<Integer> list2 = getEligibleNos(ele, list);

			for (Integer element : list) {
				if (element.equals(ele)) {
					list.remove(ele);
				}
			}
			preOputput.add(list2);
		}

		List<Integer> finalList = new ArrayList<>();

		for (List<Integer> integers : preOputput) {
			finalList.add(integers.size());
		}

		Collections.sort(finalList);
		System.out.println("Result ==>>>" + finalList.get(finalList.size() - 1));

	}

	private static List<Integer> getEligibleNos(Integer ele, List<Integer> list) {
		List<Integer> listOut = new ArrayList<>();

		for (Integer integer : list) {

			int diff = ele - integer;
			if (diff < 0) {
				diff = diff * -1;
			}
			if (diff <= 1) {
				listOut.add(integer);

			}
		}
		System.out.println("listOut" + listOut + "Ele" + ele);
		return listOut;
	}


}
