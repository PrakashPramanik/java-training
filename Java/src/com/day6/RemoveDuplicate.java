package com.day6;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
public static void main(String[] args) {
	ArrayList<Integer> n = new ArrayList<Integer>();
	HashSet<Integer> numbers = new HashSet<Integer>();

	
	n.add(1);
	n.add(2);
	n.add(1);
	
	for(Integer i: n) {
		if(!numbers.contains(i)) {
			numbers.add(i);
		}
	}
	System.out.println(n);
	System.out.println(numbers);
	
}
}
