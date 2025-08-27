package com.day8;

import java.util.ArrayList;

public class Main1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.forEach(x -> System.out.println("The value is " + x));
	}
}
