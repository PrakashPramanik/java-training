package com.day3.p1;

public class Voter {
	int age;
	String name;
	static String countryName;
	Voter(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	 static void setCountry(String country) {
		countryName=country;
	}
	
	public void display() {
		System.out.println(name + " " + age + "  " +countryName);
	}
}
