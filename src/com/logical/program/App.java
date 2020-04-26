package com.logical.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class App {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		/// 4 6 5 3 3 1

		list.add(4);
		list.add(6);
		list.add(5);
		list.add(3);
		list.add(3);
		list.add(1);

		List<List<Integer>> eleWiseList = new CopyOnWriteArrayList<>();

		for (int i = 0; i < list.size(); i++) {

			List<Integer> subList = new ArrayList<>();
			subList.add(list.get(i));
			eleWiseList.add(subList);
		}

		System.out.println(eleWiseList);

		for (int i = 0; i < list.size(); i++) {

			addToAppropriateList(list.get(i), eleWiseList, list);

		}

	}

	private static void addToAppropriateList(Integer newEle, List<List<Integer>> eleWiseList, List<Integer> list) {

		for (List<Integer> entry : eleWiseList) {

			for (Integer ele : entry) {

				Integer diff = (ele - newEle);
				if (diff < 0) {
					diff = diff * -1;
				}

				if (diff <= 1) {

					int freqNewEle = calFrequency(newEle, list);
					int freqEle = calFrequency(ele, entry);

					if (freqNewEle > freqEle) {
						
							if(calDifferenceWithAllEle(newEle,entry)) {
								entry.add(newEle);
							}
						}
						
					}

				}

			System.out.println(entry);
			}
		
		
		}

	private static boolean calDifferenceWithAllEle(Integer newEle, List<Integer> entry) {
		
	int[] ar=new int[entry.size()];
		
		for (int i = 0; i < entry.size(); i++) {
			
			int calDiff=newEle - entry.get(i);
			if(calDiff <0){
				calDiff=calDiff*-1;
			}
			ar[i]=calDiff;
			
		}
		
		 Arrays.sort(ar);
		 
		int ar2= ar[ ar.length-1];
		return ar2>1?false:true; 
	}


	private static int calFrequency(Integer newEle, List<Integer> list) {
		return Collections.frequency(list, newEle);
	}

	
}
