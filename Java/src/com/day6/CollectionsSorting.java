package com.day6;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSorting {
	public static void main(String[] args) {
		ArrayList<String> wordsList = new ArrayList<>();
		wordsList.add("banana");
		wordsList.add("apple");
		wordsList.add("cherry");
		wordsList.add("date");
		System.out.println("Original list: " + wordsList);
		Collections.sort(wordsList);
		System.out.println("Sorted list: " + wordsList);
	}
}
