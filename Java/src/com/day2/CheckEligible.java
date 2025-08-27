package com.day2;
import java.time.LocalDate;



public class CheckEligible extends Voter {
	public void checkAge(int age) {
		if (age >= 18) {
			System.out.println("eligible "+ LocalDate.now());
		} else {
			System.out.println("not eligible");
		}
	}
}
