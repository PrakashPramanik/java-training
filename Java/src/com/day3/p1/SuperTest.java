package com.day3.p1;

class Vehicle {
	int maxSpeed = 120;
}


class Car extends Vehicle {
	int maxSpeed = 180;

	void display() {
		
		System.out.println("Maximum Speed: " + super.maxSpeed);
	}
}


class SuperTest {
	public static void main(String[] args) {
		Car small = new Car();
		small.display();
	}
}
