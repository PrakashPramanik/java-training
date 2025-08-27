package com.day3.p1;

public class EncapMain {
	public static void main(String[] args) {
		Encapsulate o = new Encapsulate();

		
		o.setName("Geeky");
		o.setAge(19);
		o.setRoll(51);

		
		System.out.println("Geek's name: " + o.getName());
		System.out.println("Geek's age: " + o.getAge());
		System.out.println("Geek's roll: " + o.getRoll());

		
	}
}
