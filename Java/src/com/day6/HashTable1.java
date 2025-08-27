package com.day6;

import java.util.*;

public class HashTable1 {
	public static void main(String[] args) {
		// Create an empty Hashtable
		Hashtable<String, Integer> ht = new Hashtable<>();

		// Add elements to the hashtable
		ht.put("vishal", 10);
		ht.put("sachin", 30);
		ht.put("vaibhav", 20);

		// Print size and content
		System.out.println("Size of map is: " + ht.size());
		System.out.println(ht);

		// Check if a key is present and if
		// present, print value
		for (Map.Entry<String, Integer> e : ht.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());

		if (ht.containsKey("vishal")) {
			Integer a = ht.get("vishal");
			System.out.println("value for key" + " \"vishal\" is: " + a);
		}
	}
}