package com.day3.p1;

class Person {
	void message() {
		System.out.println("This is person class\n");
	}
}

class Student extends Person {
	void message() {
		System.out.println("This is student class");
	}

	void display() {

		message();

		super.message();
	}
}

class SuperMethod {
	public static void main(String args[]) {
		Student s = new Student();

		s.display();
	}
}
