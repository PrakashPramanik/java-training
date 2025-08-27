package com.day3.p1;

public class StudentDetail {

	String name;
	int rollNo;

	// static variable
	static String cllgName;

	// static counter to set unique roll no
	static int counter = 0;

	public StudentDetail(String name, int rollNo) {
		this.name = name;

		this.rollNo = rollNo;
	}

	// static method
	static void setCllg(String name)

	{
		cllgName = name;
	}

	// instance method
	void getStudentInfo() {
		System.out.println("name : " + name);
		System.out.println("rollNo : " + rollNo);

		// accessing static variable
		System.out.println("cllgName : " + cllgName);
		System.out.println("---------------------------");
	}
}
