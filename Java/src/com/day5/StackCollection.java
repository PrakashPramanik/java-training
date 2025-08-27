package com.day5;

import java.util.*;

public class StackCollection {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(11);
		s.push(33);
		s.push(145);
		s.push(18);
		s.push(91);
		System.out.println(s);
		int n = s.peek();
		System.out.println("Peek is used to get element: " + n);
		s.pop();
		System.out.println("After using pop method: " + s);
	}
}
