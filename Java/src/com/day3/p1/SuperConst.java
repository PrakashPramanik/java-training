package com.day3.p1;

class Person1 {
	Person1() {
		System.out.println("Person class Constructor");
	}
}

class Student2 extends Person1 {
	Student2() {

		super();

		System.out.println("Student class Constructor");
	}
}

class SuperConst {
	public static void main(String[] args) {
		Student2 s = new Student2();
		MyClass m = new MyClass(12);
		System.out.println(m.value);
	}
}
