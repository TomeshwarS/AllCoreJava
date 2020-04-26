package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap1 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("AA", 10);
		map.put("BB", 20);
		map.put("CC", 30);

		for (Map.Entry<String, Integer> keysValuePair : map.entrySet()) {

			System.out.println(keysValuePair.getKey() + "" + keysValuePair.getValue());
		}

		
	}

}
