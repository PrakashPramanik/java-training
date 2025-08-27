package com.day8;

import java.util.HashSet;

public class LambdaHashSet {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.forEach(x -> System.out.println("The value is " + x));
	}
}