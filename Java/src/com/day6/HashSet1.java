package com.day6;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW"); // Duplicate
		cars.add("Mazda");
		System.out.println(cars);
		for (String element : cars)
			System.out.print(element + " , ");
	}
}