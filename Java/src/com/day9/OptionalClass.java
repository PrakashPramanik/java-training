package com.day9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {

		List<String> al = Arrays.asList("apple", "banana", "cherry");

		// It returns an empty instance of Optional class To avoid abnormal termination,
		// we use the Optional class. In the following example, we are using Optional.
		Optional<String> firstElement = al.stream().findFirst();

		// Print the element if present
		firstElement.ifPresent(System.out::println);
	}
}
