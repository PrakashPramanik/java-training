package com.day5;

public class StudentCollection {

	private String name;
	private int rollNo;
	private int age;

	public String getName() {
		return name;
	}



	public int getRollNo() {
		return rollNo;
	}


	public int getAge() {
		return age;
	}


	public StudentCollection(String name, int rollno, int age) {
		this.name = name;
		this.rollNo = rollno;
		this.age = age;

	}

}