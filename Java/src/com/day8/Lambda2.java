package com.day8;

interface SingleInterface {
	void SingleParam(int a);
}

public class Lambda2 {

	public static void main(String[] args) {

		// Using lambda expressions to define the operations
		SingleInterface displaySingleParameter = (a) -> System.out.println("Single Parameter" + a);

		// Using the operations
		displaySingleParameter.SingleParam(2);
	}
}
