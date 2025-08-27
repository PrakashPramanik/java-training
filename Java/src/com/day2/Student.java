package com.day2;


public class Student {
	public static void main(String[] args) {

		Student1 s1 = new Student1(10, "Alice");
		

		System.out.println(s1.id);
		System.out.println(s1.n);
		s1.add(3, 4);
		s1.sub(3, 1);
		s1.mul(3, 5);
	}
}