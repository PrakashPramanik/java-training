package com.day8;

interface ZeroParameter {
	void display();

}

public class Lambda1 {
	public static void main(String[] args) {
		// Lambda expression with zero parameters
		ZeroParameter zeroParamLambda = () -> System.out.println("This is a zero-parameter lambda expression!");

		// Invoke the method
		zeroParamLambda.display();
	}
}