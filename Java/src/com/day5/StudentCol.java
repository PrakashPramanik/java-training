package com.day5;

import java.util.ArrayList;

public class StudentCol {
	
	public static void display(ArrayList<StudentGrade> al) {
		for(StudentGrade st : al ) {
			st.displayEach();
		}
	}
	
	public static void displayFailNot(ArrayList<StudentGrade> al) {
		for(StudentGrade st : al ) {
			st.displayEachNotFail();
		}
	}

	public static void main(String[] args) {
		StudentGrade shyam = new StudentGrade("shyam", 21, 90);
		StudentGrade david = new StudentGrade("david", 22, 80);
		StudentGrade ram= new StudentGrade("ram", 23, 20);
		ArrayList<StudentGrade> al = new ArrayList<StudentGrade>();
		al.add(shyam);
		al.add(david);
		al.add(ram);
		display(al);
		System.out.println("############################");
		System.out.println("List of All passed Student");
		displayFailNot(al);

	}

}
