package com.day5;

import java.util.*;

 public class Vector1 {
	public static void main(String[] args) {
		Vector<String> lis = new Vector<String>();
		System.out.println("In vector addElement() method is also used to add elements ");
		boolean s =  lis.add("Tiger");
		lis.add("Lion");
		lis.add("Dog");
		lis.add("Elephant");
		lis.addElement("Rat");
		lis.addElement("Cat");
		lis.addElement("Deer");
		System.out.println(lis);
	}
}
