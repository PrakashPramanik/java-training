package com.day8;

interface LocalInterface {
	int operation(int a, int b);
}

public class Lamda3 {
	public static void main(String[] args) {

		// Using lambda expressions to define the operations
		LocalInterface add = (a, b) -> a + b;
		LocalInterface multiply = (a, b) -> a * b;
		// Using the operations
		System.out.println(add.operation(6, 3));
		System.out.println(multiply.operation(4, 5));
	}
}
