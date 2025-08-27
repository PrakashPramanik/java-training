package com.day3.p1;

public class Encapsulate {
	private String geekName;
	private int geekRoll;
	private int geekAge;


	public int getAge() {
		return geekAge;
	}


	public String getName() {
		return geekName;
	}


	public int getRoll() {
		return geekRoll;
	}


	public void setAge(int newAge) {
		geekAge = newAge;
	}

	
	public void setName(String newName) {
		geekName = newName;
	}

	public void setRoll(int newRoll) {
		geekRoll = newRoll;
	}

}
