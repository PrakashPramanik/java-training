package com.day9;

import java.util.*;

public class TerminalForEach {

	// Driver code
	public static void main(String[] args) {

		// Creating a list of Strings
		List<String> list = Arrays.asList("GFG", "Geeks", "for", "GeeksforGeeks");

		list.forEach(System.out::println);
		list.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		HashMap<String, Integer> studentMarks = new HashMap<>();
		studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);
        
        studentMarks.forEach((k,v)-> System.out.println(k+" :"+v));

	}
}