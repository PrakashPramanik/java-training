package com.day4;

//public class ArrayIndexAndMathematicalException {

//	public static void main(String[] args) {
//		try {
//			int number[] = new int[10];
////	           System.out.println(number[2]);
//			number[10] = 30 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println("Zero cannot divide any number");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Index out of size of the array");
//		}
//	}
//}

class ArrayIndexAndMathematicalException {
	public static void main(String[] args) {
		try {
			int number[] = new int[20];
			number[10] = 30 / 9;
			System.out.println(number[10]);
			// this statement will throw
			// ArrayIndexOutOfBoundsException e
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e.getMessage());
			// print the message
		} finally {
			System.out.println("This finally block always execuetes");
		}
	}
}