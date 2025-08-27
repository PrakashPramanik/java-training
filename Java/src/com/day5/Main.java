package com.day5;

import java.util.*;

//public class Main {
//	public static void main(String[] args) {
//		LinkedList<Integer> name = new LinkedList<Integer>();
//		name.add(100);
//		name.add(200);
//		name.add(300);
//		name.add(400);
//		name.add(5000);
//		System.out.println(name.getFirst());
//	}
//}

public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("C");
		list.add("C++");
		list.add("Python");
		list.add("Java");
		list.add("PHP");
		System.out.println("Original list is: " + list);
		list.addFirst("scala");
		list.addFirst("HTML");
		System.out.println("After adding element by using addFirst() method: " + list);
		list.removeFirst();
		System.out.println("After adding element by using removeFirst() method: " + list);
		System.out.println("After adding element by using getFirst() method: " + list.getFirst());
		list.addLast("CSS");
		System.out.println("After adding element by using addLast() method: " + list);
		list.removeLast();
		System.out.println("After adding element by using removeLast() method: " + list);
		System.out.println("After adding element by using getLast() method: " + list.getLast());
	}
}