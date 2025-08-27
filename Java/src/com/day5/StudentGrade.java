package com.day5;

public class StudentGrade {
	public String name;
	public int age;
	public int marks;
	public String grade;
	public StudentGrade(String name, int age, int marks) {
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	public void checkGrade() {
		if(this.marks >= 90) {
			this.grade="A";
		}
		else if(this.marks >= 80) {
			this.grade="B";
		}
		else {
			this.grade="D";
		}
	}
	
	public void displayEach() {
		checkGrade();
		System.out.println(this.name+" " + this.age+" " + this.marks+" " + this.grade);
		
	}
	
	
	public void displayEachNotFail() {
//		checkGrade();
		if(this.grade != "D") {
			System.out.println(this.name+" " + this.age+" " + this.marks+" " + this.grade);
			
		}
		
	}

}
