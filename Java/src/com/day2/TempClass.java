package com.day2;
import java.time.LocalDate;
import java.time.Month;

import com.day2.temp.*;

public class TempClass {

	public static void main(String[] args) {
		Temp t = new Temp();
		t.temp();
		LocalDate dt = LocalDate.now();
		System.out.println(dt);
		Month m = LocalDate.now().getMonth();
		System.out.println(m);

	}

}
