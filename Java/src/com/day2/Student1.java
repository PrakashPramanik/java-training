package com.day2;

class Student1 {
	int id;
	String n;

	public Student1(int id, String n) {
		this.id = id;
		this.n = n;
	}
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void sub(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
	
	public void mul(int a, int b) {
		int c=a*b;
		System.out.println(c);
	}
	
	public void div(int a, int b) {
		int c=a/b;
		System.out.println(c);
	}
	
	public void mod(int a, int b) {
		int c=a%b;
		System.out.println(c);
	}
}

