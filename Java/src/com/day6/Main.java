package com.day6;

import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		TreeSet<String> cars = new TreeSet<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW"); // Duplicate
		cars.add("Mazda");

		System.out.println(cars);

		for (String i : cars) {
			System.out.println(i);
		}
	}

}
