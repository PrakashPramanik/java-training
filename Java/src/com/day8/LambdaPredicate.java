package com.day8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class subClass {
	public void predicateExample() {

		System.out.println("*** filter out the even numbers using a predicate**");

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		Predicate<Integer> predicate = n -> n % 2 == 0;

		for (Integer val : list) {
			if (predicate.test(val)) { // test method called to cecheck condition
				System.out.println(val);
			}
		}
	}
}

public class LambdaPredicate {
	public static void main(String args[]) {
		System.out.println("This is predicate example");
		subClass predicateDemo = new subClass();
		predicateDemo.predicateExample();
	}
}