package com.day6;

import java.util.*;

public class LinkedHashMap1 {

	public static void main(String[] args) {

		// Creating an empty LinkedHashMap
		Map<String, Integer> m = new LinkedHashMap<>();

		// Inserting pair entries in above Map
		// using put() method
		m.put("Sweta", 10);
		m.put("Amiya", 30);
		m.put("Gusly", 20);

		// Iterating over Map
		for (Map.Entry<String, Integer> e : m.entrySet())

			// Printing key-value pairs
			System.out.println(e.getKey() + " " + e.getValue());
	}
}