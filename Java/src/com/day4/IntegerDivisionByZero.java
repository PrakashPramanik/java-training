package com.day4;

//public class IntegerDivisionByZero {
//	public static void main(String[] args) {
////		int numerator = 10;
////		int denominator = 0;
////		int result = numerator / denominator;
////		System.out.println("Result: " + result);
//
//		String s = null;
//
//		// Getting length of a string
//		System.out.println(s.length());
//	}
//}



public class IntegerDivisionByZero {
	   public static void main(String[] args) {
	       int numerator = 10;
	       int denominator = 0;
	 
	       try {
	           int result = numerator / denominator; // This line will throw an ArithmeticException
	           System.out.println("Result: " + result); // This line will not be executed
	       } catch (ArithmeticException e) {
	           System.out.println("Error: " + e.getMessage());
	       }
	   }
	}