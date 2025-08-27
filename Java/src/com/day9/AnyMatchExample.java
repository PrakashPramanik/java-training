package com.day9;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");

		// Check if any fruit starts with 'b'
		boolean anyStartsB = fruits.stream().anyMatch(fruit -> fruit.startsWith("b"));
		System.out.println("Any fruit starts with 'b': " + anyStartsB); // Output: true

		// Check if any fruit is longer than 10 characters
		boolean anyLongFruit = fruits.stream().anyMatch(fruit -> fruit.length() > 10);
		System.out.println("Any fruit is longer than 10 characters: " + anyLongFruit); // Output: false
	}
}