package com.day6;

import java.util.HashMap;

public class CapitalCities {
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("India", "New Dehli");
		capitalCities.put("Austria", "Wien");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");

// Print keys and values
		for (String i : capitalCities.keySet()) {
			System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}
		System.out.println(capitalCities.get("India"));
		capitalCities.remove("England");
		System.out.println(capitalCities);
	}
}
