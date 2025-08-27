package com.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		// Using map to transform names to uppercase
		List<String> uppercaseNames = names.stream() // Original stream of strings
				.map(String::toUpperCase) // Intermediate operation: transforms each string to uppercase
				.collect(Collectors.toList()); // Terminal operation: collects results into a list

		System.out.println(uppercaseNames); // Output: [ALICE, BOB, CHARLIE]

		// Using map to transform strings to their lengths
		List<Integer> nameLengths = names.stream() // Original stream of strings
				.map(String::length) // Intermediate operation: transforms each string to its length
				.collect(Collectors.toList()); // Terminal operation: collects results into a list
		System.out.println(nameLengths); // Output: [5, 3, 7]
	}
}
