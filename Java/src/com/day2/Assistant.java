package com.day2;

public class Assistant {

	public void sayHello(String firstGuest) {
		System.out.println("Good evening, " + firstGuest + "!");
	}

	public void sayHello(String firstGuest, String secondGuest) {
		System.out.println("Good day, " + firstGuest + " and " + secondGuest + "!");
	}

	public static void main(String[] args) {
		Assistant assistant = new Assistant();
		assistant.sayHello("Michael", "Victor");
	}
}
