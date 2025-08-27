package com.day2;

class Grade implements InterfaceGrade {
	public void calculateGrade(int g) {
		if (g >= 90) {
			System.out.println("grade A");
		} else if (g >= 80) {
			System.out.println("grade B");
		} else if (g >= 70) {
			System.out.println("garade C");
		} else {
			System.out.println("fail");
		}
	}
}
