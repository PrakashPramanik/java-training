package com.day6;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		// Create a TreeMap with natural ordering of keys (String implements Comparable)
		TreeMap<String, String> capitalCities = new TreeMap<>();
		capitalCities.put("England", "London");
		capitalCities.put("India", "New Delhi");
		capitalCities.put("Austria", "Wien");
		System.out.println(capitalCities);
		for (Map.Entry<String, String> e : capitalCities.entrySet())

			System.out.println(e.getKey() + " " + e.getValue());

	}
}
